package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an additional implementation for linked embedded object support. */
trait XLinkageSupport extends XCommonEmbedPersist {
  /**
    * returns the URL of the link object.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state or is not a link
    */
  val LinkURL: java.lang.String
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
  def breakLink(xStorage: XStorage, sEntryName: java.lang.String): scala.Unit
  /**
    * returns the URL of the link object.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state or is not a link
    */
  def getLinkURL(): java.lang.String
  /**
    * allows to detect whether the object is a linked one.
    *
    * Most of embedded objects will not support this interface, but some of them can do it, to allow conversion from link to object. After the conversion
    * the object does not change, so interface set stays the same, but the object is not a link any more.
    * @returns `TRUE` - the object is a linked one. `FALSE` - otherwise
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def isLink(): scala.Boolean
}

object XLinkageSupport {
  @scala.inline
  def apply(
    LinkURL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    breakLink: js.Function2[XStorage, java.lang.String, scala.Unit],
    getLinkURL: js.Function0[java.lang.String],
    isLink: js.Function0[scala.Boolean],
    isReadonly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reload: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    storeOwn: js.Function0[scala.Unit]
  ): XLinkageSupport = {
    val __obj = js.Dynamic.literal(LinkURL = LinkURL, acquire = acquire, breakLink = breakLink, getLinkURL = getLinkURL, isLink = isLink, isReadonly = isReadonly, queryInterface = queryInterface, release = release, reload = reload, storeOwn = storeOwn)
  
    __obj.asInstanceOf[XLinkageSupport]
  }
}

