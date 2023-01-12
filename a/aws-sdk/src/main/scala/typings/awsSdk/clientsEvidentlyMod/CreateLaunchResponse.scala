package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchResponse extends StObject {
  
  /**
    * A structure that contains the configuration of the launch that was created.
    */
  var launch: Launch
}
object CreateLaunchResponse {
  
  inline def apply(launch: Launch): CreateLaunchResponse = {
    val __obj = js.Dynamic.literal(launch = launch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLaunchResponse] (val x: Self) extends AnyVal {
    
    inline def setLaunch(value: Launch): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
  }
}
