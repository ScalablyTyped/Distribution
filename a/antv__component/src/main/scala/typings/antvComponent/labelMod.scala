package typings.antvComponent

import typings.antvGBase.interfacesMod.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("@antv/component/lib/util/label", "ellipsisLabel")
  @js.native
  def ellipsisLabel(isVertical: Boolean, label: IElement, limitLength: Double): Boolean = js.native
  @JSImport("@antv/component/lib/util/label", "ellipsisLabel")
  @js.native
  def ellipsisLabel(isVertical: Boolean, label: IElement, limitLength: Double, position: String): Boolean = js.native
  
  @JSImport("@antv/component/lib/util/label", "getLabelLength")
  @js.native
  def getLabelLength(isVertical: Boolean, label: js.Any): js.Any = js.native
  
  @JSImport("@antv/component/lib/util/label", "getMaxLabelWidth")
  @js.native
  def getMaxLabelWidth(labels: js.Array[IElement]): Double = js.native
  
  @JSImport("@antv/component/lib/util/label", "testLabel")
  @js.native
  def testLabel(label: IElement, limitLength: Double): Boolean = js.native
}
