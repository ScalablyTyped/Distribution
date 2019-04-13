package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyDifference extends js.Object {
  /**
    * The actual property value of the resource property.
    */
  var ActualValue: PropertyValue
  /**
    * The type of property difference.    ADD: A value has been added to a resource property that is an array or list data type.    REMOVE: The property has been removed from the current resource configuration.    NOT_EQUAL: The current property value differs from its expected value (as defined in the stack template and any values specified as template parameters).  
    */
  var DifferenceType: awsDashSdkLib.clientsCloudformationMod.DifferenceType
  /**
    * The expected property value of the resource property, as defined in the stack template and any values specified as template parameters.
    */
  var ExpectedValue: PropertyValue
  /**
    * The fully-qualified path to the resource property.
    */
  var PropertyPath: awsDashSdkLib.clientsCloudformationMod.PropertyPath
}

object PropertyDifference {
  @scala.inline
  def apply(
    ActualValue: PropertyValue,
    DifferenceType: DifferenceType,
    ExpectedValue: PropertyValue,
    PropertyPath: PropertyPath
  ): PropertyDifference = {
    val __obj = js.Dynamic.literal(ActualValue = ActualValue, DifferenceType = DifferenceType.asInstanceOf[js.Any], ExpectedValue = ExpectedValue, PropertyPath = PropertyPath)
  
    __obj.asInstanceOf[PropertyDifference]
  }
}

