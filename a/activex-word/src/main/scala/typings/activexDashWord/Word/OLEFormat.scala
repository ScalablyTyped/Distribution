package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.OLEFormat")
@js.native
class OLEFormat protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  var ClassType: String = js.native
  val Creator: Double = js.native
  var DisplayAsIcon: Boolean = js.native
  var IconIndex: Double = js.native
  var IconLabel: String = js.native
  var IconName: String = js.native
  val IconPath: String = js.native
  val Label: String = js.native
  val Object: js.Any = js.native
  val Parent: js.Any = js.native
  var PreserveFormattingOnUpdate: Boolean = js.native
  val ProgID: String = js.native
  var `Word.OLEFormat_typekey`: OLEFormat = js.native
  def Activate(): Unit = js.native
  def ActivateAs(ClassType: String): Unit = js.native
  def ConvertTo(): Unit = js.native
  def ConvertTo(ClassType: js.Any): Unit = js.native
  def ConvertTo(ClassType: js.Any, DisplayAsIcon: js.Any): Unit = js.native
  def ConvertTo(ClassType: js.Any, DisplayAsIcon: js.Any, IconFileName: js.Any): Unit = js.native
  def ConvertTo(ClassType: js.Any, DisplayAsIcon: js.Any, IconFileName: js.Any, IconIndex: js.Any): Unit = js.native
  def ConvertTo(
    ClassType: js.Any,
    DisplayAsIcon: js.Any,
    IconFileName: js.Any,
    IconIndex: js.Any,
    IconLabel: js.Any
  ): Unit = js.native
  def DoVerb(): Unit = js.native
  def DoVerb(VerbIndex: js.Any): Unit = js.native
  def Edit(): Unit = js.native
  def Open(): Unit = js.native
}

