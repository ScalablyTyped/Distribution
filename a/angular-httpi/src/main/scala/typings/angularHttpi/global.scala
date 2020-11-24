package typings.angularHttpi

import typings.angular.mod.IHttpService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Httpi extends js.Object {
    
    @js.native
    class HttpiResource protected ()
      extends typings.angularHttpi.Httpi.HttpiResource {
      def this(http: IHttpService, url: String) = this()
    }
  }
}
