package typings.antdMobile.anon

import typings.antdMobile.antdMobileStrings.primary
import typings.antdMobile.antdMobileStrings.white
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd-mobile.antd-mobile/es/components/page-indicator.PageIndicatorProps, 'style' | 'className' | 'color'> */
trait PickPageIndicatorPropsstyClassName extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[primary | white] = js.undefined
  
  var style: js.UndefOr[CSSPropertiesPartialRecorActivedotborderradius] = js.undefined
}
object PickPageIndicatorPropsstyClassName {
  
  inline def apply(): PickPageIndicatorPropsstyClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPageIndicatorPropsstyClassName]
  }
  
  extension [Self <: PickPageIndicatorPropsstyClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: primary | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(value: CSSPropertiesPartialRecorActivedotborderradius): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
