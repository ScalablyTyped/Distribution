package typings.anchorJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.anchorJs.mod.anchorjs.AnchorJS
import typings.anchorJs.mod.anchorjs.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("anchor-js", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AnchorJS {
    def this(options: Options) = this()
  }
  @JSImport("anchor-js", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AnchorJS = js.native
  
  object global {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("anchors")
    @js.native
    open class anchors ()
      extends StObject
         with AnchorJS {
      def this(options: Options) = this()
    }
    @JSGlobal("anchors")
    @js.native
    val anchors: AnchorJS = js.native
  }
  
  type _To = js.Object & AnchorJS
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & AnchorJS = ^
  
  object anchorjs {
    
    /** @deprecated alias for AnchorJS */
    type Anchor = AnchorJS
    
    @js.native
    trait AnchorJS
      extends StObject
         with Instantiable0[AnchorJS]
         with Instantiable1[/* options */ Options, AnchorJS] {
      
      def add(): this.type = js.native
      def add(selector: String): this.type = js.native
      
      var options: Options = js.native
      
      def remove(): this.type = js.native
      def remove(selector: String): this.type = js.native
      
      def removeAll(): Unit = js.native
    }
    
    /** @deprecated alias for {Options} */
    type AnchorOptions = Options
    
    /** @deprecated alias for {Placement} */
    type AnchorPlacement = Placement
    
    /** @deprecated alias for {Visibility} */
    type AnchorVisibility = Visibility
    
    trait Options extends StObject {
      
      var ariaLabel: js.UndefOr[String] = js.undefined
      
      var base: js.UndefOr[String] = js.undefined
      
      var `class`: js.UndefOr[String] = js.undefined
      
      var icon: js.UndefOr[String] = js.undefined
      
      var placement: js.UndefOr[AnchorPlacement] = js.undefined
      
      var titleText: js.UndefOr[String] = js.undefined
      
      var truncate: js.UndefOr[Double] = js.undefined
      
      var visible: js.UndefOr[Visibility] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
        
        inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
        
        inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
        
        inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
        
        inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
        
        inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setPlacement(value: AnchorPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
        
        inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
        
        inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
        
        inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
        
        inline def setVisible(value: Visibility): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.anchorJs.anchorJsStrings.left
      - typings.anchorJs.anchorJsStrings.right
    */
    trait Placement extends StObject
    object Placement {
      
      inline def left: typings.anchorJs.anchorJsStrings.left = "left".asInstanceOf[typings.anchorJs.anchorJsStrings.left]
      
      inline def right: typings.anchorJs.anchorJsStrings.right = "right".asInstanceOf[typings.anchorJs.anchorJsStrings.right]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.anchorJs.anchorJsStrings.always
      - typings.anchorJs.anchorJsStrings.hover
    */
    trait Visibility extends StObject
    object Visibility {
      
      inline def always: typings.anchorJs.anchorJsStrings.always = "always".asInstanceOf[typings.anchorJs.anchorJsStrings.always]
      
      inline def hover: typings.anchorJs.anchorJsStrings.hover = "hover".asInstanceOf[typings.anchorJs.anchorJsStrings.hover]
    }
  }
}
