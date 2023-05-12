package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCollectionDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the collection.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the collection was created.
    */
  var createdDate: js.UndefOr[Long] = js.undefined
  
  /**
    * The description of the collection.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the collection.
    */
  var id: js.UndefOr[CollectionId] = js.undefined
  
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
    * The collection type.
    */
  var `type`: js.UndefOr[CollectionType] = js.undefined
}
object UpdateCollectionDetail {
  
  inline def apply(): UpdateCollectionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCollectionDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCollectionDetail] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedDate(value: Long): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: CollectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
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
