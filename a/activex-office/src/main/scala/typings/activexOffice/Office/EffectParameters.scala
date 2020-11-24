package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectParameters extends js.Object {
  
  def apply(Index: String): EffectParameter = js.native
  def apply(Index: Double): EffectParameter = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): EffectParameter = js.native
  def Item(Index: Double): EffectParameter = js.native
}
