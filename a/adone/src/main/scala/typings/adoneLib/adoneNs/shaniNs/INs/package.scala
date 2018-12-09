package typings
package adoneLib.adoneNs.shaniNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type DescribeCallback = js.ThisFunction0[/* this */ DescribeRuntimeContext, scala.Unit]
  type EndHookEvent = (adoneLib.adoneLibStrings.`end before hook`) | (adoneLib.adoneLibStrings.`end after hook`) | (adoneLib.adoneLibStrings.`end before each hook`) | (adoneLib.adoneLibStrings.`end after each hook`) | (adoneLib.adoneLibStrings.`end before test hook`) | (adoneLib.adoneLibStrings.`end after test hook`)
  type HookCallback = js.ThisFunction1[
    /* this */ HookRuntimeContext, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type StartHookEvent = (adoneLib.adoneLibStrings.`start before hook`) | (adoneLib.adoneLibStrings.`start after hook`) | (adoneLib.adoneLibStrings.`start before each hook`) | (adoneLib.adoneLibStrings.`start after each hook`) | (adoneLib.adoneLibStrings.`start before test hook`) | (adoneLib.adoneLibStrings.`start after test hook`)
  type TestCallback = js.ThisFunction1[
    /* this */ TestRuntimeContext, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
}
