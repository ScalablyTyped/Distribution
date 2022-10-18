package typings.angularDevkitCore.anon

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobName
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcUtilsMod.DeepReadonly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Readonly<@angular-devkit/core.@angular-devkit/core/src/experimental/jobs/api.JobDescription>> */
trait PartialReadonlyJobDescrip extends StObject {
  
  var argument: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  
  var input: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  
  var name: js.UndefOr[JobName] = js.undefined
  
  var output: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
}
object PartialReadonlyJobDescrip {
  
  inline def apply(): PartialReadonlyJobDescrip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyJobDescrip]
  }
  
  extension [Self <: PartialReadonlyJobDescrip](x: Self) {
    
    inline def setArgument(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setInput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: JobName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
