package typings.apolloUtilities

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executeMod.ExecutionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-utilities/lib/util/errorHandling", JSImport.Namespace)
@js.native
object errorHandlingMod extends js.Object {
  def graphQLResultHasError(result: ExecutionResult[StringDictionary[_], StringDictionary[_]]): Double = js.native
  def tryFunctionOrLogError(f: js.Function): js.Any = js.native
}

