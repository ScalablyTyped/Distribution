package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemProperties extends js.Object {
  
  def Add(Name: String, Type: OlUserPropertyType): ItemProperty = js.native
  def Add(
    Name: String,
    Type: OlUserPropertyType,
    AddToFolderFields: js.UndefOr[scala.Nothing],
    DisplayFormat: js.Any
  ): ItemProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: js.Any): ItemProperty = js.native
  def Add(Name: String, Type: OlUserPropertyType, AddToFolderFields: js.Any, DisplayFormat: js.Any): ItemProperty = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): ItemProperty = js.native
  
  @JSName("Outlook.ItemProperties_typekey")
  var OutlookDotItemProperties_typekey: ItemProperties = js.native
  
  val Parent: js.Any = js.native
  
  def Remove(Index: Double): Unit = js.native
  
  val Session: NameSpace = js.native
}
