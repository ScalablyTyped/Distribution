package typings.akuminaDashCore.interfacesILanguageRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageRequest extends js.Object {
  var languageCode: js.UndefOr[String] = js.undefined
  var languageId: Double
}

object ILanguageRequest {
  @scala.inline
  def apply(languageId: Double, languageCode: String = null): ILanguageRequest = {
    val __obj = js.Dynamic.literal(languageId = languageId)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[ILanguageRequest]
  }
}

