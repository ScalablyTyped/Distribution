package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// LocaleService
// see http://docs.angularjs.org/api/ng.$locale
///////////////////////////////////////////////////////////////////////////
trait ILocaleService extends js.Object {
  var DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor
  // These are not documented
  // Check angular's i18n files for exemples
  var NUMBER_FORMATS: ILocaleNumberFormatDescriptor
  var id: java.lang.String
  def pluralCat(num: js.Any): java.lang.String
}

object ILocaleService {
  @scala.inline
  def apply(
    DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor,
    NUMBER_FORMATS: ILocaleNumberFormatDescriptor,
    id: java.lang.String,
    pluralCat: js.Function1[js.Any, java.lang.String]
  ): ILocaleService = {
    val __obj = js.Dynamic.literal(DATETIME_FORMATS = DATETIME_FORMATS, NUMBER_FORMATS = NUMBER_FORMATS, id = id, pluralCat = pluralCat)
  
    __obj.asInstanceOf[ILocaleService]
  }
}

