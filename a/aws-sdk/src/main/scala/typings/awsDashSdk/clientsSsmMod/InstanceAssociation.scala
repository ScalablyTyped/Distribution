package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociation extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationId] = js.native
  /**
    * Version information for the association on the instance.
    */
  var AssociationVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationVersion] = js.native
  /**
    * The content of the association document for the instance(s).
    */
  var Content: js.UndefOr[DocumentContent] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.native
}

object InstanceAssociation {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationVersion: AssociationVersion = null,
    Content: DocumentContent = null,
    InstanceId: InstanceId = null
  ): InstanceAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAssociation]
  }
}

