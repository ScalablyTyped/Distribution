package typings.antvGBase

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/util/text", JSImport.Namespace)
@js.native
object utilTextMod extends js.Object {
  
  def assembleFont(attrs: ShapeAttrs): String = js.native
  
  def getLineSpaceing(fontSize: Double): Double = js.native
  def getLineSpaceing(fontSize: Double, lineHeight: Double): Double = js.native
  
  def getTextHeight(text: String, fontSize: Double): Double = js.native
  def getTextHeight(text: String, fontSize: Double, lineHeight: Double): Double = js.native
  
  def getTextWidth(text: String, font: String): Double = js.native
}
