package typings.antvComponent

import typings.antvGBase.interfacesMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("@antv/component/lib/util/label", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ellipsisLabel(isVertical: Boolean, label: IElement, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisLabel")(isVertical.asInstanceOf[js.Any], label.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ellipsisLabel(isVertical: Boolean, label: IElement, limitLength: Double, position: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisLabel")(isVertical.asInstanceOf[js.Any], label.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getLabelLength(isVertical: Boolean, label: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLabelLength")(isVertical.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getMaxLabelWidth(labels: js.Array[IElement]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxLabelWidth")(labels.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def testLabel(label: IElement, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("testLabel")(label.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
