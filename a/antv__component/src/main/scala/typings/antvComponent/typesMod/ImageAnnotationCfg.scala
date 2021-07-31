package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.Point
import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAnnotationCfg
  extends StObject
     with GroupComponentCfg {
  
  /**
    * 结束点
    * @type {Point}
    */
  var end: js.UndefOr[Point] = js.undefined
  
  /**
    * 图片地址
    * @type {string}
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * 起始点
    * @type {Point}
    */
  var start: js.UndefOr[Point] = js.undefined
  
  /**
    * 区域的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object ImageAnnotationCfg {
  
  @scala.inline
  def apply(container: IGroup): ImageAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnnotationCfg]
  }
  
  @scala.inline
  implicit class ImageAnnotationCfgMutableBuilder[Self <: ImageAnnotationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
