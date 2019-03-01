package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockType extends js.Object {
  val BlockType: java.lang.String
  val Category: java.lang.String
  val Name: java.lang.String
  val Range: activexDashWordLib.WordNs.Range
  val Template: java.lang.String
}

object Anon_BlockType {
  @scala.inline
  def apply(
    BlockType: java.lang.String,
    Category: java.lang.String,
    Name: java.lang.String,
    Range: activexDashWordLib.WordNs.Range,
    Template: java.lang.String
  ): Anon_BlockType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BlockType")(BlockType)
    __obj.updateDynamic("Category")(Category)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Range")(Range)
    __obj.updateDynamic("Template")(Template)
    __obj.asInstanceOf[Anon_BlockType]
  }
}

