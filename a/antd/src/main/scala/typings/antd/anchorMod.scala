package typings.antd

import typings.antd.anon.Affix
import typings.antd.anon.TypeofAnchorLink
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/anchor", JSImport.Namespace)
@js.native
object anchorMod extends js.Object {
  
  @js.native
  class default ()
    extends typings.antd.anchorAnchorMod.default
  /* static members */
  @js.native
  object default extends js.Object {
    
    var Link: TypeofAnchorLink = js.native
    
    var contextType: Context[ConfigConsumerProps] = js.native
    
    var defaultProps: Affix = js.native
  }
}
