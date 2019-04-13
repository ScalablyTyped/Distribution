package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudDirectory
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudDirectory: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds a new Facet to an object. An object can have more than one facet applied on it.
    */
  def addFacetToObject(): awsDashSdkLib.libRequestMod.Request[AddFacetToObjectResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def detachTypedLink(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Detaches a typed link from a specified source and target object. For more information, see Typed Links.
    */
  def detachTypedLink(params: DetachTypedLinkRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detachTypedLink(
    params: DetachTypedLinkRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
    */
  def disableDirectory(): awsDashSdkLib.libRequestMod.Request[DisableDirectoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
  def upgradePublishedSchema(
    params: UpgradePublishedSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpgradePublishedSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpgradePublishedSchemaResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

