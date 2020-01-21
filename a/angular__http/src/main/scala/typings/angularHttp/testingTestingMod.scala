package typings.angularHttp

import typings.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typings.angularHttp.indexMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typings.angularHttp.indexMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

