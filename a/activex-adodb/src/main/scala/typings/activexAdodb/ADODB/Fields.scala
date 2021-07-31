package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends StObject {
  
  def apply(Index: String): Field = js.native
  def apply(Index: Double): Field = js.native
  
  /**
    * @param DefinedSize [DefinedSize=0]
    * @param Attrib [Attrib=-1]
    */
  def Append(Name: String, Type: DataTypeEnum): Unit = js.native
  def Append(Name: String, Type: DataTypeEnum, DefinedSize: Double): Unit = js.native
  def Append(Name: String, Type: DataTypeEnum, DefinedSize: Double, Attrib: Unit, FieldValue: js.Any): Unit = js.native
  def Append(Name: String, Type: DataTypeEnum, DefinedSize: Double, Attrib: FieldAttributeEnum): Unit = js.native
  def Append(
    Name: String,
    Type: DataTypeEnum,
    DefinedSize: Double,
    Attrib: FieldAttributeEnum,
    FieldValue: js.Any
  ): Unit = js.native
  def Append(Name: String, Type: DataTypeEnum, DefinedSize: Unit, Attrib: Unit, FieldValue: js.Any): Unit = js.native
  def Append(Name: String, Type: DataTypeEnum, DefinedSize: Unit, Attrib: FieldAttributeEnum): Unit = js.native
  def Append(
    Name: String,
    Type: DataTypeEnum,
    DefinedSize: Unit,
    Attrib: FieldAttributeEnum,
    FieldValue: js.Any
  ): Unit = js.native
  
  def CancelUpdate(): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Index: String): Unit = js.native
  def Delete(Index: Double): Unit = js.native
  
  def Item(Index: String): Field = js.native
  def Item(Index: Double): Field = js.native
  
  def Refresh(): Unit = js.native
  
  /** @param ResyncValues [ResyncValues=2] */
  def Resync(): Unit = js.native
  def Resync(ResyncValues: ResyncEnum): Unit = js.native
  
  def Update(): Unit = js.native
  
  /**
    * @param DefinedSize [DefinedSize=0]
    * @param Attrib [Attrib=-1]
    */
  def _Append(Name: String, Type: DataTypeEnum): Unit = js.native
  def _Append(Name: String, Type: DataTypeEnum, DefinedSize: Double): Unit = js.native
  def _Append(Name: String, Type: DataTypeEnum, DefinedSize: Double, Attrib: FieldAttributeEnum): Unit = js.native
  def _Append(Name: String, Type: DataTypeEnum, DefinedSize: Unit, Attrib: FieldAttributeEnum): Unit = js.native
}
