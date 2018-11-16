package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickerResults extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  def apply(Index: scala.Double): PickerResult = js.native
  /** @param SIPId [SIPId=''] */
  def Add(Id: java.lang.String, DisplayName: java.lang.String, Type: java.lang.String): PickerResult = js.native
  /** @param SIPId [SIPId=''] */
  def Add(
    Id: java.lang.String,
    DisplayName: java.lang.String,
    Type: java.lang.String,
    SIPId: java.lang.String
  ): PickerResult = js.native
  /** @param SIPId [SIPId=''] */
  def Add(
    Id: java.lang.String,
    DisplayName: java.lang.String,
    Type: java.lang.String,
    SIPId: java.lang.String,
    ItemData: js.Any
  ): PickerResult = js.native
  /** @param SIPId [SIPId=''] */
  def Add(
    Id: java.lang.String,
    DisplayName: java.lang.String,
    Type: java.lang.String,
    SIPId: java.lang.String,
    ItemData: js.Any,
    SubItems: js.Any
  ): PickerResult = js.native
  def Item(Index: scala.Double): PickerResult = js.native
}

