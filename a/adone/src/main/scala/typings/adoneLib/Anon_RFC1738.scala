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
  def apply(RFC1738: java.lang.String => java.lang.String, RFC3986: java.lang.String => java.lang.String): Anon_RFC1738 = {
    val __obj = js.Dynamic.literal(RFC1738 = js.Any.fromFunction1(RFC1738), RFC3986 = js.Any.fromFunction1(RFC3986))
  
    __obj.asInstanceOf[Anon_RFC1738]
  }
}

