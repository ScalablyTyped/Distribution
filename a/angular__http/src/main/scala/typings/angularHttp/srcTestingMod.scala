package typings.angularHttp

import typings.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/src/testing", JSImport.Namespace)
@js.native
object srcTestingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typings.angularHttp.mockBackendMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typings.angularHttp.mockBackendMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

