package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdCode extends StObject {
  
  /** 行政区划代码 */
  var adCode: String
  
  /** 城市名 */
  var city: String
  
  /** 城市名对应拼音拼写，方便用户搜索 */
  var spell: String
}
object AdCode {
  
  inline def apply(adCode: String, city: String, spell: String): AdCode = {
    val __obj = js.Dynamic.literal(adCode = adCode.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], spell = spell.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdCode]
  }
  
  extension [Self <: AdCode](x: Self) {
    
    inline def setAdCode(value: String): Self = StObject.set(x, "adCode", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setSpell(value: String): Self = StObject.set(x, "spell", value.asInstanceOf[js.Any])
  }
}
