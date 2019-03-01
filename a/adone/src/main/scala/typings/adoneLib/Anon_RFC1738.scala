package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RFC1738 extends js.Object {
  def RFC1738(`val`: java.lang.String): java.lang.String
  def RFC3986(`val`: java.lang.String): java.lang.String
}

object Anon_RFC1738 {
  @scala.inline
  def apply(
    RFC1738: js.Function1[java.lang.String, java.lang.String],
    RFC3986: js.Function1[java.lang.String, java.lang.String]
  ): Anon_RFC1738 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("RFC1738")(RFC1738)
    __obj.updateDynamic("RFC3986")(RFC3986)
    __obj.asInstanceOf[Anon_RFC1738]
  }
}

