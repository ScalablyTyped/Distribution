package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.Config
import typings.antd.confirmMod.ModalStaticFunctions
import typings.antd.modalModalMod.ModalProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod extends Shortcut {
  
  @JSImport("antd/lib/modal", JSImport.Default)
  @js.native
  val default: ModalType = js.native
  
  type ModalType = FC[ModalProps] & ModalStaticFunctions & Config
  
  type _To = ModalType
  
  /* This means you don't have to write `default`, but can instead just say `modalMod.foo` */
  override def _to: ModalType = default
}
