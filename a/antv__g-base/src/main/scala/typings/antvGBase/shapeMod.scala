package typings.antvGBase

import typings.antvGBase.anon.Height
import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.ShapeAttrs
import typings.antvGBase.typesMod.ShapeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeMod {
  
  @JSImport("@antv/g-base/lib/abstract/shape", JSImport.Default)
  @js.native
  abstract class default protected () extends AbstractShape {
    def this(cfg: ShapeCfg) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.antvGBase.interfacesMod.IObservable because Already inherited
  - typings.antvGBase.interfacesMod.IBase because Already inherited
  - typings.antvGBase.interfacesMod.IElement because Already inherited
  - typings.antvGBase.interfacesMod.IShape because var conflicts: cfg, destroyed. Inlined isHit, isClipShape */ @js.native
  trait AbstractShape
    extends typings.antvGBase.elementMod.default {
    
    def _isInBBox(refX: js.Any, refY: js.Any): Boolean = js.native
    
    /**
      * 属性更改后需要做的事情
      * @protected
      * @param {ShapeAttrs} targetAttrs 渲染的图像属性
      */
    def afterAttrsChange(targetAttrs: ShapeAttrs): Unit = js.native
    
    /**
      * 计算包围盒的抽象方法
      * @return {BBox} 包围盒
      */
    def calculateBBox(): BBox = js.native
    
    /**
      * 计算相对于画布的包围盒，默认等同于 bbox
      * @return {BBox} 包围盒
      */
    def calculateCanvasBBox(): Height = js.native
    
    /**
      * @protected
      * 清理缓存的 bbox
      */
    def clearCacheBBox(): Unit = js.native
    
    def isClipShape(): js.Any = js.native
    /**
      * 是否用于 clip, 默认为 false
      * @return {boolean} 图形是否用于 clip
      */
    @JSName("isClipShape")
    def isClipShape_Boolean(): Boolean = js.native
    
    /**
      * 图形拾取
      * @param {number} x x 坐标
      * @param {number} y y 坐标
      * @returns 是否已被拾取
      */
    def isHit(x: Double, y: Double): Boolean = js.native
    
    /**
      * @protected
      * 不同的图形自己实现是否在图形内部的逻辑，要判断边和填充区域
      * @param  {number}  refX 相对于图形的坐标 x
      * @param  {number}  refY 相对于图形的坐标 Y
      * @return {boolean} 点是否在图形内部
      */
    def isInShape(refX: Double, refY: Double): Boolean = js.native
    
    /**
      * 是否仅仅使用 BBox 检测就可以判定拾取到图形
      * 默认是 false，但是有些图形例如 image、marker 等都可直接使用 BBox 的检测而不需要使用图形拾取
      * @return {Boolean} 仅仅使用 BBox 进行拾取
      */
    def isOnlyHitBox(): Boolean = js.native
  }
}
