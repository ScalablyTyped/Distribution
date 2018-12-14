package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/clouddirectory", "CloudDirectory")
@js.native
object CloudDirectoryNs extends js.Object {
  
  trait AddFacetToObjectRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * Attributes on the facet that you are adding to the object.
         */
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    /**
         * A reference to the object you are adding the specified facet to.
         */
    var ObjectReference: ObjectReference
    /**
         * Identifiers for the facet that you are adding to the object. See SchemaFacet for details.
         */
    var SchemaFacet: SchemaFacet
  }
  
  
  trait AddFacetToObjectResponse extends js.Object
  
  
  trait ApplySchemaRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory into which the schema is copied. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * Published schema Amazon Resource Name (ARN) that needs to be copied. For more information, see arns.
         */
    var PublishedSchemaArn: Arn
  }
  
  
  trait ApplySchemaResponse extends js.Object {
    /**
         * The applied schema ARN that is associated with the copied schema in the Directory. You can use this ARN to describe the schema information applied on this directory. For more information, see arns.
         */
    var AppliedSchemaArn: js.UndefOr[Arn] = js.undefined
    /**
         * The ARN that is associated with the Directory. For more information, see arns.
         */
    var DirectoryArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait AttachObjectRequest extends js.Object {
    /**
         * The child object reference to be attached to the object.
         */
    var ChildReference: ObjectReference
    /**
         * Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The link name with which the child object is attached to the parent.
         */
    var LinkName: LinkName
    /**
         * The parent object reference.
         */
    var ParentReference: ObjectReference
  }
  
  
  trait AttachObjectResponse extends js.Object {
    /**
         * The attached ObjectIdentifier, which is the child ObjectIdentifier.
         */
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait AttachPolicyRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The reference that identifies the object to which the policy will be attached.
         */
    var ObjectReference: ObjectReference
    /**
         * The reference that is associated with the policy object.
         */
    var PolicyReference: ObjectReference
  }
  
  
  trait AttachPolicyResponse extends js.Object
  
  
  trait AttachToIndexRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the directory where the object and index exist.
         */
    var DirectoryArn: Arn
    /**
         * A reference to the index that you are attaching the object to.
         */
    var IndexReference: ObjectReference
    /**
         * A reference to the object that you are attaching to the index.
         */
    var TargetReference: ObjectReference
  }
  
  
  trait AttachToIndexResponse extends js.Object {
    /**
         * The ObjectIdentifier of the object that was attached to the index.
         */
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait AttachTypedLinkRequest extends js.Object {
    /**
         * A set of attributes that are associated with the typed link.
         */
    var Attributes: AttributeNameAndValueList
    /**
         * The Amazon Resource Name (ARN) of the directory where you want to attach the typed link.
         */
    var DirectoryArn: Arn
    /**
         * Identifies the source object that the typed link will attach to.
         */
    var SourceObjectReference: ObjectReference
    /**
         * Identifies the target object that the typed link will attach to.
         */
    var TargetObjectReference: ObjectReference
    /**
         * Identifies the typed link facet that is associated with the typed link.
         */
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }
  
  
  trait AttachTypedLinkResponse extends js.Object {
    /**
         * Returns a typed link specifier as output.
         */
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined
  }
  
  
  trait AttributeKey extends js.Object {
    /**
         * The name of the facet that the attribute exists within.
         */
    var FacetName: FacetName
    /**
         * The name of the attribute.
         */
    var Name: AttributeName
    /**
         * The Amazon Resource Name (ARN) of the schema that contains the facet and attribute.
         */
    var SchemaArn: Arn
  }
  
  
  trait AttributeKeyAndValue extends js.Object {
    /**
         * The key of the attribute.
         */
    var Key: AttributeKey
    /**
         * The value of the attribute.
         */
    var Value: TypedAttributeValue
  }
  
  
  trait AttributeNameAndValue extends js.Object {
    /**
         * The attribute name of the typed link.
         */
    var AttributeName: AttributeName
    /**
         * The value for the typed link.
         */
    var Value: TypedAttributeValue
  }
  
  
  trait BatchAddFacetToObject extends js.Object {
    /**
         * The attributes to set on the object.
         */
    var ObjectAttributeList: AttributeKeyAndValueList
    /**
         * A reference to the object being mutated.
         */
    var ObjectReference: ObjectReference
    /**
         * Represents the facet being added to the object.
         */
    var SchemaFacet: SchemaFacet
  }
  
  
  trait BatchAddFacetToObjectResponse extends js.Object
  
  
  trait BatchAttachObject extends js.Object {
    /**
         * The child object reference that is to be attached to the object.
         */
    var ChildReference: ObjectReference
    /**
         * The name of the link.
         */
    var LinkName: LinkName
    /**
         * The parent object reference.
         */
    var ParentReference: ObjectReference
  }
  
  
  trait BatchAttachObjectResponse extends js.Object {
    /**
         * The ObjectIdentifier of the object that has been attached.
         */
    var attachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait BatchAttachPolicy extends js.Object {
    /**
         * The reference that identifies the object to which the policy will be attached.
         */
    var ObjectReference: ObjectReference
    /**
         * The reference that is associated with the policy object.
         */
    var PolicyReference: ObjectReference
  }
  
  
  trait BatchAttachPolicyResponse extends js.Object
  
  
  trait BatchAttachToIndex extends js.Object {
    /**
         * A reference to the index that you are attaching the object to.
         */
    var IndexReference: ObjectReference
    /**
         * A reference to the object that you are attaching to the index.
         */
    var TargetReference: ObjectReference
  }
  
  
  trait BatchAttachToIndexResponse extends js.Object {
    /**
         * The ObjectIdentifier of the object that was attached to the index.
         */
    var AttachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait BatchAttachTypedLink extends js.Object {
    /**
         * A set of attributes that are associated with the typed link.
         */
    var Attributes: AttributeNameAndValueList
    /**
         * Identifies the source object that the typed link will attach to.
         */
    var SourceObjectReference: ObjectReference
    /**
         * Identifies the target object that the typed link will attach to.
         */
    var TargetObjectReference: ObjectReference
    /**
         * Identifies the typed link facet that is associated with the typed link.
         */
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }
  
  
  trait BatchAttachTypedLinkResponse extends js.Object {
    /**
         * Returns a typed link specifier as output.
         */
    var TypedLinkSpecifier: js.UndefOr[TypedLinkSpecifier] = js.undefined
  }
  
  
  trait BatchCreateIndex extends js.Object {
    /**
         * The batch reference name. See Transaction Support for more information.
         */
    var BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined
    /**
         * Indicates whether the attribute that is being indexed has unique values or not.
         */
    var IsUnique: Bool
    /**
         * The name of the link between the parent object and the index object.
         */
    var LinkName: js.UndefOr[LinkName] = js.undefined
    /**
         * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
         */
    var OrderedIndexedAttributeList: AttributeKeyList
    /**
         * A reference to the parent object that contains the index object.
         */
    var ParentReference: js.UndefOr[ObjectReference] = js.undefined
  }
  
  
  trait BatchCreateIndexResponse extends js.Object {
    /**
         * The ObjectIdentifier of the index created by this operation.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait BatchCreateObject extends js.Object {
    /**
         * The batch reference name. See Transaction Support for more information.
         */
    var BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined
    /**
         * The name of the link.
         */
    var LinkName: js.UndefOr[LinkName] = js.undefined
    /**
         * An attribute map, which contains an attribute ARN as the key and attribute value as the map value.
         */
    var ObjectAttributeList: AttributeKeyAndValueList
    /**
         * If specified, the parent reference to which this object will be attached.
         */
    var ParentReference: js.UndefOr[ObjectReference] = js.undefined
    /**
         * A list of FacetArns that will be associated with the object. For more information, see arns.
         */
    var SchemaFacet: SchemaFacetList
  }
  
  
  trait BatchCreateObjectResponse extends js.Object {
    /**
         * The ID that is associated with the object.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait BatchDeleteObject extends js.Object {
    /**
         * The reference that identifies the object.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchDeleteObjectResponse extends js.Object
  
  
  trait BatchDetachFromIndex extends js.Object {
    /**
         * A reference to the index object.
         */
    var IndexReference: ObjectReference
    /**
         * A reference to the object being detached from the index.
         */
    var TargetReference: ObjectReference
  }
  
  
  trait BatchDetachFromIndexResponse extends js.Object {
    /**
         * The ObjectIdentifier of the object that was detached from the index.
         */
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait BatchDetachObject extends js.Object {
    /**
         * The batch reference name. See Transaction Support for more information.
         */
    var BatchReferenceName: js.UndefOr[BatchReferenceName] = js.undefined
    /**
         * The name of the link.
         */
    var LinkName: LinkName
    /**
         * Parent reference from which the object with the specified link name is detached.
         */
    var ParentReference: ObjectReference
  }
  
  
  trait BatchDetachObjectResponse extends js.Object {
    /**
         * The ObjectIdentifier of the detached object.
         */
    var detachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait BatchDetachPolicy extends js.Object {
    /**
         * Reference that identifies the object whose policy object will be detached.
         */
    var ObjectReference: ObjectReference
    /**
         * Reference that identifies the policy object.
         */
    var PolicyReference: ObjectReference
  }
  
  
  trait BatchDetachPolicyResponse extends js.Object
  
  
  trait BatchDetachTypedLink extends js.Object {
    /**
         * Used to accept a typed link specifier as input.
         */
    var TypedLinkSpecifier: TypedLinkSpecifier
  }
  
  
  trait BatchDetachTypedLinkResponse extends js.Object
  
  
  trait BatchGetLinkAttributes extends js.Object {
    /**
         * A list of attribute names whose values will be retrieved.
         */
    var AttributeNames: AttributeNameList
    /**
         * Allows a typed link specifier to be accepted as input.
         */
    var TypedLinkSpecifier: TypedLinkSpecifier
  }
  
  
  trait BatchGetLinkAttributesResponse extends js.Object {
    /**
         * The attributes that are associated with the typed link.
         */
    var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  }
  
  
  trait BatchGetObjectAttributes extends js.Object {
    /**
         * List of attribute names whose values will be retrieved.
         */
    var AttributeNames: AttributeNameList
    /**
         * Reference that identifies the object whose attributes will be retrieved.
         */
    var ObjectReference: ObjectReference
    /**
         * Identifier for the facet whose attributes will be retrieved. See SchemaFacet for details.
         */
    var SchemaFacet: SchemaFacet
  }
  
  
  trait BatchGetObjectAttributesResponse extends js.Object {
    /**
         * The attribute values that are associated with an object.
         */
    var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  }
  
  
  trait BatchGetObjectInformation extends js.Object {
    /**
         * A reference to the object.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchGetObjectInformationResponse extends js.Object {
    /**
         * The ObjectIdentifier of the specified object.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    /**
         * The facets attached to the specified object.
         */
    var SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
  }
  
  
  trait BatchListAttachedIndices extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A reference to the object that has indices attached.
         */
    var TargetReference: ObjectReference
  }
  
  
  trait BatchListAttachedIndicesResponse extends js.Object {
    /**
         * The indices attached to the specified object.
         */
    var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait BatchListIncomingTypedLinks extends js.Object {
    /**
         * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
         */
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined
    /**
         * Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls.
         */
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the object whose attributes will be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchListIncomingTypedLinksResponse extends js.Object {
    /**
         * Returns one or more typed link specifiers as output.
         */
    var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait BatchListIndex extends js.Object {
    /**
         * The reference to the index to list.
         */
    var IndexReference: ObjectReference
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Specifies the ranges of indexed values that you want to query.
         */
    var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined
  }
  
  
  trait BatchListIndexResponse extends js.Object {
    /**
         * The objects and indexed values attached to the index.
         */
    var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait BatchListObjectAttributes extends js.Object {
    /**
         * Used to filter the list of object attributes that are associated with a certain facet.
         */
    var FacetFilter: js.UndefOr[SchemaFacet] = js.undefined
    /**
         * The maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Reference of the object whose attributes need to be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchListObjectAttributesResponse extends js.Object {
    /**
         * The attributes map that is associated with the object. AttributeArn is the key; attribute value is the value.
         */
    var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait BatchListObjectChildren extends js.Object {
    /**
         * Maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Reference of the object for which child objects are being listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchListObjectChildrenResponse extends js.Object {
    /**
         * The children structure, which is a map with the key as the LinkName and ObjectIdentifier as the value.
         */
    var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait BatchListObjectParentPaths extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the object whose attributes will be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchListObjectParentPathsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Returns the path to the ObjectIdentifiers that are associated with the directory.
         */
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList] = js.undefined
  }
  
  
  trait BatchListObjectParents extends js.Object {
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    var NextToken: js.UndefOr[NextToken] = js.undefined
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchListObjectParentsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken] = js.undefined
    var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
  }
  
  
  trait BatchListObjectPolicies extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the object whose attributes will be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchListObjectPoliciesResponse extends js.Object {
    /**
         * A list of policy ObjectIdentifiers, that are attached to the object.
         */
    var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait BatchListOutgoingTypedLinks extends js.Object {
    /**
         * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
         */
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined
    /**
         * Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they are supplied to any API calls.
         */
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the object whose attributes will be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchListOutgoingTypedLinksResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Returns a typed link specifier as output.
         */
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
  }
  
  
  trait BatchListPolicyAttachments extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the policy object.
         */
    var PolicyReference: ObjectReference
  }
  
  
  trait BatchListPolicyAttachmentsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of ObjectIdentifiers to which the policy is attached.
         */
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
  }
  
  
  trait BatchLookupPolicy extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Reference that identifies the object whose policies will be looked up.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchLookupPolicyResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
         */
    var PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined
  }
  
  
  trait BatchReadException extends js.Object {
    /**
         * An exception message that is associated with the failure.
         */
    var Message: js.UndefOr[ExceptionMessage] = js.undefined
    /**
         * A type of exception, such as InvalidArnException.
         */
    var Type: js.UndefOr[BatchReadExceptionType] = js.undefined
  }
  
  
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
  
  
  trait BatchReadOperationResponse extends js.Object {
    /**
         * Identifies which operation in a batch has failed.
         */
    var ExceptionResponse: js.UndefOr[BatchReadException] = js.undefined
    /**
         * Identifies which operation in a batch has succeeded.
         */
    var SuccessfulResponse: js.UndefOr[BatchReadSuccessfulResponse] = js.undefined
  }
  
  
  trait BatchReadRequest extends js.Object {
    /**
         * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * A list of operations that are part of the batch.
         */
    var Operations: BatchReadOperationList
  }
  
  
  trait BatchReadResponse extends js.Object {
    /**
         * A list of all the responses for each batch read.
         */
    var Responses: js.UndefOr[BatchReadOperationResponseList] = js.undefined
  }
  
  
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
  
  
  trait BatchRemoveFacetFromObject extends js.Object {
    /**
         * A reference to the object whose facet will be removed.
         */
    var ObjectReference: ObjectReference
    /**
         * The facet to remove from the object.
         */
    var SchemaFacet: SchemaFacet
  }
  
  
  trait BatchRemoveFacetFromObjectResponse extends js.Object
  
  
  trait BatchUpdateLinkAttributes extends js.Object {
    /**
         * The attributes update structure.
         */
    var AttributeUpdates: LinkAttributeUpdateList
    /**
         * Allows a typed link specifier to be accepted as input.
         */
    var TypedLinkSpecifier: TypedLinkSpecifier
  }
  
  
  trait BatchUpdateLinkAttributesResponse extends js.Object
  
  
  trait BatchUpdateObjectAttributes extends js.Object {
    /**
         * Attributes update structure.
         */
    var AttributeUpdates: ObjectAttributeUpdateList
    /**
         * Reference that identifies the object.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait BatchUpdateObjectAttributesResponse extends js.Object {
    /**
         * ID that is associated with the object.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
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
  
  
  trait BatchWriteRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * A list of operations that are part of the batch.
         */
    var Operations: BatchWriteOperationList
  }
  
  
  trait BatchWriteResponse extends js.Object {
    /**
         * A list of all the responses for each batch write.
         */
    var Responses: js.UndefOr[BatchWriteOperationResponseList] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateDirectoryRequest extends js.Object {
    /**
         * The name of the Directory. Should be unique per account, per region.
         */
    var Name: DirectoryName
    /**
         * The Amazon Resource Name (ARN) of the published schema that will be copied into the data Directory. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait CreateDirectoryResponse extends js.Object {
    /**
         * The ARN of the published schema in the Directory. Once a published schema is copied into the directory, it has its own ARN, which is referred to applied schema ARN. For more information, see arns.
         */
    var AppliedSchemaArn: Arn
    /**
         * The ARN that is associated with the Directory. For more information, see arns.
         */
    var DirectoryArn: DirectoryArn
    /**
         * The name of the Directory.
         */
    var Name: DirectoryName
    /**
         * The root object node of the created directory.
         */
    var ObjectIdentifier: ObjectIdentifier
  }
  
  
  trait CreateFacetRequest extends js.Object {
    /**
         * The attributes that are associated with the Facet.
         */
    var Attributes: js.UndefOr[FacetAttributeList] = js.undefined
    /**
         * There are two different styles that you can define on any given facet, Static and Dynamic. For static facets, all attributes must be defined in the schema. For dynamic facets, attributes can be defined during data plane operations.
         */
    var FacetStyle: js.UndefOr[FacetStyle] = js.undefined
    /**
         * The name of the Facet, which is unique for a given schema.
         */
    var Name: FacetName
    /**
         * Specifies whether a given object created from this facet is of type node, leaf node, policy or index.   Node: Can have multiple children but one parent.     Leaf node: Cannot have children but can have multiple parents.     Policy: Allows you to store a policy document and policy type. For more information, see Policies.     Index: Can be created with the Index API.  
         */
    var ObjectType: js.UndefOr[ObjectType] = js.undefined
    /**
         * The schema ARN in which the new Facet will be created. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait CreateFacetResponse extends js.Object
  
  
  trait CreateIndexRequest extends js.Object {
    /**
         * The ARN of the directory where the index should be created.
         */
    var DirectoryArn: Arn
    /**
         * Indicates whether the attribute that is being indexed has unique values or not.
         */
    var IsUnique: Bool
    /**
         * The name of the link between the parent object and the index object.
         */
    var LinkName: js.UndefOr[LinkName] = js.undefined
    /**
         * Specifies the attributes that should be indexed on. Currently only a single attribute is supported.
         */
    var OrderedIndexedAttributeList: AttributeKeyList
    /**
         * A reference to the parent object that contains the index object.
         */
    var ParentReference: js.UndefOr[ObjectReference] = js.undefined
  }
  
  
  trait CreateIndexResponse extends js.Object {
    /**
         * The ObjectIdentifier of the index created by this operation.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait CreateObjectRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory in which the object will be created. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The name of link that is used to attach this object to a parent.
         */
    var LinkName: js.UndefOr[LinkName] = js.undefined
    /**
         * The attribute map whose attribute ARN contains the key and attribute value as the map value.
         */
    var ObjectAttributeList: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    /**
         * If specified, the parent reference to which this object will be attached.
         */
    var ParentReference: js.UndefOr[ObjectReference] = js.undefined
    /**
         * A list of schema facets to be associated with the object. Do not provide minor version components. See SchemaFacet for details.
         */
    var SchemaFacets: SchemaFacetList
  }
  
  
  trait CreateObjectResponse extends js.Object {
    /**
         * The identifier that is associated with the object.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait CreateSchemaRequest extends js.Object {
    /**
         * The name that is associated with the schema. This is unique to each account and in each region.
         */
    var Name: SchemaName
  }
  
  
  trait CreateSchemaResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
         */
    var SchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait CreateTypedLinkFacetRequest extends js.Object {
    /**
         *  Facet structure that is associated with the typed link facet.
         */
    var Facet: TypedLinkFacet
    /**
         * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait CreateTypedLinkFacetResponse extends js.Object
  
  
  trait DeleteDirectoryRequest extends js.Object {
    /**
         * The ARN of the directory to delete.
         */
    var DirectoryArn: Arn
  }
  
  
  trait DeleteDirectoryResponse extends js.Object {
    /**
         * The ARN of the deleted directory.
         */
    var DirectoryArn: Arn
  }
  
  
  trait DeleteFacetRequest extends js.Object {
    /**
         * The name of the facet to delete.
         */
    var Name: FacetName
    /**
         * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait DeleteFacetResponse extends js.Object
  
  
  trait DeleteObjectRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * A reference that identifies the object.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait DeleteObjectResponse extends js.Object
  
  
  trait DeleteSchemaRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait DeleteSchemaResponse extends js.Object {
    /**
         * The input ARN that is returned as part of the response. For more information, see arns.
         */
    var SchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait DeleteTypedLinkFacetRequest extends js.Object {
    /**
         * The unique name of the typed link facet.
         */
    var Name: TypedLinkName
    /**
         * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait DeleteTypedLinkFacetResponse extends js.Object
  
  
  trait DetachFromIndexRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the directory the index and object exist in.
         */
    var DirectoryArn: Arn
    /**
         * A reference to the index object.
         */
    var IndexReference: ObjectReference
    /**
         * A reference to the object being detached from the index.
         */
    var TargetReference: ObjectReference
  }
  
  
  trait DetachFromIndexResponse extends js.Object {
    /**
         * The ObjectIdentifier of the object that was detached from the index.
         */
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait DetachObjectRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The link name associated with the object that needs to be detached.
         */
    var LinkName: LinkName
    /**
         * The parent reference from which the object with the specified link name is detached.
         */
    var ParentReference: ObjectReference
  }
  
  
  trait DetachObjectResponse extends js.Object {
    /**
         * The ObjectIdentifier that was detached from the object.
         */
    var DetachedObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait DetachPolicyRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * Reference that identifies the object whose policy object will be detached.
         */
    var ObjectReference: ObjectReference
    /**
         * Reference that identifies the policy object.
         */
    var PolicyReference: ObjectReference
  }
  
  
  trait DetachPolicyResponse extends js.Object
  
  
  trait DetachTypedLinkRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the directory where you want to detach the typed link.
         */
    var DirectoryArn: Arn
    /**
         * Used to accept a typed link specifier as input.
         */
    var TypedLinkSpecifier: TypedLinkSpecifier
  }
  
  
  trait Directory extends js.Object {
    /**
         * The date and time when the directory was created.
         */
    var CreationDateTime: js.UndefOr[_Date] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the directory. For more information, see arns.
         */
    var DirectoryArn: js.UndefOr[DirectoryArn] = js.undefined
    /**
         * The name of the directory.
         */
    var Name: js.UndefOr[DirectoryName] = js.undefined
    /**
         * The state of the directory. Can be either Enabled, Disabled, or Deleted.
         */
    var State: js.UndefOr[DirectoryState] = js.undefined
  }
  
  
  trait DisableDirectoryRequest extends js.Object {
    /**
         * The ARN of the directory to disable.
         */
    var DirectoryArn: Arn
  }
  
  
  trait DisableDirectoryResponse extends js.Object {
    /**
         * The ARN of the directory that has been disabled.
         */
    var DirectoryArn: Arn
  }
  
  
  trait EnableDirectoryRequest extends js.Object {
    /**
         * The ARN of the directory to enable.
         */
    var DirectoryArn: Arn
  }
  
  
  trait EnableDirectoryResponse extends js.Object {
    /**
         * The ARN of the enabled directory.
         */
    var DirectoryArn: Arn
  }
  
  
  trait Facet extends js.Object {
    /**
         * There are two different styles that you can define on any given facet, Static and Dynamic. For static facets, all attributes must be defined in the schema. For dynamic facets, attributes can be defined during data plane operations.
         */
    var FacetStyle: js.UndefOr[FacetStyle] = js.undefined
    /**
         * The name of the Facet.
         */
    var Name: js.UndefOr[FacetName] = js.undefined
    /**
         * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
         */
    var ObjectType: js.UndefOr[ObjectType] = js.undefined
  }
  
  
  trait FacetAttribute extends js.Object {
    /**
         * A facet attribute consists of either a definition or a reference. This structure contains the attribute definition. See Attribute References for more information.
         */
    var AttributeDefinition: js.UndefOr[FacetAttributeDefinition] = js.undefined
    /**
         * An attribute reference that is associated with the attribute. See Attribute References for more information.
         */
    var AttributeReference: js.UndefOr[FacetAttributeReference] = js.undefined
    /**
         * The name of the facet attribute.
         */
    var Name: AttributeName
    /**
         * The required behavior of the FacetAttribute.
         */
    var RequiredBehavior: js.UndefOr[RequiredAttributeBehavior] = js.undefined
  }
  
  
  trait FacetAttributeDefinition extends js.Object {
    /**
         * The default value of the attribute (if configured).
         */
    var DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined
    /**
         * Whether the attribute is mutable or not.
         */
    var IsImmutable: js.UndefOr[Bool] = js.undefined
    /**
         * Validation rules attached to the attribute definition.
         */
    var Rules: js.UndefOr[RuleMap] = js.undefined
    /**
         * The type of the attribute.
         */
    var Type: FacetAttributeType
  }
  
  
  trait FacetAttributeReference extends js.Object {
    /**
         * The target attribute name that is associated with the facet reference. See Attribute References for more information.
         */
    var TargetAttributeName: AttributeName
    /**
         * The target facet name that is associated with the facet reference. See Attribute References for more information.
         */
    var TargetFacetName: FacetName
  }
  
  
  trait FacetAttributeUpdate extends js.Object {
    /**
         * The action to perform when updating the attribute.
         */
    var Action: js.UndefOr[UpdateActionType] = js.undefined
    /**
         * The attribute to update.
         */
    var Attribute: js.UndefOr[FacetAttribute] = js.undefined
  }
  
  
  trait GetAppliedSchemaVersionRequest extends js.Object {
    /**
         * The ARN of the applied schema.
         */
    var SchemaArn: Arn
  }
  
  
  trait GetAppliedSchemaVersionResponse extends js.Object {
    /**
         * Current applied schema ARN, including the minor version in use if one was provided.
         */
    var AppliedSchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait GetDirectoryRequest extends js.Object {
    /**
         * The ARN of the directory.
         */
    var DirectoryArn: DirectoryArn
  }
  
  
  trait GetDirectoryResponse extends js.Object {
    /**
         * Metadata about the directory.
         */
    var Directory: Directory
  }
  
  
  trait GetFacetRequest extends js.Object {
    /**
         * The name of the facet to retrieve.
         */
    var Name: FacetName
    /**
         * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait GetFacetResponse extends js.Object {
    /**
         * The Facet structure that is associated with the facet.
         */
    var Facet: js.UndefOr[Facet] = js.undefined
  }
  
  
  trait GetLinkAttributesRequest extends js.Object {
    /**
         * A list of attribute names whose values will be retrieved.
         */
    var AttributeNames: AttributeNameList
    /**
         * The consistency level at which to retrieve the attributes on a typed link.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the typed link resides. For more information, see arns or Typed Links.
         */
    var DirectoryArn: Arn
    /**
         * Allows a typed link specifier to be accepted as input.
         */
    var TypedLinkSpecifier: TypedLinkSpecifier
  }
  
  
  trait GetLinkAttributesResponse extends js.Object {
    /**
         * The attributes that are associated with the typed link.
         */
    var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  }
  
  
  trait GetObjectAttributesRequest extends js.Object {
    /**
         * List of attribute names whose values will be retrieved.
         */
    var AttributeNames: AttributeNameList
    /**
         * The consistency level at which to retrieve the attributes on an object.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides.
         */
    var DirectoryArn: Arn
    /**
         * Reference that identifies the object whose attributes will be retrieved.
         */
    var ObjectReference: ObjectReference
    /**
         * Identifier for the facet whose attributes will be retrieved. See SchemaFacet for details.
         */
    var SchemaFacet: SchemaFacet
  }
  
  
  trait GetObjectAttributesResponse extends js.Object {
    /**
         * The attributes that are associated with the object.
         */
    var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
  }
  
  
  trait GetObjectInformationRequest extends js.Object {
    /**
         * The consistency level at which to retrieve the object information.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The ARN of the directory being retrieved.
         */
    var DirectoryArn: Arn
    /**
         * A reference to the object.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait GetObjectInformationResponse extends js.Object {
    /**
         * The ObjectIdentifier of the specified object.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    /**
         * The facets attached to the specified object. Although the response does not include minor version information, the most recently applied minor version of each Facet is in effect. See GetAppliedSchemaVersion for details.
         */
    var SchemaFacets: js.UndefOr[SchemaFacetList] = js.undefined
  }
  
  
  trait GetSchemaAsJsonRequest extends js.Object {
    /**
         * The ARN of the schema to retrieve.
         */
    var SchemaArn: Arn
  }
  
  
  trait GetSchemaAsJsonResponse extends js.Object {
    /**
         * The JSON representation of the schema document.
         */
    var Document: js.UndefOr[SchemaJsonDocument] = js.undefined
    /**
         * The name of the retrieved schema.
         */
    var Name: js.UndefOr[SchemaName] = js.undefined
  }
  
  
  trait GetTypedLinkFacetInformationRequest extends js.Object {
    /**
         * The unique name of the typed link facet.
         */
    var Name: TypedLinkName
    /**
         * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait GetTypedLinkFacetInformationResponse extends js.Object {
    /**
         * The order of identity attributes for the facet, from most significant to least significant. The ability to filter typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls. For more information about identity attributes, see Typed Links.
         */
    var IdentityAttributeOrder: js.UndefOr[AttributeNameList] = js.undefined
  }
  
  
  trait IndexAttachment extends js.Object {
    /**
         * The indexed attribute values.
         */
    var IndexedAttributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    /**
         * In response to ListIndex, the ObjectIdentifier of the object attached to the index. In response to ListAttachedIndices, the ObjectIdentifier of the index attached to the object. This field will always contain the ObjectIdentifier of the object on the opposite side of the attachment specified in the query.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait LinkAttributeAction extends js.Object {
    /**
         * A type that can be either UPDATE_OR_CREATE or DELETE.
         */
    var AttributeActionType: js.UndefOr[UpdateActionType] = js.undefined
    /**
         * The value that you want to update to.
         */
    var AttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
  }
  
  
  trait LinkAttributeUpdate extends js.Object {
    /**
         * The action to perform as part of the attribute update.
         */
    var AttributeAction: js.UndefOr[LinkAttributeAction] = js.undefined
    /**
         * The key of the attribute being updated.
         */
    var AttributeKey: js.UndefOr[AttributeKey] = js.undefined
  }
  
  
  trait LinkNameToObjectIdentifierMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ObjectIdentifier]
  
  
  trait ListAppliedSchemaArnsRequest extends js.Object {
    /**
         * The ARN of the directory you are listing.
         */
    var DirectoryArn: Arn
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The response for ListAppliedSchemaArns when this parameter is used will list all minor version ARNs for a major version.
         */
    var SchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait ListAppliedSchemaArnsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The ARNs of schemas that are applied to the directory.
         */
    var SchemaArns: js.UndefOr[Arns] = js.undefined
  }
  
  
  trait ListAttachedIndicesRequest extends js.Object {
    /**
         * The consistency level to use for this operation.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The ARN of the directory.
         */
    var DirectoryArn: Arn
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A reference to the object that has indices attached.
         */
    var TargetReference: ObjectReference
  }
  
  
  trait ListAttachedIndicesResponse extends js.Object {
    /**
         * The indices attached to the specified object.
         */
    var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListDevelopmentSchemaArnsRequest extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListDevelopmentSchemaArnsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The ARNs of retrieved development schemas.
         */
    var SchemaArns: js.UndefOr[Arns] = js.undefined
  }
  
  
  trait ListDirectoriesRequest extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
         */
    var state: js.UndefOr[DirectoryState] = js.undefined
  }
  
  
  trait ListDirectoriesResponse extends js.Object {
    /**
         * Lists all directories that are associated with your account in pagination fashion.
         */
    var Directories: DirectoryList
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListFacetAttributesRequest extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The name of the facet whose attributes will be retrieved.
         */
    var Name: FacetName
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The ARN of the schema where the facet resides.
         */
    var SchemaArn: Arn
  }
  
  
  trait ListFacetAttributesResponse extends js.Object {
    /**
         * The attributes attached to the facet.
         */
    var Attributes: js.UndefOr[FacetAttributeList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListFacetNamesRequest extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The Amazon Resource Name (ARN) to retrieve facet names from.
         */
    var SchemaArn: Arn
  }
  
  
  trait ListFacetNamesResponse extends js.Object {
    /**
         * The names of facets that exist within the schema.
         */
    var FacetNames: js.UndefOr[FacetNameList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListIncomingTypedLinksRequest extends js.Object {
    /**
         * The consistency level to execute the request at.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
         */
    var DirectoryArn: Arn
    /**
         * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
         */
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined
    /**
         * Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls.
         */
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Reference that identifies the object whose attributes will be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait ListIncomingTypedLinksResponse extends js.Object {
    /**
         * Returns one or more typed link specifiers as output.
         */
    var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListIndexRequest extends js.Object {
    /**
         * The consistency level to execute the request at.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The ARN of the directory that the index exists in.
         */
    var DirectoryArn: Arn
    /**
         * The reference to the index to list.
         */
    var IndexReference: ObjectReference
    /**
         * The maximum number of objects in a single page to retrieve from the index during a request. For more information, see Amazon Cloud Directory Limits.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Specifies the ranges of indexed values that you want to query.
         */
    var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined
  }
  
  
  trait ListIndexResponse extends js.Object {
    /**
         * The objects and indexed values attached to the index.
         */
    var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListManagedSchemaArnsRequest extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The response for ListManagedSchemaArns. When this parameter is used, all minor version ARNs for a major version are listed.
         */
    var SchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait ListManagedSchemaArnsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The ARNs for all AWS managed schemas.
         */
    var SchemaArns: js.UndefOr[Arns] = js.undefined
  }
  
  
  trait ListObjectAttributesRequest extends js.Object {
    /**
         * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * Used to filter the list of object attributes that are associated with a certain facet.
         */
    var FacetFilter: js.UndefOr[SchemaFacet] = js.undefined
    /**
         * The maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the object whose attributes will be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait ListObjectAttributesResponse extends js.Object {
    /**
         * Attributes map that is associated with the object. AttributeArn is the key, and attribute value is the value.
         */
    var Attributes: js.UndefOr[AttributeKeyAndValueList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListObjectChildrenRequest extends js.Object {
    /**
         * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the object for which child objects are being listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait ListObjectChildrenResponse extends js.Object {
    /**
         * Children structure, which is a map with key as the LinkName and ObjectIdentifier as the value.
         */
    var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListObjectParentPathsRequest extends js.Object {
    /**
         * The ARN of the directory to which the parent path applies.
         */
    var DirectoryArn: Arn
    /**
         * The maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the object whose parent paths are listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait ListObjectParentPathsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Returns the path to the ObjectIdentifiers that are associated with the directory.
         */
    var PathToObjectIdentifiersList: js.UndefOr[PathToObjectIdentifiersList] = js.undefined
  }
  
  
  trait ListObjectParentsRequest extends js.Object {
    /**
         * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * When set to True, returns all ListObjectParentsResponse$ParentLinks. There could be multiple links between a parent-child pair.
         */
    var IncludeAllLinksToEachParent: js.UndefOr[Bool] = js.undefined
    /**
         * The maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the object for which parent objects are being listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait ListObjectParentsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Returns a list of parent reference and LinkName Tuples.
         */
    var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
    /**
         * The parent structure, which is a map with key as the ObjectIdentifier and LinkName as the value.
         */
    var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap] = js.undefined
  }
  
  
  trait ListObjectPoliciesRequest extends js.Object {
    /**
         * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Reference that identifies the object for which policies will be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait ListObjectPoliciesResponse extends js.Object {
    /**
         * A list of policy ObjectIdentifiers, that are attached to the object.
         */
    var AttachedPolicyIds: js.UndefOr[ObjectIdentifierList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListOutgoingTypedLinksRequest extends js.Object {
    /**
         * The consistency level to execute the request at.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
         */
    var DirectoryArn: Arn
    /**
         * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
         */
    var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined
    /**
         * Filters are interpreted in the order of the attributes defined on the typed link facet, not the order they are supplied to any API calls.
         */
    var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A reference that identifies the object whose attributes will be listed.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait ListOutgoingTypedLinksResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Returns a typed link specifier as output.
         */
    var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
  }
  
  
  trait ListPolicyAttachmentsRequest extends js.Object {
    /**
         * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
         */
    var ConsistencyLevel: js.UndefOr[ConsistencyLevel] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The reference that identifies the policy object.
         */
    var PolicyReference: ObjectReference
  }
  
  
  trait ListPolicyAttachmentsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of ObjectIdentifiers to which the policy is attached.
         */
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
  }
  
  
  trait ListPublishedSchemaArnsRequest extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The response for ListPublishedSchemaArns when this parameter is used will list all minor version ARNs for a major version.
         */
    var SchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait ListPublishedSchemaArnsResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The ARNs of published schemas.
         */
    var SchemaArns: js.UndefOr[Arns] = js.undefined
  }
  
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
         * The MaxResults parameter sets the maximum number of results returned in a single page. This is for future use and is not supported currently.
         */
    var MaxResults: js.UndefOr[TagsNumberResults] = js.undefined
    /**
         * The pagination token. This is for future use. Currently pagination is not supported for tagging.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the resource. Tagging is only supported for directories.
         */
    var ResourceArn: Arn
  }
  
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * A list of tag key value pairs that are associated with the response.
         */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  
  trait ListTypedLinkFacetAttributesRequest extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The unique name of the typed link facet.
         */
    var Name: TypedLinkName
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait ListTypedLinkFacetAttributesResponse extends js.Object {
    /**
         * An ordered set of attributes associate with the typed link.
         */
    var Attributes: js.UndefOr[TypedLinkAttributeDefinitionList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait ListTypedLinkFacetNamesRequest extends js.Object {
    /**
         * The maximum number of results to retrieve.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait ListTypedLinkFacetNamesResponse extends js.Object {
    /**
         * The names of typed link facets that exist within the schema.
         */
    var FacetNames: js.UndefOr[TypedLinkNameList] = js.undefined
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  
  trait LookupPolicyRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The maximum number of items to be retrieved in a single call. This is an approximate number.
         */
    var MaxResults: js.UndefOr[NumberResults] = js.undefined
    /**
         * The token to request the next page of results.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Reference that identifies the object whose policies will be looked up.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait LookupPolicyResponse extends js.Object {
    /**
         * The pagination token.
         */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
         * Provides list of path to policies. Policies contain PolicyId, ObjectIdentifier, and PolicyType. For more information, see Policies.
         */
    var PolicyToPathList: js.UndefOr[PolicyToPathList] = js.undefined
  }
  
  
  trait ObjectAttributeAction extends js.Object {
    /**
         * A type that can be either Update or Delete.
         */
    var ObjectAttributeActionType: js.UndefOr[UpdateActionType] = js.undefined
    /**
         * The value that you want to update to.
         */
    var ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
  }
  
  
  trait ObjectAttributeRange extends js.Object {
    /**
         * The key of the attribute that the attribute range covers.
         */
    var AttributeKey: js.UndefOr[AttributeKey] = js.undefined
    /**
         * The range of attribute values being selected.
         */
    var Range: js.UndefOr[TypedAttributeValueRange] = js.undefined
  }
  
  
  trait ObjectAttributeUpdate extends js.Object {
    /**
         * The action to perform as part of the attribute update.
         */
    var ObjectAttributeAction: js.UndefOr[ObjectAttributeAction] = js.undefined
    /**
         * The key of the attribute being updated.
         */
    var ObjectAttributeKey: js.UndefOr[AttributeKey] = js.undefined
  }
  
  
  trait ObjectIdentifierAndLinkNameTuple extends js.Object {
    /**
         * The name of the link between the parent and the child object.
         */
    var LinkName: js.UndefOr[LinkName] = js.undefined
    /**
         * The ID that is associated with the object.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait ObjectIdentifierToLinkNameMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[LinkName]
  
  
  trait ObjectReference extends js.Object {
    /**
         * A path selector supports easy selection of an object by the parent/child links leading to it from the directory root. Use the link names from each parent/child link to construct the path. Path selectors start with a slash (/) and link names are separated by slashes. For more information about paths, see Access Objects. You can identify an object in one of the following ways:    $ObjectIdentifier - An object identifier is an opaque string provided by Amazon Cloud Directory. When creating objects, the system will provide you with the identifier of the created object. An object’s identifier is immutable and no two objects will ever share the same object identifier    /some/path - Identifies the object based on path    #SomeBatchReference - Identifies the object in a batch call  
         */
    var Selector: js.UndefOr[SelectorObjectReference] = js.undefined
  }
  
  
  trait PathToObjectIdentifiers extends js.Object {
    /**
         * Lists ObjectIdentifiers starting from directory root to the object in the request.
         */
    var ObjectIdentifiers: js.UndefOr[ObjectIdentifierList] = js.undefined
    /**
         * The path that is used to identify the object starting from directory root.
         */
    var Path: js.UndefOr[PathString] = js.undefined
  }
  
  
  trait PolicyAttachment extends js.Object {
    /**
         * The ObjectIdentifier that is associated with PolicyAttachment.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
    /**
         * The ID of PolicyAttachment.
         */
    var PolicyId: js.UndefOr[ObjectIdentifier] = js.undefined
    /**
         * The type of policy that can be associated with PolicyAttachment.
         */
    var PolicyType: js.UndefOr[PolicyType] = js.undefined
  }
  
  
  trait PolicyToPath extends js.Object {
    /**
         * The path that is referenced from the root.
         */
    var Path: js.UndefOr[PathString] = js.undefined
    /**
         * List of policy objects.
         */
    var Policies: js.UndefOr[PolicyAttachmentList] = js.undefined
  }
  
  
  trait PublishSchemaRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the development schema. For more information, see arns.
         */
    var DevelopmentSchemaArn: Arn
    /**
         * The minor version under which the schema will be published. This parameter is recommended. Schemas have both a major and minor version associated with them.
         */
    var MinorVersion: js.UndefOr[Version] = js.undefined
    /**
         * The new name under which the schema will be published. If this is not provided, the development schema is considered.
         */
    var Name: js.UndefOr[SchemaName] = js.undefined
    /**
         * The major version under which the schema will be published. Schemas have both a major and minor version associated with them.
         */
    var Version: Version
  }
  
  
  trait PublishSchemaResponse extends js.Object {
    /**
         * The ARN that is associated with the published schema. For more information, see arns.
         */
    var PublishedSchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait PutSchemaFromJsonRequest extends js.Object {
    /**
         * The replacement JSON schema.
         */
    var Document: SchemaJsonDocument
    /**
         * The ARN of the schema to update.
         */
    var SchemaArn: Arn
  }
  
  
  trait PutSchemaFromJsonResponse extends js.Object {
    /**
         * The ARN of the schema to update.
         */
    var Arn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait RemoveFacetFromObjectRequest extends js.Object {
    /**
         * The ARN of the directory in which the object resides.
         */
    var DirectoryArn: Arn
    /**
         * A reference to the object to remove the facet from.
         */
    var ObjectReference: ObjectReference
    /**
         * The facet to remove. See SchemaFacet for details.
         */
    var SchemaFacet: SchemaFacet
  }
  
  
  trait RemoveFacetFromObjectResponse extends js.Object
  
  
  trait Rule extends js.Object {
    /**
         * The minimum and maximum parameters that are associated with the rule.
         */
    var Parameters: js.UndefOr[RuleParameterMap] = js.undefined
    /**
         * The type of attribute validation rule.
         */
    var Type: js.UndefOr[RuleType] = js.undefined
  }
  
  
  trait RuleMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Rule]
  
  
  trait RuleParameterMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[RuleParameterValue]
  
  
  trait SchemaFacet extends js.Object {
    /**
         * The name of the facet.
         */
    var FacetName: js.UndefOr[FacetName] = js.undefined
    /**
         * The ARN of the schema that contains the facet with no minor component. See arns and In-Place Schema Upgrade for a description of when to provide minor versions.
         */
    var SchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * The key that is associated with the tag.
         */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
         * The value that is associated with the tag.
         */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TagResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource. Tagging is only supported for directories.
         */
    var ResourceArn: Arn
    /**
         * A list of tag key-value pairs.
         */
    var Tags: TagList
  }
  
  
  trait TagResourceResponse extends js.Object
  
  
  trait TypedAttributeValue extends js.Object {
    /**
         * A binary data value.
         */
    var BinaryValue: js.UndefOr[BinaryAttributeValue] = js.undefined
    /**
         * A Boolean data value.
         */
    var BooleanValue: js.UndefOr[BooleanAttributeValue] = js.undefined
    /**
         * A date and time value.
         */
    var DatetimeValue: js.UndefOr[DatetimeAttributeValue] = js.undefined
    /**
         * A number data value.
         */
    var NumberValue: js.UndefOr[NumberAttributeValue] = js.undefined
    /**
         * A string data value.
         */
    var StringValue: js.UndefOr[StringAttributeValue] = js.undefined
  }
  
  
  trait TypedAttributeValueRange extends js.Object {
    /**
         * The inclusive or exclusive range end.
         */
    var EndMode: RangeMode
    /**
         * The attribute value to terminate the range at.
         */
    var EndValue: js.UndefOr[TypedAttributeValue] = js.undefined
    /**
         * The inclusive or exclusive range start.
         */
    var StartMode: RangeMode
    /**
         * The value to start the range at.
         */
    var StartValue: js.UndefOr[TypedAttributeValue] = js.undefined
  }
  
  
  trait TypedLinkAttributeDefinition extends js.Object {
    /**
         * The default value of the attribute (if configured).
         */
    var DefaultValue: js.UndefOr[TypedAttributeValue] = js.undefined
    /**
         * Whether the attribute is mutable or not.
         */
    var IsImmutable: js.UndefOr[Bool] = js.undefined
    /**
         * The unique name of the typed link attribute.
         */
    var Name: AttributeName
    /**
         * The required behavior of the TypedLinkAttributeDefinition.
         */
    var RequiredBehavior: RequiredAttributeBehavior
    /**
         * Validation rules that are attached to the attribute definition.
         */
    var Rules: js.UndefOr[RuleMap] = js.undefined
    /**
         * The type of the attribute.
         */
    var Type: FacetAttributeType
  }
  
  
  trait TypedLinkAttributeRange extends js.Object {
    /**
         * The unique name of the typed link attribute.
         */
    var AttributeName: js.UndefOr[AttributeName] = js.undefined
    /**
         * The range of attribute values that are being selected.
         */
    var Range: TypedAttributeValueRange
  }
  
  
  trait TypedLinkFacet extends js.Object {
    /**
         * A set of key-value pairs associated with the typed link. Typed link attributes are used when you have data values that are related to the link itself, and not to one of the two objects being linked. Identity attributes also serve to distinguish the link from others of the same type between the same objects.
         */
    var Attributes: TypedLinkAttributeDefinitionList
    /**
         * The set of attributes that distinguish links made from this facet from each other, in the order of significance. Listing typed links can filter on the values of these attributes. See ListOutgoingTypedLinks and ListIncomingTypedLinks for details.
         */
    var IdentityAttributeOrder: AttributeNameList
    /**
         * The unique name of the typed link facet.
         */
    var Name: TypedLinkName
  }
  
  
  trait TypedLinkFacetAttributeUpdate extends js.Object {
    /**
         * The action to perform when updating the attribute.
         */
    var Action: UpdateActionType
    /**
         * The attribute to update.
         */
    var Attribute: TypedLinkAttributeDefinition
  }
  
  
  trait TypedLinkSchemaAndFacetName extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
         */
    var SchemaArn: Arn
    /**
         * The unique name of the typed link facet.
         */
    var TypedLinkName: TypedLinkName
  }
  
  
  trait TypedLinkSpecifier extends js.Object {
    /**
         * Identifies the attribute value to update.
         */
    var IdentityAttributeValues: AttributeNameAndValueList
    /**
         * Identifies the source object that the typed link will attach to.
         */
    var SourceObjectReference: ObjectReference
    /**
         * Identifies the target object that the typed link will attach to.
         */
    var TargetObjectReference: ObjectReference
    /**
         * Identifies the typed link facet that is associated with the typed link.
         */
    var TypedLinkFacet: TypedLinkSchemaAndFacetName
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Adds a new Facet to an object. An object can have more than one facet applied on it.
       */
    def addFacetToObject(): awsDashSdkLib.libRequestMod.Request[AddFacetToObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Facet to an object. An object can have more than one facet applied on it.
       */
    def addFacetToObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddFacetToObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddFacetToObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Facet to an object. An object can have more than one facet applied on it.
       */
    def addFacetToObject(params: AddFacetToObjectRequest): awsDashSdkLib.libRequestMod.Request[AddFacetToObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new Facet to an object. An object can have more than one facet applied on it.
       */
    def addFacetToObject(
      params: AddFacetToObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AddFacetToObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AddFacetToObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
       */
    def applySchema(): awsDashSdkLib.libRequestMod.Request[ApplySchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
       */
    def applySchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplySchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplySchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
       */
    def applySchema(params: ApplySchemaRequest): awsDashSdkLib.libRequestMod.Request[ApplySchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
       */
    def applySchema(
      params: ApplySchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApplySchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApplySchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
       */
    def attachObject(): awsDashSdkLib.libRequestMod.Request[AttachObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
       */
    def attachObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
       */
    def attachObject(params: AttachObjectRequest): awsDashSdkLib.libRequestMod.Request[AttachObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
       */
    def attachObject(
      params: AttachObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
       */
    def attachPolicy(): awsDashSdkLib.libRequestMod.Request[AttachPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
       */
    def attachPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
       */
    def attachPolicy(params: AttachPolicyRequest): awsDashSdkLib.libRequestMod.Request[AttachPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
       */
    def attachPolicy(
      params: AttachPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches the specified object to the specified index.
       */
    def attachToIndex(): awsDashSdkLib.libRequestMod.Request[AttachToIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches the specified object to the specified index.
       */
    def attachToIndex(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachToIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachToIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches the specified object to the specified index.
       */
    def attachToIndex(params: AttachToIndexRequest): awsDashSdkLib.libRequestMod.Request[AttachToIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches the specified object to the specified index.
       */
    def attachToIndex(
      params: AttachToIndexRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachToIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachToIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
       */
    def attachTypedLink(): awsDashSdkLib.libRequestMod.Request[AttachTypedLinkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
       */
    def attachTypedLink(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachTypedLinkResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachTypedLinkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
       */
    def attachTypedLink(params: AttachTypedLinkRequest): awsDashSdkLib.libRequestMod.Request[AttachTypedLinkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
       */
    def attachTypedLink(
      params: AttachTypedLinkRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AttachTypedLinkResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AttachTypedLinkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Performs all the read operations in a batch. 
       */
    def batchRead(): awsDashSdkLib.libRequestMod.Request[BatchReadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Performs all the read operations in a batch. 
       */
    def batchRead(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchReadResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchReadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Performs all the read operations in a batch. 
       */
    def batchRead(params: BatchReadRequest): awsDashSdkLib.libRequestMod.Request[BatchReadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Performs all the read operations in a batch. 
       */
    def batchRead(
      params: BatchReadRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchReadResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchReadResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Performs all the write operations in a batch. Either all the operations succeed or none.
       */
    def batchWrite(): awsDashSdkLib.libRequestMod.Request[BatchWriteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Performs all the write operations in a batch. Either all the operations succeed or none.
       */
    def batchWrite(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchWriteResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchWriteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Performs all the write operations in a batch. Either all the operations succeed or none.
       */
    def batchWrite(params: BatchWriteRequest): awsDashSdkLib.libRequestMod.Request[BatchWriteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Performs all the write operations in a batch. Either all the operations succeed or none.
       */
    def batchWrite(
      params: BatchWriteRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchWriteResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchWriteResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema. You can also quickly create a directory using a managed schema, called the QuickStartSchema. For more information, see Managed Schema in the Amazon Cloud Directory Developer Guide.
       */
    def createDirectory(): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema. You can also quickly create a directory using a managed schema, called the QuickStartSchema. For more information, see Managed Schema in the Amazon Cloud Directory Developer Guide.
       */
    def createDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema. You can also quickly create a directory using a managed schema, called the QuickStartSchema. For more information, see Managed Schema in the Amazon Cloud Directory Developer Guide.
       */
    def createDirectory(params: CreateDirectoryRequest): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema. You can also quickly create a directory using a managed schema, called the QuickStartSchema. For more information, see Managed Schema in the Amazon Cloud Directory Developer Guide.
       */
    def createDirectory(
      params: CreateDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
       */
    def createFacet(): awsDashSdkLib.libRequestMod.Request[CreateFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
       */
    def createFacet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
       */
    def createFacet(params: CreateFacetRequest): awsDashSdkLib.libRequestMod.Request[CreateFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
       */
    def createFacet(
      params: CreateFacetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an index object. See Indexing and search for more information.
       */
    def createIndex(): awsDashSdkLib.libRequestMod.Request[CreateIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an index object. See Indexing and search for more information.
       */
    def createIndex(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an index object. See Indexing and search for more information.
       */
    def createIndex(params: CreateIndexRequest): awsDashSdkLib.libRequestMod.Request[CreateIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an index object. See Indexing and search for more information.
       */
    def createIndex(
      params: CreateIndexRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
       */
    def createObject(): awsDashSdkLib.libRequestMod.Request[CreateObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
       */
    def createObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
       */
    def createObject(params: CreateObjectRequest): awsDashSdkLib.libRequestMod.Request[CreateObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
       */
    def createObject(
      params: CreateObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
       */
    def createSchema(): awsDashSdkLib.libRequestMod.Request[CreateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
       */
    def createSchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
       */
    def createSchema(params: CreateSchemaRequest): awsDashSdkLib.libRequestMod.Request[CreateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
       */
    def createSchema(
      params: CreateSchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a TypedLinkFacet. For more information, see Typed Links.
       */
    def createTypedLinkFacet(): awsDashSdkLib.libRequestMod.Request[CreateTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a TypedLinkFacet. For more information, see Typed Links.
       */
    def createTypedLinkFacet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTypedLinkFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a TypedLinkFacet. For more information, see Typed Links.
       */
    def createTypedLinkFacet(params: CreateTypedLinkFacetRequest): awsDashSdkLib.libRequestMod.Request[CreateTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a TypedLinkFacet. For more information, see Typed Links.
       */
    def createTypedLinkFacet(
      params: CreateTypedLinkFacetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTypedLinkFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
       */
    def deleteDirectory(): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
       */
    def deleteDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
       */
    def deleteDirectory(params: DeleteDirectoryRequest): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
       */
    def deleteDirectory(
      params: DeleteDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
       */
    def deleteFacet(): awsDashSdkLib.libRequestMod.Request[DeleteFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
       */
    def deleteFacet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
       */
    def deleteFacet(params: DeleteFacetRequest): awsDashSdkLib.libRequestMod.Request[DeleteFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
       */
    def deleteFacet(
      params: DeleteFacetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory Limits.
       */
    def deleteObject(): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory Limits.
       */
    def deleteObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory Limits.
       */
    def deleteObject(params: DeleteObjectRequest): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory Limits.
       */
    def deleteObject(
      params: DeleteObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a given schema. Schemas in a development and published state can only be deleted. 
       */
    def deleteSchema(): awsDashSdkLib.libRequestMod.Request[DeleteSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a given schema. Schemas in a development and published state can only be deleted. 
       */
    def deleteSchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a given schema. Schemas in a development and published state can only be deleted. 
       */
    def deleteSchema(params: DeleteSchemaRequest): awsDashSdkLib.libRequestMod.Request[DeleteSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a given schema. Schemas in a development and published state can only be deleted. 
       */
    def deleteSchema(
      params: DeleteSchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a TypedLinkFacet. For more information, see Typed Links.
       */
    def deleteTypedLinkFacet(): awsDashSdkLib.libRequestMod.Request[DeleteTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a TypedLinkFacet. For more information, see Typed Links.
       */
    def deleteTypedLinkFacet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTypedLinkFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a TypedLinkFacet. For more information, see Typed Links.
       */
    def deleteTypedLinkFacet(params: DeleteTypedLinkFacetRequest): awsDashSdkLib.libRequestMod.Request[DeleteTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a TypedLinkFacet. For more information, see Typed Links.
       */
    def deleteTypedLinkFacet(
      params: DeleteTypedLinkFacetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTypedLinkFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches the specified object from the specified index.
       */
    def detachFromIndex(): awsDashSdkLib.libRequestMod.Request[DetachFromIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches the specified object from the specified index.
       */
    def detachFromIndex(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachFromIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachFromIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches the specified object from the specified index.
       */
    def detachFromIndex(params: DetachFromIndexRequest): awsDashSdkLib.libRequestMod.Request[DetachFromIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches the specified object from the specified index.
       */
    def detachFromIndex(
      params: DetachFromIndexRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachFromIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachFromIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
       */
    def detachObject(): awsDashSdkLib.libRequestMod.Request[DetachObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
       */
    def detachObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
       */
    def detachObject(params: DetachObjectRequest): awsDashSdkLib.libRequestMod.Request[DetachObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
       */
    def detachObject(
      params: DetachObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a policy from an object.
       */
    def detachPolicy(): awsDashSdkLib.libRequestMod.Request[DetachPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a policy from an object.
       */
    def detachPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a policy from an object.
       */
    def detachPolicy(params: DetachPolicyRequest): awsDashSdkLib.libRequestMod.Request[DetachPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a policy from an object.
       */
    def detachPolicy(
      params: DetachPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetachPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetachPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
       */
    def detachTypedLink(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
       */
    def detachTypedLink(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
       */
    def detachTypedLink(params: DetachTypedLinkRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
       */
    def detachTypedLink(
      params: DetachTypedLinkRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
       */
    def disableDirectory(): awsDashSdkLib.libRequestMod.Request[DisableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
       */
    def disableDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
       */
    def disableDirectory(params: DisableDirectoryRequest): awsDashSdkLib.libRequestMod.Request[DisableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
       */
    def disableDirectory(
      params: DisableDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisableDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
       */
    def enableDirectory(): awsDashSdkLib.libRequestMod.Request[EnableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
       */
    def enableDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
       */
    def enableDirectory(params: EnableDirectoryRequest): awsDashSdkLib.libRequestMod.Request[EnableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
       */
    def enableDirectory(
      params: EnableDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EnableDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EnableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns current applied schema version ARN, including the minor version in use.
       */
    def getAppliedSchemaVersion(): awsDashSdkLib.libRequestMod.Request[GetAppliedSchemaVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns current applied schema version ARN, including the minor version in use.
       */
    def getAppliedSchemaVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAppliedSchemaVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAppliedSchemaVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns current applied schema version ARN, including the minor version in use.
       */
    def getAppliedSchemaVersion(params: GetAppliedSchemaVersionRequest): awsDashSdkLib.libRequestMod.Request[GetAppliedSchemaVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns current applied schema version ARN, including the minor version in use.
       */
    def getAppliedSchemaVersion(
      params: GetAppliedSchemaVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAppliedSchemaVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAppliedSchemaVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata about a directory.
       */
    def getDirectory(): awsDashSdkLib.libRequestMod.Request[GetDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata about a directory.
       */
    def getDirectory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata about a directory.
       */
    def getDirectory(params: GetDirectoryRequest): awsDashSdkLib.libRequestMod.Request[GetDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata about a directory.
       */
    def getDirectory(
      params: GetDirectoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDirectoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
       */
    def getFacet(): awsDashSdkLib.libRequestMod.Request[GetFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
       */
    def getFacet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
       */
    def getFacet(params: GetFacetRequest): awsDashSdkLib.libRequestMod.Request[GetFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
       */
    def getFacet(
      params: GetFacetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes that are associated with a typed link.
       */
    def getLinkAttributes(): awsDashSdkLib.libRequestMod.Request[GetLinkAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes that are associated with a typed link.
       */
    def getLinkAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLinkAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLinkAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes that are associated with a typed link.
       */
    def getLinkAttributes(params: GetLinkAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetLinkAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes that are associated with a typed link.
       */
    def getLinkAttributes(
      params: GetLinkAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetLinkAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetLinkAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes within a facet that are associated with an object.
       */
    def getObjectAttributes(): awsDashSdkLib.libRequestMod.Request[GetObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes within a facet that are associated with an object.
       */
    def getObjectAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes within a facet that are associated with an object.
       */
    def getObjectAttributes(params: GetObjectAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes within a facet that are associated with an object.
       */
    def getObjectAttributes(
      params: GetObjectAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata about an object.
       */
    def getObjectInformation(): awsDashSdkLib.libRequestMod.Request[GetObjectInformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata about an object.
       */
    def getObjectInformation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectInformationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectInformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata about an object.
       */
    def getObjectInformation(params: GetObjectInformationRequest): awsDashSdkLib.libRequestMod.Request[GetObjectInformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves metadata about an object.
       */
    def getObjectInformation(
      params: GetObjectInformationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectInformationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectInformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
       */
    def getSchemaAsJson(): awsDashSdkLib.libRequestMod.Request[GetSchemaAsJsonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
       */
    def getSchemaAsJson(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSchemaAsJsonResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSchemaAsJsonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
       */
    def getSchemaAsJson(params: GetSchemaAsJsonRequest): awsDashSdkLib.libRequestMod.Request[GetSchemaAsJsonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
       */
    def getSchemaAsJson(
      params: GetSchemaAsJsonRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSchemaAsJsonResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSchemaAsJsonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.
       */
    def getTypedLinkFacetInformation(): awsDashSdkLib.libRequestMod.Request[GetTypedLinkFacetInformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.
       */
    def getTypedLinkFacetInformation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTypedLinkFacetInformationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTypedLinkFacetInformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.
       */
    def getTypedLinkFacetInformation(params: GetTypedLinkFacetInformationRequest): awsDashSdkLib.libRequestMod.Request[GetTypedLinkFacetInformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.
       */
    def getTypedLinkFacetInformation(
      params: GetTypedLinkFacetInformationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTypedLinkFacetInformationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTypedLinkFacetInformationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
       */
    def listAppliedSchemaArns(): awsDashSdkLib.libRequestMod.Request[ListAppliedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
       */
    def listAppliedSchemaArns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAppliedSchemaArnsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAppliedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
       */
    def listAppliedSchemaArns(params: ListAppliedSchemaArnsRequest): awsDashSdkLib.libRequestMod.Request[ListAppliedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
       */
    def listAppliedSchemaArns(
      params: ListAppliedSchemaArnsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAppliedSchemaArnsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAppliedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists indices attached to the specified object.
       */
    def listAttachedIndices(): awsDashSdkLib.libRequestMod.Request[ListAttachedIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists indices attached to the specified object.
       */
    def listAttachedIndices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedIndicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists indices attached to the specified object.
       */
    def listAttachedIndices(params: ListAttachedIndicesRequest): awsDashSdkLib.libRequestMod.Request[ListAttachedIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists indices attached to the specified object.
       */
    def listAttachedIndices(
      params: ListAttachedIndicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAttachedIndicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAttachedIndicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
       */
    def listDevelopmentSchemaArns(): awsDashSdkLib.libRequestMod.Request[ListDevelopmentSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
       */
    def listDevelopmentSchemaArns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDevelopmentSchemaArnsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDevelopmentSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
       */
    def listDevelopmentSchemaArns(params: ListDevelopmentSchemaArnsRequest): awsDashSdkLib.libRequestMod.Request[ListDevelopmentSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
       */
    def listDevelopmentSchemaArns(
      params: ListDevelopmentSchemaArnsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDevelopmentSchemaArnsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDevelopmentSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists directories created within an account.
       */
    def listDirectories(): awsDashSdkLib.libRequestMod.Request[ListDirectoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists directories created within an account.
       */
    def listDirectories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDirectoriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDirectoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists directories created within an account.
       */
    def listDirectories(params: ListDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[ListDirectoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists directories created within an account.
       */
    def listDirectories(
      params: ListDirectoriesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDirectoriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDirectoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes attached to the facet.
       */
    def listFacetAttributes(): awsDashSdkLib.libRequestMod.Request[ListFacetAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes attached to the facet.
       */
    def listFacetAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFacetAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFacetAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes attached to the facet.
       */
    def listFacetAttributes(params: ListFacetAttributesRequest): awsDashSdkLib.libRequestMod.Request[ListFacetAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves attributes attached to the facet.
       */
    def listFacetAttributes(
      params: ListFacetAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFacetAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFacetAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the names of facets that exist in a schema.
       */
    def listFacetNames(): awsDashSdkLib.libRequestMod.Request[ListFacetNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the names of facets that exist in a schema.
       */
    def listFacetNames(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFacetNamesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFacetNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the names of facets that exist in a schema.
       */
    def listFacetNames(params: ListFacetNamesRequest): awsDashSdkLib.libRequestMod.Request[ListFacetNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the names of facets that exist in a schema.
       */
    def listFacetNames(
      params: ListFacetNamesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFacetNamesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFacetNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
       */
    def listIncomingTypedLinks(): awsDashSdkLib.libRequestMod.Request[ListIncomingTypedLinksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
       */
    def listIncomingTypedLinks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIncomingTypedLinksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIncomingTypedLinksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
       */
    def listIncomingTypedLinks(params: ListIncomingTypedLinksRequest): awsDashSdkLib.libRequestMod.Request[ListIncomingTypedLinksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
       */
    def listIncomingTypedLinks(
      params: ListIncomingTypedLinksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIncomingTypedLinksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIncomingTypedLinksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists objects attached to the specified index.
       */
    def listIndex(): awsDashSdkLib.libRequestMod.Request[ListIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists objects attached to the specified index.
       */
    def listIndex(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists objects attached to the specified index.
       */
    def listIndex(params: ListIndexRequest): awsDashSdkLib.libRequestMod.Request[ListIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists objects attached to the specified index.
       */
    def listIndex(
      params: ListIndexRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListIndexResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListIndexResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
       */
    def listManagedSchemaArns(): awsDashSdkLib.libRequestMod.Request[ListManagedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
       */
    def listManagedSchemaArns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListManagedSchemaArnsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListManagedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
       */
    def listManagedSchemaArns(params: ListManagedSchemaArnsRequest): awsDashSdkLib.libRequestMod.Request[ListManagedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
       */
    def listManagedSchemaArns(
      params: ListManagedSchemaArnsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListManagedSchemaArnsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListManagedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all attributes that are associated with an object. 
       */
    def listObjectAttributes(): awsDashSdkLib.libRequestMod.Request[ListObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all attributes that are associated with an object. 
       */
    def listObjectAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all attributes that are associated with an object. 
       */
    def listObjectAttributes(params: ListObjectAttributesRequest): awsDashSdkLib.libRequestMod.Request[ListObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all attributes that are associated with an object. 
       */
    def listObjectAttributes(
      params: ListObjectAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of child objects that are associated with a given object.
       */
    def listObjectChildren(): awsDashSdkLib.libRequestMod.Request[ListObjectChildrenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of child objects that are associated with a given object.
       */
    def listObjectChildren(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectChildrenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectChildrenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of child objects that are associated with a given object.
       */
    def listObjectChildren(params: ListObjectChildrenRequest): awsDashSdkLib.libRequestMod.Request[ListObjectChildrenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of child objects that are associated with a given object.
       */
    def listObjectChildren(
      params: ListObjectChildrenRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectChildrenResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectChildrenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
       */
    def listObjectParentPaths(): awsDashSdkLib.libRequestMod.Request[ListObjectParentPathsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
       */
    def listObjectParentPaths(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectParentPathsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectParentPathsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
       */
    def listObjectParentPaths(params: ListObjectParentPathsRequest): awsDashSdkLib.libRequestMod.Request[ListObjectParentPathsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
       */
    def listObjectParentPaths(
      params: ListObjectParentPathsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectParentPathsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectParentPathsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists parent objects that are associated with a given object in pagination fashion.
       */
    def listObjectParents(): awsDashSdkLib.libRequestMod.Request[ListObjectParentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists parent objects that are associated with a given object in pagination fashion.
       */
    def listObjectParents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectParentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectParentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists parent objects that are associated with a given object in pagination fashion.
       */
    def listObjectParents(params: ListObjectParentsRequest): awsDashSdkLib.libRequestMod.Request[ListObjectParentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists parent objects that are associated with a given object in pagination fashion.
       */
    def listObjectParents(
      params: ListObjectParentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectParentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectParentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns policies attached to an object in pagination fashion.
       */
    def listObjectPolicies(): awsDashSdkLib.libRequestMod.Request[ListObjectPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns policies attached to an object in pagination fashion.
       */
    def listObjectPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns policies attached to an object in pagination fashion.
       */
    def listObjectPolicies(params: ListObjectPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListObjectPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns policies attached to an object in pagination fashion.
       */
    def listObjectPolicies(
      params: ListObjectPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
       */
    def listOutgoingTypedLinks(): awsDashSdkLib.libRequestMod.Request[ListOutgoingTypedLinksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
       */
    def listOutgoingTypedLinks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOutgoingTypedLinksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOutgoingTypedLinksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
       */
    def listOutgoingTypedLinks(params: ListOutgoingTypedLinksRequest): awsDashSdkLib.libRequestMod.Request[ListOutgoingTypedLinksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
       */
    def listOutgoingTypedLinks(
      params: ListOutgoingTypedLinksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListOutgoingTypedLinksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListOutgoingTypedLinksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the ObjectIdentifiers to which a given policy is attached.
       */
    def listPolicyAttachments(): awsDashSdkLib.libRequestMod.Request[ListPolicyAttachmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the ObjectIdentifiers to which a given policy is attached.
       */
    def listPolicyAttachments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPolicyAttachmentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPolicyAttachmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the ObjectIdentifiers to which a given policy is attached.
       */
    def listPolicyAttachments(params: ListPolicyAttachmentsRequest): awsDashSdkLib.libRequestMod.Request[ListPolicyAttachmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns all of the ObjectIdentifiers to which a given policy is attached.
       */
    def listPolicyAttachments(
      params: ListPolicyAttachmentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPolicyAttachmentsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPolicyAttachmentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
       */
    def listPublishedSchemaArns(): awsDashSdkLib.libRequestMod.Request[ListPublishedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
       */
    def listPublishedSchemaArns(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPublishedSchemaArnsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPublishedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
       */
    def listPublishedSchemaArns(params: ListPublishedSchemaArnsRequest): awsDashSdkLib.libRequestMod.Request[ListPublishedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
       */
    def listPublishedSchemaArns(
      params: ListPublishedSchemaArnsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPublishedSchemaArnsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPublishedSchemaArnsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
       */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
       */
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
       */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
       */
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed Links.
       */
    def listTypedLinkFacetAttributes(): awsDashSdkLib.libRequestMod.Request[ListTypedLinkFacetAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed Links.
       */
    def listTypedLinkFacetAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTypedLinkFacetAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTypedLinkFacetAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed Links.
       */
    def listTypedLinkFacetAttributes(params: ListTypedLinkFacetAttributesRequest): awsDashSdkLib.libRequestMod.Request[ListTypedLinkFacetAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed Links.
       */
    def listTypedLinkFacetAttributes(
      params: ListTypedLinkFacetAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTypedLinkFacetAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTypedLinkFacetAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed Links.
       */
    def listTypedLinkFacetNames(): awsDashSdkLib.libRequestMod.Request[ListTypedLinkFacetNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed Links.
       */
    def listTypedLinkFacetNames(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTypedLinkFacetNamesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTypedLinkFacetNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed Links.
       */
    def listTypedLinkFacetNames(params: ListTypedLinkFacetNamesRequest): awsDashSdkLib.libRequestMod.Request[ListTypedLinkFacetNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed Links.
       */
    def listTypedLinkFacetNames(
      params: ListTypedLinkFacetNamesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTypedLinkFacetNamesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTypedLinkFacetNamesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
       */
    def lookupPolicy(): awsDashSdkLib.libRequestMod.Request[LookupPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
       */
    def lookupPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LookupPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LookupPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
       */
    def lookupPolicy(params: LookupPolicyRequest): awsDashSdkLib.libRequestMod.Request[LookupPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
       */
    def lookupPolicy(
      params: LookupPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ LookupPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[LookupPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Publishes a development schema with a major version and a recommended minor version.
       */
    def publishSchema(): awsDashSdkLib.libRequestMod.Request[PublishSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Publishes a development schema with a major version and a recommended minor version.
       */
    def publishSchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PublishSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PublishSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Publishes a development schema with a major version and a recommended minor version.
       */
    def publishSchema(params: PublishSchemaRequest): awsDashSdkLib.libRequestMod.Request[PublishSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Publishes a development schema with a major version and a recommended minor version.
       */
    def publishSchema(
      params: PublishSchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PublishSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PublishSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
       */
    def putSchemaFromJson(): awsDashSdkLib.libRequestMod.Request[PutSchemaFromJsonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
       */
    def putSchemaFromJson(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutSchemaFromJsonResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutSchemaFromJsonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
       */
    def putSchemaFromJson(params: PutSchemaFromJsonRequest): awsDashSdkLib.libRequestMod.Request[PutSchemaFromJsonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
       */
    def putSchemaFromJson(
      params: PutSchemaFromJsonRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutSchemaFromJsonResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutSchemaFromJsonResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified facet from the specified object.
       */
    def removeFacetFromObject(): awsDashSdkLib.libRequestMod.Request[RemoveFacetFromObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified facet from the specified object.
       */
    def removeFacetFromObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveFacetFromObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveFacetFromObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified facet from the specified object.
       */
    def removeFacetFromObject(params: RemoveFacetFromObjectRequest): awsDashSdkLib.libRequestMod.Request[RemoveFacetFromObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Removes the specified facet from the specified object.
       */
    def removeFacetFromObject(
      params: RemoveFacetFromObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RemoveFacetFromObjectResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RemoveFacetFromObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * An API operation for adding tags to a resource.
       */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * An API operation for adding tags to a resource.
       */
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * An API operation for adding tags to a resource.
       */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * An API operation for adding tags to a resource.
       */
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * An API operation for removing tags from a resource.
       */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * An API operation for removing tags from a resource.
       */
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * An API operation for removing tags from a resource.
       */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * An API operation for removing tags from a resource.
       */
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
       */
    def updateFacet(): awsDashSdkLib.libRequestMod.Request[UpdateFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
       */
    def updateFacet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
       */
    def updateFacet(params: UpdateFacetRequest): awsDashSdkLib.libRequestMod.Request[UpdateFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
       */
    def updateFacet(
      params: UpdateFacetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
       */
    def updateLinkAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateLinkAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
       */
    def updateLinkAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateLinkAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateLinkAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
       */
    def updateLinkAttributes(params: UpdateLinkAttributesRequest): awsDashSdkLib.libRequestMod.Request[UpdateLinkAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
       */
    def updateLinkAttributes(
      params: UpdateLinkAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateLinkAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateLinkAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a given object's attributes.
       */
    def updateObjectAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a given object's attributes.
       */
    def updateObjectAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateObjectAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a given object's attributes.
       */
    def updateObjectAttributes(params: UpdateObjectAttributesRequest): awsDashSdkLib.libRequestMod.Request[UpdateObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a given object's attributes.
       */
    def updateObjectAttributes(
      params: UpdateObjectAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateObjectAttributesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateObjectAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the schema name with a new name. Only development schema names can be updated.
       */
    def updateSchema(): awsDashSdkLib.libRequestMod.Request[UpdateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the schema name with a new name. Only development schema names can be updated.
       */
    def updateSchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the schema name with a new name. Only development schema names can be updated.
       */
    def updateSchema(params: UpdateSchemaRequest): awsDashSdkLib.libRequestMod.Request[UpdateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the schema name with a new name. Only development schema names can be updated.
       */
    def updateSchema(
      params: UpdateSchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a TypedLinkFacet. For more information, see Typed Links.
       */
    def updateTypedLinkFacet(): awsDashSdkLib.libRequestMod.Request[UpdateTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a TypedLinkFacet. For more information, see Typed Links.
       */
    def updateTypedLinkFacet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTypedLinkFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a TypedLinkFacet. For more information, see Typed Links.
       */
    def updateTypedLinkFacet(params: UpdateTypedLinkFacetRequest): awsDashSdkLib.libRequestMod.Request[UpdateTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates a TypedLinkFacet. For more information, see Typed Links.
       */
    def updateTypedLinkFacet(
      params: UpdateTypedLinkFacetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTypedLinkFacetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTypedLinkFacetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
       */
    def upgradeAppliedSchema(): awsDashSdkLib.libRequestMod.Request[UpgradeAppliedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
       */
    def upgradeAppliedSchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpgradeAppliedSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpgradeAppliedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
       */
    def upgradeAppliedSchema(params: UpgradeAppliedSchemaRequest): awsDashSdkLib.libRequestMod.Request[UpgradeAppliedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
       */
    def upgradeAppliedSchema(
      params: UpgradeAppliedSchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpgradeAppliedSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpgradeAppliedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
       */
    def upgradePublishedSchema(): awsDashSdkLib.libRequestMod.Request[UpgradePublishedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
       */
    def upgradePublishedSchema(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpgradePublishedSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpgradePublishedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
       */
    def upgradePublishedSchema(params: UpgradePublishedSchemaRequest): awsDashSdkLib.libRequestMod.Request[UpgradePublishedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
       */
    def upgradePublishedSchema(
      params: UpgradePublishedSchemaRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpgradePublishedSchemaResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpgradePublishedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource. Tagging is only supported for directories.
         */
    var ResourceArn: Arn
    /**
         * Keys of the tag that need to be removed from the resource.
         */
    var TagKeys: TagKeyList
  }
  
  
  trait UntagResourceResponse extends js.Object
  
  
  trait UpdateFacetRequest extends js.Object {
    /**
         * List of attributes that need to be updated in a given schema Facet. Each attribute is followed by AttributeAction, which specifies the type of update operation to perform. 
         */
    var AttributeUpdates: js.UndefOr[FacetAttributeUpdateList] = js.undefined
    /**
         * The name of the facet.
         */
    var Name: FacetName
    /**
         * The object type that is associated with the facet. See CreateFacetRequest$ObjectType for more details.
         */
    var ObjectType: js.UndefOr[ObjectType] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that is associated with the Facet. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait UpdateFacetResponse extends js.Object
  
  
  trait UpdateLinkAttributesRequest extends js.Object {
    /**
         * The attributes update structure.
         */
    var AttributeUpdates: LinkAttributeUpdateList
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For more information, see arns or Typed Links.
         */
    var DirectoryArn: Arn
    /**
         * Allows a typed link specifier to be accepted as input.
         */
    var TypedLinkSpecifier: TypedLinkSpecifier
  }
  
  
  trait UpdateLinkAttributesResponse extends js.Object
  
  
  trait UpdateObjectAttributesRequest extends js.Object {
    /**
         * The attributes update structure.
         */
    var AttributeUpdates: ObjectAttributeUpdateList
    /**
         * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
         */
    var DirectoryArn: Arn
    /**
         * The reference that identifies the object.
         */
    var ObjectReference: ObjectReference
  }
  
  
  trait UpdateObjectAttributesResponse extends js.Object {
    /**
         * The ObjectIdentifier of the updated object.
         */
    var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
  }
  
  
  trait UpdateSchemaRequest extends js.Object {
    /**
         * The name of the schema.
         */
    var Name: SchemaName
    /**
         * The Amazon Resource Name (ARN) of the development schema. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait UpdateSchemaResponse extends js.Object {
    /**
         * The ARN that is associated with the updated schema. For more information, see arns.
         */
    var SchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait UpdateTypedLinkFacetRequest extends js.Object {
    /**
         * Attributes update structure.
         */
    var AttributeUpdates: TypedLinkFacetAttributeUpdateList
    /**
         * The order of identity attributes for the facet, from most significant to least significant. The ability to filter typed links considers the order that the attributes are defined on the typed link facet. When providing ranges to a typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range. Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls. For more information about identity attributes, see Typed Links.
         */
    var IdentityAttributeOrder: AttributeNameList
    /**
         * The unique name of the typed link facet.
         */
    var Name: TypedLinkName
    /**
         * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
         */
    var SchemaArn: Arn
  }
  
  
  trait UpdateTypedLinkFacetResponse extends js.Object
  
  
  trait UpgradeAppliedSchemaRequest extends js.Object {
    /**
         * The ARN for the directory to which the upgraded schema will be applied.
         */
    var DirectoryArn: Arn
    /**
         * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails, an exception would be thrown else the call would succeed but no changes will be saved. This parameter is optional.
         */
    var DryRun: js.UndefOr[Bool] = js.undefined
    /**
         * The revision of the published schema to upgrade the directory to.
         */
    var PublishedSchemaArn: Arn
  }
  
  
  trait UpgradeAppliedSchemaResponse extends js.Object {
    /**
         * The ARN of the directory that is returned as part of the response.
         */
    var DirectoryArn: js.UndefOr[Arn] = js.undefined
    /**
         * The ARN of the upgraded schema that is returned as part of the response.
         */
    var UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait UpgradePublishedSchemaRequest extends js.Object {
    /**
         * The ARN of the development schema with the changes used for the upgrade.
         */
    var DevelopmentSchemaArn: Arn
    /**
         * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call would succeed. This parameter is optional and defaults to false.
         */
    var DryRun: js.UndefOr[Bool] = js.undefined
    /**
         * Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
         */
    var MinorVersion: Version
    /**
         * The ARN of the published schema to be upgraded.
         */
    var PublishedSchemaArn: Arn
  }
  
  
  trait UpgradePublishedSchemaResponse extends js.Object {
    /**
         * The ARN of the upgraded schema that is returned as part of the response.
         */
    var UpgradedSchemaArn: js.UndefOr[Arn] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type Arn = java.lang.String
  type Arns = js.Array[Arn]
  type AttributeKeyAndValueList = js.Array[AttributeKeyAndValue]
  type AttributeKeyList = js.Array[AttributeKey]
  type AttributeName = java.lang.String
  type AttributeNameAndValueList = js.Array[AttributeNameAndValue]
  type AttributeNameList = js.Array[AttributeName]
  type BatchReadExceptionType = awsDashSdkLib.awsDashSdkLibStrings.ValidationException | awsDashSdkLib.awsDashSdkLibStrings.InvalidArnException | awsDashSdkLib.awsDashSdkLibStrings.ResourceNotFoundException | awsDashSdkLib.awsDashSdkLibStrings.InvalidNextTokenException | awsDashSdkLib.awsDashSdkLibStrings.AccessDeniedException | awsDashSdkLib.awsDashSdkLibStrings.NotNodeException | awsDashSdkLib.awsDashSdkLibStrings.FacetValidationException | awsDashSdkLib.awsDashSdkLibStrings.CannotListParentOfRootException | awsDashSdkLib.awsDashSdkLibStrings.NotIndexException | awsDashSdkLib.awsDashSdkLibStrings.NotPolicyException | awsDashSdkLib.awsDashSdkLibStrings.DirectoryNotEnabledException | awsDashSdkLib.awsDashSdkLibStrings.LimitExceededException | awsDashSdkLib.awsDashSdkLibStrings.InternalServiceException | java.lang.String
  type BatchReadOperationList = js.Array[BatchReadOperation]
  type BatchReadOperationResponseList = js.Array[BatchReadOperationResponse]
  type BatchReferenceName = java.lang.String
  type BatchWriteOperationList = js.Array[BatchWriteOperation]
  type BatchWriteOperationResponseList = js.Array[BatchWriteOperationResponse]
  type BinaryAttributeValue = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsClouddirectoryMod.Blob | java.lang.String
  type Bool = scala.Boolean
  type BooleanAttributeValue = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConsistencyLevel = awsDashSdkLib.awsDashSdkLibStrings.SERIALIZABLE | awsDashSdkLib.awsDashSdkLibStrings.EVENTUAL | java.lang.String
  type DatetimeAttributeValue = stdLib.Date
  type DirectoryArn = java.lang.String
  type DirectoryList = js.Array[Directory]
  type DirectoryName = java.lang.String
  type DirectoryState = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.DELETED | java.lang.String
  type ExceptionMessage = java.lang.String
  type FacetAttributeList = js.Array[FacetAttribute]
  type FacetAttributeType = awsDashSdkLib.awsDashSdkLibStrings.STRING | awsDashSdkLib.awsDashSdkLibStrings.BINARY | awsDashSdkLib.awsDashSdkLibStrings.BOOLEAN | awsDashSdkLib.awsDashSdkLibStrings.NUMBER | awsDashSdkLib.awsDashSdkLibStrings.DATETIME | awsDashSdkLib.awsDashSdkLibStrings.VARIANT | java.lang.String
  type FacetAttributeUpdateList = js.Array[FacetAttributeUpdate]
  type FacetName = java.lang.String
  type FacetNameList = js.Array[FacetName]
  type FacetStyle = awsDashSdkLib.awsDashSdkLibStrings.STATIC | awsDashSdkLib.awsDashSdkLibStrings.DYNAMIC | java.lang.String
  type IndexAttachmentList = js.Array[IndexAttachment]
  type LinkAttributeUpdateList = js.Array[LinkAttributeUpdate]
  type LinkName = java.lang.String
  type NextToken = java.lang.String
  type NumberAttributeValue = java.lang.String
  type NumberResults = scala.Double
  type ObjectAttributeRangeList = js.Array[ObjectAttributeRange]
  type ObjectAttributeUpdateList = js.Array[ObjectAttributeUpdate]
  type ObjectIdentifier = java.lang.String
  type ObjectIdentifierAndLinkNameList = js.Array[ObjectIdentifierAndLinkNameTuple]
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectType = awsDashSdkLib.awsDashSdkLibStrings.NODE | awsDashSdkLib.awsDashSdkLibStrings.LEAF_NODE | awsDashSdkLib.awsDashSdkLibStrings.POLICY | awsDashSdkLib.awsDashSdkLibStrings.INDEX | java.lang.String
  type PathString = java.lang.String
  type PathToObjectIdentifiersList = js.Array[PathToObjectIdentifiers]
  type PolicyAttachmentList = js.Array[PolicyAttachment]
  type PolicyToPathList = js.Array[PolicyToPath]
  type PolicyType = java.lang.String
  type RangeMode = awsDashSdkLib.awsDashSdkLibStrings.FIRST | awsDashSdkLib.awsDashSdkLibStrings.LAST | awsDashSdkLib.awsDashSdkLibStrings.LAST_BEFORE_MISSING_VALUES | awsDashSdkLib.awsDashSdkLibStrings.INCLUSIVE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUSIVE | java.lang.String
  type RequiredAttributeBehavior = awsDashSdkLib.awsDashSdkLibStrings.REQUIRED_ALWAYS | awsDashSdkLib.awsDashSdkLibStrings.NOT_REQUIRED | java.lang.String
  type RuleKey = java.lang.String
  type RuleParameterKey = java.lang.String
  type RuleParameterValue = java.lang.String
  type RuleType = awsDashSdkLib.awsDashSdkLibStrings.BINARY_LENGTH | awsDashSdkLib.awsDashSdkLibStrings.NUMBER_COMPARISON | awsDashSdkLib.awsDashSdkLibStrings.STRING_FROM_SET | awsDashSdkLib.awsDashSdkLibStrings.STRING_LENGTH | java.lang.String
  type SchemaFacetList = js.Array[SchemaFacet]
  type SchemaJsonDocument = java.lang.String
  type SchemaName = java.lang.String
  type SelectorObjectReference = java.lang.String
  type StringAttributeValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TagsNumberResults = scala.Double
  type TypedLinkAttributeDefinitionList = js.Array[TypedLinkAttributeDefinition]
  type TypedLinkAttributeRangeList = js.Array[TypedLinkAttributeRange]
  type TypedLinkFacetAttributeUpdateList = js.Array[TypedLinkFacetAttributeUpdate]
  type TypedLinkName = java.lang.String
  type TypedLinkNameList = js.Array[TypedLinkName]
  type TypedLinkSpecifierList = js.Array[TypedLinkSpecifier]
  type UpdateActionType = awsDashSdkLib.awsDashSdkLibStrings.CREATE_OR_UPDATE | awsDashSdkLib.awsDashSdkLibStrings.DELETE | java.lang.String
  type Version = java.lang.String
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-05-10` | awsDashSdkLib.awsDashSdkLibStrings.`2017-01-11` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

