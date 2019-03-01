package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Http extends js.Object {
  val httpNs: Anon_Client
}

object Anon_Http {
  @scala.inline
  def apply(httpNs: Anon_Client): Anon_Http = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("httpNs")(httpNs)
    __obj.asInstanceOf[Anon_Http]
  }
}

