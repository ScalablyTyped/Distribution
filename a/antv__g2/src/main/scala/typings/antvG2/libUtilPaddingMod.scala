package typings.antvG2

import typings.antvG2.libInterfaceMod.Padding
import typings.antvG2.libInterfaceMod.ViewPadding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilPaddingMod {
  
  @JSImport("@antv/g2/lib/util/padding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAutoPadding(padding: ViewPadding): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoPadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parsePadding(): Padding = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePadding")().asInstanceOf[Padding]
  inline def parsePadding(padding: js.Array[Double]): Padding = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Padding]
  inline def parsePadding(padding: Double): Padding = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePadding")(padding.asInstanceOf[js.Any]).asInstanceOf[Padding]
}
