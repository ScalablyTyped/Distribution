package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEmbedPersist2
  extends StObject
     with XEmbedPersist {
  
  /** Checks whether or not the object has created its persistent representation counterpart of its in-memory model. */
  def isStored(): Boolean
}
object XEmbedPersist2 {
  
  inline def apply(
    EntryName: String,
    acquire: () => Unit,
    getEntryName: () => String,
    hasEntry: () => Boolean,
    isReadonly: () => Boolean,
    isStored: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    saveCompleted: Boolean => Unit,
    setPersistentEntry: (XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    storeAsEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    storeOwn: () => Unit,
    storeToEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit
  ): XEmbedPersist2 = {
    val __obj = js.Dynamic.literal(EntryName = EntryName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEntryName = js.Any.fromFunction0(getEntryName), hasEntry = js.Any.fromFunction0(hasEntry), isReadonly = js.Any.fromFunction0(isReadonly), isStored = js.Any.fromFunction0(isStored), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction2(reload), saveCompleted = js.Any.fromFunction1(saveCompleted), setPersistentEntry = js.Any.fromFunction5(setPersistentEntry), storeAsEntry = js.Any.fromFunction4(storeAsEntry), storeOwn = js.Any.fromFunction0(storeOwn), storeToEntry = js.Any.fromFunction4(storeToEntry))
    __obj.asInstanceOf[XEmbedPersist2]
  }
  
  extension [Self <: XEmbedPersist2](x: Self) {
    
    inline def setIsStored(value: () => Boolean): Self = StObject.set(x, "isStored", js.Any.fromFunction0(value))
  }
}
