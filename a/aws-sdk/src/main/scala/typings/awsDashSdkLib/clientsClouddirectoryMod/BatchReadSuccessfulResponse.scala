package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchReadSuccessfulResponse extends js.Object {
  /**
    * The list of attributes to retrieve from the typed link.
    */
  var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributesResponse] = js.undefined
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributesResponse] = js.undefined
  /**
    * Retrieves metadata about an object.
    */
  var GetObjectInformation: js.UndefOr[BatchGetObjectInformationResponse] = js.undefined
  /**
    * Lists indices attached to an object.
    */
  var ListAttachedIndices: js.UndefOr[BatchListAttachedIndicesResponse] = js.undefined
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinksResponse] = js.undefined
  /**
    * Lists objects attached to the specified index.
    */
  var ListIndex: js.UndefOr[BatchListIndexResponse] = js.undefined
  /**
    * Lists all attributes that are associated with an object.
    */
  var ListObjectAttributes: js.UndefOr[BatchListObjectAttributesResponse] = js.undefined
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  var ListObjectChildren: js.UndefOr[BatchListObjectChildrenResponse] = js.undefined
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure.
    */
  var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPathsResponse] = js.undefined
  var ListObjectParents: js.UndefOr[BatchListObjectParentsResponse] = js.undefined
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  var ListObjectPolicies: js.UndefOr[BatchListObjectPoliciesResponse] = js.undefined
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinksResponse] = js.undefined
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachmentsResponse] = js.undefined
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  var LookupPolicy: js.UndefOr[BatchLookupPolicyResponse] = js.undefined
}

object BatchReadSuccessfulResponse {
  @scala.inline
  def apply(
    GetLinkAttributes: BatchGetLinkAttributesResponse = null,
    GetObjectAttributes: BatchGetObjectAttributesResponse = null,
    GetObjectInformation: BatchGetObjectInformationResponse = null,
    ListAttachedIndices: BatchListAttachedIndicesResponse = null,
    ListIncomingTypedLinks: BatchListIncomingTypedLinksResponse = null,
    ListIndex: BatchListIndexResponse = null,
    ListObjectAttributes: BatchListObjectAttributesResponse = null,
    ListObjectChildren: BatchListObjectChildrenResponse = null,
    ListObjectParentPaths: BatchListObjectParentPathsResponse = null,
    ListObjectParents: BatchListObjectParentsResponse = null,
    ListObjectPolicies: BatchListObjectPoliciesResponse = null,
    ListOutgoingTypedLinks: BatchListOutgoingTypedLinksResponse = null,
    ListPolicyAttachments: BatchListPolicyAttachmentsResponse = null,
    LookupPolicy: BatchLookupPolicyResponse = null
  ): BatchReadSuccessfulResponse = {
    val __obj = js.Dynamic.literal()
    if (GetLinkAttributes != null) __obj.updateDynamic("GetLinkAttributes")(GetLinkAttributes)
    if (GetObjectAttributes != null) __obj.updateDynamic("GetObjectAttributes")(GetObjectAttributes)
    if (GetObjectInformation != null) __obj.updateDynamic("GetObjectInformation")(GetObjectInformation)
    if (ListAttachedIndices != null) __obj.updateDynamic("ListAttachedIndices")(ListAttachedIndices)
    if (ListIncomingTypedLinks != null) __obj.updateDynamic("ListIncomingTypedLinks")(ListIncomingTypedLinks)
    if (ListIndex != null) __obj.updateDynamic("ListIndex")(ListIndex)
    if (ListObjectAttributes != null) __obj.updateDynamic("ListObjectAttributes")(ListObjectAttributes)
    if (ListObjectChildren != null) __obj.updateDynamic("ListObjectChildren")(ListObjectChildren)
    if (ListObjectParentPaths != null) __obj.updateDynamic("ListObjectParentPaths")(ListObjectParentPaths)
    if (ListObjectParents != null) __obj.updateDynamic("ListObjectParents")(ListObjectParents)
    if (ListObjectPolicies != null) __obj.updateDynamic("ListObjectPolicies")(ListObjectPolicies)
    if (ListOutgoingTypedLinks != null) __obj.updateDynamic("ListOutgoingTypedLinks")(ListOutgoingTypedLinks)
    if (ListPolicyAttachments != null) __obj.updateDynamic("ListPolicyAttachments")(ListPolicyAttachments)
    if (LookupPolicy != null) __obj.updateDynamic("LookupPolicy")(LookupPolicy)
    __obj.asInstanceOf[BatchReadSuccessfulResponse]
  }
}

