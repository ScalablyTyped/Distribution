package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Environment Variables Collection Object */
@js.native
trait WshEnvironment extends js.Object {
  val Length: Double = js.native
  def apply(Name: String): String = js.native
  def Count(): Double = js.native
  def Item(Name: String): String = js.native
  def Remove(Name: String): Unit = js.native
}

