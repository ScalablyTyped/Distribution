package typings.antDesignIconsAngular

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.SimpleChanges
import typings.antDesignIconsAngular.iconServiceMod.IconService
import typings.antDesignIconsAngular.typesMod.IconDefinition
import typings.antDesignIconsAngular.typesMod.ThemeType
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconDirectiveMod {
  
  @JSImport("@ant-design/icons-angular/component/icon.directive", "IconDirective")
  @js.native
  class IconDirective protected ()
    extends StObject
       with OnChanges {
    def this(_iconService: IconService, _elementRef: ElementRef[js.Any], _renderer: Renderer2) = this()
    
    /**
      * Render a new icon in the current element. Remove the icon when `type` is falsy.
      */
    /* protected */ def _changeIcon(): js.Promise[SVGElement | Null] = js.native
    
    /* protected */ def _clearSVGElement(): Unit = js.native
    
    /* protected */ var _elementRef: ElementRef[js.Any] = js.native
    
    /* protected */ def _getSelfRenderMeta(): RenderMeta = js.native
    
    /* protected */ var _iconService: IconService = js.native
    
    /**
      * Parse a icon to the standard form, an `IconDefinition` or a string like 'account-book-fill` (with a theme suffixed).
      * If namespace is specified, ignore theme because it meaningless for users' icons.
      *
      * @param type
      * @param theme
      */
    /* protected */ def _parseIconType(`type`: String, theme: ThemeType): IconDefinition | String = js.native
    /* protected */ def _parseIconType(`type`: IconDefinition, theme: ThemeType): IconDefinition | String = js.native
    
    /* protected */ var _renderer: Renderer2 = js.native
    
    /* protected */ def _setSVGElement(svg: SVGElement): Unit = js.native
    
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked data-bound properties
      * if at least one has changed, and before the view and content
      * children are checked.
      * @param changes The changed properties.
      */
    /* CompleteClass */
    override def ngOnChanges(changes: SimpleChanges): Unit = js.native
    
    var theme: ThemeType = js.native
    
    var twoToneColor: String = js.native
    
    var `type`: String | IconDefinition = js.native
  }
  
  trait RenderMeta extends StObject {
    
    var theme: ThemeType
    
    var twoToneColor: String
    
    var `type`: String | IconDefinition
  }
  object RenderMeta {
    
    inline def apply(theme: ThemeType, twoToneColor: String, `type`: String | IconDefinition): RenderMeta = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], twoToneColor = twoToneColor.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderMeta]
    }
    
    extension [Self <: RenderMeta](x: Self) {
      
      inline def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTwoToneColor(value: String): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      inline def setType(value: String | IconDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
