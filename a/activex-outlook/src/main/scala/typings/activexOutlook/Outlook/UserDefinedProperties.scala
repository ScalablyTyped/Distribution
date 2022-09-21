package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDefinedProperties extends StObject {
  
  def Add(Name: String, Type: OlUserPropertyType): UserDefinedProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, DisplayFormat: Any): UserDefinedProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, DisplayFormat: Any, Formula: Any): UserDefinedProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, DisplayFormat: Unit, Formula: Any): UserDefinedProperty = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Find(Name: String): UserDefinedProperty = js.native
  
  def Item(Index: Any): UserDefinedProperty = js.native
  
  /* private */ @JSName("Outlook.UserDefinedProperties_typekey")
  var OutlookDotUserDefinedProperties_typekey: UserDefinedProperties = js.native
  
  val Parent: Any = js.native
  
  def Refresh(): Unit = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
