package typings.atAngularHttp

import typings.atAngularHttp.atAngularHttpMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/index", JSImport.Namespace)
@js.native
object testingIndexMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typings.atAngularHttp.testingPublicUnderscoreApiMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typings.atAngularHttp.testingPublicUnderscoreApiMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

