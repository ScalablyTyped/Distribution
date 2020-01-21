package typings.apolloReactHoc.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProps[TData, TGraphQLVariables] extends js.Object {
  var data: DataValue[TData, TGraphQLVariables]
}

object DataProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](data: DataValue[TData, TGraphQLVariables]): DataProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataProps[TData, TGraphQLVariables]]
  }
}

