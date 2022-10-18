package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationS3Response extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source Amazon S3 bucket location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.LocationArn] = js.undefined
}
object CreateLocationS3Response {
  
  inline def apply(): CreateLocationS3Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationS3Response]
  }
  
  extension [Self <: CreateLocationS3Response](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
  }
}
