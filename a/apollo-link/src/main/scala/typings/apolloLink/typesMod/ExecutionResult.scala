package typings.apolloLink.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionResult[TData]
  extends typings.graphql.executeMod.ExecutionResult[StringDictionary[js.Any], StringDictionary[js.Any]]

object ExecutionResult {
  @scala.inline
  def apply[TData](): ExecutionResult[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionResult[TData]]
  }
}

