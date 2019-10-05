package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeColorScheme extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  def Colors(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  def GetCustomColor(Name: String): Double = js.native
  def Load(FileName: String): Unit = js.native
  def Save(FileName: String): Unit = js.native
}

