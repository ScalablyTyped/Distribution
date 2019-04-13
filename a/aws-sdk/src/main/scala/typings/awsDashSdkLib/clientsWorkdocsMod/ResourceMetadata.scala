package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceMetadata extends js.Object {
  /**
    * The ID of the resource.
    */
  var Id: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * The original name of the resource before a rename operation.
    */
  var OriginalName: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * The owner of the resource.
    */
  var Owner: js.UndefOr[UserMetadata] = js.undefined
  /**
    * The parent ID of the resource before a rename operation.
    */
  var ParentId: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[ResourceType] = js.undefined
  /**
    * The version ID of the resource. This is an optional field and is filled for action on document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
}

object ResourceMetadata {
  @scala.inline
  def apply(
    Id: ResourceIdType = null,
    Name: ResourceNameType = null,
    OriginalName: ResourceNameType = null,
    Owner: UserMetadata = null,
    ParentId: ResourceIdType = null,
    Type: ResourceType = null,
    VersionId: DocumentVersionIdType = null
  ): ResourceMetadata = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OriginalName != null) __obj.updateDynamic("OriginalName")(OriginalName)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[ResourceMetadata]
  }
}

