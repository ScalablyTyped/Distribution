package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.srcApiMod.BuilderInfo
import typings.angularDevkitArchitect.srcApiMod.BuilderInput
import typings.angularDevkitArchitect.srcApiMod.BuilderOutput
import typings.angularDevkitArchitect.srcApiMod.Target
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobDescription
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobHandler
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobHandlerContext
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobName
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessage
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcUtilsMod.DeepReadonly
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcInternalMod {
  
  @JSImport("@angular-devkit/architect/src/internal", "BuilderSymbol")
  @js.native
  val BuilderSymbol: js.Symbol = js.native
  
  @JSImport("@angular-devkit/architect/src/internal", "BuilderVersionSymbol")
  @js.native
  val BuilderVersionSymbol: js.Symbol = js.native
  
  @js.native
  trait ArchitectHost[BuilderInfoT /* <: BuilderInfo */] extends StObject {
    
    /**
      * Get the builder name for a target.
      * @param target The target to inspect.
      */
    def getBuilderNameForTarget(target: Target): js.Promise[String | Null] = js.native
    
    def getCurrentDirectory(): js.Promise[String] = js.native
    
    def getOptionsForTarget(target: Target): js.Promise[JsonObject | Null] = js.native
    
    def getProjectMetadata(projectName: String): js.Promise[JsonObject | Null] = js.native
    def getProjectMetadata(target: Target): js.Promise[JsonObject | Null] = js.native
    
    def getWorkspaceRoot(): js.Promise[String] = js.native
    
    def loadBuilder(info: BuilderInfoT): js.Promise[Builder[JsonObject] | Null] = js.native
    
    /**
      * Resolve a builder. This needs to return a string which will be used in a dynamic `import()`
      * clause. This should throw if no builder can be found. The dynamic import will throw if
      * it is unsupported.
      * @param builderName The name of the builder to be used.
      * @returns All the info needed for the builder itself.
      */
    def resolveBuilder(builderName: String): js.Promise[BuilderInfoT | Null] = js.native
  }
  
  @js.native
  trait Builder[OptionT /* <: JsonObject */] extends StObject {
    
    def handler(argument: JsonObject, context: JobHandlerContext[JsonObject, BuilderInput, BuilderOutput]): Observable_[JobOutboundMessage[BuilderOutput]] = js.native
    @JSName("handler")
    var handler_Original: JobHandler[JsonObject, BuilderInput, BuilderOutput] = js.native
  }
  
  trait BuilderDescription
    extends StObject
       with JobDescription {
    
    var info: BuilderInfo
  }
  object BuilderDescription {
    
    inline def apply(
      argument: DeepReadonly[JsonSchema],
      info: BuilderInfo,
      input: DeepReadonly[JsonSchema],
      name: JobName,
      output: DeepReadonly[JsonSchema]
    ): BuilderDescription = {
      val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuilderDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuilderDescription] (val x: Self) extends AnyVal {
      
      inline def setInfo(value: BuilderInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BuilderJobHandler[A /* <: JsonObject */, I /* <: BuilderInput */, O /* <: BuilderOutput */]
    extends StObject
       with JobHandler[A, I, O] {
    
    @JSName("jobDescription")
    var jobDescription_BuilderJobHandler: BuilderDescription = js.native
  }
}
