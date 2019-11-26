package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bearer extends js.Object {
  var bearer: String
}

object Anon_Bearer {
  @scala.inline
  def apply(bearer: String): Anon_Bearer = {
    val __obj = js.Dynamic.literal(bearer = bearer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bearer]
  }
}

