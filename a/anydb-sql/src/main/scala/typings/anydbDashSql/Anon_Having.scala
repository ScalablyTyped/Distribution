package typings.anydbDashSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Having[T] extends js.Object {
  def having(nodes: js.Any*): T
}

object Anon_Having {
  @scala.inline
  def apply[T](having: /* repeated */ js.Any => T): Anon_Having[T] = {
    val __obj = js.Dynamic.literal(having = js.Any.fromFunction1(having))
  
    __obj.asInstanceOf[Anon_Having[T]]
  }
}

