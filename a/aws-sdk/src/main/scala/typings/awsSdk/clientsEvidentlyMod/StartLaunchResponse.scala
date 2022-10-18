package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLaunchResponse extends StObject {
  
  /**
    * A structure that contains information about the launch that was started.
    */
  var launch: Launch
}
object StartLaunchResponse {
  
  inline def apply(launch: Launch): StartLaunchResponse = {
    val __obj = js.Dynamic.literal(launch = launch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLaunchResponse]
  }
  
  extension [Self <: StartLaunchResponse](x: Self) {
    
    inline def setLaunch(value: Launch): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
  }
}
