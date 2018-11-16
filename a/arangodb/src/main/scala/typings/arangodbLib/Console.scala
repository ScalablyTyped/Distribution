package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  def debugLines(args: js.Any*): scala.Unit = js.native
  def debugStack(err: nodeLib.Error): scala.Unit = js.native
  def debugStack(err: nodeLib.Error, msg: java.lang.String): scala.Unit = js.native
  def errorLines(args: js.Any*): scala.Unit = js.native
  def errorStack(err: nodeLib.Error): scala.Unit = js.native
  def errorStack(err: nodeLib.Error, msg: java.lang.String): scala.Unit = js.native
  def infoLines(args: js.Any*): scala.Unit = js.native
  def infoStack(err: nodeLib.Error): scala.Unit = js.native
  def infoStack(err: nodeLib.Error, msg: java.lang.String): scala.Unit = js.native
  def logLines(args: js.Any*): scala.Unit = js.native
  def warnLines(args: js.Any*): scala.Unit = js.native
  def warnStack(err: nodeLib.Error): scala.Unit = js.native
  def warnStack(err: nodeLib.Error, msg: java.lang.String): scala.Unit = js.native
}

