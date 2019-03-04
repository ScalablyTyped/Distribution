package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: arangodbLib.arangodbLibStrings.`application/json`
  var authorization: java.lang.String
}

object Anon_Accept {
  @scala.inline
  def apply(accept: arangodbLib.arangodbLibStrings.`application/json`, authorization: java.lang.String): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept, authorization = authorization)
  
    __obj.asInstanceOf[Anon_Accept]
  }
}

