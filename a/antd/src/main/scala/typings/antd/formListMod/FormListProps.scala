package typings.antd.formListMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormListProps extends js.Object {
  var name: String | Double | (js.Array[String | Double]) = js.native
  def children(fields: js.Array[FormListFieldData], operation: FormListOperation): ReactNode = js.native
}

object FormListProps {
  @scala.inline
  def apply(
    children: (js.Array[FormListFieldData], FormListOperation) => ReactNode,
    name: String | Double | (js.Array[String | Double])
  ): FormListProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormListProps]
  }
  @scala.inline
  implicit class FormListPropsOps[Self <: FormListProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: (js.Array[FormListFieldData], FormListOperation) => ReactNode): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setNameVarargs(value: (String | Double)*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: String | Double | (js.Array[String | Double])): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

