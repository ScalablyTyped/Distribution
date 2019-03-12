package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  def debugLines(args: js.Any*): scala.Unit = js.native
  def debugStack(err: stdLib.Error): scala.Unit = js.native
  def debugStack(err: stdLib.Error, msg: java.lang.String): scala.Unit = js.native
  def errorLines(args: js.Any*): scala.Unit = js.native
  def errorStack(err: stdLib.Error): scala.Unit = js.native
  def errorStack(err: stdLib.Error, msg: java.lang.String): scala.Unit = js.native
  def infoLines(args: js.Any*): scala.Unit = js.native
  def infoStack(err: stdLib.Error): scala.Unit = js.native
  def infoStack(err: stdLib.Error, msg: java.lang.String): scala.Unit = js.native
  def logLines(args: js.Any*): scala.Unit = js.native
  def warnLines(args: js.Any*): scala.Unit = js.native
  def warnStack(err: stdLib.Error): scala.Unit = js.native
  def warnStack(err: stdLib.Error, msg: java.lang.String): scala.Unit = js.native
}

