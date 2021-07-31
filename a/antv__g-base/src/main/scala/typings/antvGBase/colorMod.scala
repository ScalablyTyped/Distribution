package typings.antvGBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@antv/g-base/lib/util/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isColorProp(prop: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColorProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isGradientColor(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGradientColor")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
