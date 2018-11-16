package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeColorScheme extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  def Colors(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  def GetCustomColor(Name: java.lang.String): scala.Double = js.native
  def Load(FileName: java.lang.String): scala.Unit = js.native
  def Save(FileName: java.lang.String): scala.Unit = js.native
}

