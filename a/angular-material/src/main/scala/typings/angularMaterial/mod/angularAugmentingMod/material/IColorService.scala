package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorService extends js.Object {
  
  def applyThemeColors(element: JQuery, colorExpression: IColorExpression): Unit = js.native
  def applyThemeColors(element: Element, colorExpression: IColorExpression): Unit = js.native
  
  def getThemeColor(expression: String): String = js.native
  
  def hasTheme(): Boolean = js.native
}
