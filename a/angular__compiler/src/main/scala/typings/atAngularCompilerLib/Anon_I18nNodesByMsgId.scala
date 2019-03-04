package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18nNodesByMsgId extends js.Object {
  var i18nNodesByMsgId: org.scalablytyped.runtime.StringDictionary[js.Array[atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node]]
  var locale: java.lang.String | scala.Null
}

object Anon_I18nNodesByMsgId {
  @scala.inline
  def apply(
    i18nNodesByMsgId: org.scalablytyped.runtime.StringDictionary[js.Array[atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node]],
    locale: java.lang.String = null
  ): Anon_I18nNodesByMsgId = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[Anon_I18nNodesByMsgId]
  }
}

