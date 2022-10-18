package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcUtilsMod.DeepReadonly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobDescription
  extends StObject
     with JsonObject {
  
  val argument: DeepReadonly[JsonSchema]
  
  val input: DeepReadonly[JsonSchema]
  
  val name: JobName
  
  val output: DeepReadonly[JsonSchema]
}
object JobDescription {
  
  inline def apply(
    argument: DeepReadonly[JsonSchema],
    input: DeepReadonly[JsonSchema],
    name: JobName,
    output: DeepReadonly[JsonSchema]
  ): JobDescription = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDescription]
  }
  
  extension [Self <: JobDescription](x: Self) {
    
    inline def setArgument(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setInput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setName(value: JobName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
