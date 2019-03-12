package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * handles string representations of property values.
  * @see
  */
trait XStringRepresentation extends js.Object {
  /**
    * converts a into a string.
    * @param PropertyValue The to-be-converted property value.
    * @returns The converted string representation of the property value.
    * @see XPropertyHandler.convertToControlValue()
    */
  def convertToControlValue(PropertyValue: js.Any): java.lang.String
  /**
    * converts a string into an any with the type defined by the target type.
    * @param ControlValue The to-be-converted control value.
    * @param ControlValueType The target type of the conversion.
    * @see XPropertyHandler.convertToPropertyValue()
    */
  def convertToPropertyValue(ControlValue: java.lang.String, ControlValueType: activexDashLibreofficeLib.`type`): js.Any
}

object XStringRepresentation {
  @scala.inline
  def apply(
    convertToControlValue: js.Any => java.lang.String,
    convertToPropertyValue: (java.lang.String, activexDashLibreofficeLib.`type`) => js.Any
  ): XStringRepresentation = {
    val __obj = js.Dynamic.literal(convertToControlValue = js.Any.fromFunction1(convertToControlValue), convertToPropertyValue = js.Any.fromFunction2(convertToPropertyValue))
  
    __obj.asInstanceOf[XStringRepresentation]
  }
}

