package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attachments extends StObject {
  
  def Add(Source: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any, Position: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any, Position: js.Any, DisplayName: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: js.Any, Position: Unit, DisplayName: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: Unit, Position: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: Unit, Position: js.Any, DisplayName: js.Any): Attachment = js.native
  def Add(Source: js.Any, Type: Unit, Position: Unit, DisplayName: js.Any): Attachment = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): Attachment = js.native
  
  /* private */ @JSName("Outlook.Attachments_typekey")
  var OutlookDotAttachments_typekey: Attachments = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
