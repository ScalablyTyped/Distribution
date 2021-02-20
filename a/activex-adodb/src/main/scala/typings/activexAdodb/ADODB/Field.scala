package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends StObject {
  
  @JSName("ADODB.Field_typekey")
  var ADODBDotField_typekey: Field = js.native
  
  val ActualSize: Double = js.native
  
  def AppendChunk(Data: js.Any): Unit = js.native
  
  /** Sum of one or more of the values in the **FieldAttributeEnum** enum */
  var Attributes: FieldAttributeEnum = js.native
  
  var DataFormat: js.Any = js.native
  
  var DefinedSize: Double = js.native
  
  def GetChunk(Length: Double): js.Any = js.native
  
  val Name: String = js.native
  
  var NumericScale: Double = js.native
  
  val OriginalValue: js.Any = js.native
  
  var Precision: Double = js.native
  
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  val Status: Double = js.native
  
  var Type: DataTypeEnum = js.native
  
  val UnderlyingValue: js.Any = js.native
  
  var Value: js.Any = js.native
}
