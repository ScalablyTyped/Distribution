package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerDialog extends StObject {
  
  val Application: js.Any = js.native
  
  def CreatePickerResults(): PickerResults = js.native
  
  val Creator: Double = js.native
  
  var DataHandlerId: String = js.native
  
  @JSName("Office.PickerDialog_typekey")
  var OfficeDotPickerDialog_typekey: PickerDialog = js.native
  
  def Properties(Index: Double): PickerProperty = js.native
  @JSName("Properties")
  val Properties_Original: PickerProperties = js.native
  
  def Resolve(TokenText: String, duplicateDlgMode: Double): PickerResults = js.native
  
  /**
    * @param IsMultiSelect [IsMultiSelect=true]
    * @param ExistingResults [ExistingResults=0]
    */
  def Show(): PickerResults = js.native
  def Show(IsMultiSelect: Boolean): PickerResults = js.native
  def Show(IsMultiSelect: Boolean, ExistingResults: PickerResults): PickerResults = js.native
  def Show(IsMultiSelect: Unit, ExistingResults: PickerResults): PickerResults = js.native
  
  var Title: String = js.native
}
