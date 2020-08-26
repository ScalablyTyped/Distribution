package typings.arangodb.jwtMod

import typings.arangodb.arangodbStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsafeJwtStorageOptions extends js.Object {
  var algorithm: none = js.native
  var maxExp: js.UndefOr[Double] = js.native
  var ttl: js.UndefOr[Double] = js.native
  var verify: js.UndefOr[Boolean] = js.native
}

object UnsafeJwtStorageOptions {
  @scala.inline
  def apply(algorithm: none): UnsafeJwtStorageOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsafeJwtStorageOptions]
  }
  @scala.inline
  implicit class UnsafeJwtStorageOptionsOps[Self <: UnsafeJwtStorageOptions] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: none): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxExp(value: Double): Self = this.set("maxExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxExp: Self = this.set("maxExp", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    @scala.inline
    def setVerify(value: Boolean): Self = this.set("verify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
  
}

