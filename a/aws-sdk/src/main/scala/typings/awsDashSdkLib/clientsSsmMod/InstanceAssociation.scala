package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAssociation extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[AssociationId] = js.undefined
  /**
    * Version information for the association on the instance.
    */
  var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
  /**
    * The content of the association document for the instance(s).
    */
  var Content: js.UndefOr[DocumentContent] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
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
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[InstanceAssociation]
  }
}

