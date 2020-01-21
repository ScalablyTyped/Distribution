package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Procedures extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Procedure = js.native
  def apply(Item: Double): Procedure = js.native
  def Append(Name: String, Command: Command): Unit = js.native
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  def Item(Item: String): Procedure = js.native
  def Item(Item: Double): Procedure = js.native
  def Refresh(): Unit = js.native
}

