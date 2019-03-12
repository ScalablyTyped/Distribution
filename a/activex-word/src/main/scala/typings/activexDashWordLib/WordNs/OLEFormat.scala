package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.OLEFormat")
@js.native
class OLEFormat protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  var ClassType: java.lang.String = js.native
  val Creator: scala.Double = js.native
  var DisplayAsIcon: scala.Boolean = js.native
  var IconIndex: scala.Double = js.native
  var IconLabel: java.lang.String = js.native
  var IconName: java.lang.String = js.native
  val IconPath: java.lang.String = js.native
  val Label: java.lang.String = js.native
  val Object: js.Any = js.native
  val Parent: js.Any = js.native
  var PreserveFormattingOnUpdate: scala.Boolean = js.native
  val ProgID: java.lang.String = js.native
  var `Word.OLEFormat_typekey`: OLEFormat = js.native
  def Activate(): scala.Unit = js.native
  def ActivateAs(ClassType: java.lang.String): scala.Unit = js.native
  def ConvertTo(): scala.Unit = js.native
  def ConvertTo(ClassType: js.Any): scala.Unit = js.native
  def ConvertTo(ClassType: js.Any, DisplayAsIcon: js.Any): scala.Unit = js.native
  def ConvertTo(ClassType: js.Any, DisplayAsIcon: js.Any, IconFileName: js.Any): scala.Unit = js.native
  def ConvertTo(ClassType: js.Any, DisplayAsIcon: js.Any, IconFileName: js.Any, IconIndex: js.Any): scala.Unit = js.native
  def ConvertTo(
    ClassType: js.Any,
    DisplayAsIcon: js.Any,
    IconFileName: js.Any,
    IconIndex: js.Any,
    IconLabel: js.Any
  ): scala.Unit = js.native
  def DoVerb(): scala.Unit = js.native
  def DoVerb(VerbIndex: js.Any): scala.Unit = js.native
  def Edit(): scala.Unit = js.native
  def Open(): scala.Unit = js.native
}

