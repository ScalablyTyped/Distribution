package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): User = js.native
  def apply(Item: scala.Double): User = js.native
  /** @param Password [Password=''] */
  def Append(Item: User): scala.Unit = js.native
  def Append(Item: User, Password: java.lang.String): scala.Unit = js.native
  def Append(Item: java.lang.String): scala.Unit = js.native
  def Append(Item: java.lang.String, Password: java.lang.String): scala.Unit = js.native
  def Delete(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: scala.Double): scala.Unit = js.native
  def Item(Item: java.lang.String): User = js.native
  def Item(Item: scala.Double): User = js.native
  def Refresh(): scala.Unit = js.native
}

