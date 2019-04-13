package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAttribute extends js.Object {
  /**
    * Type of resource.
    */
  var Type: ResourceAttributeType
  /**
    * Value of the resource type.
    */
  var Value: ResourceAttributeValue
}

object ResourceAttribute {
  @scala.inline
  def apply(Type: ResourceAttributeType, Value: ResourceAttributeValue): ResourceAttribute = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[ResourceAttribute]
  }
}

