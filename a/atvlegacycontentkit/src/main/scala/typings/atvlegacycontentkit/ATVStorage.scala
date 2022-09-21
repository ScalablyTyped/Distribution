package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type used to define the local and session storage objects.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVStorage
  extends StObject
     with /**
  * Any other arbitary property is allowed here.
  */
/* x */ StringDictionary[Any] {
  
  /**
    * Deletes all items from the storage object.
    */
  def clear(): Unit
  
  /**
    * Get a value from the storage.
    * @param key The key for the value you want to find.
    */
  def getItem(key: String): Any
  
  /**
    * Remove an item from the storage.
    * @param key The key of the item you want to remove.
    */
  def removeItem(key: String): Unit
  
  /**
    * Set a value for a particular key.
    * @param key The key you want this value to be associated with.
    * @param value The value you want to store. This cannot be null or undefined.
    */
  def setItem(key: String, value: Any): Unit
}
object ATVStorage {
  
  inline def apply(
    clear: () => Unit,
    getItem: String => Any,
    removeItem: String => Unit,
    setItem: (String, Any) => Unit
  ): ATVStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[ATVStorage]
  }
  
  extension [Self <: ATVStorage](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: String => Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: (String, Any) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
