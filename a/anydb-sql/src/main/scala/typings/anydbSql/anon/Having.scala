package typings.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Having[T] extends js.Object {
  def having(nodes: js.Any*): T
}

object Having {
  @scala.inline
  def apply[T](having: /* repeated */ js.Any => T): Having[T] = {
    val __obj = js.Dynamic.literal(having = js.Any.fromFunction1(having))
    __obj.asInstanceOf[Having[T]]
  }
}

