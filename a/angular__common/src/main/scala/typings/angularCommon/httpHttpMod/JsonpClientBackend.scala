package typings.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "JsonpClientBackend")
@js.native
class JsonpClientBackend protected () extends HttpBackend {
  def this(callbackMap: ɵangularPackagesCommonHttpHttpB, document: js.Any) = this()
  
  /* private */ var callbackMap: js.Any = js.native
  
  /* private */ var document: js.Any = js.native
  
  /**
    * Get the name of the next callback method, by incrementing the global `nextRequestId`.
    */
  /* private */ var nextCallback: js.Any = js.native
  
  /**
    * A resolved promise that can be used to schedule microtasks in the event handlers.
    */
  /* private */ val resolvedPromise: js.Any = js.native
}
