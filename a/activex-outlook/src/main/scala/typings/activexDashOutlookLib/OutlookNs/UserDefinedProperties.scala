package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.UserDefinedProperties")
@js.native
class UserDefinedProperties protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var `Outlook.UserDefinedProperties_typekey`: UserDefinedProperties = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Add(Name: java.lang.String, Type: OlUserPropertyType): UserDefinedProperty = js.native
  def Add(Name: java.lang.String, Type: OlUserPropertyType, DisplayFormat: js.Any): UserDefinedProperty = js.native
  def Add(Name: java.lang.String, Type: OlUserPropertyType, DisplayFormat: js.Any, Formula: js.Any): UserDefinedProperty = js.native
  def Find(Name: java.lang.String): UserDefinedProperty = js.native
  def Item(Index: js.Any): UserDefinedProperty = js.native
  def Refresh(): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

