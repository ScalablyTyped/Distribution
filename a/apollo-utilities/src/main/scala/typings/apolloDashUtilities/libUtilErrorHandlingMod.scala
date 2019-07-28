package typings.apolloDashUtilities

import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.executionExecuteMod.ExecutionResultDataDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/util/errorHandling", JSImport.Namespace)
@js.native
object libUtilErrorHandlingMod extends js.Object {
  def graphQLResultHasError(result: ExecutionResult[ExecutionResultDataDefault]): Double = js.native
  def tryFunctionOrLogError(f: js.Function): js.Any = js.native
}

