package typings
package adoneLib.adoneNs.shaniNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type DescribeCallback = js.ThisFunction0[/* this */ DescribeRuntimeContext, scala.Unit]
  type HookCallback = js.ThisFunction1[
    /* this */ HookRuntimeContext, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type TestCallback = js.ThisFunction1[
    /* this */ TestRuntimeContext, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
}
