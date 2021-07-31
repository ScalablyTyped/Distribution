package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fields extends StObject {
  
  def apply(Item: String): Field = js.native
  def apply(Item: Double): Field = js.native
  
  def Append(Field: Field): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Item: String): Field = js.native
  def Item(Item: Double): Field = js.native
  
  def Refresh(): Unit = js.native
}
