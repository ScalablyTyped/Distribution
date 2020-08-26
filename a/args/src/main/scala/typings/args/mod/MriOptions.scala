package typings.args.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MriOptions extends js.Object {
  var alias: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  var args: js.UndefOr[js.Array[String]] = js.native
  var boolean: js.UndefOr[String | js.Array[String]] = js.native
  var default: js.UndefOr[StringDictionary[js.Any]] = js.native
  var string: js.UndefOr[String | js.Array[String]] = js.native
  var unknown: js.UndefOr[js.Function1[/* param */ String, Boolean]] = js.native
}

object MriOptions {
  @scala.inline
  def apply(): MriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MriOptions]
  }
  @scala.inline
  implicit class MriOptionsOps[Self <: MriOptions] (val x: Self) extends AnyVal {
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
    def setAlias(value: StringDictionary[String | js.Array[String]]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setBooleanVarargs(value: String*): Self = this.set("boolean", js.Array(value :_*))
    @scala.inline
    def setBoolean(value: String | js.Array[String]): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setDefault(value: StringDictionary[js.Any]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setStringVarargs(value: String*): Self = this.set("string", js.Array(value :_*))
    @scala.inline
    def setString(value: String | js.Array[String]): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setUnknown(value: /* param */ String => Boolean): Self = this.set("unknown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
  
}

