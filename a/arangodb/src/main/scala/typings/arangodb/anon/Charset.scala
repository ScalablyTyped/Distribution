package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charset extends js.Object {
  var charset: String = js.native
}

object Charset {
  @scala.inline
  def apply(charset: String): Charset = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charset]
  }
  @scala.inline
  implicit class CharsetOps[Self <: Charset] (val x: Self) extends AnyVal {
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
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
  }
  
}

