package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserProperties extends StObject {
  
  def Add(Name: String, Type: OlUserPropertyType): UserProperty = js.native
  def Add(
    Name: String,
    Type: OlUserPropertyType,
    AddToFolderFields: js.UndefOr[scala.Nothing],
    DisplayFormat: js.Any
  ): UserProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: js.Any): UserProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: js.Any, DisplayFormat: js.Any): UserProperty = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Find(Name: String): UserProperty = js.native
  def Find(Name: String, Custom: js.Any): UserProperty = js.native
  
  def Item(Index: js.Any): UserProperty = js.native
  
  @JSName("Outlook.UserProperties_typekey")
  var OutlookDotUserProperties_typekey: UserProperties = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
