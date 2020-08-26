package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.DataTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Column = js.native
  def apply(Item: Double): Column = js.native
  def Append(Item: String): Unit = js.native
  def Append(Item: String, Type: js.UndefOr[scala.Nothing], DefinedSize: Double): Unit = js.native
  def Append(Item: String, Type: DataTypeEnum): Unit = js.native
  def Append(Item: String, Type: DataTypeEnum, DefinedSize: Double): Unit = js.native
  /**
    * @param Type [Type=202]
    * @param DefinedSize [DefinedSize=0]
    */
  def Append(Item: Column): Unit = js.native
  def Append(Item: Column, Type: js.UndefOr[scala.Nothing], DefinedSize: Double): Unit = js.native
  def Append(Item: Column, Type: DataTypeEnum): Unit = js.native
  def Append(Item: Column, Type: DataTypeEnum, DefinedSize: Double): Unit = js.native
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  def Item(Item: String): Column = js.native
  def Item(Item: Double): Column = js.native
  def Refresh(): Unit = js.native
}

