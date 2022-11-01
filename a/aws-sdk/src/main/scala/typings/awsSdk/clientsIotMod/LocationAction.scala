package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationAction extends StObject {
  
  /**
    * The unique ID of the device providing the location data.
    */
  var deviceId: String
  
  /**
    * A string that evaluates to a double value that represents the latitude of the device's location.
    */
  var latitude: String
  
  /**
    * A string that evaluates to a double value that represents the longitude of the device's location.
    */
  var longitude: String
  
  /**
    * The IAM role that grants permission to write to the Amazon Location resource.
    */
  var roleArn: AwsArn
  
  /**
    * The time that the location data was sampled. The default value is the time the MQTT message was processed.
    */
  var timestamp: js.UndefOr[LocationTimestamp] = js.undefined
  
  /**
    * The name of the tracker resource in Amazon Location in which the location is updated.
    */
  var trackerName: String
}
object LocationAction {
  
  inline def apply(deviceId: String, latitude: String, longitude: String, roleArn: AwsArn, trackerName: String): LocationAction = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], trackerName = trackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationAction]
  }
  
  extension [Self <: LocationAction](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: LocationTimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTrackerName(value: String): Self = StObject.set(x, "trackerName", value.asInstanceOf[js.Any])
  }
}
