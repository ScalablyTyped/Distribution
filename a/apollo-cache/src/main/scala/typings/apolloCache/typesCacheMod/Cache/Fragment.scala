package typings.apolloCache.typesCacheMod.Cache

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fragment[TVariables] extends js.Object {
  var fragment: DocumentNode
  var fragmentName: js.UndefOr[String] = js.undefined
  var id: String
  var variables: js.UndefOr[TVariables] = js.undefined
}

object Fragment {
  @scala.inline
  def apply[TVariables](fragment: DocumentNode, id: String, fragmentName: String = null, variables: TVariables = null): Fragment[TVariables] = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (fragmentName != null) __obj.updateDynamic("fragmentName")(fragmentName.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment[TVariables]]
  }
}

