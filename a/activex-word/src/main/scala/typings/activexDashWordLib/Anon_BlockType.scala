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
    val __obj = js.Dynamic.literal(BlockType = BlockType, Category = Category, Name = Name, Range = Range, Template = Template)
  
    __obj.asInstanceOf[Anon_BlockType]
  }
}

