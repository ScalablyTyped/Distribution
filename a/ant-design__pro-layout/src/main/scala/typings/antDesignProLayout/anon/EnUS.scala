package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnUS extends StObject {
  
  var `en-US`: Appsettingcontentwidth
  
  var `it-IT`: Appsettingcontentwidthfixed
  
  var `zh-CN`: Appsettingcontentwidth
  
  var `zh-TW`: Appsettingcontentwidthfixed
}
object EnUS {
  
  inline def apply(
    `en-US`: Appsettingcontentwidth,
    `it-IT`: Appsettingcontentwidthfixed,
    `zh-CN`: Appsettingcontentwidth,
    `zh-TW`: Appsettingcontentwidthfixed
  ): EnUS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("en-US")(`en-US`.asInstanceOf[js.Any])
    __obj.updateDynamic("it-IT")(`it-IT`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-CN")(`zh-CN`.asInstanceOf[js.Any])
    __obj.updateDynamic("zh-TW")(`zh-TW`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnUS]
  }
  
  extension [Self <: EnUS](x: Self) {
    
    inline def `setEn-US`(value: Appsettingcontentwidth): Self = StObject.set(x, "en-US", value.asInstanceOf[js.Any])
    
    inline def `setIt-IT`(value: Appsettingcontentwidthfixed): Self = StObject.set(x, "it-IT", value.asInstanceOf[js.Any])
    
    inline def `setZh-CN`(value: Appsettingcontentwidth): Self = StObject.set(x, "zh-CN", value.asInstanceOf[js.Any])
    
    inline def `setZh-TW`(value: Appsettingcontentwidthfixed): Self = StObject.set(x, "zh-TW", value.asInstanceOf[js.Any])
  }
}
