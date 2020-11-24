package typings.angularStrap.mgcrea.ngStrap.datepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatepicker extends js.Object {
  
  def destroy(): Unit = js.native
  
  def hide(): Unit = js.native
  
  def int(): Unit = js.native
  
  def select(dateConstructorArg: String, keep: Boolean): Unit = js.native
  def select(dateConstructorArg: js.Array[Double], keep: Boolean): Unit = js.native
  def select(dateConstructorArg: Double, keep: Boolean): Unit = js.native
  
  def setMode(mode: js.Any): Unit = js.native
  
  def show(): Unit = js.native
  
  def update(date: Date): Unit = js.native
  
  def updateDisabledDates(dateRanges: js.Array[IDatepickerDateRange]): Unit = js.native
}
