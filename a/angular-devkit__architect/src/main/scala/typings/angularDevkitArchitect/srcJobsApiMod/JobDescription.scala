package typings.angularDevkitArchitect.srcJobsApiMod

import typings.angularDevkitArchitect.srcJobsTypesMod.DeepReadonly
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobDescription] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setInput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setName(value: JobName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
