package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationEfsResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS file system location that you create.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
}
object CreateLocationEfsResponse {
  
  inline def apply(): CreateLocationEfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationEfsResponse]
  }
  
  extension [Self <: CreateLocationEfsResponse](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
