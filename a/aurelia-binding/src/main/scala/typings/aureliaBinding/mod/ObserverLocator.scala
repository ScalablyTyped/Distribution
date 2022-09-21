package typings.aureliaBinding.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "ObserverLocator")
@js.native
open class ObserverLocator () extends StObject {
  
  /**
    * Adds a property observation adapter.
    */
  def addAdapter(adapter: ObjectObservationAdapter): Unit = js.native
  
  /**
    * Gets an observer for array mutation.
    */
  def getArrayObserver(array: js.Array[Any]): InternalCollectionObserver = js.native
  
  /**
    * Gets an observer for map mutation.
    */
  def getMapObserver(map: Map[Any, Any]): InternalCollectionObserver = js.native
  
  /**
    * Gets an observer for property changes.
    */
  def getObserver(obj: Any, propertyName: String): InternalPropertyObserver = js.native
  
  /**
    * Gets an observer for set mutation.
    */
  def getSetObserver(set: Set[Any]): InternalCollectionObserver = js.native
}
