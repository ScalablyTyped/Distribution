package typings.argon2Browser.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Argon2BrowserHashOptions extends js.Object {
  var distPath: js.UndefOr[String] = js.native
  var hashLen: js.UndefOr[Double] = js.native
  var mem: js.UndefOr[Double] = js.native
  var parallelism: js.UndefOr[Double] = js.native
  var pass: String | Uint8Array = js.native
  var salt: String | Uint8Array = js.native
  var time: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[ArgonType] = js.native
}

object Argon2BrowserHashOptions {
  @scala.inline
  def apply(pass: String | Uint8Array, salt: String | Uint8Array): Argon2BrowserHashOptions = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2BrowserHashOptions]
  }
  @scala.inline
  implicit class Argon2BrowserHashOptionsOps[Self <: Argon2BrowserHashOptions] (val x: Self) extends AnyVal {
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
    def setPass(value: String | Uint8Array): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def setSalt(value: String | Uint8Array): Self = this.set("salt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistPath(value: String): Self = this.set("distPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistPath: Self = this.set("distPath", js.undefined)
    @scala.inline
    def setHashLen(value: Double): Self = this.set("hashLen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashLen: Self = this.set("hashLen", js.undefined)
    @scala.inline
    def setMem(value: Double): Self = this.set("mem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMem: Self = this.set("mem", js.undefined)
    @scala.inline
    def setParallelism(value: Double): Self = this.set("parallelism", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallelism: Self = this.set("parallelism", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setType(value: ArgonType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

