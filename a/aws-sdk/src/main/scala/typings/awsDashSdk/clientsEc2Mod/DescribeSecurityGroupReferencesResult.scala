package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSecurityGroupReferencesResult extends js.Object {
  /**
    * Information about the VPCs with the referencing security groups.
    */
  var SecurityGroupReferenceSet: js.UndefOr[SecurityGroupReferences] = js.undefined
}

object DescribeSecurityGroupReferencesResult {
  @scala.inline
  def apply(SecurityGroupReferenceSet: SecurityGroupReferences = null): DescribeSecurityGroupReferencesResult = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupReferenceSet != null) __obj.updateDynamic("SecurityGroupReferenceSet")(SecurityGroupReferenceSet)
    __obj.asInstanceOf[DescribeSecurityGroupReferencesResult]
  }
}

