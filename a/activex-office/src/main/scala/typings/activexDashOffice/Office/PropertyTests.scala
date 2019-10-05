package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyTests extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  def apply(Index: Double): PropertyTest = js.native
  /** @param Connector [Connector=1] */
  def Add(Name: String, Condition: MsoCondition, Value: js.Any, SecondValue: js.Any): Unit = js.native
  def Add(Name: String, Condition: MsoCondition, Value: js.Any, SecondValue: js.Any, Connector: MsoConnector): Unit = js.native
  def Item(Index: Double): PropertyTest = js.native
  def Remove(Index: Double): Unit = js.native
}

