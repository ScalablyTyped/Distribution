package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSchemes extends StObject {
  
  /** @param PowerPoint.ColorScheme [Scheme=0] */
  def Add(): ColorScheme = js.native
  def Add(Scheme: ColorScheme): ColorScheme = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): ColorScheme = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.ColorSchemes_typekey")
  var PowerPointDotColorSchemes_typekey: ColorSchemes = js.native
}
