package typings.anydbSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHaving[T] extends js.Object {
  def having(nodes: js.Any*): T
}

object AnonHaving {
  @scala.inline
  def apply[T](having: /* repeated */ js.Any => T): AnonHaving[T] = {
    val __obj = js.Dynamic.literal(having = js.Any.fromFunction1(having))
  
    __obj.asInstanceOf[AnonHaving[T]]
  }
}

