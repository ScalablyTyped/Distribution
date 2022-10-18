package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchResponse extends StObject {
  
  /**
    * A structure containing the configuration details of the launch.
    */
  var launch: js.UndefOr[Launch] = js.undefined
}
object GetLaunchResponse {
  
  inline def apply(): GetLaunchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLaunchResponse]
  }
  
  extension [Self <: GetLaunchResponse](x: Self) {
    
    inline def setLaunch(value: Launch): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
    
    inline def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
  }
}
