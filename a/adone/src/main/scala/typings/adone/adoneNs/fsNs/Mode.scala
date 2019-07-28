package typings.adone.adoneNs.fsNs

import typings.adone.adoneNs.fsNs.INs.Access
import typings.adone.adoneNs.fsNs.INs.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the permissions of a file
  */
@JSGlobal("adone.fs.Mode")
@js.native
class Mode protected () extends js.Object {
  def this(stat: Stats) = this()
  var group: Access = js.native
  var others: Access = js.native
  var owner: Access = js.native
  var stat: Stats = js.native
}

