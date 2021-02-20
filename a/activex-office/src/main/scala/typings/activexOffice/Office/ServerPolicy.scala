package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerPolicy extends StObject {
  
  def apply(Index: String): PolicyItem = js.native
  def apply(Index: Double): PolicyItem = js.native
  
  val Application: js.Any = js.native
  
  val BlockPreview: Boolean = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  val Description: String = js.native
  
  val Id: String = js.native
  
  def Item(Index: String): PolicyItem = js.native
  def Item(Index: Double): PolicyItem = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Statement: String = js.native
}
