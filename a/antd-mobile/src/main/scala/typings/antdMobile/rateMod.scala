package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.rateRateMod.RateProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rateMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/rate", JSImport.Default)
  @js.native
  val default: FC[RateProps] = js.native
  
  type _To = FC[RateProps]
  
  /* This means you don't have to write `default`, but can instead just say `rateMod.foo` */
  override def _to: FC[RateProps] = default
}
