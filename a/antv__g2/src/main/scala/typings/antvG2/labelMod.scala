package typings.antvG2

import typings.antvG2.labelBaseMod.GeometryLabelConstructor
import typings.antvG2.labelInterfaceMod.LabelItem
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("@antv/g2/lib/geometry/label", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGeometryLabel(`type`: String): GeometryLabelConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryLabel")(`type`.asInstanceOf[js.Any]).asInstanceOf[GeometryLabelConstructor]
  
  inline def getGeometryLabelLayout(`type`: String): GeometryLabelsLayoutFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryLabelLayout")(`type`.asInstanceOf[js.Any]).asInstanceOf[GeometryLabelsLayoutFn]
  
  inline def registerGeometryLabel(`type`: String, ctor: GeometryLabelConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometryLabel")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerGeometryLabelLayout(`type`: String, layoutFn: GeometryLabelsLayoutFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometryLabelLayout")(`type`.asInstanceOf[js.Any], layoutFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * label 布局函数定义
    * @param items 存储每个 label 的详细信息
    * @param labels 所有的 labels 图形实例
    * @param shapes 所有 label 对应的图形元素实例
    * @param region 画布区域
    * @param cfg 用于存储各个布局函数开放给用户的配置数据
    */
  type GeometryLabelsLayoutFn = js.Function5[
    /* items */ js.Array[LabelItem], 
    /* labels */ js.Array[IGroup], 
    /* shapes */ js.Array[IGroup | IShape], 
    /* region */ BBox, 
    /* cfg */ js.UndefOr[LooseObject], 
    Unit
  ]
}
