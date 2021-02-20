package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnUS extends StObject {
  
  var `en-US`: Appsettingcontentwidth = js.native
  
  var `it-IT`: Appsettingcontentwidthfixed = js.native
  
  var `zh-CN`: Appsettingcontentwidth = js.native
  
  var `zh-TW`: Appsettingcontentwidthfixed = js.native
}
object EnUS {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EnUSMutableBuilder[Self <: EnUS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setEn-US`(value: Appsettingcontentwidth): Self = StObject.set(x, "en-US", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIt-IT`(value: Appsettingcontentwidthfixed): Self = StObject.set(x, "it-IT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZh-CN`(value: Appsettingcontentwidth): Self = StObject.set(x, "zh-CN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZh-TW`(value: Appsettingcontentwidthfixed): Self = StObject.set(x, "zh-TW", value.asInstanceOf[js.Any])
  }
}
