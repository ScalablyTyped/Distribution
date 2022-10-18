package typings.antDesignIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTwoTonePrimaryColorMod {
  
  @JSImport("@ant-design/icons/lib/components/twoTonePrimaryColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTwoToneColor(): TwoToneColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColor")().asInstanceOf[TwoToneColor]
  
  inline def setTwoToneColor(twoToneColor: TwoToneColor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColor")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type TwoToneColor = String | (js.Tuple2[String, String])
}
