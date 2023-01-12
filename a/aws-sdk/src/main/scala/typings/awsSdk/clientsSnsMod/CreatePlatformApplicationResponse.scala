package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlatformApplicationResponse extends StObject {
  
  /**
    * PlatformApplicationArn is returned.
    */
  var PlatformApplicationArn: js.UndefOr[String] = js.undefined
}
object CreatePlatformApplicationResponse {
  
  inline def apply(): CreatePlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlatformApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePlatformApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformApplicationArnUndefined: Self = StObject.set(x, "PlatformApplicationArn", js.undefined)
  }
}
