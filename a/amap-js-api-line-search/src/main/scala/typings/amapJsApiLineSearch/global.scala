package typings.amapJsApiLineSearch

import typings.amapJsApiLineSearch.AMap.LineSearch.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AMap extends js.Object {
    
    @js.native
    /**
      * 公交路线查询
      * @param options 选项
      */
    class LineSearch ()
      extends typings.amapJsApiLineSearch.AMap.LineSearch {
      def this(options: Options) = this()
    }
  }
}
