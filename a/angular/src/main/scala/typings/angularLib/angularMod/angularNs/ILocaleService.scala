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

