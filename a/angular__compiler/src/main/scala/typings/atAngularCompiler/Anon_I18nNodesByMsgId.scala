package typings.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18nNodesByMsgId extends js.Object {
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]]
  var locale: String | Null
}

object Anon_I18nNodesByMsgId {
  @scala.inline
  def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]], locale: String = null): Anon_I18nNodesByMsgId = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[Anon_I18nNodesByMsgId]
  }
}

