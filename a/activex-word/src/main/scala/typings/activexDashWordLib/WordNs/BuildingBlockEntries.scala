package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.BuildingBlockEntries")
@js.native
class BuildingBlockEntries protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.BuildingBlockEntries_typekey`: BuildingBlockEntries = js.native
  /** @param Word.WdDocPartInsertOptions [InsertOptions=0] */
  def Add(
    Name: java.lang.String,
    Type: WdBuildingBlockTypes,
    Category: java.lang.String,
    Range: Range,
    Description: js.Any
  ): BuildingBlock = js.native
  /** @param Word.WdDocPartInsertOptions [InsertOptions=0] */
  def Add(
    Name: java.lang.String,
    Type: WdBuildingBlockTypes,
    Category: java.lang.String,
    Range: Range,
    Description: js.Any,
    InsertOptions: WdDocPartInsertOptions
  ): BuildingBlock = js.native
  def Item(Index: js.Any): BuildingBlock = js.native
}

