package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBarControls extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: CommandBar = js.native
  def apply(Index: java.lang.String): CommandBarControl = js.native
  def apply(Index: scala.Double): CommandBarControl = js.native
  def Add(): CommandBarControl = js.native
  def Add(Type: MsoControlType): CommandBarControl = js.native
  def Add(Type: MsoControlType, Id: scala.Double): CommandBarControl = js.native
  def Add(Type: MsoControlType, Id: scala.Double, Parameter: js.Any): CommandBarControl = js.native
  def Add(Type: MsoControlType, Id: scala.Double, Parameter: js.Any, Before: scala.Double): CommandBarControl = js.native
  def Add(
    Type: MsoControlType,
    Id: scala.Double,
    Parameter: js.Any,
    Before: scala.Double,
    Temporary: scala.Boolean
  ): CommandBarControl = js.native
  def Item(Index: java.lang.String): CommandBarControl = js.native
  def Item(Index: scala.Double): CommandBarControl = js.native
}

