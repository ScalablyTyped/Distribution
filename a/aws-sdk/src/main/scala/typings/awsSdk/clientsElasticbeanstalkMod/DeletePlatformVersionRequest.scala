package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlatformVersionRequest extends StObject {
  
  /**
    * The ARN of the version of the custom platform.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
}
object DeletePlatformVersionRequest {
  
  inline def apply(): DeletePlatformVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePlatformVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePlatformVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
  }
}
