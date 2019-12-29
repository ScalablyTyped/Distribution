package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.BuildingBlockEntries")
@js.native
class BuildingBlockEntries protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.BuildingBlockEntries_typekey")
  var WordDotBuildingBlockEntries_typekey: BuildingBlockEntries = js.native
  /** @param Word.WdDocPartInsertOptions [InsertOptions=0] */
  def Add(Name: String, Type: WdBuildingBlockTypes, Category: String, Range: Range, Description: js.Any): BuildingBlock = js.native
  def Add(
    Name: String,
    Type: WdBuildingBlockTypes,
    Category: String,
    Range: Range,
    Description: js.Any,
    InsertOptions: WdDocPartInsertOptions
  ): BuildingBlock = js.native
  def Item(Index: js.Any): BuildingBlock = js.native
}

