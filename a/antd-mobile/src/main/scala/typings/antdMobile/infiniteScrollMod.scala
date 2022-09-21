package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.infiniteScrollInfiniteScrollMod.InfiniteScrollProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteScrollMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/infinite-scroll", JSImport.Default)
  @js.native
  val default: FC[InfiniteScrollProps] = js.native
  
  type _To = FC[InfiniteScrollProps]
  
  /* This means you don't have to write `default`, but can instead just say `infiniteScrollMod.foo` */
  override def _to: FC[InfiniteScrollProps] = default
}
