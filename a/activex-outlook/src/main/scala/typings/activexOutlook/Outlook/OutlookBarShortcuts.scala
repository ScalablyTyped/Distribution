package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookBarShortcuts extends StObject {
  
  def Add(Target: js.Any, Name: String): OutlookBarShortcut = js.native
  def Add(Target: js.Any, Name: String, Index: js.Any): OutlookBarShortcut = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): OutlookBarShortcut = js.native
  
  @JSName("Outlook.OutlookBarShortcuts_typekey")
  var OutlookDotOutlookBarShortcuts_typekey: OutlookBarShortcuts = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: js.Any): Unit = js.native
  
  val Session: NameSpace = js.native
}
