package typings.antd.formListMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormListProps extends js.Object {
  var name: String | Double | (js.Array[String | Double])
  def children(fields: js.Array[FieldData], operation: Operation): ReactNode
}

object FormListProps {
  @scala.inline
  def apply(
    children: (js.Array[FieldData], Operation) => ReactNode,
    name: String | Double | (js.Array[String | Double])
  ): FormListProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormListProps]
  }
}

