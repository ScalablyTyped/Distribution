package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.scrollMaskScrollMaskMod.ScrollMaskProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollMaskMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/scroll-mask", JSImport.Default)
  @js.native
  val default: FC[ScrollMaskProps] = js.native
  
  type _To = FC[ScrollMaskProps]
  
  /* This means you don't have to write `default`, but can instead just say `scrollMaskMod.foo` */
  override def _to: FC[ScrollMaskProps] = default
}
