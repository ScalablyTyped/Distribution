package typings.antDesignIconsSvg

import org.scalablytyped.runtime.StringDictionary
import typings.antDesignIconsSvg.anon.PrimaryColor
import typings.antDesignIconsSvg.typesMod.IconDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@ant-design/icons-svg/lib/helpers", "renderIconDefinitionToSVGElement")
  @js.native
  def renderIconDefinitionToSVGElement(icond: IconDefinition): String = js.native
  @JSImport("@ant-design/icons-svg/lib/helpers", "renderIconDefinitionToSVGElement")
  @js.native
  def renderIconDefinitionToSVGElement(icond: IconDefinition, options: HelperRenderOptions): String = js.native
  
  @js.native
  trait HelperRenderOptions extends StObject {
    
    var extraSVGAttrs: js.UndefOr[StringDictionary[String]] = js.native
    
    var placeholders: js.UndefOr[PrimaryColor] = js.native
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
