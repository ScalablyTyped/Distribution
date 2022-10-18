package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchResponse extends StObject {
  
  /**
    * A structure that contains the new configuration of the launch that was updated.
    */
  var launch: Launch
}
object UpdateLaunchResponse {
  
  inline def apply(launch: Launch): UpdateLaunchResponse = {
    val __obj = js.Dynamic.literal(launch = launch.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLaunchResponse]
  }
  
  extension [Self <: UpdateLaunchResponse](x: Self) {
    
    inline def setLaunch(value: Launch): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
  }
}
