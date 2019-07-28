package typings.apolloDashClient.coreLocalStateMod

import typings.apolloDashUtilities.libGetFromASTMod.FragmentMap
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecContext extends js.Object {
  var context: js.Any = js.native
  var defaultOperationType: String = js.native
  var exportedVariables: Record[String, _] = js.native
  var fragmentMap: FragmentMap = js.native
  @JSName("fragmentMatcher")
  var fragmentMatcher_Original: FragmentMatcher = js.native
  var onlyRunForcedResolvers: Boolean = js.native
  var variables: VariableMap = js.native
  def fragmentMatcher(rootValue: js.Any, typeCondition: String, context: js.Any): Boolean = js.native
}

