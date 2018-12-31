package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the permissions of a file
  */
@JSGlobal("adone.fs.Mode")
@js.native
class Mode protected () extends js.Object {
  def this(stat: adoneLib.adoneNs.fsNs.INs.Stats) = this()
  var group: adoneLib.adoneNs.fsNs.INs.Access = js.native
  var others: adoneLib.adoneNs.fsNs.INs.Access = js.native
  var owner: adoneLib.adoneNs.fsNs.INs.Access = js.native
  var stat: adoneLib.adoneNs.fsNs.INs.Stats = js.native
}

