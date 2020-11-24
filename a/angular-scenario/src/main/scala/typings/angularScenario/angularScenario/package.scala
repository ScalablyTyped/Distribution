package typings.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object angularScenario {
  
  type BindingFunction = js.Function1[
    /* bracketBindingExpression */ java.lang.String, 
    typings.angularScenario.angularScenario.Future
  ]
  
  type CustomMatchers = typings.angularScenario.angularScenario.Matchers
  
  type PauseFunction = js.Function0[js.Any]
  
  type RunFunction = js.Function1[/* functionToRun */ js.Any, js.Any]
  
  type RunFunctionWithDescription = js.Function2[/* description */ java.lang.String, /* functionToRun */ js.Any, js.Any]
  
  type SleepFunction = js.Function1[/* seconds */ scala.Double, js.Any]
  
  type UsingFunction = js.Function2[
    /* selector */ java.lang.String, 
    /* selectorDescription */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
