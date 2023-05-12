package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationSmbResponse extends StObject {
  
  /**
    * The ARN of the SMB location that you created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
}
object CreateLocationSmbResponse {
  
  inline def apply(): CreateLocationSmbResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationSmbResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationSmbResponse] (val x: Self) extends AnyVal {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
