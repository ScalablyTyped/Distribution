package typings.atAngularHttp

import typings.atAngularHttp.atAngularHttpMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/public_api", JSImport.Namespace)
@js.native
object testingPublicUnderscoreApiMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typings.atAngularHttp.testingSrcTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typings.atAngularHttp.testingSrcTestingMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

