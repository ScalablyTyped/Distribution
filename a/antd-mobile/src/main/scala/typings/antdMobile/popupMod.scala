package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.popupPopupMod.PopupProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/popup", JSImport.Default)
  @js.native
  val default: FC[PopupProps] = js.native
  
  type _To = FC[PopupProps]
  
  /* This means you don't have to write `default`, but can instead just say `popupMod.foo` */
  override def _to: FC[PopupProps] = default
}
