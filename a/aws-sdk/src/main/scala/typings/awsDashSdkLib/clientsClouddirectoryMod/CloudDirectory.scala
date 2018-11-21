package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudDirectory
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudDirectory: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ClientConfiguration = js.native
  /**
     * Adds a new Facet to an object. An object can have more than one facet applied on it.
     */
  def addFacetToObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AddFacetToObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new Facet to an object. An object can have more than one facet applied on it.
     */
  def addFacetToObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AddFacetToObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AddFacetToObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new Facet to an object. An object can have more than one facet applied on it.
     */
  def addFacetToObject(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AddFacetToObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AddFacetToObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new Facet to an object. An object can have more than one facet applied on it.
     */
  def addFacetToObject(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AddFacetToObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AddFacetToObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AddFacetToObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
     */
  def applySchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ApplySchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
     */
  def applySchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ApplySchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ApplySchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
     */
  def applySchema(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ApplySchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ApplySchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Copies the input published schema, at the specified version, into the Directory with the same name and version as that of the published schema.
     */
  def applySchema(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ApplySchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ApplySchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ApplySchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
     */
  def attachObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
     */
  def attachObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
     */
  def attachObject(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches an existing object to another object. An object can be accessed in two ways:   Using the path   Using ObjectIdentifier   
     */
  def attachObject(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     */
  def attachPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     */
  def attachPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     */
  def attachPolicy(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     */
  def attachPolicy(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches the specified object to the specified index.
     */
  def attachToIndex(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachToIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches the specified object to the specified index.
     */
  def attachToIndex(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachToIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachToIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches the specified object to the specified index.
     */
  def attachToIndex(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachToIndexRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachToIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches the specified object to the specified index.
     */
  def attachToIndex(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachToIndexRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachToIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachToIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a typed link to a specified source and target object. For more information, see Typed link.
     */
  def attachTypedLink(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachTypedLinkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a typed link to a specified source and target object. For more information, see Typed link.
     */
  def attachTypedLink(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachTypedLinkResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachTypedLinkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a typed link to a specified source and target object. For more information, see Typed link.
     */
  def attachTypedLink(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachTypedLinkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachTypedLinkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a typed link to a specified source and target object. For more information, see Typed link.
     */
  def attachTypedLink(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachTypedLinkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachTypedLinkResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.AttachTypedLinkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Performs all the read operations in a batch. 
     */
  def batchRead(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchReadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Performs all the read operations in a batch. 
     */
  def batchRead(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchReadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchReadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Performs all the read operations in a batch. 
     */
  def batchRead(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchReadRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchReadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Performs all the read operations in a batch. 
     */
  def batchRead(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchReadRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchReadResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchReadResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Performs all the write operations in a batch. Either all the operations succeed or none.
     */
  def batchWrite(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchWriteResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Performs all the write operations in a batch. Either all the operations succeed or none.
     */
  def batchWrite(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchWriteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchWriteResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Performs all the write operations in a batch. Either all the operations succeed or none.
     */
  def batchWrite(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchWriteRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchWriteResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Performs all the write operations in a batch. Either all the operations succeed or none.
     */
  def batchWrite(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchWriteRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchWriteResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.BatchWriteResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema.
     */
  def createDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema.
     */
  def createDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema.
     */
  def createDirectory(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Directory by copying the published schema into the directory. A directory cannot be created without a schema.
     */
  def createDirectory(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
     */
  def createFacet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
     */
  def createFacet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
     */
  def createFacet(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateFacetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new Facet in a schema. Facet creation is allowed only in development or applied schemas.
     */
  def createFacet(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateFacetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an index object. See Indexing for more information.
     */
  def createIndex(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an index object. See Indexing for more information.
     */
  def createIndex(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an index object. See Indexing for more information.
     */
  def createIndex(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateIndexRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an index object. See Indexing for more information.
     */
  def createIndex(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateIndexRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
     */
  def createObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
     */
  def createObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
     */
  def createObject(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an object in a Directory. Additionally attaches the object to a parent, if a parent reference and LinkName is specified. An object is simply a collection of Facet attributes. You can also use this API call to create a policy object, if the facet from which you create the object is a policy facet. 
     */
  def createObject(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
     */
  def createSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
     */
  def createSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
     */
  def createSchema(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new schema in a development state. A schema can exist in three phases:    Development: This is a mutable phase of the schema. All new schemas are in the development phase. Once the schema is finalized, it can be published.    Published: Published schemas are immutable and have a version associated with them.    Applied: Applied schemas are mutable in a way that allows you to add new schema facets. You can also add new, nonrequired attributes to existing schema facets. You can apply only published schemas to directories.   
     */
  def createSchema(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a TypedLinkFacet. For more information, see Typed link.
     */
  def createTypedLinkFacet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a TypedLinkFacet. For more information, see Typed link.
     */
  def createTypedLinkFacet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateTypedLinkFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a TypedLinkFacet. For more information, see Typed link.
     */
  def createTypedLinkFacet(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateTypedLinkFacetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a TypedLinkFacet. For more information, see Typed link.
     */
  def createTypedLinkFacet(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateTypedLinkFacetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateTypedLinkFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.CreateTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
     */
  def deleteDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
     */
  def deleteDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
     */
  def deleteDirectory(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a directory. Only disabled directories can be deleted. A deleted directory cannot be undone. Exercise extreme caution when deleting directories.
     */
  def deleteDirectory(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
     */
  def deleteFacet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
     */
  def deleteFacet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
     */
  def deleteFacet(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteFacetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a given Facet. All attributes and Rules that are associated with the facet will be deleted. Only development schema facets are allowed deletion.
     */
  def deleteFacet(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteFacetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted.
     */
  def deleteObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted.
     */
  def deleteObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted.
     */
  def deleteObject(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an object and its associated attributes. Only objects with no children and no parents can be deleted.
     */
  def deleteObject(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a given schema. Schemas in a development and published state can only be deleted. 
     */
  def deleteSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a given schema. Schemas in a development and published state can only be deleted. 
     */
  def deleteSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a given schema. Schemas in a development and published state can only be deleted. 
     */
  def deleteSchema(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a given schema. Schemas in a development and published state can only be deleted. 
     */
  def deleteSchema(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a TypedLinkFacet. For more information, see Typed link.
     */
  def deleteTypedLinkFacet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a TypedLinkFacet. For more information, see Typed link.
     */
  def deleteTypedLinkFacet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteTypedLinkFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a TypedLinkFacet. For more information, see Typed link.
     */
  def deleteTypedLinkFacet(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteTypedLinkFacetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a TypedLinkFacet. For more information, see Typed link.
     */
  def deleteTypedLinkFacet(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteTypedLinkFacetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteTypedLinkFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DeleteTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches the specified object from the specified index.
     */
  def detachFromIndex(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachFromIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches the specified object from the specified index.
     */
  def detachFromIndex(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachFromIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachFromIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches the specified object from the specified index.
     */
  def detachFromIndex(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachFromIndexRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachFromIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches the specified object from the specified index.
     */
  def detachFromIndex(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachFromIndexRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachFromIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachFromIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
     */
  def detachObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
     */
  def detachObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
     */
  def detachObject(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a given object from the parent object. The object that is to be detached from the parent is specified by the link name.
     */
  def detachObject(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a policy from an object.
     */
  def detachPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a policy from an object.
     */
  def detachPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a policy from an object.
     */
  def detachPolicy(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a policy from an object.
     */
  def detachPolicy(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a typed link from a specified source and target object. For more information, see Typed link.
     */
  def detachTypedLink(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a typed link from a specified source and target object. For more information, see Typed link.
     */
  def detachTypedLink(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a typed link from a specified source and target object. For more information, see Typed link.
     */
  def detachTypedLink(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachTypedLinkRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a typed link from a specified source and target object. For more information, see Typed link.
     */
  def detachTypedLink(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DetachTypedLinkRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
     */
  def disableDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DisableDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
     */
  def disableDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DisableDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DisableDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
     */
  def disableDirectory(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DisableDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DisableDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disables the specified directory. Disabled directories cannot be read or written to. Only enabled directories can be disabled. Disabled directories may be reenabled.
     */
  def disableDirectory(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DisableDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DisableDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.DisableDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
     */
  def enableDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.EnableDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
     */
  def enableDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.EnableDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.EnableDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
     */
  def enableDirectory(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.EnableDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.EnableDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Enables the specified directory. Only disabled directories can be enabled. Once enabled, the directory can then be read and written to.
     */
  def enableDirectory(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.EnableDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.EnableDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.EnableDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns current applied schema version ARN, including the minor version in use.
     */
  def getAppliedSchemaVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetAppliedSchemaVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns current applied schema version ARN, including the minor version in use.
     */
  def getAppliedSchemaVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetAppliedSchemaVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetAppliedSchemaVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns current applied schema version ARN, including the minor version in use.
     */
  def getAppliedSchemaVersion(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetAppliedSchemaVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetAppliedSchemaVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns current applied schema version ARN, including the minor version in use.
     */
  def getAppliedSchemaVersion(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetAppliedSchemaVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetAppliedSchemaVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetAppliedSchemaVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves metadata about a directory.
     */
  def getDirectory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves metadata about a directory.
     */
  def getDirectory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves metadata about a directory.
     */
  def getDirectory(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetDirectoryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves metadata about a directory.
     */
  def getDirectory(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetDirectoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetDirectoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetDirectoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
     */
  def getFacet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
     */
  def getFacet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
     */
  def getFacet(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetFacetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType. You can call this on all kinds of schema facets -- published, development, or applied.
     */
  def getFacet(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetFacetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes that are associated with a typed link.
     */
  def getLinkAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetLinkAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes that are associated with a typed link.
     */
  def getLinkAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetLinkAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetLinkAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes that are associated with a typed link.
     */
  def getLinkAttributes(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetLinkAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetLinkAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes that are associated with a typed link.
     */
  def getLinkAttributes(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetLinkAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetLinkAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetLinkAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes within a facet that are associated with an object.
     */
  def getObjectAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes within a facet that are associated with an object.
     */
  def getObjectAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes within a facet that are associated with an object.
     */
  def getObjectAttributes(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes within a facet that are associated with an object.
     */
  def getObjectAttributes(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves metadata about an object.
     */
  def getObjectInformation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectInformationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves metadata about an object.
     */
  def getObjectInformation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectInformationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectInformationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves metadata about an object.
     */
  def getObjectInformation(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectInformationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectInformationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves metadata about an object.
     */
  def getObjectInformation(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectInformationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectInformationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetObjectInformationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
     */
  def getSchemaAsJson(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetSchemaAsJsonResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
     */
  def getSchemaAsJson(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetSchemaAsJsonResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetSchemaAsJsonResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
     */
  def getSchemaAsJson(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetSchemaAsJsonRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetSchemaAsJsonResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a JSON representation of the schema. See JSON Schema Format for more information.
     */
  def getSchemaAsJson(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetSchemaAsJsonRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetSchemaAsJsonResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetSchemaAsJsonResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed link.
     */
  def getTypedLinkFacetInformation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetTypedLinkFacetInformationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed link.
     */
  def getTypedLinkFacetInformation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetTypedLinkFacetInformationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetTypedLinkFacetInformationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed link.
     */
  def getTypedLinkFacetInformation(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetTypedLinkFacetInformationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetTypedLinkFacetInformationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the identity attribute order for a specific TypedLinkFacet. For more information, see Typed link.
     */
  def getTypedLinkFacetInformation(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetTypedLinkFacetInformationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetTypedLinkFacetInformationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.GetTypedLinkFacetInformationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
     */
  def listAppliedSchemaArns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAppliedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
     */
  def listAppliedSchemaArns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAppliedSchemaArnsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAppliedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
     */
  def listAppliedSchemaArns(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAppliedSchemaArnsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAppliedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists schema major versions applied to a directory. If SchemaArn is provided, lists the minor version.
     */
  def listAppliedSchemaArns(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAppliedSchemaArnsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAppliedSchemaArnsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAppliedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists indices attached to the specified object.
     */
  def listAttachedIndices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAttachedIndicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists indices attached to the specified object.
     */
  def listAttachedIndices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAttachedIndicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAttachedIndicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists indices attached to the specified object.
     */
  def listAttachedIndices(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAttachedIndicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAttachedIndicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists indices attached to the specified object.
     */
  def listAttachedIndices(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAttachedIndicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAttachedIndicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListAttachedIndicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
     */
  def listDevelopmentSchemaArns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDevelopmentSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
     */
  def listDevelopmentSchemaArns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDevelopmentSchemaArnsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDevelopmentSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
     */
  def listDevelopmentSchemaArns(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDevelopmentSchemaArnsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDevelopmentSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves each Amazon Resource Name (ARN) of schemas in the development state.
     */
  def listDevelopmentSchemaArns(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDevelopmentSchemaArnsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDevelopmentSchemaArnsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDevelopmentSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists directories created within an account.
     */
  def listDirectories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDirectoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists directories created within an account.
     */
  def listDirectories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDirectoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDirectoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists directories created within an account.
     */
  def listDirectories(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDirectoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists directories created within an account.
     */
  def listDirectories(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDirectoriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDirectoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListDirectoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes attached to the facet.
     */
  def listFacetAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes attached to the facet.
     */
  def listFacetAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes attached to the facet.
     */
  def listFacetAttributes(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves attributes attached to the facet.
     */
  def listFacetAttributes(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the names of facets that exist in a schema.
     */
  def listFacetNames(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the names of facets that exist in a schema.
     */
  def listFacetNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the names of facets that exist in a schema.
     */
  def listFacetNames(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetNamesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the names of facets that exist in a schema.
     */
  def listFacetNames(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetNamesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListFacetNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed link.
     */
  def listIncomingTypedLinks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIncomingTypedLinksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed link.
     */
  def listIncomingTypedLinks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIncomingTypedLinksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIncomingTypedLinksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed link.
     */
  def listIncomingTypedLinks(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIncomingTypedLinksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIncomingTypedLinksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all the incoming TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed link.
     */
  def listIncomingTypedLinks(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIncomingTypedLinksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIncomingTypedLinksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIncomingTypedLinksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists objects attached to the specified index.
     */
  def listIndex(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists objects attached to the specified index.
     */
  def listIndex(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists objects attached to the specified index.
     */
  def listIndex(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIndexRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists objects attached to the specified index.
     */
  def listIndex(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIndexRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIndexResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListIndexResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
     */
  def listManagedSchemaArns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListManagedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
     */
  def listManagedSchemaArns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListManagedSchemaArnsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListManagedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
     */
  def listManagedSchemaArns(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListManagedSchemaArnsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListManagedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the major version families of each managed schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
     */
  def listManagedSchemaArns(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListManagedSchemaArnsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListManagedSchemaArnsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListManagedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all attributes that are associated with an object. 
     */
  def listObjectAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all attributes that are associated with an object. 
     */
  def listObjectAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all attributes that are associated with an object. 
     */
  def listObjectAttributes(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all attributes that are associated with an object. 
     */
  def listObjectAttributes(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of child objects that are associated with a given object.
     */
  def listObjectChildren(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectChildrenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of child objects that are associated with a given object.
     */
  def listObjectChildren(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectChildrenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectChildrenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of child objects that are associated with a given object.
     */
  def listObjectChildren(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectChildrenRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectChildrenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of child objects that are associated with a given object.
     */
  def listObjectChildren(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectChildrenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectChildrenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectChildrenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
     */
  def listObjectParentPaths(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentPathsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
     */
  def listObjectParentPaths(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentPathsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentPathsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
     */
  def listObjectParentPaths(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentPathsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentPathsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves all available parent paths for any object type such as node, leaf node, policy node, and index node objects. For more information about objects, see Directory Structure. Use this API to evaluate all parents for an object. The call returns all objects from the root of the directory up to the requested object. The API returns the number of paths based on user-defined MaxResults, in case there are multiple paths to the parent. The order of the paths and nodes returned is consistent among multiple API calls unless the objects are deleted or moved. Paths not leading to the directory root are ignored from the target object.
     */
  def listObjectParentPaths(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentPathsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentPathsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentPathsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists parent objects that are associated with a given object in pagination fashion.
     */
  def listObjectParents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists parent objects that are associated with a given object in pagination fashion.
     */
  def listObjectParents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists parent objects that are associated with a given object in pagination fashion.
     */
  def listObjectParents(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists parent objects that are associated with a given object in pagination fashion.
     */
  def listObjectParents(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectParentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns policies attached to an object in pagination fashion.
     */
  def listObjectPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns policies attached to an object in pagination fashion.
     */
  def listObjectPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns policies attached to an object in pagination fashion.
     */
  def listObjectPolicies(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns policies attached to an object in pagination fashion.
     */
  def listObjectPolicies(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListObjectPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed link.
     */
  def listOutgoingTypedLinks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListOutgoingTypedLinksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed link.
     */
  def listOutgoingTypedLinks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListOutgoingTypedLinksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListOutgoingTypedLinksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed link.
     */
  def listOutgoingTypedLinks(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListOutgoingTypedLinksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListOutgoingTypedLinksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all the outgoing TypedLinkSpecifier information for an object. It also supports filtering by typed link facet and identity attributes. For more information, see Typed link.
     */
  def listOutgoingTypedLinks(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListOutgoingTypedLinksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListOutgoingTypedLinksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListOutgoingTypedLinksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the ObjectIdentifiers to which a given policy is attached.
     */
  def listPolicyAttachments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPolicyAttachmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the ObjectIdentifiers to which a given policy is attached.
     */
  def listPolicyAttachments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPolicyAttachmentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPolicyAttachmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the ObjectIdentifiers to which a given policy is attached.
     */
  def listPolicyAttachments(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPolicyAttachmentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPolicyAttachmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns all of the ObjectIdentifiers to which a given policy is attached.
     */
  def listPolicyAttachments(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPolicyAttachmentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPolicyAttachmentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPolicyAttachmentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
     */
  def listPublishedSchemaArns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPublishedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
     */
  def listPublishedSchemaArns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPublishedSchemaArnsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPublishedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
     */
  def listPublishedSchemaArns(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPublishedSchemaArnsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPublishedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the major version families of each published schema. If a major version ARN is provided as SchemaArn, the minor version revisions in that family are listed instead.
     */
  def listPublishedSchemaArns(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPublishedSchemaArnsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPublishedSchemaArnsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListPublishedSchemaArnsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
     */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
     */
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
     */
  def listTagsForResource(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns tags for a resource. Tagging is currently supported only for directories with a limit of 50 tags per directory. All 50 tags are returned for a given directory with this API call.
     */
  def listTagsForResource(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed link.
     */
  def listTypedLinkFacetAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed link.
     */
  def listTypedLinkFacetAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed link.
     */
  def listTypedLinkFacetAttributes(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of all attribute definitions for a particular TypedLinkFacet. For more information, see Typed link.
     */
  def listTypedLinkFacetAttributes(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed link.
     */
  def listTypedLinkFacetNames(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed link.
     */
  def listTypedLinkFacetNames(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed link.
     */
  def listTypedLinkFacetNames(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetNamesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a paginated list of TypedLink facet names for a particular schema. For more information, see Typed link.
     */
  def listTypedLinkFacetNames(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetNamesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetNamesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.ListTypedLinkFacetNamesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
     */
  def lookupPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.LookupPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
     */
  def lookupPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.LookupPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.LookupPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
     */
  def lookupPolicy(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.LookupPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.LookupPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all policies from the root of the Directory to the object specified. If there are no policies present, an empty list is returned. If policies are present, and if some objects don't have the policies attached, it returns the ObjectIdentifier for such objects. If policies are present, it returns ObjectIdentifier, policyId, and policyType. Paths that don't lead to the root from the target object are ignored. For more information, see Policies.
     */
  def lookupPolicy(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.LookupPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.LookupPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.LookupPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Publishes a development schema with a major version and a recommended minor version.
     */
  def publishSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PublishSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Publishes a development schema with a major version and a recommended minor version.
     */
  def publishSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PublishSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PublishSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Publishes a development schema with a major version and a recommended minor version.
     */
  def publishSchema(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PublishSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PublishSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Publishes a development schema with a major version and a recommended minor version.
     */
  def publishSchema(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PublishSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PublishSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PublishSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
     */
  def putSchemaFromJson(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PutSchemaFromJsonResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
     */
  def putSchemaFromJson(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PutSchemaFromJsonResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PutSchemaFromJsonResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
     */
  def putSchemaFromJson(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PutSchemaFromJsonRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PutSchemaFromJsonResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Allows a schema to be updated using JSON upload. Only available for development schemas. See JSON Schema Format for more information.
     */
  def putSchemaFromJson(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PutSchemaFromJsonRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PutSchemaFromJsonResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.PutSchemaFromJsonResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified facet from the specified object.
     */
  def removeFacetFromObject(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.RemoveFacetFromObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified facet from the specified object.
     */
  def removeFacetFromObject(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.RemoveFacetFromObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.RemoveFacetFromObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified facet from the specified object.
     */
  def removeFacetFromObject(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.RemoveFacetFromObjectRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.RemoveFacetFromObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes the specified facet from the specified object.
     */
  def removeFacetFromObject(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.RemoveFacetFromObjectRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.RemoveFacetFromObjectResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.RemoveFacetFromObjectResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * An API operation for adding tags to a resource.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * An API operation for adding tags to a resource.
     */
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * An API operation for adding tags to a resource.
     */
  def tagResource(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * An API operation for adding tags to a resource.
     */
  def tagResource(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * An API operation for removing tags from a resource.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * An API operation for removing tags from a resource.
     */
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * An API operation for removing tags from a resource.
     */
  def untagResource(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * An API operation for removing tags from a resource.
     */
  def untagResource(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
     */
  def updateFacet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
     */
  def updateFacet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
     */
  def updateFacet(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateFacetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Does the following:   Adds new Attributes, Rules, or ObjectTypes.   Updates existing Attributes, Rules, or ObjectTypes.   Deletes existing Attributes, Rules, or ObjectTypes.  
     */
  def updateFacet(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateFacetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
     */
  def updateLinkAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateLinkAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
     */
  def updateLinkAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateLinkAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateLinkAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
     */
  def updateLinkAttributes(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateLinkAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateLinkAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a given typed link’s attributes. Attributes to be updated must not contribute to the typed link’s identity, as defined by its IdentityAttributeOrder.
     */
  def updateLinkAttributes(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateLinkAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateLinkAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateLinkAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a given object's attributes.
     */
  def updateObjectAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a given object's attributes.
     */
  def updateObjectAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateObjectAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a given object's attributes.
     */
  def updateObjectAttributes(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateObjectAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a given object's attributes.
     */
  def updateObjectAttributes(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateObjectAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateObjectAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateObjectAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the schema name with a new name. Only development schema names can be updated.
     */
  def updateSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the schema name with a new name. Only development schema names can be updated.
     */
  def updateSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the schema name with a new name. Only development schema names can be updated.
     */
  def updateSchema(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the schema name with a new name. Only development schema names can be updated.
     */
  def updateSchema(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a TypedLinkFacet. For more information, see Typed link.
     */
  def updateTypedLinkFacet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a TypedLinkFacet. For more information, see Typed link.
     */
  def updateTypedLinkFacet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateTypedLinkFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a TypedLinkFacet. For more information, see Typed link.
     */
  def updateTypedLinkFacet(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateTypedLinkFacetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a TypedLinkFacet. For more information, see Typed link.
     */
  def updateTypedLinkFacet(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateTypedLinkFacetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateTypedLinkFacetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpdateTypedLinkFacetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
     */
  def upgradeAppliedSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradeAppliedSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
     */
  def upgradeAppliedSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradeAppliedSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradeAppliedSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
     */
  def upgradeAppliedSchema(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradeAppliedSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradeAppliedSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Upgrades a single directory in-place using the PublishedSchemaArn with schema updates found in MinorVersion. Backwards-compatible minor version upgrades are instantaneously available for readers on all objects in the directory. Note: This is a synchronous API call and upgrades only one schema on a given directory per call. To upgrade multiple directories from one schema, you would need to call this API on each directory.
     */
  def upgradeAppliedSchema(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradeAppliedSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradeAppliedSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradeAppliedSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
     */
  def upgradePublishedSchema(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradePublishedSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
     */
  def upgradePublishedSchema(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradePublishedSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradePublishedSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
     */
  def upgradePublishedSchema(params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradePublishedSchemaRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradePublishedSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Upgrades a published schema under a new minor version revision using the current contents of DevelopmentSchemaArn.
     */
  def upgradePublishedSchema(
    params: awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradePublishedSchemaRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradePublishedSchemaResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsClouddirectoryMod.CloudDirectoryNs.UpgradePublishedSchemaResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

