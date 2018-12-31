package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fields extends js.Object {
  val Count: scala.Double = js.native
  def apply(Index: java.lang.String): Field = js.native
  def apply(Index: scala.Double): Field = js.native
  /**
    * @param DefinedSize [DefinedSize=0]
    * @param Attrib [Attrib=-1]
    */
  def Append(Name: java.lang.String, Type: DataTypeEnum): scala.Unit = js.native
  def Append(Name: java.lang.String, Type: DataTypeEnum, DefinedSize: scala.Double): scala.Unit = js.native
  def Append(Name: java.lang.String, Type: DataTypeEnum, DefinedSize: scala.Double, Attrib: FieldAttributeEnum): scala.Unit = js.native
  def Append(
    Name: java.lang.String,
    Type: DataTypeEnum,
    DefinedSize: scala.Double,
    Attrib: FieldAttributeEnum,
    FieldValue: js.Any
  ): scala.Unit = js.native
  def CancelUpdate(): scala.Unit = js.native
  def Delete(Index: java.lang.String): scala.Unit = js.native
  def Delete(Index: scala.Double): scala.Unit = js.native
  def Item(Index: java.lang.String): Field = js.native
  def Item(Index: scala.Double): Field = js.native
  def Refresh(): scala.Unit = js.native
  /** @param ResyncValues [ResyncValues=2] */
  def Resync(): scala.Unit = js.native
  def Resync(ResyncValues: ResyncEnum): scala.Unit = js.native
  def Update(): scala.Unit = js.native
  /**
    * @param DefinedSize [DefinedSize=0]
    * @param Attrib [Attrib=-1]
    */
  def _Append(Name: java.lang.String, Type: DataTypeEnum): scala.Unit = js.native
  def _Append(Name: java.lang.String, Type: DataTypeEnum, DefinedSize: scala.Double): scala.Unit = js.native
  def _Append(Name: java.lang.String, Type: DataTypeEnum, DefinedSize: scala.Double, Attrib: FieldAttributeEnum): scala.Unit = js.native
}

