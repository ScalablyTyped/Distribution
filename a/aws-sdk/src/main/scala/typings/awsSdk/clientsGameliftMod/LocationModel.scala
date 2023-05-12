package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationModel extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a Amazon GameLift location resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::location/location-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912.
    */
  var LocationArn: js.UndefOr[LocationArnModel] = js.undefined
  
  /**
    * The location's name.
    */
  var LocationName: js.UndefOr[LocationStringModel] = js.undefined
}
object LocationModel {
  
  inline def apply(): LocationModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationModel] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArnModel): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationName(value: LocationStringModel): Self = StObject.set(x, "LocationName", value.asInstanceOf[js.Any])
    
    inline def setLocationNameUndefined: Self = StObject.set(x, "LocationName", js.undefined)
  }
}
