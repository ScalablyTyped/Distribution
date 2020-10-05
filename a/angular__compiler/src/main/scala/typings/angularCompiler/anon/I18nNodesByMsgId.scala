package typings.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nNodesByMsgId extends js.Object {
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]] = js.native
  var locale: String | Null = js.native
}

object I18nNodesByMsgId {
  @scala.inline
  def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]]): I18nNodesByMsgId = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nNodesByMsgId]
  }
  @scala.inline
  implicit class I18nNodesByMsgIdOps[Self <: I18nNodesByMsgId] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setLocaleNull: Self = this.set("locale", null)
  }
  
}

