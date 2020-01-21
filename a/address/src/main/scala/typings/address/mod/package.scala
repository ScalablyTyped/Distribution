package typings.address

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddressCallback = js.Function2[/* err */ typings.std.Error, /* addr */ typings.address.mod.Address, scala.Unit]
  type DnsCallback = js.Function2[/* err */ typings.std.Error, /* servers */ js.Array[java.lang.String], scala.Unit]
  type MacCallback = js.Function2[/* err */ typings.std.Error, /* addr */ java.lang.String, scala.Unit]
}
