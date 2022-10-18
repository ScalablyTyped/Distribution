package typings.antvG2

import typings.antvG2.anon.R
import typings.antvG2.libGeometryLabelInterfaceMod.LabelItem
import typings.antvG2.libInterfaceMod.MappingDatum
import typings.antvG2.libInterfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryLabelPolarMod {
  
  @JSImport("@antv/g2/lib/geometry/label/polar", JSImport.Default)
  @js.native
  open class default () extends PolarLabel
  
  @js.native
  trait PolarLabel
    extends typings.antvG2.libGeometryLabelBaseMod.default {
    
    /**
      * 获取圆弧的位置
      */
    /* protected */ def getArcPoint(mappingData: MappingDatum): Point = js.native
    /* protected */ def getArcPoint(mappingData: MappingDatum, index: Double): Point = js.native
    
    /**
      * 获取坐标点与圆心形成的圆的位置信息
      * @param angle
      * @param offset
      * @param point
      * @param isLabelEmit
      */
    /* protected */ def getCirclePoint(angle: Double, offset: Double, point: Point, isLabelEmit: Boolean): R = js.native
    
    /**
      * @override
      * 获取文本的对齐方式
      * @param point
      */
    /* protected */ def getLabelAlign(point: LabelItem): Any = js.native
    
    /**
      * 获取 label 的旋转角度
      * @param angle
      * @param offset
      * @param isLabelEmit
      */
    /* protected */ def getLabelRotate(angle: Double, offset: Double, isLabelEmit: Boolean): Double = js.native
    
    /* private */ var getMiddlePoint: Any = js.native
    
    /**
      * 计算坐标线点在极坐标系下角度
      * @param point
      */
    /* protected */ def getPointAngle(point: Point): Double = js.native
    
    /* private */ var isToMiddle: Any = js.native
  }
}
