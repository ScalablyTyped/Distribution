package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyDifference extends js.Object {
  /**
    * The actual property value of the resource property.
    */
  var ActualValue: PropertyValue = js.native
  /**
    * The type of property difference.    ADD: A value has been added to a resource property that is an array or list data type.    REMOVE: The property has been removed from the current resource configuration.    NOT_EQUAL: The current property value differs from its expected value (as defined in the stack template and any values specified as template parameters).  
    */
  var DifferenceType: typings.awsDashSdk.clientsCloudformationMod.DifferenceType = js.native
  /**
    * The expected property value of the resource property, as defined in the stack template and any values specified as template parameters.
    */
  var ExpectedValue: PropertyValue = js.native
  /**
    * The fully-qualified path to the resource property.
    */
  var PropertyPath: typings.awsDashSdk.clientsCloudformationMod.PropertyPath = js.native
}

object PropertyDifference {
  @scala.inline
  def apply(
    ActualValue: PropertyValue,
    DifferenceType: DifferenceType,
    ExpectedValue: PropertyValue,
    PropertyPath: PropertyPath
  ): PropertyDifference = {
    val __obj = js.Dynamic.literal(ActualValue = ActualValue.asInstanceOf[js.Any], DifferenceType = DifferenceType.asInstanceOf[js.Any], ExpectedValue = ExpectedValue.asInstanceOf[js.Any], PropertyPath = PropertyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertyDifference]
  }
}

