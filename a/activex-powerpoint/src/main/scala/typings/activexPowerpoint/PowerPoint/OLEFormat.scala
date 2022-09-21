package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OLEFormat extends StObject {
  
  def Activate(): Unit = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /** @param number [Index=0] */
  def DoVerb(): Unit = js.native
  def DoVerb(Index: Double): Unit = js.native
  
  var FollowColors: PpFollowColors = js.native
  
  val Object: Any = js.native
  
  val ObjectVerbs: typings.activexPowerpoint.PowerPoint.ObjectVerbs = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.OLEFormat_typekey")
  var PowerPointDotOLEFormat_typekey: OLEFormat = js.native
  
  val ProgID: String = js.native
}
