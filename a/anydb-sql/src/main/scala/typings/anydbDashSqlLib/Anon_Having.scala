package typings
package anydbDashSqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Having[T] extends js.Object {
  def having(nodes: js.Any*): T
}

object Anon_Having {
  @scala.inline
  def apply[T](having: js.Function1[/* repeated */ js.Any, T]): Anon_Having[T] = {
    val __obj = js.Dynamic.literal(having = having)
  
    __obj.asInstanceOf[Anon_Having[T]]
  }
}

