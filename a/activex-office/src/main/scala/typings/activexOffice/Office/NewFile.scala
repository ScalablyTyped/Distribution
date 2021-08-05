package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewFile extends StObject {
  
  def Add(FileName: String): Boolean = js.native
  def Add(FileName: String, Section: Unit, DisplayName: String): Boolean = js.native
  def Add(FileName: String, Section: Unit, DisplayName: String, Action: MsoFileNewAction): Boolean = js.native
  def Add(FileName: String, Section: Unit, DisplayName: Unit, Action: MsoFileNewAction): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection, DisplayName: String): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection, DisplayName: String, Action: MsoFileNewAction): Boolean = js.native
  def Add(FileName: String, Section: MsoFileNewSection, DisplayName: Unit, Action: MsoFileNewAction): Boolean = js.native
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  /* private */ @JSName("Office.NewFile_typekey")
  var OfficeDotNewFile_typekey: NewFile = js.native
  
  def Remove(FileName: String): Boolean = js.native
  def Remove(FileName: String, Section: Unit, DisplayName: String): Boolean = js.native
  def Remove(FileName: String, Section: Unit, DisplayName: String, Action: MsoFileNewAction): Boolean = js.native
  def Remove(FileName: String, Section: Unit, DisplayName: Unit, Action: MsoFileNewAction): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection, DisplayName: String): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection, DisplayName: String, Action: MsoFileNewAction): Boolean = js.native
  def Remove(FileName: String, Section: MsoFileNewSection, DisplayName: Unit, Action: MsoFileNewAction): Boolean = js.native
}
