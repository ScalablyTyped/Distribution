package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_I18nNodesByMsgIdLocale extends js.Object {
  var i18nNodesByMsgId: org.scalablytyped.runtime.StringDictionary[js.Array[atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node]]
  var locale: java.lang.String
}

object Anon_I18nNodesByMsgIdLocale {
  @scala.inline
  def apply(
    i18nNodesByMsgId: org.scalablytyped.runtime.StringDictionary[js.Array[atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node]],
    locale: java.lang.String
  ): Anon_I18nNodesByMsgIdLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("i18nNodesByMsgId")(i18nNodesByMsgId)
    __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[Anon_I18nNodesByMsgIdLocale]
  }
}

