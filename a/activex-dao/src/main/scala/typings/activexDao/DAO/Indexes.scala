package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indexes extends StObject {
  
  def apply(Item: String): Index = js.native
  def apply(Item: Double): Index = js.native
  
  def Append(Index: Index): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Item: String): Index = js.native
  def Item(Item: Double): Index = js.native
  
  def Refresh(): Unit = js.native
}
