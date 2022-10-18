package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionConfiguration extends StObject {
  
  /**
    * The expected encoding type of the input payload for the function. The default is ''json''.
    */
  var EncodingType: js.UndefOr[typings.awsSdk.clientsGreengrassMod.EncodingType] = js.undefined
  
  /**
    * The environment configuration of the function.
    */
  var Environment: js.UndefOr[FunctionConfigurationEnvironment] = js.undefined
  
  /**
    * The execution arguments.
    */
  var ExecArgs: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the function executable.
    */
  var Executable: js.UndefOr[string] = js.undefined
  
  /**
    * The Lambda runtime supported by Greengrass which is to be used instead of the one specified in the Lambda function.
    */
  var FunctionRuntimeOverride: js.UndefOr[string] = js.undefined
  
  /**
    * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when you run the Lambda function without containerization.
    */
  var MemorySize: js.UndefOr[integer] = js.undefined
  
  /**
    * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
    */
  var Pinned: js.UndefOr[boolean] = js.undefined
  
  /**
    * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies to pinned Lambda functions for each request.
    */
  var Timeout: js.UndefOr[integer] = js.undefined
}
object FunctionConfiguration {
  
  inline def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  
  extension [Self <: FunctionConfiguration](x: Self) {
    
    inline def setEncodingType(value: EncodingType): Self = StObject.set(x, "EncodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "EncodingType", js.undefined)
    
    inline def setEnvironment(value: FunctionConfigurationEnvironment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setExecArgs(value: string): Self = StObject.set(x, "ExecArgs", value.asInstanceOf[js.Any])
    
    inline def setExecArgsUndefined: Self = StObject.set(x, "ExecArgs", js.undefined)
    
    inline def setExecutable(value: string): Self = StObject.set(x, "Executable", value.asInstanceOf[js.Any])
    
    inline def setExecutableUndefined: Self = StObject.set(x, "Executable", js.undefined)
    
    inline def setFunctionRuntimeOverride(value: string): Self = StObject.set(x, "FunctionRuntimeOverride", value.asInstanceOf[js.Any])
    
    inline def setFunctionRuntimeOverrideUndefined: Self = StObject.set(x, "FunctionRuntimeOverride", js.undefined)
    
    inline def setMemorySize(value: integer): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
    
    inline def setPinned(value: boolean): Self = StObject.set(x, "Pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "Pinned", js.undefined)
    
    inline def setTimeout(value: integer): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
