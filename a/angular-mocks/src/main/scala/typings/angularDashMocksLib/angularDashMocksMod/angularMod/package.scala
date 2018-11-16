package typings
package angularDashMocksLib.angularDashMocksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularMod {
  ///////////////////////////////////////////////////////////////////////////
  // ComponentControllerService
  // see https://docs.angularjs.org/api/ngMock/service/$componentController
  ///////////////////////////////////////////////////////////////////////////
  type IComponentControllerService = js.Function4[
    /* componentName */ java.lang.String, 
    /* locals */ angularDashMocksLib.Anon_Key, 
    /* bindings */ js.UndefOr[js.Any], 
    /* ident */ js.UndefOr[java.lang.String], 
    js.Any
  ]
  ///////////////////////////////////////////////////////////////////////////
  // ControllerService mock
  // see https://docs.angularjs.org/api/ngMock/service/$controller
  // This interface extends http://docs.angularjs.org/api/ng.$controller
  ///////////////////////////////////////////////////////////////////////////
  type IControllerService = js.Function3[
    /* controllerConstructor */ (ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]) | (js.Function1[/* repeated */js.Any, js.Any]) | java.lang.String, 
    /* locals */ js.UndefOr[js.Any], 
    /* bindings */ js.UndefOr[js.Any], 
    js.Any
  ]
  ///////////////////////////////////////////////////////////////////////////
  // FlushPendingTasksService
  // see https://docs.angularjs.org/api/ngMock/service/$flushPendingTasks
  ///////////////////////////////////////////////////////////////////////////
  type IFlushPendingTasksService = js.Function1[/* delay */ js.UndefOr[scala.Double], scala.Unit]
  ///////////////////////////////////////////////////////////////////////////
  // VerifyNoPendingTasksService
  // see https://docs.angularjs.org/api/ngMock/service/$verifyNoPendingTasks
  ///////////////////////////////////////////////////////////////////////////
  type IVerifyNoPendingTasksService = js.Function1[/* taskType */ js.UndefOr[java.lang.String], scala.Unit]
}
