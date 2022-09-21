package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderFields extends StObject {
  
  def Add(PropertyName: String): OrderField = js.native
  def Add(PropertyName: String, IsDescending: Any): OrderField = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Insert(PropertyName: String, Index: Any): OrderField = js.native
  def Insert(PropertyName: String, Index: Any, IsDescending: Any): OrderField = js.native
  
  def Item(Index: Any): OrderField = js.native
  
  /* private */ @JSName("Outlook.OrderFields_typekey")
  var OutlookDotOrderFields_typekey: OrderFields = js.native
  
  val Parent: Any = js.native
  
  def Remove(Index: Any): Unit = js.native
  
  def RemoveAll(): Unit = js.native
  
  val Session: NameSpace = js.native
}
