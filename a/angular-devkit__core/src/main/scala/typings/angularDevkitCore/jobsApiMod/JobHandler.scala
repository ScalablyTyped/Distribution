package typings.angularDevkitCore.jobsApiMod

import typings.angularDevkitCore.anon.PartialJobDescription
import typings.angularDevkitCore.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobHandler[ArgT /* <: JsonValue */, InputT /* <: JsonValue */, OutputT /* <: JsonValue */] extends StObject {
  
  def apply(argument: ArgT, context: JobHandlerContext[ArgT, InputT, OutputT]): Any = js.native
  
  var jobDescription: PartialJobDescription = js.native
}
