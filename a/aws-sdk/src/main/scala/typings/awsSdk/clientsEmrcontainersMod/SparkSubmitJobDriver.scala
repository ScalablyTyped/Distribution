package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparkSubmitJobDriver extends StObject {
  
  /**
    * The entry point of job application.
    */
  var entryPoint: EntryPointPath
  
  /**
    * The arguments for job application.
    */
  var entryPointArguments: js.UndefOr[EntryPointArguments] = js.undefined
  
  /**
    * The Spark submit parameters that are used for job runs.
    */
  var sparkSubmitParameters: js.UndefOr[SparkSubmitParameters] = js.undefined
}
object SparkSubmitJobDriver {
  
  inline def apply(entryPoint: EntryPointPath): SparkSubmitJobDriver = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkSubmitJobDriver]
  }
  
  extension [Self <: SparkSubmitJobDriver](x: Self) {
    
    inline def setEntryPoint(value: EntryPointPath): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointArguments(value: EntryPointArguments): Self = StObject.set(x, "entryPointArguments", value.asInstanceOf[js.Any])
    
    inline def setEntryPointArgumentsUndefined: Self = StObject.set(x, "entryPointArguments", js.undefined)
    
    inline def setEntryPointArgumentsVarargs(value: EntryPointArgument*): Self = StObject.set(x, "entryPointArguments", js.Array(value*))
    
    inline def setSparkSubmitParameters(value: SparkSubmitParameters): Self = StObject.set(x, "sparkSubmitParameters", value.asInstanceOf[js.Any])
    
    inline def setSparkSubmitParametersUndefined: Self = StObject.set(x, "sparkSubmitParameters", js.undefined)
  }
}
