package typings.apolloReact.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationOption extends js.Object {
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Object | (js.Function1[/* props */ js.Any, QueryOptions | MutationOptions])] = js.native
  var props: js.UndefOr[js.Function1[/* props */ js.Any, _]] = js.native
  var skip: js.UndefOr[Boolean | (js.Function1[/* props */ js.Any, Boolean])] = js.native
  var withRef: js.UndefOr[Boolean] = js.native
}

object OperationOption {
  @scala.inline
  def apply(): OperationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationOption]
  }
  @scala.inline
  implicit class OperationOptionOps[Self <: OperationOption] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionsFunction1(value: /* props */ js.Any => QueryOptions | MutationOptions): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: js.Object | (js.Function1[/* props */ js.Any, QueryOptions | MutationOptions])): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setProps(value: /* props */ js.Any => _): Self = this.set("props", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setSkipFunction1(value: /* props */ js.Any => Boolean): Self = this.set("skip", js.Any.fromFunction1(value))
    @scala.inline
    def setSkip(value: Boolean | (js.Function1[/* props */ js.Any, Boolean])): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setWithRef(value: Boolean): Self = this.set("withRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithRef: Self = this.set("withRef", js.undefined)
  }
  
}

