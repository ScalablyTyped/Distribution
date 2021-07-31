package typings.angularHttp

import typings.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingPublicApiMod {
  
  @JSImport("@angular/http/testing/public_api", "MockBackend")
  @js.native
  class MockBackend ()
    extends typings.angularHttp.srcTestingMod.MockBackend
  
  @JSImport("@angular/http/testing/public_api", "MockConnection")
  @js.native
  class MockConnection protected ()
    extends typings.angularHttp.srcTestingMod.MockConnection {
    def this(req: Request) = this()
  }
}
