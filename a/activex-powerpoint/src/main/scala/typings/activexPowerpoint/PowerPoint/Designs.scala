package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Designs extends StObject {
  
  /** @param number [Index=-1] */
  def Add(designName: String): Design = js.native
  def Add(designName: String, Index: Double): Design = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /** @param number [Index=-1] */
  def Clone(pOriginal: Design): Design = js.native
  def Clone(pOriginal: Design, Index: Double): Design = js.native
  
  val Count: Double = js.native
  
  def Item(Index: js.Any): Design = js.native
  
  /** @param number [Index=-1] */
  def Load(TemplateName: String): Design = js.native
  def Load(TemplateName: String, Index: Double): Design = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("PowerPoint.Designs_typekey")
  var PowerPointDotDesigns_typekey: Designs = js.native
}
