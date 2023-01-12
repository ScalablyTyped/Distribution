package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 选择城市 https://docs.alipay.com/mini/api/ui-city
trait City extends StObject {
  
  // 城市名
  var adCode: String
  
  var city: String
  
  // 行政区划代码
  var spell: js.UndefOr[String] = js.undefined
}
object City {
  
  inline def apply(adCode: String, city: String): City = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: City] (val x: Self) extends AnyVal {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setSpell(value: String): Self = StObject.set(x, "spell", value.asInstanceOf[js.Any])
    
    inline def setSpellUndefined: Self = StObject.set(x, "spell", js.undefined)
  }
}
