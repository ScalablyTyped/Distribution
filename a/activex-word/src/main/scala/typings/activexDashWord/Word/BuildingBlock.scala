package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.BuildingBlock")
@js.native
class BuildingBlock protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Category: typings.activexDashWord.Word.Category = js.native
  val Creator: Double = js.native
  var Description: String = js.native
  val ID: String = js.native
  val Index: Double = js.native
  var InsertOptions: Double = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  val Type: BuildingBlockType = js.native
  var Value: String = js.native
  @JSName("Word.BuildingBlock_typekey")
  var WordDotBuildingBlock_typekey: BuildingBlock = js.native
  def Delete(): Unit = js.native
  def Insert(Where: Range): Range = js.native
  def Insert(Where: Range, RichText: js.Any): Range = js.native
}

