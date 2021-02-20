package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miniSelectMod extends Shortcut {
  
  @JSImport("antd/lib/pagination/MiniSelect", JSImport.Default)
  @js.native
  val default: MiniSelectInterface = js.native
  
  @js.native
  trait MiniSelectInterface
    extends FunctionComponent[js.Any] {
    
    var Option: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Option */ js.Any = js.native
  }
  
  type _To = MiniSelectInterface
  
  /* This means you don't have to write `default`, but can instead just say `miniSelectMod.foo` */
  override def _to: MiniSelectInterface = default
}
