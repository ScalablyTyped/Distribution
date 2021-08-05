package typings.activexWord.anon

import typings.activexWord.Word.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockType extends StObject {
  
  val BlockType: String
  
  val Category: String
  
  val Name: String
  
  val Range: typings.activexWord.Word.Range
  
  val Template: String
}
object BlockType {
  
  inline def apply(BlockType: String, Category: String, Name: String, Range: Range, Template: String): BlockType = {
    val __obj = js.Dynamic.literal(BlockType = BlockType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockType]
  }
  
  extension [Self <: BlockType](x: Self) {
    
    inline def setBlockType(value: String): Self = StObject.set(x, "BlockType", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: String): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
  }
}
