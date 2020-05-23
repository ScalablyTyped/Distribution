package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an additional implementation for linked embedded object support. */
trait XLinkageSupport extends XCommonEmbedPersist {
  /**
    * returns the URL of the link object.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state or is not a link
    */
  val LinkURL: String
  /**
    * breaks the link and provides the object with a parent storage and a name for object's entry
    *
    * This method can be used only for links implementations that implement the whole set of embedded object interfaces. Usually the sets of interfaces are
    * the same for links and objects. An example of exception from this are OOo links that do not implement {@link XEmbedPersist} interface. For such cases
    * the method will throw an exception.
    *
    * The link will be broken and the linked object will become a normal embedded object.
    *
    * An entry with the specified name should be created or opened inside provided storage. This entry will be used for the object persistence. If the entry
    * exists already all its contents will be ignored.
    * @param xStorage a parent storage the entry should be created or opened in
    * @param sEntryName a name for the entry
    * @see also XEmbedPersist.setPersistentEntry
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state or not a linked object
    * @throws com::sun::star::io::IOException in case object has not persistence or other io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def breakLink(xStorage: XStorage, sEntryName: String): Unit
  /**
    * returns the URL of the link object.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state or is not a link
    */
  def getLinkURL(): String
  /**
    * allows to detect whether the object is a linked one.
    *
    * Most of embedded objects will not support this interface, but some of them can do it, to allow conversion from link to object. After the conversion
    * the object does not change, so interface set stays the same, but the object is not a link any more.
    * @returns `TRUE` - the object is a linked one. `FALSE` - otherwise
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def isLink(): Boolean
}

object XLinkageSupport {
  @scala.inline
  def apply(
    LinkURL: String,
    acquire: () => Unit,
    breakLink: (XStorage, String) => Unit,
    getLinkURL: () => String,
    isLink: () => Boolean,
    isReadonly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    storeOwn: () => Unit
  ): XLinkageSupport = {
    val __obj = js.Dynamic.literal(LinkURL = LinkURL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), breakLink = js.Any.fromFunction2(breakLink), getLinkURL = js.Any.fromFunction0(getLinkURL), isLink = js.Any.fromFunction0(isLink), isReadonly = js.Any.fromFunction0(isReadonly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction2(reload), storeOwn = js.Any.fromFunction0(storeOwn))
    __obj.asInstanceOf[XLinkageSupport]
  }
}

