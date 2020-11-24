package typings.antvComponent

import typings.antvGBase.interfacesMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/util/label", JSImport.Namespace)
@js.native
object labelMod extends js.Object {
  
  def ellipsisLabel(isVertical: Boolean, label: IElement, limitLength: Double): Boolean = js.native
  def ellipsisLabel(isVertical: Boolean, label: IElement, limitLength: Double, position: String): Boolean = js.native
  
  def getLabelLength(isVertical: Boolean, label: js.Any): js.Any = js.native
  
  def getMaxLabelWidth(labels: js.Array[IElement]): Double = js.native
  
  def testLabel(label: IElement, limitLength: Double): Boolean = js.native
}
