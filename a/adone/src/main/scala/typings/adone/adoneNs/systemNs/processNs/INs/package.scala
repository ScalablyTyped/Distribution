package typings.adone.adoneNs.systemNs.processNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  import typings.node.childUnderscoreProcessMod.ChildProcess
  import typings.node.streamMod.Stream
  import typings.std.Error

  type ExecChildProcess = ChildProcess with ExecChildPromise with js.Promise[ExecReturns]
  type ExecError = Error with ExecReturns
  /* Rewritten from type alias, can be one of: 
    - typings.adone.adoneStrings.pipe
    - typings.adone.adoneStrings.ipc
    - typings.adone.adoneStrings.ignore
    - typings.node.streamMod.Stream
    - scala.Double
    - scala.Null
    - `js.undefined`
    - scala.Nothing
  */
  type StdIOOption = js.UndefOr[_StdIOOption | Stream | Double | Null]
}
