package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachments extends StObject {
  
  def Add(Source: Any): Attachment = js.native
  def Add(Source: Any, Type: Any): Attachment = js.native
  def Add(Source: Any, Type: Any, Position: Any): Attachment = js.native
  def Add(Source: Any, Type: Any, Position: Any, DisplayName: Any): Attachment = js.native
  def Add(Source: Any, Type: Any, Position: Unit, DisplayName: Any): Attachment = js.native
  def Add(Source: Any, Type: Unit, Position: Any): Attachment = js.native
  def Add(Source: Any, Type: Unit, Position: Any, DisplayName: Any): Attachment = js.native
  def Add(Source: Any, Type: Unit, Position: Unit, DisplayName: Any): Attachment = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Any): Attachment = js.native
  
  /* private */ @JSName("Outlook.Attachments_typekey")
  var OutlookDotAttachments_typekey: Attachments = js.native
  
  val Parent: Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
