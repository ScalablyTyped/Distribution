package typings.activexAdodb.ADODB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends StObject {
  
  def apply(Index: String): Parameter = js.native
  def apply(Index: Double): Parameter = js.native
  
  def Append(Object: Any): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Index: String): Unit = js.native
  def Delete(Index: Double): Unit = js.native
  
  def Item(Index: String): Parameter = js.native
  def Item(Index: Double): Parameter = js.native
  
  def Refresh(): Unit = js.native
}
