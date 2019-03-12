package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.UserProperties")
@js.native
class UserProperties protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.UserProperties_typekey`: UserProperties = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: java.lang.String, Type: OlUserPropertyType): UserProperty = js.native
  def Add(Name: java.lang.String, Type: OlUserPropertyType, AddToFolderFields: js.Any): UserProperty = js.native
  def Add(Name: java.lang.String, Type: OlUserPropertyType, AddToFolderFields: js.Any, DisplayFormat: js.Any): UserProperty = js.native
  def Find(Name: java.lang.String): UserProperty = js.native
  def Find(Name: java.lang.String, Custom: js.Any): UserProperty = js.native
  def Item(Index: js.Any): UserProperty = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

