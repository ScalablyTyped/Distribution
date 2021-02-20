package typings.activexWord.anon

import typings.activexWord.Word.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockType extends StObject {
  
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
  implicit class BlockTypeMutableBuilder[Self <: BlockType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockType(value: String): Self = StObject.set(x, "BlockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
  }
}
