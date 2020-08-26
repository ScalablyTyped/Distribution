package typings.activexWord.anon

import typings.activexWord.Word.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockType extends js.Object {
  val BlockType: String = js.native
  val Category: String = js.native
  val Name: String = js.native
  val Range: typings.activexWord.Word.Range = js.native
  val Template: String = js.native
}

object BlockType {
  @scala.inline
  def apply(BlockType: String, Category: String, Name: String, Range: Range, Template: String): BlockType = {
    val __obj = js.Dynamic.literal(BlockType = BlockType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockType]
  }
  @scala.inline
  implicit class BlockTypeOps[Self <: BlockType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlockType(value: String): Self = this.set("BlockType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: String): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("Template", value.asInstanceOf[js.Any])
  }
  
}

