package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keys extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Key = js.native
  def apply(Item: scala.Double): Key = js.native
  /**
    * @param Type [Type=1]
    * @param RelatedTable [RelatedTable='']
    * @param RelatedColumn [RelatedColumn='']
    */
  def Append(Item: Key): scala.Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum): scala.Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: activexDashInteropLib.SafeArray[java.lang.String]): scala.Unit = js.native
  def Append(
    Item: Key,
    Type: KeyTypeEnum,
    Column: activexDashInteropLib.SafeArray[java.lang.String],
    RelatedTable: java.lang.String
  ): scala.Unit = js.native
  def Append(
    Item: Key,
    Type: KeyTypeEnum,
    Column: activexDashInteropLib.SafeArray[java.lang.String],
    RelatedTable: java.lang.String,
    RelatedColumn: java.lang.String
  ): scala.Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: java.lang.String): scala.Unit = js.native
  def Append(Item: Key, Type: KeyTypeEnum, Column: java.lang.String, RelatedTable: java.lang.String): scala.Unit = js.native
  def Append(
    Item: Key,
    Type: KeyTypeEnum,
    Column: java.lang.String,
    RelatedTable: java.lang.String,
    RelatedColumn: java.lang.String
  ): scala.Unit = js.native
  def Append(Item: java.lang.String): scala.Unit = js.native
  def Append(Item: java.lang.String, Type: KeyTypeEnum): scala.Unit = js.native
  def Append(
    Item: java.lang.String,
    Type: KeyTypeEnum,
    Column: activexDashInteropLib.SafeArray[java.lang.String]
  ): scala.Unit = js.native
  def Append(
    Item: java.lang.String,
    Type: KeyTypeEnum,
    Column: activexDashInteropLib.SafeArray[java.lang.String],
    RelatedTable: java.lang.String
  ): scala.Unit = js.native
  def Append(
    Item: java.lang.String,
    Type: KeyTypeEnum,
    Column: activexDashInteropLib.SafeArray[java.lang.String],
    RelatedTable: java.lang.String,
    RelatedColumn: java.lang.String
  ): scala.Unit = js.native
  def Append(Item: java.lang.String, Type: KeyTypeEnum, Column: java.lang.String): scala.Unit = js.native
  def Append(
    Item: java.lang.String,
    Type: KeyTypeEnum,
    Column: java.lang.String,
    RelatedTable: java.lang.String
  ): scala.Unit = js.native
  def Append(
    Item: java.lang.String,
    Type: KeyTypeEnum,
    Column: java.lang.String,
    RelatedTable: java.lang.String,
    RelatedColumn: java.lang.String
  ): scala.Unit = js.native
  def Delete(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: scala.Double): scala.Unit = js.native
  def Item(Item: java.lang.String): Key = js.native
  def Item(Item: scala.Double): Key = js.native
  def Refresh(): scala.Unit = js.native
}

