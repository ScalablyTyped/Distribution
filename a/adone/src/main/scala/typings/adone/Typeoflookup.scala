package typings.adone

import typings.node.Anon_Address
import typings.node.Anon_AddressFamily
import typings.node.Anon_AddressFamilyArray
import typings.node.dnsMod.LookupAllOptions
import typings.node.dnsMod.LookupOneOptions
import typings.node.dnsMod.LookupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoflookup extends js.Object {
  def __promisify__(hostname: String): js.Promise[Anon_AddressFamily] = js.native
  def __promisify__(hostname: String, options: Double): js.Promise[Anon_AddressFamily] = js.native
  def __promisify__(hostname: String, options: LookupAllOptions): js.Promise[Anon_Address] = js.native
  def __promisify__(hostname: String, options: LookupOneOptions): js.Promise[Anon_AddressFamily] = js.native
  def __promisify__(hostname: String, options: LookupOptions): js.Promise[Anon_AddressFamilyArray] = js.native
}

