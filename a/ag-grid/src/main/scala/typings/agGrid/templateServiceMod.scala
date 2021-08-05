package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateServiceMod {
  
  @JSImport("ag-grid/dist/lib/templateService", "TemplateService")
  @js.native
  class TemplateService () extends StObject {
    
    /* private */ @JSName("$scope")
    var $scope: js.Any = js.native
    
    def getTemplate(url: js.Any, callback: js.Any): js.Any = js.native
    
    def handleHttpResult(httpResult: js.Any, url: js.Any): Unit = js.native
    
    /* private */ var templateCache: js.Any = js.native
    
    /* private */ var waitingCallbacks: js.Any = js.native
  }
}
