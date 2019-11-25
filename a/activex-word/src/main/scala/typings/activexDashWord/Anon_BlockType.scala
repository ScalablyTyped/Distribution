package typings.activexDashWord

import typings.activexDashWord.Word.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockType extends js.Object {
  val BlockType: String
  val Category: String
  val Name: String
  val Range: typings.activexDashWord.Word.Range
  val Template: String
}

object Anon_BlockType {
  @scala.inline
  def apply(BlockType: String, Category: String, Name: String, Range: Range, Template: String): Anon_BlockType = {
    val __obj = js.Dynamic.literal(BlockType = BlockType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BlockType]
  }
}

