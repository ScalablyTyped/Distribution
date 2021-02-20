package typings.activexDao.DAO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryDefs extends StObject {
  
  def apply(Item: String): QueryDef = js.native
  def apply(Item: Double): QueryDef = js.native
  
  def Append(QueryDef: QueryDef): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Name: String): Unit = js.native
  
  def Item(Item: String): QueryDef = js.native
  def Item(Item: Double): QueryDef = js.native
  
  def Refresh(): Unit = js.native
}
