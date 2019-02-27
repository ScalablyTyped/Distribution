package typings
package apolloDashClientLib.coreLocalStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecContext extends js.Object {
  var context: js.Any = js.native
  var defaultOperationType: java.lang.String = js.native
  var exportedVariables: stdLib.Record[java.lang.String, _] = js.native
  var fragmentMap: apolloDashUtilitiesLib.libGetFromASTMod.FragmentMap = js.native
  @JSName("fragmentMatcher")
  var fragmentMatcher_Original: FragmentMatcher = js.native
  var onlyRunForcedResolvers: scala.Boolean = js.native
  var variables: VariableMap = js.native
  def fragmentMatcher(rootValue: js.Any, typeCondition: java.lang.String, context: js.Any): scala.Boolean = js.native
}

