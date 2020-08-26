package typings.apolloReactHoc.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProps[TData, TGraphQLVariables] extends js.Object {
  var data: DataValue[TData, TGraphQLVariables] = js.native
}

object DataProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](data: DataValue[TData, TGraphQLVariables]): DataProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProps[TData, TGraphQLVariables]]
  }
  @scala.inline
  implicit class DataPropsOps[Self <: DataProps[_, _], TData, TGraphQLVariables] (val x: Self with (DataProps[TData, TGraphQLVariables])) extends AnyVal {
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
    def setData(value: DataValue[TData, TGraphQLVariables]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

