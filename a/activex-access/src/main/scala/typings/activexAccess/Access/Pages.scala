package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pages extends StObject {
  
  def apply(Index: String): Page = js.native
  def apply(Index: Double): Page = js.native
  
  def Add(): Page = js.native
  def Add(Before: Double): Page = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): Page = js.native
  def Item(Index: Double): Page = js.native
  
  def Remove(): Unit = js.native
  def Remove(Item: Double): Unit = js.native
}
