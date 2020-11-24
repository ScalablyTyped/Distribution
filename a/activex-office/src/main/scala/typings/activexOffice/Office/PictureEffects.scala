package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureEffects extends js.Object {
  
  def apply(Index: Double): PictureEffect = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  /** @param Index [Index=-1] */
  def Delete(): Unit = js.native
  def Delete(Index: Double): Unit = js.native
  
  /** @param Position [Position=-1] */
  def Insert(EffectType: MsoPictureEffectType): PictureEffect = js.native
  def Insert(EffectType: MsoPictureEffectType, Position: Double): PictureEffect = js.native
  
  def Item(Index: Double): PictureEffect = js.native
}
