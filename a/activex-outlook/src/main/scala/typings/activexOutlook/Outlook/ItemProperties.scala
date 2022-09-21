package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemProperties extends StObject {
  
  def Add(Name: String, Type: OlUserPropertyType): ItemProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: Any): ItemProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: Any, DisplayFormat: Any): ItemProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: Unit, DisplayFormat: Any): ItemProperty = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Any): ItemProperty = js.native
  
  /* private */ @JSName("Outlook.ItemProperties_typekey")
  var OutlookDotItemProperties_typekey: ItemProperties = js.native
  
  val Parent: Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
