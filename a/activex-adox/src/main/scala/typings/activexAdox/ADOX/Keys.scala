package typings.activexAdox.ADOX

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keys extends StObject {
  
  def apply(Item: String): Key = js.native
  def apply(Item: Double): Key = js.native
  
  def Append(Item: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: String, RelatedTable: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: String, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: String, RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: Unit, RelatedTable: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: Unit, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: Unit, RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: SafeArray[String]): Unit = js.native
  def Append(Item: String, Type: Unit, Column: SafeArray[String], RelatedTable: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: SafeArray[String], RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: Unit, Column: SafeArray[String], RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: String, RelatedTable: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: String, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: String, RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: Unit, RelatedTable: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: Unit, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: Unit, RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: SafeArray[String]): Unit = js.native
  def Append(Item: String, Type: KeyTypeEnum, Column: SafeArray[String], RelatedTable: String): Unit = js.native
  def Append(
    Item: String,
    Type: KeyTypeEnum,
    Column: SafeArray[String],
    RelatedTable: String,
    RelatedColumn: String
  ): Unit = js.native
  def Append(
    Item: String,
    Type: KeyTypeEnum,
    Column: SafeArray[String],
    RelatedTable: Unit,
    RelatedColumn: String
  ): Unit = js.native
  /**
    * @param Type [Type=1]
    * @param RelatedTable [RelatedTable='']
    * @param RelatedColumn [RelatedColumn='']
    */
  def Append(Item: Key): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: String, RelatedTable: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: String, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: String, RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: Unit, RelatedTable: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: Unit, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: Unit, RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: SafeArray[String]): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: SafeArray[String], RelatedTable: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: SafeArray[String], RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: Unit, Column: SafeArray[String], RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: String, RelatedTable: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: String, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: String, RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: Unit, RelatedTable: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: Unit, RelatedTable: String, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: Unit, RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: SafeArray[String]): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: SafeArray[String], RelatedTable: String): Unit = js.native
  def Append(
    Item: Key,
    Type: KeyTypeEnum,
    Column: SafeArray[String],
    RelatedTable: String,
    RelatedColumn: String
  ): Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: SafeArray[String], RelatedTable: Unit, RelatedColumn: String): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  
  def Item(Item: String): Key = js.native
  def Item(Item: Double): Key = js.native
  
  def Refresh(): Unit = js.native
}
