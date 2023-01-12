package typings.antDesignIconsSvg

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIconsSvg.anon.PrimaryColor
import typings.antDesignIconsSvg.libTypesMod.IconDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersMod {
  
  @JSImport("@ant-design/icons-svg/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderIconDefinitionToSVGElement(icond: IconDefinition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIconDefinitionToSVGElement")(icond.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderIconDefinitionToSVGElement(icond: IconDefinition, options: HelperRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderIconDefinitionToSVGElement")(icond.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait HelperRenderOptions extends StObject {
    
    var extraSVGAttrs: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var placeholders: js.UndefOr[PrimaryColor] = js.undefined
  }
  object HelperRenderOptions {
    
    inline def apply(): HelperRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelperRenderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelperRenderOptions] (val x: Self) extends AnyVal {
      
      inline def setExtraSVGAttrs(value: StringDictionary[String]): Self = StObject.set(x, "extraSVGAttrs", value.asInstanceOf[js.Any])
      
      inline def setExtraSVGAttrsUndefined: Self = StObject.set(x, "extraSVGAttrs", js.undefined)
      
      inline def setPlaceholders(value: PrimaryColor): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      inline def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
    }
  }
}
