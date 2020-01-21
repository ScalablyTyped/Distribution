package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentDataSource[T] extends js.Object {
  var currentDataSource: js.Array[T]
}

object AnonCurrentDataSource {
  @scala.inline
  def apply[T](currentDataSource: js.Array[T]): AnonCurrentDataSource[T] = {
    val __obj = js.Dynamic.literal(currentDataSource = currentDataSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrentDataSource[T]]
  }
}

