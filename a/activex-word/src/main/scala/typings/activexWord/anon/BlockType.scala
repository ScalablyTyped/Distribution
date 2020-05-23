package typings.activexWord.anon

import typings.activexWord.Word.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockType extends js.Object {
  val BlockType: String
  val Category: String
  val Name: String
  val Range: typings.activexWord.Word.Range
  val Template: String
}

object BlockType {
  @scala.inline
  def apply(BlockType: String, Category: String, Name: String, Range: Range, Template: String): BlockType = {
    val __obj = js.Dynamic.literal(BlockType = BlockType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockType]
  }
}

