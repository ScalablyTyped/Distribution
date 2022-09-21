package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationPoints extends StObject {
  
  /** @param number [Index=-1] */
  def Add(): AnimationPoint = js.native
  def Add(Index: Double): AnimationPoint = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): AnimationPoint = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.AnimationPoints_typekey")
  var PowerPointDotAnimationPoints_typekey: AnimationPoints = js.native
  
  var Smooth: MsoTriState = js.native
}
