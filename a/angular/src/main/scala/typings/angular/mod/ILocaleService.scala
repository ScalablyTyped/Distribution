package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// LocaleService
// see http://docs.angularjs.org/api/ng/service/$locale
///////////////////////////////////////////////////////////////////////////
trait ILocaleService extends StObject {
  
  var DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor
  
  // These are not documented
  // Check angular's i18n files for exemples
  var NUMBER_FORMATS: ILocaleNumberFormatDescriptor
  
  var id: String
  
  def pluralCat(num: js.Any): String
}
object ILocaleService {
  
  @scala.inline
  def apply(
    DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor,
    NUMBER_FORMATS: ILocaleNumberFormatDescriptor,
    id: String,
    pluralCat: js.Any => String
  ): ILocaleService = {
    val __obj = js.Dynamic.literal(DATETIME_FORMATS = DATETIME_FORMATS.asInstanceOf[js.Any], NUMBER_FORMATS = NUMBER_FORMATS.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pluralCat = js.Any.fromFunction1(pluralCat))
    __obj.asInstanceOf[ILocaleService]
  }
  
  @scala.inline
  implicit class ILocaleServiceMutableBuilder[Self <: ILocaleService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDATETIME_FORMATS(value: ILocaleDateTimeFormatDescriptor): Self = StObject.set(x, "DATETIME_FORMATS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUMBER_FORMATS(value: ILocaleNumberFormatDescriptor): Self = StObject.set(x, "NUMBER_FORMATS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralCat(value: js.Any => String): Self = StObject.set(x, "pluralCat", js.Any.fromFunction1(value))
  }
}
