package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptDetails extends StObject {
  
  /**
    * The runtime parameters passed to the run path for the script.
    */
  var ExecutableParameters: js.UndefOr[String] = js.undefined
  
  /**
    * The run path for the script.
    */
  var ExecutablePath: String
  
  /**
    * The S3 object location for the script.
    */
  var ScriptS3Location: S3Location
  
  /**
    * The run timeout, in seconds, for the script.
    */
  var TimeoutInSeconds: Integer
}
object ScriptDetails {
  
  inline def apply(ExecutablePath: String, ScriptS3Location: S3Location, TimeoutInSeconds: Integer): ScriptDetails = {
    val __obj = js.Dynamic.literal(ExecutablePath = ExecutablePath.asInstanceOf[js.Any], ScriptS3Location = ScriptS3Location.asInstanceOf[js.Any], TimeoutInSeconds = TimeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptDetails]
  }
  
  extension [Self <: ScriptDetails](x: Self) {
    
    inline def setExecutableParameters(value: String): Self = StObject.set(x, "ExecutableParameters", value.asInstanceOf[js.Any])
    
    inline def setExecutableParametersUndefined: Self = StObject.set(x, "ExecutableParameters", js.undefined)
    
    inline def setExecutablePath(value: String): Self = StObject.set(x, "ExecutablePath", value.asInstanceOf[js.Any])
    
    inline def setScriptS3Location(value: S3Location): Self = StObject.set(x, "ScriptS3Location", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSeconds(value: Integer): Self = StObject.set(x, "TimeoutInSeconds", value.asInstanceOf[js.Any])
  }
}
