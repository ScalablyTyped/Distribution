package typings.amapJsApiIndoorMap

import typings.amapJsApiIndoorMap.AMap.IndoorMap.Options
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
      * 室内地图
      * @param options 选项
      */
    class IndoorMap ()
      extends typings.amapJsApiIndoorMap.AMap.IndoorMap {
      def this(options: Options) = this()
    }
  }
}
