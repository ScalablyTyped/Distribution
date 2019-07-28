package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchWriteOperation extends js.Object {
  /**
    * A batch operation that adds a facet to an object.
    */
  var AddFacetToObject: js.UndefOr[BatchAddFacetToObject] = js.undefined
  /**
    * Attaches an object to a Directory.
    */
  var AttachObject: js.UndefOr[BatchAttachObject] = js.undefined
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  var AttachPolicy: js.UndefOr[BatchAttachPolicy] = js.undefined
  /**
    * Attaches the specified object to the specified index.
    */
  var AttachToIndex: js.UndefOr[BatchAttachToIndex] = js.undefined
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  var AttachTypedLink: js.UndefOr[BatchAttachTypedLink] = js.undefined
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  var CreateIndex: js.UndefOr[BatchCreateIndex] = js.undefined
  /**
    * Creates an object.
    */
  var CreateObject: js.UndefOr[BatchCreateObject] = js.undefined
  /**
    * Deletes an object in a Directory.
    */
  var DeleteObject: js.UndefOr[BatchDeleteObject] = js.undefined
  /**
    * Detaches the specified object from the specified index.
    */
  var DetachFromIndex: js.UndefOr[BatchDetachFromIndex] = js.undefined
  /**
    * Detaches an object from a Directory.
    */
  var DetachObject: js.UndefOr[BatchDetachObject] = js.undefined
  /**
    * Detaches a policy from a Directory.
    */
  var DetachPolicy: js.UndefOr[BatchDetachPolicy] = js.undefined
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  var DetachTypedLink: js.UndefOr[BatchDetachTypedLink] = js.undefined
  /**
    * A batch operation that removes a facet from an object.
    */
  var RemoveFacetFromObject: js.UndefOr[BatchRemoveFacetFromObject] = js.undefined
  /**
    * Updates a given object's attributes.
    */
  var UpdateLinkAttributes: js.UndefOr[BatchUpdateLinkAttributes] = js.undefined
  /**
    * Updates a given object's attributes.
    */
  var UpdateObjectAttributes: js.UndefOr[BatchUpdateObjectAttributes] = js.undefined
}

object BatchWriteOperation {
  @scala.inline
  def apply(
    AddFacetToObject: BatchAddFacetToObject = null,
    AttachObject: BatchAttachObject = null,
    AttachPolicy: BatchAttachPolicy = null,
    AttachToIndex: BatchAttachToIndex = null,
    AttachTypedLink: BatchAttachTypedLink = null,
    CreateIndex: BatchCreateIndex = null,
    CreateObject: BatchCreateObject = null,
    DeleteObject: BatchDeleteObject = null,
    DetachFromIndex: BatchDetachFromIndex = null,
    DetachObject: BatchDetachObject = null,
    DetachPolicy: BatchDetachPolicy = null,
    DetachTypedLink: BatchDetachTypedLink = null,
    RemoveFacetFromObject: BatchRemoveFacetFromObject = null,
    UpdateLinkAttributes: BatchUpdateLinkAttributes = null,
    UpdateObjectAttributes: BatchUpdateObjectAttributes = null
  ): BatchWriteOperation = {
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
    __obj.asInstanceOf[BatchWriteOperation]
  }
}

