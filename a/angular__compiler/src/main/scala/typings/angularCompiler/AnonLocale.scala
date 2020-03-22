package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocale extends js.Object {
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]]
  var locale: String
}

object AnonLocale {
  @scala.inline
  def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]], locale: String): AnonLocale = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocale]
  }
}

