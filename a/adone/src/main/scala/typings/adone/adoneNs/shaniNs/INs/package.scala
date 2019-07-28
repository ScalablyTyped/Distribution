package typings.adone.adoneNs.shaniNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type DescribeCallback = js.ThisFunction0[/* this */ DescribeRuntimeContext, Unit]
  type HookCallback = js.ThisFunction1[
    /* this */ HookRuntimeContext, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  type TestCallback = js.ThisFunction1[
    /* this */ TestRuntimeContext, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
}
