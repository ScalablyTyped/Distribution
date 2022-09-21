package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.footerFooterMod.FooterProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/footer", JSImport.Default)
  @js.native
  val default: FC[FooterProps] = js.native
  
  type _To = FC[FooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `footerMod.foo` */
  override def _to: FC[FooterProps] = default
}
