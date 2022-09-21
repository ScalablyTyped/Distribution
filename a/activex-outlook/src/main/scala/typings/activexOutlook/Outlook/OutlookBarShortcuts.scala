package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookBarShortcuts extends StObject {
  
  def Add(Target: Any, Name: String): OutlookBarShortcut = js.native
  def Add(Target: Any, Name: String, Index: Any): OutlookBarShortcut = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Any): OutlookBarShortcut = js.native
  
  /* private */ @JSName("Outlook.OutlookBarShortcuts_typekey")
  var OutlookDotOutlookBarShortcuts_typekey: OutlookBarShortcuts = js.native
  
  val Parent: Any = js.native
  
  def Remove(Index: Any): Unit = js.native
  
  val Session: NameSpace = js.native
}
