package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyTests extends StObject {
  
  def apply(Index: Double): PropertyTest = js.native
  
  /** @param Connector [Connector=1] */
  def Add(Name: String, Condition: MsoCondition, Value: Any, SecondValue: Any): Unit = js.native
  def Add(Name: String, Condition: MsoCondition, Value: Any, SecondValue: Any, Connector: MsoConnector): Unit = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): PropertyTest = js.native
  
  def Remove(Index: Double): Unit = js.native
}
