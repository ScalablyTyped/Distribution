package typings.apigeeAccess.mod.ApigeeAccess

import typings.apigeeAccess.apigeeAccessStrings.application
import typings.apigeeAccess.apigeeAccessStrings.exclusive
import typings.apigeeAccess.apigeeAccessStrings.global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOptions extends js.Object {
  var defaultTtl: js.UndefOr[Double] = js.native
  var resource: js.UndefOr[String] = js.native
  var scope: js.UndefOr[global | application | exclusive] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object CacheOptions {
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
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
    def setDefaultTtl(value: Double): Self = this.set("defaultTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultTtl: Self = this.set("defaultTtl", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setScope(value: global | application | exclusive): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

