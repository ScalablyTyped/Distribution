package typings.antvGLite

import typings.antvGLite.cssomMod.CSSKeywordValue
import typings.antvGLite.displayObjectsMod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertytextMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSKeywordValue | string, string> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.@antv/g-lite/dist/css/cssom.CSSKeywordValue | string, string>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyText", "CSSPropertyText")
  @js.native
  open class CSSPropertyText () extends StObject {
    
    def calculator(name: String, oldParsed: String, parsed: String, `object`: DisplayObject[Any, Any]): String = js.native
    def calculator(name: String, oldParsed: String, parsed: CSSKeywordValue, `object`: DisplayObject[Any, Any]): String = js.native
    def calculator(name: String, oldParsed: CSSKeywordValue, parsed: String, `object`: DisplayObject[Any, Any]): String = js.native
    def calculator(
      name: String,
      oldParsed: CSSKeywordValue,
      parsed: CSSKeywordValue,
      `object`: DisplayObject[Any, Any]
    ): String = js.native
    
    def postProcessor(`object`: DisplayObject[Any, Any]): Unit = js.native
  }
}
