package typings.antDesignIconsSvg

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIconsSvg.anon.PrimaryColor
import typings.antDesignIconsSvg.typesMod.IconDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@ant-design/icons-svg/lib/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def renderIconDefinitionToSVGElement(icond: IconDefinition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIconDefinitionToSVGElement")(icond.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def renderIconDefinitionToSVGElement(icond: IconDefinition, options: HelperRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderIconDefinitionToSVGElement")(icond.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait HelperRenderOptions extends StObject {
    
    var extraSVGAttrs: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var placeholders: js.UndefOr[PrimaryColor] = js.undefined
  }
  object HelperRenderOptions {
    
    @scala.inline
    def apply(): HelperRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelperRenderOptions]
    }
    
    @scala.inline
    implicit class HelperRenderOptionsMutableBuilder[Self <: HelperRenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraSVGAttrs(value: StringDictionary[String]): Self = StObject.set(x, "extraSVGAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraSVGAttrsUndefined: Self = StObject.set(x, "extraSVGAttrs", js.undefined)
      
      @scala.inline
      def setPlaceholders(value: PrimaryColor): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
    }
  }
}
