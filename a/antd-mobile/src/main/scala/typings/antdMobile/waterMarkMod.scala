package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.waterMarkWaterMarkMod.WaterMarkProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterMarkMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/water-mark", JSImport.Default)
  @js.native
  val default: FC[WaterMarkProps] = js.native
  
  type _To = FC[WaterMarkProps]
  
  /* This means you don't have to write `default`, but can instead just say `waterMarkMod.foo` */
  override def _to: FC[WaterMarkProps] = default
}
