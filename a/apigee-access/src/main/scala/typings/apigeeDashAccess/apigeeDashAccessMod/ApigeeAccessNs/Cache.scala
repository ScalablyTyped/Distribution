package typings.apigeeDashAccess.apigeeDashAccessMod.ApigeeAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def get(key: String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, Unit]): Unit = js.native
  def put(key: String, data: js.Any): Unit = js.native
  def put(key: String, data: js.Any, ttl: Double): Unit = js.native
  def put(key: String, data: js.Any, ttl: Double, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def remove(key: String): Unit = js.native
  def remove(key: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

