package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.jobsApiMod.JobName
import typings.angularDevkitBuildWebpack.jobsApiMod.Registry
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fallbackRegistryMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs/fallback-registry", "FallbackRegistry")
  @js.native
  open class FallbackRegistry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] ()
    extends StObject
       with Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT] {
    def this(_fallbacks: js.Array[Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]]) = this()
    
    /* protected */ var _fallbacks: js.Array[Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]] = js.native
    
    def addFallback(registry: Registry[JsonValue, JsonValue, JsonValue]): Unit = js.native
    
    /**
      * Get a job handler.
      * @param name The name of the job to get a handler from.
      */
    /* CompleteClass */
    override def get[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName): Any = js.native
  }
}
