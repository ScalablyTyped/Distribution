package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies common implementation for embedded objects and links persistence. */
@js.native
trait XCommonEmbedPersist extends XInterface {
  /**
    * allows to detect if the data store is read-only.
    * @returns `TRUE` if the data store is readonly or opened readonly `FALSE` otherwise
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  def isReadonly(): Boolean = js.native
  /**
    * lets the object or the link reload itself.
    *
    * If the object has persistence it will be reloaded from its persistent entry.
    * @param aMediaArgs optional parameters for document reloading, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for object reloading, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def reload(aMediaArgs: SeqEquiv[PropertyValue], aObjectArgs: SeqEquiv[PropertyValue]): Unit = js.native
  /**
    * lets the object or the link store itself.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during saving
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeOwn(): Unit = js.native
}

object XCommonEmbedPersist {
  @scala.inline
  def apply(
    acquire: () => Unit,
    isReadonly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    storeOwn: () => Unit
  ): XCommonEmbedPersist = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isReadonly = js.Any.fromFunction0(isReadonly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction2(reload), storeOwn = js.Any.fromFunction0(storeOwn))
    __obj.asInstanceOf[XCommonEmbedPersist]
  }
  @scala.inline
  implicit class XCommonEmbedPersistOps[Self <: XCommonEmbedPersist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsReadonly(value: () => Boolean): Self = this.set("isReadonly", js.Any.fromFunction0(value))
    @scala.inline
    def setReload(value: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit): Self = this.set("reload", js.Any.fromFunction2(value))
    @scala.inline
    def setStoreOwn(value: () => Unit): Self = this.set("storeOwn", js.Any.fromFunction0(value))
  }
  
}

