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

object Anon_Context {
  @scala.inline
  def apply[TData](
    remoteResult: graphqlLib.executionExecuteMod.ExecutionResult[TData],
    context: stdLib.Record[java.lang.String, _] = null,
    document: graphqlLib.languageAstMod.DocumentNode = null,
    onlyRunForcedResolvers: js.UndefOr[scala.Boolean] = js.undefined,
    variables: stdLib.Record[java.lang.String, _] = null
  ): Anon_Context[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remoteResult")(remoteResult)
    if (context != null) __obj.updateDynamic("context")(context)
    if (document != null) __obj.updateDynamic("document")(document)
    if (!js.isUndefined(onlyRunForcedResolvers)) __obj.updateDynamic("onlyRunForcedResolvers")(onlyRunForcedResolvers)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Context[TData]]
  }
}

