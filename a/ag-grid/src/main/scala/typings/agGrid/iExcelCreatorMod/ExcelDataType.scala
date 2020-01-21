package typings.agGrid.iExcelCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.agGrid.agGridStrings.String
  - typings.agGrid.agGridStrings.Number
  - typings.agGrid.agGridStrings.Boolean
  - typings.agGrid.agGridStrings.DateTime
  - typings.agGrid.agGridStrings.Error
*/
trait ExcelDataType extends js.Object

object ExcelDataType {
  @scala.inline
  def Boolean: typings.agGrid.agGridStrings.Boolean = this.cast("Boolean")
  @scala.inline
  def DateTime: typings.agGrid.agGridStrings.DateTime = this.cast("DateTime")
  @scala.inline
  def Error: typings.agGrid.agGridStrings.Error = this.cast("Error")
  @scala.inline
  def Number: typings.agGrid.agGridStrings.Number = this.cast("Number")
  @scala.inline
  def String: typings.agGrid.agGridStrings.String = this.cast("String")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

