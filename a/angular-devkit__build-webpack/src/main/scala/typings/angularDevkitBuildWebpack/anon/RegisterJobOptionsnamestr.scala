package typings.angularDevkitBuildWebpack.anon

import typings.angularDevkitBuildWebpack.jobsApiMod.JobName
import typings.angularDevkitBuildWebpack.schemaSchemaMod.JsonSchema
import typings.angularDevkitBuildWebpack.srcUtilsMod.DeepReadonly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular-devkit/build-webpack.@angular-devkit/build-webpack/core/src/experimental/jobs/simple-registry.RegisterJobOptions & {  name :string} */
trait RegisterJobOptionsnamestr extends StObject {
  
  var argument: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  
  var input: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  
  var name: js.UndefOr[JobName] & String
  
  var output: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
}
object RegisterJobOptionsnamestr {
  
  inline def apply(name: js.UndefOr[JobName] & String): RegisterJobOptionsnamestr = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterJobOptionsnamestr]
  }
  
  extension [Self <: RegisterJobOptionsnamestr](x: Self) {
    
    inline def setArgument(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setInput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: js.UndefOr[JobName] & String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: DeepReadonly[JsonSchema]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
