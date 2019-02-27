package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TData] extends js.Object {
  var context: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var document: graphqlLib.languageAstMod.DocumentNode | scala.Null
  var onlyRunForcedResolvers: js.UndefOr[scala.Boolean] = js.undefined
  var remoteResult: graphqlLib.executionExecuteMod.ExecutionResult[TData]
  var variables: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

