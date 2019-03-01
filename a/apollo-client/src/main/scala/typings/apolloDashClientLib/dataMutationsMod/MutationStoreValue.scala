package typings
package apolloDashClientLib.dataMutationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationStoreValue extends js.Object {
  var error: stdLib.Error | scala.Null
  var loading: scala.Boolean
  var mutation: graphqlLib.languageAstMod.DocumentNode
  var variables: js.Object
}

object MutationStoreValue {
  @scala.inline
  def apply(
    loading: scala.Boolean,
    mutation: graphqlLib.languageAstMod.DocumentNode,
    variables: js.Object,
    error: stdLib.Error = null
  ): MutationStoreValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("mutation")(mutation)
    __obj.updateDynamic("variables")(variables)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[MutationStoreValue]
  }
}

