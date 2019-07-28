package typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs

import typings.activexDashLibreoffice.`type`
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
  def convertToControlValue(PropertyValue: js.Any): String
  /**
    * converts a string into an any with the type defined by the target type.
    * @param ControlValue The to-be-converted control value.
    * @param ControlValueType The target type of the conversion.
    * @see XPropertyHandler.convertToPropertyValue()
    */
  def convertToPropertyValue(ControlValue: String, ControlValueType: `type`): js.Any
}

object XStringRepresentation {
  @scala.inline
  def apply(convertToControlValue: js.Any => String, convertToPropertyValue: (String, `type`) => js.Any): XStringRepresentation = {
    val __obj = js.Dynamic.literal(convertToControlValue = js.Any.fromFunction1(convertToControlValue), convertToPropertyValue = js.Any.fromFunction2(convertToPropertyValue))
  
    __obj.asInstanceOf[XStringRepresentation]
  }
}

