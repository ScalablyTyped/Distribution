package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: Anon_Accept
  var qs: java.lang.String
  var url: java.lang.String
}

object Anon_Headers {
  @scala.inline
  def apply(headers: Anon_Accept, qs: java.lang.String, url: java.lang.String): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers, qs = qs, url = url)
  
    __obj.asInstanceOf[Anon_Headers]
  }
}

