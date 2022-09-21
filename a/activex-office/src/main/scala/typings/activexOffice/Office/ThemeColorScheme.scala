package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeColorScheme extends StObject {
  
  def apply(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  
  val Application: Any = js.native
  
  def Colors(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def GetCustomColor(Name: String): Double = js.native
  
  def Load(FileName: String): Unit = js.native
  
  val Parent: Any = js.native
  
  def Save(FileName: String): Unit = js.native
}
