package typings.antvG2

import typings.antvG2.anon.Dictkey
import typings.antvG2.anon.Height
import typings.antvGBase.interfacesMod.IElement
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelUtilMod {
  
  @JSImport("@antv/g2/lib/geometry/label/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkShapeOverlap(cur: IElement, dones: js.Array[IElement]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkShapeOverlap")(cur.asInstanceOf[js.Any], dones.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findLabelTextShape(label: IGroup): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("findLabelTextShape")(label.asInstanceOf[js.Any]).asInstanceOf[IElement]
  
  inline def getLabelBackgroundInfo(labelGroup: IGroup, labelItem: Dictkey): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getLabelBackgroundInfo")(labelGroup.asInstanceOf[js.Any], labelItem.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getLabelBackgroundInfo(labelGroup: IGroup, labelItem: Dictkey, padding: js.Array[Double]): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getLabelBackgroundInfo")(labelGroup.asInstanceOf[js.Any], labelItem.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def getLabelBackgroundInfo(labelGroup: IGroup, labelItem: Dictkey, padding: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("getLabelBackgroundInfo")(labelGroup.asInstanceOf[js.Any], labelItem.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def getOverlapArea(a: BBox, b: BBox): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlapArea")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getOverlapArea(a: BBox, b: BBox, margin: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverlapArea")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], margin.asInstanceOf[js.Any])).asInstanceOf[Double]
}
