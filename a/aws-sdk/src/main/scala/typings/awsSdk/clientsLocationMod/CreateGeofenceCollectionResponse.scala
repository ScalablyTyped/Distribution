package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGeofenceCollectionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource across all Amazon Web Services.    Format example: arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection   
    */
  var CollectionArn: Arn
  
  /**
    * The name for the geofence collection.
    */
  var CollectionName: ResourceName
  
  /**
    * The timestamp for when the geofence collection was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var CreateTime: js.Date
}
object CreateGeofenceCollectionResponse {
  
  inline def apply(CollectionArn: Arn, CollectionName: ResourceName, CreateTime: js.Date): CreateGeofenceCollectionResponse = {
    val __obj = js.Dynamic.literal(CollectionArn = CollectionArn.asInstanceOf[js.Any], CollectionName = CollectionName.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGeofenceCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGeofenceCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectionArn(value: Arn): Self = StObject.set(x, "CollectionArn", value.asInstanceOf[js.Any])
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
  }
}
