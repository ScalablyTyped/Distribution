package typings.arangodb

import typings.arangodb.arangodbStrings.`application/json`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: `application/json`
  var authorization: String
}

object Anon_Accept {
  @scala.inline
  def apply(accept: `application/json`, authorization: String): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept, authorization = authorization)
  
    __obj.asInstanceOf[Anon_Accept]
  }
}

