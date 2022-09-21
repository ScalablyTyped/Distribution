package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProperties extends StObject {
  
  def Add(Name: String, Type: OlUserPropertyType): UserProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: Any): UserProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: Any, DisplayFormat: Any): UserProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: Unit, DisplayFormat: Any): UserProperty = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Find(Name: String): UserProperty = js.native
  def Find(Name: String, Custom: Any): UserProperty = js.native
  
  def Item(Index: Any): UserProperty = js.native
  
  /* private */ @JSName("Outlook.UserProperties_typekey")
  var OutlookDotUserProperties_typekey: UserProperties = js.native
  
  val Parent: Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
