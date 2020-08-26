package typings.apolloCache.dataProxyMod.DataProxy

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteFragmentOptions[TData, TVariables] extends Fragment[TVariables] {
  var data: TData = js.native
}

object WriteFragmentOptions {
  @scala.inline
  def apply[TData, TVariables](data: TData, fragment: DocumentNode, id: String): WriteFragmentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFragmentOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class WriteFragmentOptionsOps[Self <: WriteFragmentOptions[_, _], TData, TVariables] (val x: Self with (WriteFragmentOptions[TData, TVariables])) extends AnyVal {
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
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

