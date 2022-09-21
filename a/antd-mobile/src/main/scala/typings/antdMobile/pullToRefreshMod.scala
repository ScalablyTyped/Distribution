package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.pullToRefreshPullToRefreshMod.PullToRefreshProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullToRefreshMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/pull-to-refresh", JSImport.Default)
  @js.native
  val default: FC[PullToRefreshProps] = js.native
  
  type _To = FC[PullToRefreshProps]
  
  /* This means you don't have to write `default`, but can instead just say `pullToRefreshMod.foo` */
  override def _to: FC[PullToRefreshProps] = default
}
