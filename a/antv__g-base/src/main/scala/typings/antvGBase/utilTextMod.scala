package typings.antvGBase

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilTextMod {
  
  @JSImport("@antv/g-base/lib/util/text", "assembleFont")
  @js.native
  def assembleFont(attrs: ShapeAttrs): String = js.native
  
  @JSImport("@antv/g-base/lib/util/text", "getLineSpaceing")
  @js.native
  def getLineSpaceing(fontSize: Double): Double = js.native
  @JSImport("@antv/g-base/lib/util/text", "getLineSpaceing")
  @js.native
  def getLineSpaceing(fontSize: Double, lineHeight: Double): Double = js.native
  
  @JSImport("@antv/g-base/lib/util/text", "getTextHeight")
  @js.native
  def getTextHeight(text: String, fontSize: Double): Double = js.native
  @JSImport("@antv/g-base/lib/util/text", "getTextHeight")
  @js.native
  def getTextHeight(text: String, fontSize: Double, lineHeight: Double): Double = js.native
  
  @JSImport("@antv/g-base/lib/util/text", "getTextWidth")
  @js.native
  def getTextWidth(text: String, font: String): Double = js.native
}
