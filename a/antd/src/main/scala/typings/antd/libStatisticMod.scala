package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libStatisticStatisticMod.StatisticComponent
import typings.antd.libStatisticStatisticMod.StatisticProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatisticMod extends Shortcut {
  
  @JSImport("antd/lib/statistic", JSImport.Default)
  @js.native
  val default: FC[StatisticProps] & StatisticComponent = js.native
  
  type _To = FC[StatisticProps] & StatisticComponent
  
  /* This means you don't have to write `default`, but can instead just say `libStatisticMod.foo` */
  override def _to: FC[StatisticProps] & StatisticComponent = default
}
