package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.System")
@js.native
class System protected () extends js.Object {
  val Application: Application = js.native
  val ComputerType: java.lang.String = js.native
  val Country: WdCountry = js.native
  val CountryRegion: WdCountry = js.native
  val Creator: scala.Double = js.native
  var Cursor: WdCursorType = js.native
  val FreeDiskSpace: scala.Double = js.native
  val HorizontalResolution: scala.Double = js.native
  val LanguageDesignation: java.lang.String = js.native
  val MacintoshName: java.lang.String = js.native
  val MathCoprocessorInstalled: scala.Boolean = js.native
  val OperatingSystem: java.lang.String = js.native
  val Parent: js.Any = js.native
  val ProcessorType: java.lang.String = js.native
  val QuickDrawInstalled: scala.Boolean = js.native
  val Version: java.lang.String = js.native
  val VerticalResolution: scala.Double = js.native
  var `Word.System_typekey`: System = js.native
  def Connect(Path: java.lang.String): scala.Unit = js.native
  def Connect(Path: java.lang.String, Drive: js.Any): scala.Unit = js.native
  def Connect(Path: java.lang.String, Drive: js.Any, Password: js.Any): scala.Unit = js.native
  def MSInfo(): scala.Unit = js.native
  def PrivateProfileString(FileName: java.lang.String, Section: java.lang.String, Key: java.lang.String): java.lang.String = js.native
  def ProfileString(Section: java.lang.String, Key: java.lang.String): java.lang.String = js.native
}

