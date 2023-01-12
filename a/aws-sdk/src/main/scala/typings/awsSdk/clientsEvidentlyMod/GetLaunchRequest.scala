package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchRequest extends StObject {
  
  /**
    * The name of the launch that you want to see the details of.
    */
  var launch: LaunchName
  
  /**
    * The name or ARN of the project that contains the launch.
    */
  var project: ProjectRef
}
object GetLaunchRequest {
  
  inline def apply(launch: LaunchName, project: ProjectRef): GetLaunchRequest = {
    val __obj = js.Dynamic.literal(launch = launch.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLaunchRequest] (val x: Self) extends AnyVal {
    
    inline def setLaunch(value: LaunchName): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}
