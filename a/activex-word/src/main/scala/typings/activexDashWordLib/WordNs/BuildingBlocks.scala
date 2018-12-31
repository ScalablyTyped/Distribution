package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.BuildingBlocks")
@js.native
class BuildingBlocks protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.BuildingBlocks_typekey`: BuildingBlocks = js.native
  /** @param Word.WdDocPartInsertOptions [InsertOptions=0] */
  def Add(Name: java.lang.String, Range: Range, Description: js.Any): BuildingBlock = js.native
  def Add(Name: java.lang.String, Range: Range, Description: js.Any, InsertOptions: WdDocPartInsertOptions): BuildingBlock = js.native
  def Item(Index: js.Any): BuildingBlock = js.native
}

