package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies common implementation for embedded objects and links persistence. */
trait XCommonEmbedPersist
  extends StObject
     with XInterface {
  
  /**
    * allows to detect if the data store is read-only.
    * @returns `TRUE` if the data store is readonly or opened readonly `FALSE` otherwise
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  def isReadonly(): Boolean
  
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
  def reload(aMediaArgs: SeqEquiv[PropertyValue], aObjectArgs: SeqEquiv[PropertyValue]): Unit
  
  /**
    * lets the object or the link store itself.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during saving
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeOwn(): Unit
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
  implicit class XCommonEmbedPersistMutableBuilder[Self <: XCommonEmbedPersist] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsReadonly(value: () => Boolean): Self = StObject.set(x, "isReadonly", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReload(value: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStoreOwn(value: () => Unit): Self = StObject.set(x, "storeOwn", js.Any.fromFunction0(value))
  }
}
