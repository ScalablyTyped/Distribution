package typings.address.addressMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("address", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MAC_IP_RE: RegExp = js.native
  val MAC_RE: RegExp = js.native
  def apply(callback: AddressCallback): Unit = js.native
  def apply(interfaceName: String, callback: AddressCallback): Unit = js.native
  def dns(callback: DnsCallback): Unit = js.native
  def dns(filepath: String, callback: DnsCallback): Unit = js.native
  def ip(): js.Any = js.native
  def ip(interfaceName: String): js.Any = js.native
  def ipv6(): js.Any = js.native
  def ipv6(interfaceName: String): js.Any = js.native
  def mac(callback: MacCallback): Unit = js.native
  def mac(interfaceName: String, callback: MacCallback): Unit = js.native
}

