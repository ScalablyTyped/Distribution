package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "ObserverLocator")
@js.native
class ObserverLocator () extends js.Object {
  /**
    * Adds a property observation adapter.
    */
  def addAdapter(adapter: ObjectObservationAdapter): scala.Unit = js.native
  /**
    * Gets an observer for array mutation.
    */
  def getArrayObserver(array: js.Array[_]): InternalCollectionObserver = js.native
  /**
    * Gets an observer for map mutation.
    */
  def getMapObserver(map: stdLib.Map[_, _]): InternalCollectionObserver = js.native
  /**
    * Gets an observer for property changes.
    */
  def getObserver(obj: js.Any, propertyName: java.lang.String): InternalPropertyObserver = js.native
  /**
    * Gets an observer for set mutation.
    */
  def getSetObserver(set: stdLib.Set[_]): InternalCollectionObserver = js.native
}

