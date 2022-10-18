package typings.antvG2

import typings.antvG2.anon.StyleLinkActiveStyle
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementLinkByColorMod {
  
  /**
    * Link Elements by color
    *
    * public 方法是对外可用的反馈交互。使用方式，如：element-link-by-color:link, element-link-by-color:unlink, element-link-by-color:clear
    */
  @JSImport("@antv/g2/lib/interaction/action/element/link-by-color", JSImport.Default)
  @js.native
  open class default () extends LinkByColor
  
  type LinkActiveStyle = ShapeAttrs | (js.Function2[
    /* style */ ShapeAttrs, 
    /* Element */ typings.antvG2.libGeometryElementMod.default, 
    ShapeAttrs
  ])
  
  /**
    * Link Elements by color
    *
    * public 方法是对外可用的反馈交互。使用方式，如：element-link-by-color:link, element-link-by-color:unlink, element-link-by-color:clear
    */
  @js.native
  trait LinkByColor
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /* private */ var addLinkShape: Any = js.native
    
    /* private */ var cache: Any = js.native
    
    /**
      * 清除所有连接
      */
    def clear(): Unit = js.native
    
    /* private */ var getColorScale: Any = js.native
    
    /* private */ var getLinkPath: Any = js.native
    
    /**
      * 连接 elements
      *
      * @usage
      * registerInteraction('xxx', {
      *   start: [
      *    {
      *      trigger: 'interval:mouseenter',
      *      action: 'element-link-by-color:link',
      *      arg: {
      *        // style: { fill: 'red' }
      *        style: (style, element) => ({ fill: 'red' })
      *     },
      *   },
      *  ],
      * });
      */
    def link(): Unit = js.native
    def link(args: StyleLinkActiveStyle): Unit = js.native
    
    /* private */ var linkByElement: Any = js.native
    
    /* private */ var linkGroup: Any = js.native
    
    /* private */ var removeLink: Any = js.native
    
    /**
      * 取消连接 elements
      */
    def unlink(): Unit = js.native
  }
}
