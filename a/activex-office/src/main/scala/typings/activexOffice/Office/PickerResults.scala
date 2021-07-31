package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PickerResults extends StObject {
  
  def apply(Index: Double): PickerResult = js.native
  
  /** @param SIPId [SIPId=''] */
  def Add(Id: String, DisplayName: String, Type: String): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: String): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: String, ItemData: js.Any): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: String, ItemData: js.Any, SubItems: js.Any): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: String, ItemData: Unit, SubItems: js.Any): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: Unit, ItemData: js.Any): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: Unit, ItemData: js.Any, SubItems: js.Any): PickerResult = js.native
  def Add(Id: String, DisplayName: String, Type: String, SIPId: Unit, ItemData: Unit, SubItems: js.Any): PickerResult = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): PickerResult = js.native
}
