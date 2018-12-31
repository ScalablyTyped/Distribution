package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyTests extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  def apply(Index: scala.Double): PropertyTest = js.native
  /** @param Connector [Connector=1] */
  def Add(Name: java.lang.String, Condition: MsoCondition, Value: js.Any, SecondValue: js.Any): scala.Unit = js.native
  def Add(
    Name: java.lang.String,
    Condition: MsoCondition,
    Value: js.Any,
    SecondValue: js.Any,
    Connector: MsoConnector
  ): scala.Unit = js.native
  def Item(Index: scala.Double): PropertyTest = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

