package typings.awsDashSdk.clientsClouddirectoryMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudDirectory extends Service {
  @JSName("config")
  var config_CloudDirectory: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds a new Facet to an object. An object can have more than one facet applied on it.
    */
  def addFacetToObject(): Request[AddFacetToObjectResponse, AWSError] = js.native
  def addFacetToObject(callback: js.Function2[/* err */ AWSError, /* data */ AddFacetToObjectResponse, Unit]): Request[AddFacetToObjectResponse, AWSError] = js.native
  /**
    * Adds a new Facet to an object. An object can have more than one facet applied on it.
    */
  def addFacetToObject(params: AddFacetToObjectRequest): Request[AddFacetToObjectResponse, AWSError] = js.native
  def addFacetToObject(
    params: AddFacetToObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AddFacetToObjectResponse, Unit]
  ): Request[AddFacetToObjectResponse, AWSError] = js.native
  /**
    * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
    */
  def applySchema(): Request[ApplySchemaResponse, AWSError] = js.native
  def applySchema(callback: js.Function2[/* err */ AWSError, /* data */ ApplySchemaResponse, Unit]): Request[ApplySchemaResponse, AWSError] = js.native
  /**
    * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
    */
  def applySchema(params: ApplySchemaRequest): Request[ApplySchemaResponse, AWSError] = js.native
  def applySchema(
    params: ApplySchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ApplySchemaResponse, Unit]
  ): Request[ApplySchemaResponse, AWSError] = js.native
  /**
    * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
    */
  def attachObject(): Request[AttachObjectResponse, AWSError] = js.native
  def attachObject(callback: js.Function2[/* err */ AWSError, /* data */ AttachObjectResponse, Unit]): Request[AttachObjectResponse, AWSError] = js.native
  /**
    * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
    */
  def attachObject(params: AttachObjectRequest): Request[AttachObjectResponse, AWSError] = js.native
  def attachObject(
    params: AttachObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachObjectResponse, Unit]
  ): Request[AttachObjectResponse, AWSError] = js.native
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  def attachPolicy(): Request[AttachPolicyResponse, AWSError] = js.native
  def attachPolicy(callback: js.Function2[/* err */ AWSError, /* data */ AttachPolicyResponse, Unit]): Request[AttachPolicyResponse, AWSError] = js.native
  /**
    * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
    */
  def attachPolicy(params: AttachPolicyRequest): Request[AttachPolicyResponse, AWSError] = js.native
  def attachPolicy(
    params: AttachPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachPolicyResponse, Unit]
  ): Request[AttachPolicyResponse, AWSError] = js.native
  /**
    * Attaches the specified object to the specified index.
    */
  def attachToIndex(): Request[AttachToIndexResponse, AWSError] = js.native
  def attachToIndex(callback: js.Function2[/* err */ AWSError, /* data */ AttachToIndexResponse, Unit]): Request[AttachToIndexResponse, AWSError] = js.native
  /**
    * Attaches the specified object to the specified index.
    */
  def attachToIndex(params: AttachToIndexRequest): Request[AttachToIndexResponse, AWSError] = js.native
  def attachToIndex(
    params: AttachToIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachToIndexResponse, Unit]
  ): Request[AttachToIndexResponse, AWSError] = js.native
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  def attachTypedLink(): Request[AttachTypedLinkResponse, AWSError] = js.native
  def attachTypedLink(callback: js.Function2[/* err */ AWSError, /* data */ AttachTypedLinkResponse, Unit]): Request[AttachTypedLinkResponse, AWSError] = js.native
  /**
    * Attaches a typed link to a specified source and target object. For more information, see Typed Links.
    */
  def attachTypedLink(params: AttachTypedLinkRequest): Request[AttachTypedLinkResponse, AWSError] = js.native
  def attachTypedLink(
    params: AttachTypedLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AttachTypedLinkResponse, Unit]
  ): Request[AttachTypedLinkResponse, AWSError] = js.native
  /**
    * Performs all the read operations in a batch. 
    */
  def batchRead(): Request[BatchReadResponse, AWSError] = js.native
  def batchRead(callback: js.Function2[/* err */ AWSError, /* data */ BatchReadResponse, Unit]): Request[BatchReadResponse, AWSError] = js.native
  /**
    * Performs all the read operations in a batch. 
    */
  def batchRead(params: BatchReadRequest): Request[BatchReadResponse, AWSError] = js.native
  def batchRead(
    params: BatchReadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchReadResponse, Unit]
  ): Request[BatchReadResponse, AWSError] = js.native
  /**
    * Performs all the write operations in a batch. Either all the operations succeed or none.
    */
  def batchWrite(): Request[BatchWriteResponse, AWSError] = js.native
  def batchWrite(callback: js.Function2[/* err */ AWSError, /* data */ BatchWriteResponse, Unit]): Request[BatchWriteResponse, AWSError] = js.native
  /**
    * Performs all the write operations in a batch. Either all the operations succeed or none.
    */
  def batchWrite(params: BatchWriteRequest): Request[BatchWriteResponse, AWSError] = js.native
  def batchWrite(
    params: BatchWriteRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchWriteResponse, Unit]
  ): Request[BatchWriteResponse, AWSError] = js.native
  /**
    * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema. You can also quickly create a directory using a managed schema, called the QuickStartSchema. For more information, see Managed Schema in the Amazon Cloud Directory Developer Guide.
    */
  def createDirectory(): Request[CreateDirectoryResponse, AWSError] = js.native
  def createDirectory(callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectoryResponse, Unit]): Request[CreateDirectoryResponse, AWSError] = js.native
  /**
    * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema. You can also quickly create a directory using a managed schema, called the QuickStartSchema. For more information, see Managed Schema in the Amazon Cloud Directory Developer Guide.
    */
  def createDirectory(params: CreateDirectoryRequest): Request[CreateDirectoryResponse, AWSError] = js.native
  def createDirectory(
    params: CreateDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDirectoryResponse, Unit]
  ): Request[CreateDirectoryResponse, AWSError] = js.native
  /**
    * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
    */
  def createFacet(): Request[CreateFacetResponse, AWSError] = js.native
  def createFacet(callback: js.Function2[/* err */ AWSError, /* data */ CreateFacetResponse, Unit]): Request[CreateFacetResponse, AWSError] = js.native
  /**
    * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
    */
  def createFacet(params: CreateFacetRequest): Request[CreateFacetResponse, AWSError] = js.native
  def createFacet(
    params: CreateFacetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFacetResponse, Unit]
  ): Request[CreateFacetResponse, AWSError] = js.native
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  def createIndex(): Request[CreateIndexResponse, AWSError] = js.native
  def createIndex(callback: js.Function2[/* err */ AWSError, /* data */ CreateIndexResponse, Unit]): Request[CreateIndexResponse, AWSError] = js.native
  /**
    * Creates an index object. See Indexing and search for more information.
    */
  def createIndex(params: CreateIndexRequest): Request[CreateIndexResponse, AWSError] = js.native
  def createIndex(
    params: CreateIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIndexResponse, Unit]
  ): Request[CreateIndexResponse, AWSError] = js.native
  /**
    * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
    */
  def createObject(): Request[CreateObjectResponse, AWSError] = js.native
  def createObject(callback: js.Function2[/* err */ AWSError, /* data */ CreateObjectResponse, Unit]): Request[CreateObjectResponse, AWSError] = js.native
  /**
    * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
    */
  def createObject(params: CreateObjectRequest): Request[CreateObjectResponse, AWSError] = js.native
  def createObject(
    params: CreateObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateObjectResponse, Unit]
  ): Request[CreateObjectResponse, AWSError] = js.native
  /**
    * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
    */
  def createSchema(): Request[CreateSchemaResponse, AWSError] = js.native
  def createSchema(callback: js.Function2[/* err */ AWSError, /* data */ CreateSchemaResponse, Unit]): Request[CreateSchemaResponse, AWSError] = js.native
  /**
    * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
    */
  def createSchema(params: CreateSchemaRequest): Request[CreateSchemaResponse, AWSError] = js.native
  def createSchema(
    params: CreateSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSchemaResponse, Unit]
  ): Request[CreateSchemaResponse, AWSError] = js.native
  /**
    * Creates a TypedLinkFacet. For more information, see Typed Links.
    */
  def createTypedLinkFacet(): Request[CreateTypedLinkFacetResponse, AWSError] = js.native
  def createTypedLinkFacet(callback: js.Function2[/* err */ AWSError, /* data */ CreateTypedLinkFacetResponse, Unit]): Request[CreateTypedLinkFacetResponse, AWSError] = js.native
  /**
    * Creates a TypedLinkFacet. For more information, see Typed Links.
    */
  def createTypedLinkFacet(params: CreateTypedLinkFacetRequest): Request[CreateTypedLinkFacetResponse, AWSError] = js.native
  def createTypedLinkFacet(
    params: CreateTypedLinkFacetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTypedLinkFacetResponse, Unit]
  ): Request[CreateTypedLinkFacetResponse, AWSError] = js.native
  /**
    * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
    */
  def deleteDirectory(): Request[DeleteDirectoryResponse, AWSError] = js.native
  def deleteDirectory(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectoryResponse, Unit]): Request[DeleteDirectoryResponse, AWSError] = js.native
  /**
    * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
    */
  def deleteDirectory(params: DeleteDirectoryRequest): Request[DeleteDirectoryResponse, AWSError] = js.native
  def deleteDirectory(
    params: DeleteDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDirectoryResponse, Unit]
  ): Request[DeleteDirectoryResponse, AWSError] = js.native
  /**
    * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
    */
  def deleteFacet(): Request[DeleteFacetResponse, AWSError] = js.native
  def deleteFacet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFacetResponse, Unit]): Request[DeleteFacetResponse, AWSError] = js.native
  /**
    * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
    */
  def deleteFacet(params: DeleteFacetRequest): Request[DeleteFacetResponse, AWSError] = js.native
  def deleteFacet(
    params: DeleteFacetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFacetResponse, Unit]
  ): Request[DeleteFacetResponse, AWSError] = js.native
  /**
    * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory Limits.
    */
  def deleteObject(): Request[DeleteObjectResponse, AWSError] = js.native
  def deleteObject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectResponse, Unit]): Request[DeleteObjectResponse, AWSError] = js.native
  /**
    * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted. The maximum number of attributes that can be deleted during an object deletion is 30. For more information, see Amazon Cloud Directory Limits.
    */
  def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectResponse, AWSError] = js.native
  def deleteObject(
    params: DeleteObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectResponse, Unit]
  ): Request[DeleteObjectResponse, AWSError] = js.native
  /**
    * Deletes a given schema. Schemas in a development and published state can only be deleted. 
    */
  def deleteSchema(): Request[DeleteSchemaResponse, AWSError] = js.native
  def deleteSchema(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSchemaResponse, Unit]): Request[DeleteSchemaResponse, AWSError] = js.native
  /**
    * Deletes a given schema. Schemas in a development and published state can only be deleted. 
    */
  def deleteSchema(params: DeleteSchemaRequest): Request[DeleteSchemaResponse, AWSError] = js.native
  def deleteSchema(
    params: DeleteSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSchemaResponse, Unit]
  ): Request[DeleteSchemaResponse, AWSError] = js.native
  /**
    * Deletes a TypedLinkFacet. For more information, see Typed Links.
    */
  def deleteTypedLinkFacet(): Request[DeleteTypedLinkFacetResponse, AWSError] = js.native
  def deleteTypedLinkFacet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTypedLinkFacetResponse, Unit]): Request[DeleteTypedLinkFacetResponse, AWSError] = js.native
  /**
    * Deletes a TypedLinkFacet. For more information, see Typed Links.
    */
  def deleteTypedLinkFacet(params: DeleteTypedLinkFacetRequest): Request[DeleteTypedLinkFacetResponse, AWSError] = js.native
  def deleteTypedLinkFacet(
    params: DeleteTypedLinkFacetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTypedLinkFacetResponse, Unit]
  ): Request[DeleteTypedLinkFacetResponse, AWSError] = js.native
  /**
    * Detaches the specified object from the specified index.
    */
  def detachFromIndex(): Request[DetachFromIndexResponse, AWSError] = js.native
  def detachFromIndex(callback: js.Function2[/* err */ AWSError, /* data */ DetachFromIndexResponse, Unit]): Request[DetachFromIndexResponse, AWSError] = js.native
  /**
    * Detaches the specified object from the specified index.
    */
  def detachFromIndex(params: DetachFromIndexRequest): Request[DetachFromIndexResponse, AWSError] = js.native
  def detachFromIndex(
    params: DetachFromIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachFromIndexResponse, Unit]
  ): Request[DetachFromIndexResponse, AWSError] = js.native
  /**
    * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
    */
  def detachObject(): Request[DetachObjectResponse, AWSError] = js.native
  def detachObject(callback: js.Function2[/* err */ AWSError, /* data */ DetachObjectResponse, Unit]): Request[DetachObjectResponse, AWSError] = js.native
  /**
    * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
    */
  def detachObject(params: DetachObjectRequest): Request[DetachObjectResponse, AWSError] = js.native
  def detachObject(
    params: DetachObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachObjectResponse, Unit]
  ): Request[DetachObjectResponse, AWSError] = js.native
  /**
    * Detaches a policy from an object.
    */
  def detachPolicy(): Request[DetachPolicyResponse, AWSError] = js.native
  def detachPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DetachPolicyResponse, Unit]): Request[DetachPolicyResponse, AWSError] = js.native
  /**
    * Detaches a policy from an object.
    */
  def detachPolicy(params: DetachPolicyRequest): Request[DetachPolicyResponse, AWSError] = js.native
  def detachPolicy(
    params: DetachPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetachPolicyResponse, Unit]
  ): Request[DetachPolicyResponse, AWSError] = js.native
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  def detachTypedLink(): Request[js.Object, AWSError] = js.native
  def detachTypedLink(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  def detachTypedLink(params: DetachTypedLinkRequest): Request[js.Object, AWSError] = js.native
  def detachTypedLink(
    params: DetachTypedLinkRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
    */
  def disableDirectory(): Request[DisableDirectoryResponse, AWSError] = js.native
  def disableDirectory(callback: js.Function2[/* err */ AWSError, /* data */ DisableDirectoryResponse, Unit]): Request[DisableDirectoryResponse, AWSError] = js.native
  /**
    * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
    */
  def disableDirectory(params: DisableDirectoryRequest): Request[DisableDirectoryResponse, AWSError] = js.native
  def disableDirectory(
    params: DisableDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisableDirectoryResponse, Unit]
  ): Request[DisableDirectoryResponse, AWSError] = js.native
  /**
    * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
    */
  def enableDirectory(): Request[EnableDirectoryResponse, AWSError] = js.native
  def enableDirectory(callback: js.Function2[/* err */ AWSError, /* data */ EnableDirectoryResponse, Unit]): Request[EnableDirectoryResponse, AWSError] = js.native
  /**
    * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
    */
  def enableDirectory(params: EnableDirectoryRequest): Request[EnableDirectoryResponse, AWSError] = js.native
  def enableDirectory(
    params: EnableDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EnableDirectoryResponse, Unit]
  ): Request[EnableDirectoryResponse, AWSError] = js.native
  /**
    * Returns current applied schema version ARN, including the minor version in use.
    */
  def getAppliedSchemaVersion(): Request[GetAppliedSchemaVersionResponse, AWSError] = js.native
  def getAppliedSchemaVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetAppliedSchemaVersionResponse, Unit]): Request[GetAppliedSchemaVersionResponse, AWSError] = js.native
  /**
    * Returns current applied schema version ARN, including the minor version in use.
    */
  def getAppliedSchemaVersion(params: GetAppliedSchemaVersionRequest): Request[GetAppliedSchemaVersionResponse, AWSError] = js.native
  def getAppliedSchemaVersion(
    params: GetAppliedSchemaVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAppliedSchemaVersionResponse, Unit]
  ): Request[GetAppliedSchemaVersionResponse, AWSError] = js.native
  /**
    * Retrieves metadata about a directory.
    */
  def getDirectory(): Request[GetDirectoryResponse, AWSError] = js.native
  def getDirectory(callback: js.Function2[/* err */ AWSError, /* data */ GetDirectoryResponse, Unit]): Request[GetDirectoryResponse, AWSError] = js.native
  /**
    * Retrieves metadata about a directory.
    */
  def getDirectory(params: GetDirectoryRequest): Request[GetDirectoryResponse, AWSError] = js.native
  def getDirectory(
    params: GetDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDirectoryResponse, Unit]
  ): Request[GetDirectoryResponse, AWSError] = js.native
  /**
    * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
    */
  def getFacet(): Request[GetFacetResponse, AWSError] = js.native
  def getFacet(callback: js.Function2[/* err */ AWSError, /* data */ GetFacetResponse, Unit]): Request[GetFacetResponse, AWSError] = js.native
  /**
    * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
    */
  def getFacet(params: GetFacetRequest): Request[GetFacetResponse, AWSError] = js.native
  def getFacet(
    params: GetFacetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFacetResponse, Unit]
  ): Request[GetFacetResponse, AWSError] = js.native
  /**
    * Retrieves attributes that are associated with a typed link.
    */
  def getLinkAttributes(): Request[GetLinkAttributesResponse, AWSError] = js.native
  def getLinkAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetLinkAttributesResponse, Unit]): Request[GetLinkAttributesResponse, AWSError] = js.native
  /**
    * Retrieves attributes that are associated with a typed link.
    */
  def getLinkAttributes(params: GetLinkAttributesRequest): Request[GetLinkAttributesResponse, AWSError] = js.native
  def getLinkAttributes(
    params: GetLinkAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLinkAttributesResponse, Unit]
  ): Request[GetLinkAttributesResponse, AWSError] = js.native
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  def getObjectAttributes(): Request[GetObjectAttributesResponse, AWSError] = js.native
  def getObjectAttributes(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectAttributesResponse, Unit]): Request[GetObjectAttributesResponse, AWSError] = js.native
  /**
    * Retrieves attributes within a facet that are associated with an object.
    */
  def getObjectAttributes(params: GetObjectAttributesRequest): Request[GetObjectAttributesResponse, AWSError] = js.native
  def getObjectAttributes(
    params: GetObjectAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectAttributesResponse, Unit]
  ): Request[GetObjectAttributesResponse, AWSError] = js.native
  /**
    * Retrieves metadata about an object.
    */
  def getObjectInformation(): Request[GetObjectInformationResponse, AWSError] = js.native
  def getObjectInformation(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectInformationResponse, Unit]): Request[GetObjectInformationResponse, AWSError] = js.native
  /**
    * Retrieves metadata about an object.
    */
  def getObjectInformation(params: GetObjectInformationRequest): Request[GetObjectInformationResponse, AWSError] = js.native
  def getObjectInformation(
    params: GetObjectInformationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectInformationResponse, Unit]
  ): Request[GetObjectInformationResponse, AWSError] = js.native
  /**
    * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
    */
  def getSchemaAsJson(): Request[GetSchemaAsJsonResponse, AWSError] = js.native
  def getSchemaAsJson(callback: js.Function2[/* err */ AWSError, /* data */ GetSchemaAsJsonResponse, Unit]): Request[GetSchemaAsJsonResponse, AWSError] = js.native
  /**
    * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
    */
  def getSchemaAsJson(params: GetSchemaAsJsonRequest): Request[GetSchemaAsJsonResponse, AWSError] = js.native
  def getSchemaAsJson(
    params: GetSchemaAsJsonRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSchemaAsJsonResponse, Unit]
  ): Request[GetSchemaAsJsonResponse, AWSError] = js.native
  /**
    * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.
    */
  def getTypedLinkFacetInformation(): Request[GetTypedLinkFacetInformationResponse, AWSError] = js.native
  def getTypedLinkFacetInformation(callback: js.Function2[/* err */ AWSError, /* data */ GetTypedLinkFacetInformationResponse, Unit]): Request[GetTypedLinkFacetInformationResponse, AWSError] = js.native
  /**
    * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed Links.
    */
  def getTypedLinkFacetInformation(params: GetTypedLinkFacetInformationRequest): Request[GetTypedLinkFacetInformationResponse, AWSError] = js.native
  def getTypedLinkFacetInformation(
    params: GetTypedLinkFacetInformationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTypedLinkFacetInformationResponse, Unit]
  ): Request[GetTypedLinkFacetInformationResponse, AWSError] = js.native
  /**
    * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
    */
  def listAppliedSchemaArns(): Request[ListAppliedSchemaArnsResponse, AWSError] = js.native
  def listAppliedSchemaArns(callback: js.Function2[/* err */ AWSError, /* data */ ListAppliedSchemaArnsResponse, Unit]): Request[ListAppliedSchemaArnsResponse, AWSError] = js.native
  /**
    * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
    */
  def listAppliedSchemaArns(params: ListAppliedSchemaArnsRequest): Request[ListAppliedSchemaArnsResponse, AWSError] = js.native
  def listAppliedSchemaArns(
    params: ListAppliedSchemaArnsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAppliedSchemaArnsResponse, Unit]
  ): Request[ListAppliedSchemaArnsResponse, AWSError] = js.native
  /**
    * Lists indices attached to the specified object.
    */
  def listAttachedIndices(): Request[ListAttachedIndicesResponse, AWSError] = js.native
  def listAttachedIndices(callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedIndicesResponse, Unit]): Request[ListAttachedIndicesResponse, AWSError] = js.native
  /**
    * Lists indices attached to the specified object.
    */
  def listAttachedIndices(params: ListAttachedIndicesRequest): Request[ListAttachedIndicesResponse, AWSError] = js.native
  def listAttachedIndices(
    params: ListAttachedIndicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttachedIndicesResponse, Unit]
  ): Request[ListAttachedIndicesResponse, AWSError] = js.native
  /**
    * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
    */
  def listDevelopmentSchemaArns(): Request[ListDevelopmentSchemaArnsResponse, AWSError] = js.native
  def listDevelopmentSchemaArns(callback: js.Function2[/* err */ AWSError, /* data */ ListDevelopmentSchemaArnsResponse, Unit]): Request[ListDevelopmentSchemaArnsResponse, AWSError] = js.native
  /**
    * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
    */
  def listDevelopmentSchemaArns(params: ListDevelopmentSchemaArnsRequest): Request[ListDevelopmentSchemaArnsResponse, AWSError] = js.native
  def listDevelopmentSchemaArns(
    params: ListDevelopmentSchemaArnsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevelopmentSchemaArnsResponse, Unit]
  ): Request[ListDevelopmentSchemaArnsResponse, AWSError] = js.native
  /**
    * Lists directories created within an account.
    */
  def listDirectories(): Request[ListDirectoriesResponse, AWSError] = js.native
  def listDirectories(callback: js.Function2[/* err */ AWSError, /* data */ ListDirectoriesResponse, Unit]): Request[ListDirectoriesResponse, AWSError] = js.native
  /**
    * Lists directories created within an account.
    */
  def listDirectories(params: ListDirectoriesRequest): Request[ListDirectoriesResponse, AWSError] = js.native
  def listDirectories(
    params: ListDirectoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDirectoriesResponse, Unit]
  ): Request[ListDirectoriesResponse, AWSError] = js.native
  /**
    * Retrieves attributes attached to the facet.
    */
  def listFacetAttributes(): Request[ListFacetAttributesResponse, AWSError] = js.native
  def listFacetAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ListFacetAttributesResponse, Unit]): Request[ListFacetAttributesResponse, AWSError] = js.native
  /**
    * Retrieves attributes attached to the facet.
    */
  def listFacetAttributes(params: ListFacetAttributesRequest): Request[ListFacetAttributesResponse, AWSError] = js.native
  def listFacetAttributes(
    params: ListFacetAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFacetAttributesResponse, Unit]
  ): Request[ListFacetAttributesResponse, AWSError] = js.native
  /**
    * Retrieves the names of facets that exist in a schema.
    */
  def listFacetNames(): Request[ListFacetNamesResponse, AWSError] = js.native
  def listFacetNames(callback: js.Function2[/* err */ AWSError, /* data */ ListFacetNamesResponse, Unit]): Request[ListFacetNamesResponse, AWSError] = js.native
  /**
    * Retrieves the names of facets that exist in a schema.
    */
  def listFacetNames(params: ListFacetNamesRequest): Request[ListFacetNamesResponse, AWSError] = js.native
  def listFacetNames(
    params: ListFacetNamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFacetNamesResponse, Unit]
  ): Request[ListFacetNamesResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  def listIncomingTypedLinks(): Request[ListIncomingTypedLinksResponse, AWSError] = js.native
  def listIncomingTypedLinks(callback: js.Function2[/* err */ AWSError, /* data */ ListIncomingTypedLinksResponse, Unit]): Request[ListIncomingTypedLinksResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  def listIncomingTypedLinks(params: ListIncomingTypedLinksRequest): Request[ListIncomingTypedLinksResponse, AWSError] = js.native
  def listIncomingTypedLinks(
    params: ListIncomingTypedLinksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIncomingTypedLinksResponse, Unit]
  ): Request[ListIncomingTypedLinksResponse, AWSError] = js.native
  /**
    * Lists objects attached to the specified index.
    */
  def listIndex(): Request[ListIndexResponse, AWSError] = js.native
  def listIndex(callback: js.Function2[/* err */ AWSError, /* data */ ListIndexResponse, Unit]): Request[ListIndexResponse, AWSError] = js.native
  /**
    * Lists objects attached to the specified index.
    */
  def listIndex(params: ListIndexRequest): Request[ListIndexResponse, AWSError] = js.native
  def listIndex(
    params: ListIndexRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIndexResponse, Unit]
  ): Request[ListIndexResponse, AWSError] = js.native
  /**
    * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
    */
  def listManagedSchemaArns(): Request[ListManagedSchemaArnsResponse, AWSError] = js.native
  def listManagedSchemaArns(callback: js.Function2[/* err */ AWSError, /* data */ ListManagedSchemaArnsResponse, Unit]): Request[ListManagedSchemaArnsResponse, AWSError] = js.native
  /**
    * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
    */
  def listManagedSchemaArns(params: ListManagedSchemaArnsRequest): Request[ListManagedSchemaArnsResponse, AWSError] = js.native
  def listManagedSchemaArns(
    params: ListManagedSchemaArnsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListManagedSchemaArnsResponse, Unit]
  ): Request[ListManagedSchemaArnsResponse, AWSError] = js.native
  /**
    * Lists all attributes that are associated with an object. 
    */
  def listObjectAttributes(): Request[ListObjectAttributesResponse, AWSError] = js.native
  def listObjectAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectAttributesResponse, Unit]): Request[ListObjectAttributesResponse, AWSError] = js.native
  /**
    * Lists all attributes that are associated with an object. 
    */
  def listObjectAttributes(params: ListObjectAttributesRequest): Request[ListObjectAttributesResponse, AWSError] = js.native
  def listObjectAttributes(
    params: ListObjectAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectAttributesResponse, Unit]
  ): Request[ListObjectAttributesResponse, AWSError] = js.native
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  def listObjectChildren(): Request[ListObjectChildrenResponse, AWSError] = js.native
  def listObjectChildren(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectChildrenResponse, Unit]): Request[ListObjectChildrenResponse, AWSError] = js.native
  /**
    * Returns a paginated list of child objects that are associated with a given object.
    */
  def listObjectChildren(params: ListObjectChildrenRequest): Request[ListObjectChildrenResponse, AWSError] = js.native
  def listObjectChildren(
    params: ListObjectChildrenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectChildrenResponse, Unit]
  ): Request[ListObjectChildrenResponse, AWSError] = js.native
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
    */
  def listObjectParentPaths(): Request[ListObjectParentPathsResponse, AWSError] = js.native
  def listObjectParentPaths(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectParentPathsResponse, Unit]): Request[ListObjectParentPathsResponse, AWSError] = js.native
  /**
    * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
    */
  def listObjectParentPaths(params: ListObjectParentPathsRequest): Request[ListObjectParentPathsResponse, AWSError] = js.native
  def listObjectParentPaths(
    params: ListObjectParentPathsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectParentPathsResponse, Unit]
  ): Request[ListObjectParentPathsResponse, AWSError] = js.native
  /**
    * Lists parent objects that are associated with a given object in pagination fashion.
    */
  def listObjectParents(): Request[ListObjectParentsResponse, AWSError] = js.native
  def listObjectParents(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectParentsResponse, Unit]): Request[ListObjectParentsResponse, AWSError] = js.native
  /**
    * Lists parent objects that are associated with a given object in pagination fashion.
    */
  def listObjectParents(params: ListObjectParentsRequest): Request[ListObjectParentsResponse, AWSError] = js.native
  def listObjectParents(
    params: ListObjectParentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectParentsResponse, Unit]
  ): Request[ListObjectParentsResponse, AWSError] = js.native
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  def listObjectPolicies(): Request[ListObjectPoliciesResponse, AWSError] = js.native
  def listObjectPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListObjectPoliciesResponse, Unit]): Request[ListObjectPoliciesResponse, AWSError] = js.native
  /**
    * Returns policies attached to an object in pagination fashion.
    */
  def listObjectPolicies(params: ListObjectPoliciesRequest): Request[ListObjectPoliciesResponse, AWSError] = js.native
  def listObjectPolicies(
    params: ListObjectPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListObjectPoliciesResponse, Unit]
  ): Request[ListObjectPoliciesResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  def listOutgoingTypedLinks(): Request[ListOutgoingTypedLinksResponse, AWSError] = js.native
  def listOutgoingTypedLinks(callback: js.Function2[/* err */ AWSError, /* data */ ListOutgoingTypedLinksResponse, Unit]): Request[ListOutgoingTypedLinksResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed Links.
    */
  def listOutgoingTypedLinks(params: ListOutgoingTypedLinksRequest): Request[ListOutgoingTypedLinksResponse, AWSError] = js.native
  def listOutgoingTypedLinks(
    params: ListOutgoingTypedLinksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOutgoingTypedLinksResponse, Unit]
  ): Request[ListOutgoingTypedLinksResponse, AWSError] = js.native
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  def listPolicyAttachments(): Request[ListPolicyAttachmentsResponse, AWSError] = js.native
  def listPolicyAttachments(callback: js.Function2[/* err */ AWSError, /* data */ ListPolicyAttachmentsResponse, Unit]): Request[ListPolicyAttachmentsResponse, AWSError] = js.native
  /**
    * Returns all of the ObjectIdentifiers to which a given policy is attached.
    */
  def listPolicyAttachments(params: ListPolicyAttachmentsRequest): Request[ListPolicyAttachmentsResponse, AWSError] = js.native
  def listPolicyAttachments(
    params: ListPolicyAttachmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPolicyAttachmentsResponse, Unit]
  ): Request[ListPolicyAttachmentsResponse, AWSError] = js.native
  /**
    * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
    */
  def listPublishedSchemaArns(): Request[ListPublishedSchemaArnsResponse, AWSError] = js.native
  def listPublishedSchemaArns(callback: js.Function2[/* err */ AWSError, /* data */ ListPublishedSchemaArnsResponse, Unit]): Request[ListPublishedSchemaArnsResponse, AWSError] = js.native
  /**
    * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
    */
  def listPublishedSchemaArns(params: ListPublishedSchemaArnsRequest): Request[ListPublishedSchemaArnsResponse, AWSError] = js.native
  def listPublishedSchemaArns(
    params: ListPublishedSchemaArnsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPublishedSchemaArnsResponse, Unit]
  ): Request[ListPublishedSchemaArnsResponse, AWSError] = js.native
  /**
    * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed Links.
    */
  def listTypedLinkFacetAttributes(): Request[ListTypedLinkFacetAttributesResponse, AWSError] = js.native
  def listTypedLinkFacetAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ListTypedLinkFacetAttributesResponse, Unit]): Request[ListTypedLinkFacetAttributesResponse, AWSError] = js.native
  /**
    * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed Links.
    */
  def listTypedLinkFacetAttributes(params: ListTypedLinkFacetAttributesRequest): Request[ListTypedLinkFacetAttributesResponse, AWSError] = js.native
  def listTypedLinkFacetAttributes(
    params: ListTypedLinkFacetAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTypedLinkFacetAttributesResponse, Unit]
  ): Request[ListTypedLinkFacetAttributesResponse, AWSError] = js.native
  /**
    * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed Links.
    */
  def listTypedLinkFacetNames(): Request[ListTypedLinkFacetNamesResponse, AWSError] = js.native
  def listTypedLinkFacetNames(callback: js.Function2[/* err */ AWSError, /* data */ ListTypedLinkFacetNamesResponse, Unit]): Request[ListTypedLinkFacetNamesResponse, AWSError] = js.native
  /**
    * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed Links.
    */
  def listTypedLinkFacetNames(params: ListTypedLinkFacetNamesRequest): Request[ListTypedLinkFacetNamesResponse, AWSError] = js.native
  def listTypedLinkFacetNames(
    params: ListTypedLinkFacetNamesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTypedLinkFacetNamesResponse, Unit]
  ): Request[ListTypedLinkFacetNamesResponse, AWSError] = js.native
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  def lookupPolicy(): Request[LookupPolicyResponse, AWSError] = js.native
  def lookupPolicy(callback: js.Function2[/* err */ AWSError, /* data */ LookupPolicyResponse, Unit]): Request[LookupPolicyResponse, AWSError] = js.native
  /**
    * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
    */
  def lookupPolicy(params: LookupPolicyRequest): Request[LookupPolicyResponse, AWSError] = js.native
  def lookupPolicy(
    params: LookupPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LookupPolicyResponse, Unit]
  ): Request[LookupPolicyResponse, AWSError] = js.native
  /**
    * Publishes a development schema with a major version and a recommended minor version.
    */
  def publishSchema(): Request[PublishSchemaResponse, AWSError] = js.native
  def publishSchema(callback: js.Function2[/* err */ AWSError, /* data */ PublishSchemaResponse, Unit]): Request[PublishSchemaResponse, AWSError] = js.native
  /**
    * Publishes a development schema with a major version and a recommended minor version.
    */
  def publishSchema(params: PublishSchemaRequest): Request[PublishSchemaResponse, AWSError] = js.native
  def publishSchema(
    params: PublishSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PublishSchemaResponse, Unit]
  ): Request[PublishSchemaResponse, AWSError] = js.native
  /**
    * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
    */
  def putSchemaFromJson(): Request[PutSchemaFromJsonResponse, AWSError] = js.native
  def putSchemaFromJson(callback: js.Function2[/* err */ AWSError, /* data */ PutSchemaFromJsonResponse, Unit]): Request[PutSchemaFromJsonResponse, AWSError] = js.native
  /**
    * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
    */
  def putSchemaFromJson(params: PutSchemaFromJsonRequest): Request[PutSchemaFromJsonResponse, AWSError] = js.native
  def putSchemaFromJson(
    params: PutSchemaFromJsonRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSchemaFromJsonResponse, Unit]
  ): Request[PutSchemaFromJsonResponse, AWSError] = js.native
  /**
    * Removes the specified facet from the specified object.
    */
  def removeFacetFromObject(): Request[RemoveFacetFromObjectResponse, AWSError] = js.native
  def removeFacetFromObject(callback: js.Function2[/* err */ AWSError, /* data */ RemoveFacetFromObjectResponse, Unit]): Request[RemoveFacetFromObjectResponse, AWSError] = js.native
  /**
    * Removes the specified facet from the specified object.
    */
  def removeFacetFromObject(params: RemoveFacetFromObjectRequest): Request[RemoveFacetFromObjectResponse, AWSError] = js.native
  def removeFacetFromObject(
    params: RemoveFacetFromObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RemoveFacetFromObjectResponse, Unit]
  ): Request[RemoveFacetFromObjectResponse, AWSError] = js.native
  /**
    * An API operation for adding tags to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * An API operation for adding tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * An API operation for removing tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * An API operation for removing tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
    */
  def updateFacet(): Request[UpdateFacetResponse, AWSError] = js.native
  def updateFacet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFacetResponse, Unit]): Request[UpdateFacetResponse, AWSError] = js.native
  /**
    * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
    */
  def updateFacet(params: UpdateFacetRequest): Request[UpdateFacetResponse, AWSError] = js.native
  def updateFacet(
    params: UpdateFacetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFacetResponse, Unit]
  ): Request[UpdateFacetResponse, AWSError] = js.native
  /**
    * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
    */
  def updateLinkAttributes(): Request[UpdateLinkAttributesResponse, AWSError] = js.native
  def updateLinkAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLinkAttributesResponse, Unit]): Request[UpdateLinkAttributesResponse, AWSError] = js.native
  /**
    * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
    */
  def updateLinkAttributes(params: UpdateLinkAttributesRequest): Request[UpdateLinkAttributesResponse, AWSError] = js.native
  def updateLinkAttributes(
    params: UpdateLinkAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLinkAttributesResponse, Unit]
  ): Request[UpdateLinkAttributesResponse, AWSError] = js.native
  /**
    * Updates a given object's attributes.
    */
  def updateObjectAttributes(): Request[UpdateObjectAttributesResponse, AWSError] = js.native
  def updateObjectAttributes(callback: js.Function2[/* err */ AWSError, /* data */ UpdateObjectAttributesResponse, Unit]): Request[UpdateObjectAttributesResponse, AWSError] = js.native
  /**
    * Updates a given object's attributes.
    */
  def updateObjectAttributes(params: UpdateObjectAttributesRequest): Request[UpdateObjectAttributesResponse, AWSError] = js.native
  def updateObjectAttributes(
    params: UpdateObjectAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateObjectAttributesResponse, Unit]
  ): Request[UpdateObjectAttributesResponse, AWSError] = js.native
  /**
    * Updates the schema name with a new name. Only development schema names can be updated.
    */
  def updateSchema(): Request[UpdateSchemaResponse, AWSError] = js.native
  def updateSchema(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSchemaResponse, Unit]): Request[UpdateSchemaResponse, AWSError] = js.native
  /**
    * Updates the schema name with a new name. Only development schema names can be updated.
    */
  def updateSchema(params: UpdateSchemaRequest): Request[UpdateSchemaResponse, AWSError] = js.native
  def updateSchema(
    params: UpdateSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSchemaResponse, Unit]
  ): Request[UpdateSchemaResponse, AWSError] = js.native
  /**
    * Updates a TypedLinkFacet. For more information, see Typed Links.
    */
  def updateTypedLinkFacet(): Request[UpdateTypedLinkFacetResponse, AWSError] = js.native
  def updateTypedLinkFacet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTypedLinkFacetResponse, Unit]): Request[UpdateTypedLinkFacetResponse, AWSError] = js.native
  /**
    * Updates a TypedLinkFacet. For more information, see Typed Links.
    */
  def updateTypedLinkFacet(params: UpdateTypedLinkFacetRequest): Request[UpdateTypedLinkFacetResponse, AWSError] = js.native
  def updateTypedLinkFacet(
    params: UpdateTypedLinkFacetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTypedLinkFacetResponse, Unit]
  ): Request[UpdateTypedLinkFacetResponse, AWSError] = js.native
  /**
    * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
    */
  def upgradeAppliedSchema(): Request[UpgradeAppliedSchemaResponse, AWSError] = js.native
  def upgradeAppliedSchema(callback: js.Function2[/* err */ AWSError, /* data */ UpgradeAppliedSchemaResponse, Unit]): Request[UpgradeAppliedSchemaResponse, AWSError] = js.native
  /**
    * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
    */
  def upgradeAppliedSchema(params: UpgradeAppliedSchemaRequest): Request[UpgradeAppliedSchemaResponse, AWSError] = js.native
  def upgradeAppliedSchema(
    params: UpgradeAppliedSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpgradeAppliedSchemaResponse, Unit]
  ): Request[UpgradeAppliedSchemaResponse, AWSError] = js.native
  /**
    * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
    */
  def upgradePublishedSchema(): Request[UpgradePublishedSchemaResponse, AWSError] = js.native
  def upgradePublishedSchema(callback: js.Function2[/* err */ AWSError, /* data */ UpgradePublishedSchemaResponse, Unit]): Request[UpgradePublishedSchemaResponse, AWSError] = js.native
  /**
    * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
    */
  def upgradePublishedSchema(params: UpgradePublishedSchemaRequest): Request[UpgradePublishedSchemaResponse, AWSError] = js.native
  def upgradePublishedSchema(
    params: UpgradePublishedSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpgradePublishedSchemaResponse, Unit]
  ): Request[UpgradePublishedSchemaResponse, AWSError] = js.native
}

