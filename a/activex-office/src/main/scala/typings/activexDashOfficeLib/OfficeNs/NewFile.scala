package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.NewFile")
@js.native
class NewFile protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  var `Office.NewFile_typekey`: NewFile = js.native
  def Add(FileName: java.lang.String): scala.Boolean = js.native
  def Add(FileName: java.lang.String, Section: MsoFileNewSection): scala.Boolean = js.native
  def Add(FileName: java.lang.String, Section: MsoFileNewSection, DisplayName: java.lang.String): scala.Boolean = js.native
  def Add(
    FileName: java.lang.String,
    Section: MsoFileNewSection,
    DisplayName: java.lang.String,
    Action: MsoFileNewAction
  ): scala.Boolean = js.native
  def Remove(FileName: java.lang.String): scala.Boolean = js.native
  def Remove(FileName: java.lang.String, Section: MsoFileNewSection): scala.Boolean = js.native
  def Remove(FileName: java.lang.String, Section: MsoFileNewSection, DisplayName: java.lang.String): scala.Boolean = js.native
  def Remove(
    FileName: java.lang.String,
    Section: MsoFileNewSection,
    DisplayName: java.lang.String,
    Action: MsoFileNewAction
  ): scala.Boolean = js.native
}

