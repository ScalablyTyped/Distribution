package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePlatformApplicationInput extends StObject {
  
  /**
    * PlatformApplicationArn of platform application object to delete.
    */
  var PlatformApplicationArn: String
}
object DeletePlatformApplicationInput {
  
  inline def apply(PlatformApplicationArn: String): DeletePlatformApplicationInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePlatformApplicationInput]
  }
  
  extension [Self <: DeletePlatformApplicationInput](x: Self) {
    
    inline def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
  }
}
