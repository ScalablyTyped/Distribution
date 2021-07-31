package typings.antDesignIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twoTonePrimaryColorMod {
  
  @JSImport("@ant-design/icons/dist/components/twoTonePrimaryColor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTwoToneColor(): TwoToneColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColor")().asInstanceOf[TwoToneColor]
  
  @scala.inline
  def setTwoToneColor(twoToneColor: TwoToneColor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColor")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type TwoToneColor = String | (js.Tuple2[String, String])
}
