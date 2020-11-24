package typings.amapJsApiScale

import typings.amapJsApiScale.AMap.Scale.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AMap extends js.Object {
    
    /**
      * 比例尺插件
      */
    @js.native
    class Scale ()
      extends typings.amapJsApiScale.AMap.Scale {
      def this(options: Options) = this()
    }
  }
}
