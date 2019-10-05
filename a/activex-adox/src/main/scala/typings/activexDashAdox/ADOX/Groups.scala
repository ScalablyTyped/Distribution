package typings.activexDashAdox.ADOX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Group = js.native
  def apply(Item: Double): Group = js.native
  def Append(Item: String): Unit = js.native
  def Append(Item: Group): Unit = js.native
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  def Item(Item: String): Group = js.native
  def Item(Item: Double): Group = js.native
  def Refresh(): Unit = js.native
}

