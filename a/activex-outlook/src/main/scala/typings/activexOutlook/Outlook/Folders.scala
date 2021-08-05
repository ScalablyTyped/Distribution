package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Folders extends StObject {
  
  def Add(Name: String): Folder = js.native
  def Add(Name: String, Type: js.Any): Folder = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def GetFirst(): Folder = js.native
  
  def GetLast(): Folder = js.native
  
  def GetNext(): Folder = js.native
  
  def GetPrevious(): Folder = js.native
  
  def Item(Index: js.Any): Folder = js.native
  
  /* private */ @JSName("Outlook.Folders_typekey")
  var OutlookDotFolders_typekey: Folders = js.native
  
  val Parent: js.Any = js.native
  
  val RawTable: js.Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
