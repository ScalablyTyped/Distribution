package typings.angularCompiler

import typings.angularCompiler.mod.ResourceLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceLoaderMockMod {
  
  @JSImport("@angular/compiler/testing/src/resource_loader_mock", "MockResourceLoader")
  @js.native
  class MockResourceLoader () extends ResourceLoader {
    
    var _definitions: js.Any = js.native
    
    var _expectations: js.Any = js.native
    
    var _processRequest: js.Any = js.native
    
    var _requests: js.Any = js.native
    
    /**
      * Add an expectation for the given URL. Incoming requests will be checked against
      * the next expectation (in FIFO order). The `verifyNoOutstandingExpectations` method
      * can be used to check if any expectations have not yet been met.
      *
      * The response given will be returned if the expectation matches.
      */
    def expect(url: String, response: String): Unit = js.native
    
    /**
      * Process pending requests and verify there are no outstanding expectations. Also fails
      * if no requests are pending.
      */
    def flush(): Unit = js.native
    
    def hasPendingRequests(): Boolean = js.native
    
    /**
      * Throw an exception if any expectations have not been satisfied.
      */
    def verifyNoOutstandingExpectations(): Unit = js.native
    
    /**
      * Add a definition for the given URL to return the given response. Unlike expectations,
      * definitions have no order and will satisfy any matching request at any time. Also
      * unlike expectations, unused definitions do not cause `verifyNoOutstandingExpectations`
      * to return an error.
      */
    def when(url: String, response: String): Unit = js.native
  }
}
