package typings.antDesignIconsAngular

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.antDesignIconsAngular.anon.Theme
import typings.antDesignIconsAngular.antDesignIconsAngularBooleans.`false`
import typings.antDesignIconsAngular.antDesignIconsAngularStrings.`[antIcon]`
import typings.antDesignIconsAngular.componentIconDotserviceMod.IconService
import typings.antDesignIconsAngular.typesMod.IconDefinition
import typings.antDesignIconsAngular.typesMod.ThemeType
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentIconDotdirectiveMod {
  
  @JSImport("@ant-design/icons-angular/component/icon.directive", "IconDirective")
  @js.native
  open class IconDirective protected ()
    extends StObject
       with OnChanges {
    def this(_iconService: IconService, _elementRef: ElementRef[Any], _renderer: Renderer2) = this()
    
    /**
      * Render a new icon in the current element. Remove the icon when `type` is falsy.
      */
    /* protected */ def _changeIcon(): js.Promise[SVGElement | Null] = js.native
    
    /* protected */ def _clearSVGElement(): Unit = js.native
    
    /* protected */ var _elementRef: ElementRef[Any] = js.native
    
    /* protected */ def _getSelfRenderMeta(): RenderMeta = js.native
    
    /* protected */ var _iconService: IconService = js.native
    
    /**
      * Parse a icon to the standard form, an `IconDefinition` or a string like 'account-book-fill` (with a theme suffixed).
      * If namespace is specified, ignore theme because it meaningless for users' icons.
      *
      * @param type
      * @param theme
      */
    /* protected */ def _parseIconType(`type`: String): IconDefinition | String = js.native
    /* protected */ def _parseIconType(`type`: String, theme: ThemeType): IconDefinition | String = js.native
    /* protected */ def _parseIconType(`type`: IconDefinition): IconDefinition | String = js.native
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
    
    var theme: js.UndefOr[ThemeType] = js.native
    
    var twoToneColor: js.UndefOr[String] = js.native
    
    var `type`: String | IconDefinition = js.native
  }
  /* static members */
  object IconDirective {
    
    @JSImport("@ant-design/icons-angular/component/icon.directive", "IconDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-angular/component/icon.directive", "IconDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        IconDirective, 
        `[antIcon]`, 
        scala.Nothing, 
        Theme, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          IconDirective, 
          `[antIcon]`, 
          scala.Nothing, 
          Theme, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-angular/component/icon.directive", "IconDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IconDirective, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IconDirective, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
  
  trait RenderMeta extends StObject {
    
    var theme: js.UndefOr[ThemeType] = js.undefined
    
    var twoToneColor: js.UndefOr[String] = js.undefined
    
    var `type`: String | IconDefinition
  }
  object RenderMeta {
    
    inline def apply(`type`: String | IconDefinition): RenderMeta = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderMeta] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTwoToneColor(value: String): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      inline def setTwoToneColorUndefined: Self = StObject.set(x, "twoToneColor", js.undefined)
      
      inline def setType(value: String | IconDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
