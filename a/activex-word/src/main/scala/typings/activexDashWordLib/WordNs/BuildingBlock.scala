package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.BuildingBlock")
@js.native
class BuildingBlock protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Category: activexDashWordLib.WordNs.Category = js.native
  val Creator: scala.Double = js.native
  var Description: java.lang.String = js.native
  val ID: java.lang.String = js.native
  val Index: scala.Double = js.native
  var InsertOptions: scala.Double = js.native
  var Name: java.lang.String = js.native
  val Parent: js.Any = js.native
  val Type: BuildingBlockType = js.native
  var Value: java.lang.String = js.native
  var `Word.BuildingBlock_typekey`: BuildingBlock = js.native
  def Delete(): scala.Unit = js.native
  def Insert(Where: Range): Range = js.native
  def Insert(Where: Range, RichText: js.Any): Range = js.native
}

