package typings.activexAdox.ADOX

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keys extends js.Object {
  val Count: Double = js.native
  def apply(Item: String): Key = js.native
  def apply(Item: Double): Key = js.native
  def Append(Item: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: String, RelatedTable: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: String, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: SafeArray[String]): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: SafeArray[String], RelatedTable: String): Unit = js.native
  def Append(
    Item: String,
    Type: KeyTypeEnum,
    Column: SafeArray[String],
    RelatedTable: String,
    RelatedColumn: String
  ): Unit = js.native
  /**
    * @param Type [Type=1]
    * @param RelatedTable [RelatedTable='']
    * @param RelatedColumn [RelatedColumn='']
    */
  def Append(Item: Key): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: String, RelatedTable: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: String, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: SafeArray[String]): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: SafeArray[String], RelatedTable: String): Unit = js.native
  def Append(
    Item: Key,
    Type: KeyTypeEnum,
    Column: SafeArray[String],
    RelatedTable: String,
    RelatedColumn: String
  ): Unit = js.native
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  def Item(Item: String): Key = js.native
  def Item(Item: Double): Key = js.native
  def Refresh(): Unit = js.native
}

