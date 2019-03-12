package typings
package adoneLib.adoneNs.systemNs.processNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type ExecChildProcess = nodeLib.childUnderscoreProcessMod.ChildProcess with ExecChildPromise with js.Promise[ExecReturns]
  type ExecError = stdLib.Error with ExecReturns
  type StdIOOption = js.UndefOr[
    adoneLib.adoneLibStrings.pipe | adoneLib.adoneLibStrings.ipc | adoneLib.adoneLibStrings.ignore | nodeLib.streamMod.Stream | scala.Double | scala.Null
  ]
}
