package typings.apolloDashClient

import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document[TVariables] extends js.Object {
  var document: DocumentNode
  var previousResult: js.Any
  var variables: js.UndefOr[TVariables] = js.undefined
}

object Anon_Document {
  @scala.inline
  def apply[TVariables](document: DocumentNode, previousResult: js.Any, variables: TVariables = null): Anon_Document[TVariables] = {
    val __obj = js.Dynamic.literal(document = document, previousResult = previousResult)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Document[TVariables]]
  }
}

