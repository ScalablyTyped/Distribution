package typings.angularDevkitCore

import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobHandler
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobName
import typings.angularDevkitCore.srcExperimentalJobsApiMod.Registry
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExperimentalJobsFallbackRegistryMod {
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/fallback-registry", "FallbackRegistry")
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
    override def get[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName): Observable_[(JobHandler[A, I, O]) | Null] = js.native
  }
}
