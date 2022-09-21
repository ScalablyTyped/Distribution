package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookBarGroups extends StObject {
  
  def Add(Name: String): OutlookBarGroup = js.native
  def Add(Name: String, Index: Any): OutlookBarGroup = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Any): OutlookBarGroup = js.native
  
  /* private */ @JSName("Outlook.OutlookBarGroups_typekey")
  var OutlookDotOutlookBarGroups_typekey: OutlookBarGroups = js.native
  
  val Parent: Any = js.native
  
  def Remove(Index: Any): Unit = js.native
  
  val Session: NameSpace = js.native
}
