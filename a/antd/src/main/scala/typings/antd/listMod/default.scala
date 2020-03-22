package typings.antd.listMod

import typings.antd.AnonDataSource
import typings.antd.AnonGrid
import typings.antd.TypeofItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/list", JSImport.Default)
@js.native
class default[T] protected () extends List[T] {
  def this(props: ListProps[T]) = this()
}

/* static members */
@JSImport("antd/lib/list", JSImport.Default)
@js.native
object default extends js.Object {
  var Item: TypeofItem = js.native
  var childContextTypes: AnonGrid = js.native
  var defaultProps: AnonDataSource = js.native
}

