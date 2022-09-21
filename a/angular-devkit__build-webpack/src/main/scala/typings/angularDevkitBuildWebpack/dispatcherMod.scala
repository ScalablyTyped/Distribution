package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.anon.PartialReadwriteJobDescri
import typings.angularDevkitBuildWebpack.jobsApiMod.JobHandler
import typings.angularDevkitBuildWebpack.jobsApiMod.JobName
import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatcherMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/experimental/jobs/dispatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDispatcher[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](): JobDispatcher[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatcher")().asInstanceOf[JobDispatcher[A, I, O]]
  inline def createDispatcher[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */](options: PartialReadwriteJobDescri): JobDispatcher[A, I, O] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatcher")(options.asInstanceOf[js.Any]).asInstanceOf[JobDispatcher[A, I, O]]
  
  @js.native
  trait JobDispatcher[A /* <: JsonValue */, I /* <: JsonValue */, O /* <: JsonValue */]
    extends StObject
       with JobHandler[A, I, O] {
    
    /**
      * Add a conditional job that will be selected if the input fits a predicate.
      * @param predicate
      * @param name
      */
    def addConditionalJob(predicate: js.Function1[/* args */ A, Boolean], name: String): Unit = js.native
    
    /**
      * Set the default job if all conditionals failed.
      * @param name The default name if all conditions are false.
      */
    def setDefaultJob(): Unit = js.native
    def setDefaultJob(name: JobHandler[JsonValue, JsonValue, JsonValue]): Unit = js.native
    def setDefaultJob(name: JobName): Unit = js.native
  }
}
