package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.anon.PartialReadonlyJobDescrip
import typings.angularDevkitBuildWebpack.jobsApiMod.JobHandler
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategyMod {
  
  object strategy {
    
    @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs/strategy", "strategy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a JobStrategy that will reuse a running job if the argument matches.
      * @param replayMessages Replay ALL messages if a job is reused, otherwise just hook up where it
      * is.
      */
    inline def memoize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")().asInstanceOf[JobStrategy[A, I, O]]
    inline def memoize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](replayMessages: Boolean): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(replayMessages.asInstanceOf[js.Any]).asInstanceOf[JobStrategy[A, I, O]]
    
    /**
      * Creates a JobStrategy that will always reuse a running job, and restart it if the job ended.
      * @param replayMessages Replay ALL messages if a job is reused, otherwise just hook up where it
      * is.
      */
    inline def reuse[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("reuse")().asInstanceOf[JobStrategy[A, I, O]]
    inline def reuse[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](replayMessages: Boolean): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("reuse")(replayMessages.asInstanceOf[js.Any]).asInstanceOf[JobStrategy[A, I, O]]
    
    /**
      * Creates a JobStrategy that serializes every call. This strategy can be mixed between jobs.
      */
    inline def serialize[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobStrategy[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[JobStrategy[A, I, O]]
    
    type JobStrategy[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */] = js.Function2[
        /* handler */ JobHandler[A, I, O], 
        /* options */ js.UndefOr[PartialReadonlyJobDescrip], 
        JobHandler[A, I, O]
      ]
  }
}
