package typings.angularHttp

import typings.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  
  @js.native
  class MockBackend ()
    extends typings.angularHttp.testingTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typings.angularHttp.testingTestingMod.MockConnection {
    def this(req: Request) = this()
  }
}
