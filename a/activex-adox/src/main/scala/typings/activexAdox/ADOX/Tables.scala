package typings.activexAdox.ADOX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tables extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Table = js.native
  def apply(Item: Double): Table = js.native
  def Append(Item: String): Unit = js.native
  def Append(Item: Table): Unit = js.native
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  def Item(Item: String): Table = js.native
  def Item(Item: Double): Table = js.native
  def Refresh(): Unit = js.native
}

