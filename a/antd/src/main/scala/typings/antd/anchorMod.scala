package typings.antd

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.antd.anchorAnchorMod.Anchor
import typings.antd.anchorAnchorMod.AnchorProps
import typings.antd.anchorLinkMod.default
import typings.antd.anon.TypeofAnchorLink
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorMod {
  
  object default extends Shortcut {
    
    @JSImport("antd/lib/anchor", JSImport.Default)
    @js.native
    val ^ : AnchorInterface = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/lib/anchor", "default.Link")
    @js.native
    open class Link ()
      extends typings.antd.anchorLinkMod.default
    
    type _To = AnchorInterface
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: AnchorInterface = ^
  }
  
  @js.native
  trait AnchorInterface
    extends StObject
       with ForwardRefExoticComponent[AnchorProps & RefAttributes[Anchor]] {
    
    var Link: Instantiable0[default] & TypeofAnchorLink = js.native
  }
  
  type InternalAnchorType = ForwardRefExoticComponent[AnchorProps & RefAttributes[Anchor]]
}
