package typings.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nLocalizeOptions extends js.Object {
  var translations: StringDictionary[String]
}

object I18nLocalizeOptions {
  @scala.inline
  def apply(translations: StringDictionary[String]): I18nLocalizeOptions = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[I18nLocalizeOptions]
  }
}

