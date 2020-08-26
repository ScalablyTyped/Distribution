package typings.apolloCacheControl.anon

import typings.apolloCacheControl.mod.CacheScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  path :std.Array<string | number>} & apollo-cache-control.apollo-cache-control.CacheHint */
@js.native
trait pathArraystringnumberCach extends js.Object {
  var maxAge: js.UndefOr[Double] = js.native
  var path: js.Array[String | Double] = js.native
  var scope: js.UndefOr[CacheScope] = js.native
}

object pathArraystringnumberCach {
  @scala.inline
  def apply(path: js.Array[String | Double]): pathArraystringnumberCach = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[pathArraystringnumberCach]
  }
  @scala.inline
  implicit class pathArraystringnumberCachOps[Self <: pathArraystringnumberCach] (val x: Self) extends AnyVal {
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
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String | Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setScope(value: CacheScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

