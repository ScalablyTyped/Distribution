package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchReadOperation extends js.Object {
  /**
    * Retrieves attributes that are associated with a typed link.
    */
  var GetLinkAttributes: js.UndefOr[BatchGetLinkAttributes] = js.undefined
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  var GetObjectAttributes: js.UndefOr[BatchGetObjectAttributes] = js.undefined
  /**
    * Retrieves metadata about an object.
    */
  var GetObjectInformation: js.UndefOr[BatchGetObjectInformation] = js.undefined
  /**
    * Lists indices attached to an object.
    */
  var ListAttachedIndices: js.UndefOr[BatchListAttachedIndices] = js.undefined
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListIncomingTypedLinks: js.UndefOr[BatchListIncomingTypedLinks] = js.undefined
  /**
    * Lists objects attached to the specified index.
    */
  var ListIndex: js.UndefOr[BatchListIndex] = js.undefined
  /**
    * Lists all attributes that are associated with an object.
    */
  var ListObjectAttributes: js.UndefOr[BatchListObjectAttributes] = js.undefined
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  var ListObjectChildren: js.UndefOr[BatchListObjectChildren] = js.undefined
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure.
    */
  var ListObjectParentPaths: js.UndefOr[BatchListObjectParentPaths] = js.undefined
  var ListObjectParents: js.UndefOr[BatchListObjectParents] = js.undefined
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  var ListObjectPolicies: js.UndefOr[BatchListObjectPolicies] = js.undefined
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  var ListOutgoingTypedLinks: js.UndefOr[BatchListOutgoingTypedLinks] = js.undefined
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  var ListPolicyAttachments: js.UndefOr[BatchListPolicyAttachments] = js.undefined
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  var LookupPolicy: js.UndefOr[BatchLookupPolicy] = js.undefined
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
    __obj.asInstanceOf[BatchReadOperation]
  }
}

