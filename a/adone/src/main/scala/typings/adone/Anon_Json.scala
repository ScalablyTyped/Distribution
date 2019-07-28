package typings.adone

import typings.adone.adoneStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json extends js.Object {
  var responseType: json
}

object Anon_Json {
  @scala.inline
  def apply(responseType: json): Anon_Json = {
    val __obj = js.Dynamic.literal(responseType = responseType)
  
    __obj.asInstanceOf[Anon_Json]
  }
}

