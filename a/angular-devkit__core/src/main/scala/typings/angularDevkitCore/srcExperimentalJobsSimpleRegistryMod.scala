package typings.angularDevkitCore

import typings.angularDevkitCore.anon.RegisterJobOptionsnamestr
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobHandler
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobName
import typings.angularDevkitCore.srcExperimentalJobsApiMod.Registry
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitCore.srcUtilsMod.DeepReadonly
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExperimentalJobsSimpleRegistryMod {
  
  @JSImport("@angular-devkit/core/src/experimental/jobs/simple-registry", "SimpleJobRegistry")
  @js.native
  open class SimpleJobRegistry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] ()
    extends StObject
       with Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT] {
    
    /* private */ var _jobNames: Any = js.native
    
    /* protected */ def _register[ArgumentT /* <: JsonValue */, InputT /* <: JsonValue */, OutputT /* <: JsonValue */](name: JobName, handler: JobHandler[ArgumentT, InputT, OutputT], options: RegisterJobOptions): Unit = js.native
    
    /**
      * Get a job handler.
      * @param name The name of the job to get a handler from.
      */
    /* CompleteClass */
    override def get[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName): Observable_[(JobHandler[A, I, O]) | Null] = js.native
    
    /**
      * Returns the job names of all jobs.
      */
    def getJobNames(): js.Array[JobName] = js.native
    
    /**
      * Register a job handler. The name must be unique.
      *
      * @param handler The function that will be called for the job.
      * @param options An optional list of options to override the handler. {@see RegisterJobOptions}
      */
    def register[ArgumentT /* <: JsonValue */, InputT /* <: JsonValue */, OutputT /* <: JsonValue */](handler: JobHandler[ArgumentT, InputT, OutputT]): Unit = js.native
    def register[ArgumentT /* <: JsonValue */, InputT /* <: JsonValue */, OutputT /* <: JsonValue */](handler: JobHandler[ArgumentT, InputT, OutputT], options: RegisterJobOptionsnamestr): Unit = js.native
    /**
      * Register a job handler. The name must be unique.
      *
      * @param name The name of the job.
      * @param handler The function that will be called for the job.
      * @param options An optional list of options to override the handler. {@see RegisterJobOptions}
      */
    def register[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName, handler: JobHandler[A, I, O]): Unit = js.native
    def register[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName, handler: JobHandler[A, I, O], options: RegisterJobOptions): Unit = js.native
  }
  
  /* Inlined parent std.Partial<@angular-devkit/core.@angular-devkit/core/src/experimental/jobs/api.JobDescription> */
  trait RegisterJobOptions extends StObject {
    
    var argument: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var input: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
    
    var name: js.UndefOr[JobName] = js.undefined
    
    var output: js.UndefOr[DeepReadonly[JsonSchema]] = js.undefined
  }
  object RegisterJobOptions {
    
    inline def apply(): RegisterJobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegisterJobOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisterJobOptions] (val x: Self) extends AnyVal {
      
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
}
