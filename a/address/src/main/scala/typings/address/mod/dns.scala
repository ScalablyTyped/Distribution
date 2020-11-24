package typings.address.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("address", "dns")
@js.native
object dns extends js.Object {
  
  def apply(callback: DnsCallback): Unit = js.native
  def apply(filepath: String, callback: DnsCallback): Unit = js.native
}
