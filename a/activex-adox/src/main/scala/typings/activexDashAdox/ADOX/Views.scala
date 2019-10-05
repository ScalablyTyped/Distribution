package typings.activexDashAdox.ADOX

import typings.activexDashAdodb.ADODB.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Views extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): View = js.native
  def apply(Item: Double): View = js.native
  def Append(Name: String, Command: Command): Unit = js.native
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  def Item(Item: String): View = js.native
  def Item(Item: Double): View = js.native
  def Refresh(): Unit = js.native
}

