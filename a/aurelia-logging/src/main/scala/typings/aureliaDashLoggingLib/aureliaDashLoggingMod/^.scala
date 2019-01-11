package typings
package aureliaDashLoggingLib.aureliaDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-logging", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val logLevel: aureliaDashLoggingLib.aureliaDashLoggingMod.LogLevel = js.native
  def addAppender(appender: aureliaDashLoggingLib.aureliaDashLoggingMod.Appender): scala.Unit = js.native
  def addCustomLevel(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def clearAppenders(): scala.Unit = js.native
  def getAppenders(): js.Any = js.native
  def getLevel(): scala.Double = js.native
  def getLogger(id: java.lang.String): aureliaDashLoggingLib.aureliaDashLoggingMod.Logger = js.native
  def removeAppender(appender: aureliaDashLoggingLib.aureliaDashLoggingMod.Appender): scala.Unit = js.native
  def removeCustomLevel(name: java.lang.String): scala.Unit = js.native
  def setLevel(level: scala.Double): scala.Unit = js.native
}

