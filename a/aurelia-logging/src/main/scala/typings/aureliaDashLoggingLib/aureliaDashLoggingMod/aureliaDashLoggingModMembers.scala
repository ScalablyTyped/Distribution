package typings
package aureliaDashLoggingLib.aureliaDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-logging", JSImport.Namespace)
@js.native
object aureliaDashLoggingModMembers extends js.Object {
  val logLevel: LogLevel = js.native
  def addAppender(appender: Appender): scala.Unit = js.native
  def addCustomLevel(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def clearAppenders(): scala.Unit = js.native
  def getAppenders(): js.Any = js.native
  def getLevel(): scala.Double = js.native
  def getLogger(id: java.lang.String): Logger = js.native
  def removeAppender(appender: Appender): scala.Unit = js.native
  def removeCustomLevel(name: java.lang.String): scala.Unit = js.native
  def setLevel(level: scala.Double): scala.Unit = js.native
}

