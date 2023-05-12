package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGeofenceCollectionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated geofence collection. Used to specify a resource across Amazon Web Services.   Format example: arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection   
    */
  var CollectionArn: Arn
  
  /**
    * The name of the updated geofence collection.
    */
  var CollectionName: ResourceName
  
  /**
    * The time when the geofence collection was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var UpdateTime: js.Date
}
object UpdateGeofenceCollectionResponse {
  
  inline def apply(CollectionArn: Arn, CollectionName: ResourceName, UpdateTime: js.Date): UpdateGeofenceCollectionResponse = {
    val __obj = js.Dynamic.literal(CollectionArn = CollectionArn.asInstanceOf[js.Any], CollectionName = CollectionName.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGeofenceCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateGeofenceCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectionArn(value: Arn): Self = StObject.set(x, "CollectionArn", value.asInstanceOf[js.Any])
    
    inline def setCollectionName(value: ResourceName): Self = StObject.set(x, "CollectionName", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
