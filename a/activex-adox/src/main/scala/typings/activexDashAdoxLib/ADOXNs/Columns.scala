package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Column = js.native
  def apply(Item: scala.Double): Column = js.native
  /**
    * @param Type [Type=202]
    * @param DefinedSize [DefinedSize=0]
    */
  def Append(Item: Column): scala.Unit = js.native
  def Append(Item: Column, Type: activexDashAdodbLib.ADODBNs.DataTypeEnum): scala.Unit = js.native
  def Append(Item: Column, Type: activexDashAdodbLib.ADODBNs.DataTypeEnum, DefinedSize: scala.Double): scala.Unit = js.native
  def Append(Item: java.lang.String): scala.Unit = js.native
  def Append(Item: java.lang.String, Type: activexDashAdodbLib.ADODBNs.DataTypeEnum): scala.Unit = js.native
  def Append(Item: java.lang.String, Type: activexDashAdodbLib.ADODBNs.DataTypeEnum, DefinedSize: scala.Double): scala.Unit = js.native
  def Delete(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: scala.Double): scala.Unit = js.native
  def Item(Item: java.lang.String): Column = js.native
  def Item(Item: scala.Double): Column = js.native
  def Refresh(): scala.Unit = js.native
}

