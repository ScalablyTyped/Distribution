package typings.angularHttp

import typings.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typings.angularHttp.testingPublicApiMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typings.angularHttp.testingPublicApiMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

