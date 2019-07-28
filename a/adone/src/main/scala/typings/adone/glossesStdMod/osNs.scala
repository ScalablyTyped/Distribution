package typings.adone.glossesStdMod

import org.scalablytyped.runtime.StringDictionary
import typings.adone.adoneStrings.BE
import typings.adone.adoneStrings.LE
import typings.node.Anon_E2BIG
import typings.node.Anon_EncodingString
import typings.node.Anon_PRIORITYABOVENORMAL
import typings.node.Anon_SIGABRT
import typings.node.Buffer
import typings.node.NodeJSNs.Platform
import typings.node.osMod.CpuInfo
import typings.node.osMod.NetworkInterfaceInfo
import typings.node.osMod.UserInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "os")
@js.native
object osNs extends js.Object {
  val EOL: String = js.native
  def arch(): String = js.native
  def cpus(): js.Array[CpuInfo] = js.native
  def endianness(): BE | LE = js.native
  def freemem(): Double = js.native
  /**
    * Gets the priority of a process.
    * Defaults to current process.
    */
  def getPriority(): Double = js.native
  def getPriority(pid: Double): Double = js.native
  def homedir(): String = js.native
  def hostname(): String = js.native
  def loadavg(): js.Array[Double] = js.native
  def networkInterfaces(): StringDictionary[js.Array[NetworkInterfaceInfo]] = js.native
  def platform(): Platform = js.native
  def release(): String = js.native
  /**
    * Sets the priority of the process specified process.
    * @param priority Must be in range of -20 to 19
    */
  def setPriority(pid: Double, priority: Double): Unit = js.native
  /**
    * Sets the priority of the current process.
    * @param priority Must be in range of -20 to 19
    */
  def setPriority(priority: Double): Unit = js.native
  def tmpdir(): String = js.native
  def totalmem(): Double = js.native
  def `type`(): String = js.native
  def uptime(): Double = js.native
  def userInfo(): UserInfo[String] = js.native
  def userInfo(options: typings.node.Anon_BufferEncoding): UserInfo[Buffer] = js.native
  def userInfo(options: Anon_EncodingString): UserInfo[String] = js.native
  @js.native
  object constants extends js.Object {
    var UV_UDP_REUSEADDR: Double = js.native
    var errno: Anon_E2BIG = js.native
    var priority: Anon_PRIORITYABOVENORMAL = js.native
    var signals: Anon_SIGABRT = js.native
  }
  
}

