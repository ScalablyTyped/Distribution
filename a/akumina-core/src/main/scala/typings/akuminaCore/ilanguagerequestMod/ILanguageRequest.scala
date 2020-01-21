package typings.akuminaCore.ilanguagerequestMod

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
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageRequest]
  }
}

