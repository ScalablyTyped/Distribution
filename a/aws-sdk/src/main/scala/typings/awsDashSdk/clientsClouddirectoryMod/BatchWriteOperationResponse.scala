package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchWriteOperationResponse extends js.Object {
  /**
    * The result of an add facet to object batch operation.
    */
  var AddFacetToObject: js.UndefOr[BatchAddFacetToObjectResponse] = js.undefined
  /**
    * Attaches an object to a Directory.
    */
  var AttachObject: js.UndefOr[BatchAttachObjectResponse] = js.undefined
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  var AttachPolicy: js.UndefOr[BatchAttachPolicyResponse] = js.undefined
  /**
    * Attaches the specified object to the specified index.
    */
  var AttachToIndex: js.UndefOr[BatchAttachToIndexResponse] = js.undefined
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  var AttachTypedLink: js.UndefOr[BatchAttachTypedLinkResponse] = js.undefined
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  var CreateIndex: js.UndefOr[BatchCreateIndexResponse] = js.undefined
  /**
    * Creates an object in a Directory.
    */
  var CreateObject: js.UndefOr[BatchCreateObjectResponse] = js.undefined
  /**
    * Deletes an object in a Directory.
    */
  var DeleteObject: js.UndefOr[BatchDeleteObjectResponse] = js.undefined
  /**
    * Detaches the specified object from the specified index.
    */
  var DetachFromIndex: js.UndefOr[BatchDetachFromIndexResponse] = js.undefined
  /**
    * Detaches an object from a Directory.
    */
  var DetachObject: js.UndefOr[BatchDetachObjectResponse] = js.undefined
  /**
    * Detaches a policy from a Directory.
    */
  var DetachPolicy: js.UndefOr[BatchDetachPolicyResponse] = js.undefined
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  var DetachTypedLink: js.UndefOr[BatchDetachTypedLinkResponse] = js.undefined
  /**
    * The result of a batch remove facet from object operation.
    */
  var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObjectResponse] = js.undefined
  /**
    * Represents the output of a BatchWrite response operation.
    */
  var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributesResponse] = js.undefined
  /**
    * Updates a given object’s attributes.
    */
  var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributesResponse] = js.undefined
}

object BatchWriteOperationResponse {
  @scala.inline
  def apply(
    AddFacetToObject: BatchAddFacetToObjectResponse = null,
    AttachObject: BatchAttachObjectResponse = null,
    AttachPolicy: BatchAttachPolicyResponse = null,
    AttachToIndex: BatchAttachToIndexResponse = null,
    AttachTypedLink: BatchAttachTypedLinkResponse = null,
    CreateIndex: BatchCreateIndexResponse = null,
    CreateObject: BatchCreateObjectResponse = null,
    DeleteObject: BatchDeleteObjectResponse = null,
    DetachFromIndex: BatchDetachFromIndexResponse = null,
    DetachObject: BatchDetachObjectResponse = null,
    DetachPolicy: BatchDetachPolicyResponse = null,
    DetachTypedLink: BatchDetachTypedLinkResponse = null,
    RemoveFacetFromObject: BatchRemoveFacetFromObjectResponse = null,
    UpdateLinkAttributes: BatchUpdateLinkAttributesResponse = null,
    UpdateObjectAttributes: BatchUpdateObjectAttributesResponse = null
  ): BatchWriteOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (AddFacetToObject != null) __obj.updateDynamic("AddFacetToObject")(AddFacetToObject)
    if (AttachObject != null) __obj.updateDynamic("AttachObject")(AttachObject)
    if (AttachPolicy != null) __obj.updateDynamic("AttachPolicy")(AttachPolicy)
    if (AttachToIndex != null) __obj.updateDynamic("AttachToIndex")(AttachToIndex)
    if (AttachTypedLink != null) __obj.updateDynamic("AttachTypedLink")(AttachTypedLink)
    if (CreateIndex != null) __obj.updateDynamic("CreateIndex")(CreateIndex)
    if (CreateObject != null) __obj.updateDynamic("CreateObject")(CreateObject)
    if (DeleteObject != null) __obj.updateDynamic("DeleteObject")(DeleteObject)
    if (DetachFromIndex != null) __obj.updateDynamic("DetachFromIndex")(DetachFromIndex)
    if (DetachObject != null) __obj.updateDynamic("DetachObject")(DetachObject)
    if (DetachPolicy != null) __obj.updateDynamic("DetachPolicy")(DetachPolicy)
    if (DetachTypedLink != null) __obj.updateDynamic("DetachTypedLink")(DetachTypedLink)
    if (RemoveFacetFromObject != null) __obj.updateDynamic("RemoveFacetFromObject")(RemoveFacetFromObject)
    if (UpdateLinkAttributes != null) __obj.updateDynamic("UpdateLinkAttributes")(UpdateLinkAttributes)
    if (UpdateObjectAttributes != null) __obj.updateDynamic("UpdateObjectAttributes")(UpdateObjectAttributes)
    __obj.asInstanceOf[BatchWriteOperationResponse]
  }
}

