package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceInformationStringFilter extends js.Object {
  /**
    * The filter key name to describe your instances. For example: "InstanceIds"|"AgentVersion"|"PingStatus"|"PlatformTypes"|"ActivationIds"|"IamRole"|"ResourceType"|"AssociationStatus"|"Tag Key"
    */
  var Key: InstanceInformationStringFilterKey
  /**
    * The filter values.
    */
  var Values: InstanceInformationFilterValueSet
}

object InstanceInformationStringFilter {
  @scala.inline
  def apply(Key: InstanceInformationStringFilterKey, Values: InstanceInformationFilterValueSet): InstanceInformationStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key, Values = Values)
  
    __obj.asInstanceOf[InstanceInformationStringFilter]
  }
}

