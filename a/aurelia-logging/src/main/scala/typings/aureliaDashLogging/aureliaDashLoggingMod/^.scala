package typings.aureliaDashLogging.aureliaDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-logging", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val logLevel: LogLevel = js.native
  def addAppender(appender: Appender): Unit = js.native
  def addCustomLevel(name: String, value: Double): Unit = js.native
  def clearAppenders(): Unit = js.native
  def getAppenders(): js.Any = js.native
  def getLevel(): Double = js.native
  def getLogger(id: String): Logger = js.native
  def removeAppender(appender: Appender): Unit = js.native
  def removeCustomLevel(name: String): Unit = js.native
  def setLevel(level: Double): Unit = js.native
}

