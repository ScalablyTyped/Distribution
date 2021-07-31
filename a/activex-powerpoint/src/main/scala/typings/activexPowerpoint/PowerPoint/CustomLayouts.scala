package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLayouts extends StObject {
  
  def Add(Index: Double): CustomLayout = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): CustomLayout = js.native
  
  val Parent: js.Any = js.native
  
  /** @param number [Index=-1] */
  def Paste(): CustomLayout = js.native
  def Paste(Index: Double): CustomLayout = js.native
  
  @JSName("PowerPoint.CustomLayouts_typekey")
  var PowerPointDotCustomLayouts_typekey: CustomLayouts = js.native
}
