package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopLaunchRequest extends StObject {
  
  /**
    * Specify whether to consider the launch as COMPLETED or CANCELLED after it stops.
    */
  var desiredState: js.UndefOr[LaunchStopDesiredState] = js.undefined
  
  /**
    * The name of the launch to stop.
    */
  var launch: LaunchName
  
  /**
    * The name or ARN of the project that contains the launch that you want to stop.
    */
  var project: ProjectRef
  
  /**
    * A string that describes why you are stopping the launch.
    */
  var reason: js.UndefOr[Description] = js.undefined
}
object StopLaunchRequest {
  
  inline def apply(launch: LaunchName, project: ProjectRef): StopLaunchRequest = {
    val __obj = js.Dynamic.literal(launch = launch.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopLaunchRequest]
  }
  
  extension [Self <: StopLaunchRequest](x: Self) {
    
    inline def setDesiredState(value: LaunchStopDesiredState): Self = StObject.set(x, "desiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "desiredState", js.undefined)
    
    inline def setLaunch(value: LaunchName): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Description): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
