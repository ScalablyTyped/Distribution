package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jwt extends js.Object {
  var jwt: Claims
}

object Jwt {
  @scala.inline
  def apply(jwt: Claims): Jwt = {
    val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jwt]
  }
}

