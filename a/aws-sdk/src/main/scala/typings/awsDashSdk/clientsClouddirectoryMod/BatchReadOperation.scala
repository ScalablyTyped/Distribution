package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchReadOperation extends js.Object {
  /**
    * Retrieves attributes that are associated with a typed link.
    */
  var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributes] = js.native
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributes] = js.native
  /**
    * Retrieves metadata about an object.
    */
  var GetObjectInformation: js.UndefOr[BatchGetObjectInformation] = js.native
  /**
    * Lists indices attached to an object.
    */
  var ListAttachedIndices: js.UndefOr[BatchListAttachedIndices] = js.native
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinks] = js.native
  /**
    * Lists objects attached to the specified index.
    */
  var ListIndex: js.UndefOr[BatchListIndex] = js.native
  /**
    * Lists all attributes that are associated with an object.
    */
  var ListObjectAttributes: js.UndefOr[BatchListObjectAttributes] = js.native
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  var ListObjectChildren: js.UndefOr[BatchListObjectChildren] = js.native
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure.
    */
  var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPaths] = js.native
  var ListObjectParents: js.UndefOr[BatchListObjectParents] = js.native
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  var ListObjectPolicies: js.UndefOr[BatchListObjectPolicies] = js.native
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinks] = js.native
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachments] = js.native
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  var LookupPolicy: js.UndefOr[BatchLookupPolicy] = js.native
}

object BatchReadOperation {
  @scala.inline
  def apply(
    GetLinkAttributes: BatchGetLinkAttributes = null,
    GetObjectAttributes: BatchGetObjectAttributes = null,
    GetObjectInformation: BatchGetObjectInformation = null,
    ListAttachedIndices: BatchListAttachedIndices = null,
    ListIncomingTypedLinks: BatchListIncomingTypedLinks = null,
    ListIndex: BatchListIndex = null,
    ListObjectAttributes: BatchListObjectAttributes = null,
    ListObjectChildren: BatchListObjectChildren = null,
    ListObjectParentPaths: BatchListObjectParentPaths = null,
    ListObjectParents: BatchListObjectParents = null,
    ListObjectPolicies: BatchListObjectPolicies = null,
    ListOutgoingTypedLinks: BatchListOutgoingTypedLinks = null,
    ListPolicyAttachments: BatchListPolicyAttachments = null,
    LookupPolicy: BatchLookupPolicy = null
  ): BatchReadOperation = {
    val __obj = js.Dynamic.literal()
    if (GetLinkAttributes != null) __obj.updateDynamic("GetLinkAttributes")(GetLinkAttributes.asInstanceOf[js.Any])
    if (GetObjectAttributes != null) __obj.updateDynamic("GetObjectAttributes")(GetObjectAttributes.asInstanceOf[js.Any])
    if (GetObjectInformation != null) __obj.updateDynamic("GetObjectInformation")(GetObjectInformation.asInstanceOf[js.Any])
    if (ListAttachedIndices != null) __obj.updateDynamic("ListAttachedIndices")(ListAttachedIndices.asInstanceOf[js.Any])
    if (ListIncomingTypedLinks != null) __obj.updateDynamic("ListIncomingTypedLinks")(ListIncomingTypedLinks.asInstanceOf[js.Any])
    if (ListIndex != null) __obj.updateDynamic("ListIndex")(ListIndex.asInstanceOf[js.Any])
    if (ListObjectAttributes != null) __obj.updateDynamic("ListObjectAttributes")(ListObjectAttributes.asInstanceOf[js.Any])
    if (ListObjectChildren != null) __obj.updateDynamic("ListObjectChildren")(ListObjectChildren.asInstanceOf[js.Any])
    if (ListObjectParentPaths != null) __obj.updateDynamic("ListObjectParentPaths")(ListObjectParentPaths.asInstanceOf[js.Any])
    if (ListObjectParents != null) __obj.updateDynamic("ListObjectParents")(ListObjectParents.asInstanceOf[js.Any])
    if (ListObjectPolicies != null) __obj.updateDynamic("ListObjectPolicies")(ListObjectPolicies.asInstanceOf[js.Any])
    if (ListOutgoingTypedLinks != null) __obj.updateDynamic("ListOutgoingTypedLinks")(ListOutgoingTypedLinks.asInstanceOf[js.Any])
    if (ListPolicyAttachments != null) __obj.updateDynamic("ListPolicyAttachments")(ListPolicyAttachments.asInstanceOf[js.Any])
    if (LookupPolicy != null) __obj.updateDynamic("LookupPolicy")(LookupPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchReadOperation]
  }
}

