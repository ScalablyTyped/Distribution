package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcViewTypesMod {
  type DefinitionFactory[D /* <: Definition[_] */] = js.Function1[/* logger */ NodeLogger, D]
  type DisposableFn = js.Function0[scala.Unit]
  type ElementHandleEventFn = js.Function3[
    /* view */ ViewData, 
    /* eventName */ java.lang.String, 
    /* event */ js.Any, 
    scala.Boolean
  ]
  type NodeLogger = js.Function0[js.Function0[scala.Unit]]
  type ViewHandleEventFn = js.Function4[
    /* view */ ViewData, 
    /* nodeIndex */ scala.Double, 
    /* eventName */ java.lang.String, 
    /* event */ js.Any, 
    scala.Boolean
  ]
  type ViewUpdateFn = js.Function2[/* check */ NodeCheckFn, /* view */ ViewData, scala.Unit]
}
