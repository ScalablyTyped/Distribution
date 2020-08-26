package typings.arangodb.anon

import typings.arangodb.ArangoDB.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  var algorithm: js.UndefOr[HashAlgorithm] = js.native
  var secret: js.UndefOr[String] = js.native
}

object Algorithm {
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: HashAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
  
}

