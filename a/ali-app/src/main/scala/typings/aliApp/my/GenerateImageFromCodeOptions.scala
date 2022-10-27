package typings.aliApp.my

import typings.aliApp.aliAppStrings.H
import typings.aliApp.aliAppStrings.L
import typings.aliApp.aliAppStrings.M
import typings.aliApp.aliAppStrings.Q
import typings.aliApp.aliAppStrings.QRCODE
import typings.aliApp.anon.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateImageFromCodeOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var code: String
  
  /**
    * @defaultValue 'H'
    */
  var correctLevel: js.UndefOr[L | M | Q | H] = js.undefined
  
  var format: QRCODE
  
  @JSName("success")
  var success_GenerateImageFromCodeOptions: js.UndefOr[js.Function1[/* res */ Image, Unit]] = js.undefined
  
  var width: Double
}
object GenerateImageFromCodeOptions {
  
  inline def apply(code: String, width: Double): GenerateImageFromCodeOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], format = "QRCODE", width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateImageFromCodeOptions]
  }
  
  extension [Self <: GenerateImageFromCodeOptions](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCorrectLevel(value: L | M | Q | H): Self = StObject.set(x, "correctLevel", value.asInstanceOf[js.Any])
    
    inline def setCorrectLevelUndefined: Self = StObject.set(x, "correctLevel", js.undefined)
    
    inline def setFormat(value: QRCODE): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Image => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
