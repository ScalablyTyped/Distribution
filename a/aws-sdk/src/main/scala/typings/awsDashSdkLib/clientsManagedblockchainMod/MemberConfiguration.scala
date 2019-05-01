package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberConfiguration extends js.Object {
  /**
    * An optional description of the member.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * Configuration properties of the blockchain framework relevant to the member.
    */
  var FrameworkConfiguration: MemberFrameworkConfiguration
  /**
    * The name of the member.
    */
  var Name: NetworkMemberNameString
}

object MemberConfiguration {
  @scala.inline
  def apply(
    FrameworkConfiguration: MemberFrameworkConfiguration,
    Name: NetworkMemberNameString,
    Description: DescriptionString = null
  ): MemberConfiguration = {
    val __obj = js.Dynamic.literal(FrameworkConfiguration = FrameworkConfiguration, Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[MemberConfiguration]
  }
}

