package typings.apolloCache.typesCacheMod.Cache

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fragment[TVariables] extends js.Object {
  var fragment: DocumentNode = js.native
  var fragmentName: js.UndefOr[String] = js.native
  var id: String = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object Fragment {
  @scala.inline
  def apply[TVariables](fragment: DocumentNode, id: String): Fragment[TVariables] = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment[TVariables]]
  }
  @scala.inline
  implicit class FragmentOps[Self <: Fragment[_], TVariables] (val x: Self with Fragment[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFragment(value: DocumentNode): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentName(value: String): Self = this.set("fragmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentName: Self = this.set("fragmentName", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

