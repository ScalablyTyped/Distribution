package typings.angularHttp

import typings.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/http/testing/testing", "MockBackend")
  @js.native
  open class MockBackend ()
    extends typings.angularHttp.indexMod.MockBackend
  
  @JSImport("@angular/http/testing/testing", "MockConnection")
  @js.native
  open class MockConnection protected ()
    extends typings.angularHttp.indexMod.MockConnection {
    def this(req: Request) = this()
  }
}
