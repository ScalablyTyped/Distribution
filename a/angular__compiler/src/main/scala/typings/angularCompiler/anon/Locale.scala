package typings.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]] = js.native
  var locale: String = js.native
}

object Locale {
  @scala.inline
  def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]], locale: String): Locale = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def setI18nNodesByMsgId(value: StringDictionary[js.Array[Node]]): Self = this.set("i18nNodesByMsgId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
  
}

