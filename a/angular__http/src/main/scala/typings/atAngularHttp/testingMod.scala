package typings.atAngularHttp

import typings.atAngularHttp.atAngularHttpMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typings.atAngularHttp.testingTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typings.atAngularHttp.testingTestingMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

