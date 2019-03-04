package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a property value. */
trait PropertyValue extends js.Object {
  /**
    * contains an implementation-specific handle for the property.
    *
    * It may be -1 if the implementation has no handle. If available it can be used for fast lookups.
    */
  var Handle: scala.Double
  /**
    * specifies the name of the property.
    *
    * The name is unique within a sequence of PropertyValues. Upper and lower case are distinguished.
    */
  var Name: java.lang.String
  /** determines if the value comes from the object itself or from a default and if the value cannot be determined exactly. */
  var State: PropertyState
  /** contains the value of the property or `VOID` , if no value is available. */
  var Value: js.Any
}

object PropertyValue {
  @scala.inline
  def apply(Handle: scala.Double, Name: java.lang.String, State: PropertyState, Value: js.Any): PropertyValue = {
    val __obj = js.Dynamic.literal(Handle = Handle, Name = Name, State = State, Value = Value)
  
    __obj.asInstanceOf[PropertyValue]
  }
}

