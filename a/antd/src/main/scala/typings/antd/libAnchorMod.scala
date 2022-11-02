package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libAnchorAnchorLinkMod.AnchorLinkProps
import typings.antd.libAnchorAnchorMod.AnchorProps
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnchorMod extends Shortcut {
  
  @JSImport("antd/lib/anchor", JSImport.Default)
  @js.native
  val default: AnchorInterface = js.native
  
  @js.native
  trait AnchorInterface
    extends StObject
       with FunctionComponent[AnchorProps] {
    
    var Link: FC[AnchorLinkProps] = js.native
  }
  
  type InternalAnchorType = FC[AnchorProps]
  
  type _To = AnchorInterface
  
  /* This means you don't have to write `default`, but can instead just say `libAnchorMod.foo` */
  override def _to: AnchorInterface = default
}
