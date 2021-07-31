package typings.antvGBase

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilTextMod {
  
  @JSImport("@antv/g-base/lib/util/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assembleFont(attrs: ShapeAttrs): String = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleFont")(attrs.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getLineSpaceing(fontSize: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineSpaceing")(fontSize.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getLineSpaceing(fontSize: Double, lineHeight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineSpaceing")(fontSize.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTextHeight(text: String, fontSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextHeight")(text.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def getTextHeight(text: String, fontSize: Double, lineHeight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextHeight")(text.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getTextWidth(text: String, font: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextWidth")(text.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[Double]
}
