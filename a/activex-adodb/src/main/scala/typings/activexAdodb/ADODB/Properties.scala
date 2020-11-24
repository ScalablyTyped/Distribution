package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Properties extends js.Object {
  
  def apply(Index: String): Property = js.native
  def apply(Index: Double): Property = js.native
  
  val Count: Double = js.native
  
  def Item(Index: String): Property = js.native
  def Item(Index: Double): Property = js.native
  
  def Refresh(): Unit = js.native
}
