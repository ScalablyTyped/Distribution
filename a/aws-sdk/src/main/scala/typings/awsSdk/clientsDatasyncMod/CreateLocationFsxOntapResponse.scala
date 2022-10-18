package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxOntapResponse extends StObject {
  
  /**
    * Specifies the ARN of the FSx for ONTAP file system location that you create.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
}
object CreateLocationFsxOntapResponse {
  
  inline def apply(): CreateLocationFsxOntapResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationFsxOntapResponse]
  }
  
  extension [Self <: CreateLocationFsxOntapResponse](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
