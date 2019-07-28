package typings.address

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("address", JSImport.Namespace)
@js.native
object addressMod extends js.Object {
  def apply(callback: js.Function2[/* err */ Error, /* addr */ Anon_Ip, Unit]): Unit = js.native
  def apply(interfaceName: String, callback: js.Function2[/* err */ Error, /* addr */ Anon_Ip, Unit]): Unit = js.native
  def dns(callback: js.Function2[/* err */ Error, /* servers */ js.Array[String], Unit]): Unit = js.native
  def dns(filePath: String, callback: js.Function2[/* err */ Error, /* servers */ js.Array[String], Unit]): Unit = js.native
  def ip(): String = js.native
  def ip(interfaceName: String): String = js.native
  def ipv6(): String = js.native
  def ipv6(interfaceName: String): String = js.native
  def mac(callback: js.Function2[/* err */ Error, /* addr */ String, Unit]): Unit = js.native
  def mac(interfaceName: String, callback: js.Function2[/* err */ Error, /* addr */ String, Unit]): Unit = js.native
}

