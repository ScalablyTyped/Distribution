package typings.angularHttp

import typings.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@angular/http/testing/index", "MockBackend")
  @js.native
  open class MockBackend ()
    extends typings.angularHttp.testingPublicApiMod.MockBackend
  
  @JSImport("@angular/http/testing/index", "MockConnection")
  @js.native
  open class MockConnection protected ()
    extends typings.angularHttp.testingPublicApiMod.MockConnection {
    def this(req: Request) = this()
  }
}
