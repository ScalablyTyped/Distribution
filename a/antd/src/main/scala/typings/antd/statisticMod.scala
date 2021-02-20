package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.statisticStatisticMod.StatisticComponent
import typings.antd.statisticStatisticMod.StatisticProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticMod {
  
  object default extends Shortcut {
    
    @JSImport("antd/lib/statistic", JSImport.Default)
    @js.native
    val ^ : FC[StatisticProps] with StatisticComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/statistic", "default.Countdown")
    @js.native
    class Countdown ()
      extends typings.antd.countdownMod.default
    
    type _To = FC[StatisticProps] with StatisticComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: FC[StatisticProps] with StatisticComponent = ^
  }
}
