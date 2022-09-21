package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeMarginHeadingVerticalEnd extends StObject {
  
  var sizeMarginHeadingVerticalEnd: String
  
  var sizeMarginHeadingVerticalStart: String
}
object SizeMarginHeadingVerticalEnd {
  
  inline def apply(sizeMarginHeadingVerticalEnd: String, sizeMarginHeadingVerticalStart: String): SizeMarginHeadingVerticalEnd = {
    val __obj = js.Dynamic.literal(sizeMarginHeadingVerticalEnd = sizeMarginHeadingVerticalEnd.asInstanceOf[js.Any], sizeMarginHeadingVerticalStart = sizeMarginHeadingVerticalStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeMarginHeadingVerticalEnd]
  }
  
  extension [Self <: SizeMarginHeadingVerticalEnd](x: Self) {
    
    inline def setSizeMarginHeadingVerticalEnd(value: String): Self = StObject.set(x, "sizeMarginHeadingVerticalEnd", value.asInstanceOf[js.Any])
    
    inline def setSizeMarginHeadingVerticalStart(value: String): Self = StObject.set(x, "sizeMarginHeadingVerticalStart", value.asInstanceOf[js.Any])
  }
}
