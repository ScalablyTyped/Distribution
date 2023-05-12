package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the collection.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
    */
  var collectionEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The Epoch time when the collection was created.
    */
  var createdDate: js.UndefOr[Long] = js.undefined
  
  /**
    * Collection-specific endpoint used to access OpenSearch Dashboards.
    */
  var dashboardEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the collection.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the collection.
    */
  var id: js.UndefOr[CollectionId] = js.undefined
  
  /**
    * The ARN of the Amazon Web Services KMS key used to encrypt the collection.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the collection was last modified.
    */
  var lastModifiedDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the collection.
    */
  var name: js.UndefOr[CollectionName] = js.undefined
  
  /**
    * The current status of the collection.
    */
  var status: js.UndefOr[CollectionStatus] = js.undefined
  
  /**
    * The type of collection.
    */
  var `type`: js.UndefOr[CollectionType] = js.undefined
}
object CollectionDetail {
  
  inline def apply(): CollectionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionDetail] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCollectionEndpoint(value: String): Self = StObject.set(x, "collectionEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCollectionEndpointUndefined: Self = StObject.set(x, "collectionEndpoint", js.undefined)
    
    inline def setCreatedDate(value: Long): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDashboardEndpoint(value: String): Self = StObject.set(x, "dashboardEndpoint", value.asInstanceOf[js.Any])
    
    inline def setDashboardEndpointUndefined: Self = StObject.set(x, "dashboardEndpoint", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: CollectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setLastModifiedDate(value: Long): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setName(value: CollectionName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: CollectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: CollectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
