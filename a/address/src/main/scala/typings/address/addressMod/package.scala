package typings.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object addressMod {
  import typings.std.Error

  type AddressCallback = js.Function2[/* err */ Error, /* addr */ Address, Unit]
  type DnsCallback = js.Function2[/* err */ Error, /* servers */ js.Array[String], Unit]
  type MacCallback = js.Function2[/* err */ Error, /* addr */ String, Unit]
}
