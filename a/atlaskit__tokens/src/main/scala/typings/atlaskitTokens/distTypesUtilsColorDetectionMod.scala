package typings.atlaskitTokens

import typings.atlaskitTokens.anon.A
import typings.atlaskitTokens.anon.ColorInset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsColorDetectionMod {
  
  @JSImport("@atlaskit/tokens/dist/types/utils/color-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBoxShadow(rawShadow: js.Array[ColorInset]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxShadow")(rawShadow.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToRGBAValues(hex: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGBAValues")(hex.asInstanceOf[js.Any]).asInstanceOf[A]
}
