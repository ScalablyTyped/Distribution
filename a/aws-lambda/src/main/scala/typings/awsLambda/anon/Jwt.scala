package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jwt extends js.Object {
  var jwt: Claims = js.native
}

object Jwt {
  @scala.inline
  def apply(jwt: Claims): Jwt = {
    val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jwt]
  }
  @scala.inline
  implicit class JwtOps[Self <: Jwt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJwt(value: Claims): Self = this.set("jwt", value.asInstanceOf[js.Any])
  }
  
}

