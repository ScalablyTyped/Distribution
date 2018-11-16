package typings
package apigeeDashAccessLib.apigeeDashAccessMod.ApigeeAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  def get(key: java.lang.String, callback: js.Function2[/* err */ js.Any, /* data */ js.Any, scala.Unit]): scala.Unit = js.native
  def put(key: java.lang.String, data: js.Any): scala.Unit = js.native
  def put(key: java.lang.String, data: js.Any, ttl: scala.Double): scala.Unit = js.native
  def put(
    key: java.lang.String,
    data: js.Any,
    ttl: scala.Double,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def remove(key: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

