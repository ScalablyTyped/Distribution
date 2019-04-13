package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssociationRequest extends js.Object {
  /**
    * The association ID for which you want information.
    */
  var AssociationId: js.UndefOr[AssociationId] = js.undefined
  /**
    * Specify the association version to retrieve. To view the latest version, either specify $LATEST for this parameter, or omit this parameter. To view a list of all associations for an instance, use ListAssociations. To get a list of versions for a specific association, use ListAssociationVersions. 
    */
  var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
}

object DescribeAssociationRequest {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationVersion: AssociationVersion = null,
    InstanceId: InstanceId = null,
    Name: DocumentARN = null
  ): DescribeAssociationRequest = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[DescribeAssociationRequest]
  }
}

