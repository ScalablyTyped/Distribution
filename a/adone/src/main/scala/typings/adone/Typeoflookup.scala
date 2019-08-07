package typings.adone

import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupAllOptions
import typings.node.dnsMod.LookupOneOptions
import typings.node.dnsMod.LookupOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoflookup extends js.Object {
  def __promisify__(hostname: String): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: String, options: Double): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  def __promisify__(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
  def __promisify__(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
}

