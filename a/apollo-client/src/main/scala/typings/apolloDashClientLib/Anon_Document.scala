package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var previousResult: js.Any
  var variables: js.UndefOr[apolloDashClientLib.coreTypesMod.OperationVariables]
}

object Anon_Document {
  @scala.inline
  def apply(
    document: graphqlLib.languageAstMod.DocumentNode,
    previousResult: js.Any,
    variables: apolloDashClientLib.coreTypesMod.OperationVariables = null
  ): Anon_Document = {
    val __obj = js.Dynamic.literal(document = document, previousResult = previousResult)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Document]
  }
}

