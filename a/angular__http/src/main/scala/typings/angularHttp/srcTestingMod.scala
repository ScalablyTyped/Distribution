package typings.angularHttp

import typings.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTestingMod {
  
  @JSImport("@angular/http/testing/src/testing", "MockBackend")
  @js.native
  class MockBackend ()
    extends typings.angularHttp.mockBackendMod.MockBackend
  
  @JSImport("@angular/http/testing/src/testing", "MockConnection")
  @js.native
  class MockConnection protected ()
    extends typings.angularHttp.mockBackendMod.MockConnection {
    def this(req: Request) = this()
  }
}
