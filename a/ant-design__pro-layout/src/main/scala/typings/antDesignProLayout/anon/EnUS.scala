package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnUS extends StObject {
  
  var `en-US`: Appsettingcontentwidthfluid
  
  var `it-IT`: Appsettingcopy
  
  var `ko-KR`: Appsettingcopyinfo
  
  var `zh-CN`: Appsettingcontentwidth
  
  var `zh-TW`: Appsettingcontentwidthfixed
}
object EnUS {
  
  inline def apply(
    `en-US`: Appsettingcontentwidthfluid,
    `it-IT`: Appsettingcopy,
    `ko-KR`: Appsettingcopyinfo,
    `zh-CN`: Appsettingcontentwidth,
    `zh-TW`: Appsettingcontentwidthfixed
  ): EnUS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("en-US")(`en-US`.asInstanceOf[js.Any])
    __obj.updateDynamic("it-IT")(`it-IT`.asInstanceOf[js.Any])
    __obj.updateDynamic("ko-KR")(`ko-KR`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-TW")(`zh-TW`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnUS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnUS] (val x: Self) extends AnyVal {
    
    inline def `setEn-US`(value: Appsettingcontentwidthfluid): Self = StObject.set(x, "en-US", value.asInstanceOf[js.Any])
    
    inline def `setIt-IT`(value: Appsettingcopy): Self = StObject.set(x, "it-IT", value.asInstanceOf[js.Any])
    
    inline def `setKo-KR`(value: Appsettingcopyinfo): Self = StObject.set(x, "ko-KR", value.asInstanceOf[js.Any])
    
    inline def `setZh-CN`(value: Appsettingcontentwidth): Self = StObject.set(x, "zh-CN", value.asInstanceOf[js.Any])
    
    inline def `setZh-TW`(value: Appsettingcontentwidthfixed): Self = StObject.set(x, "zh-TW", value.asInstanceOf[js.Any])
  }
}
