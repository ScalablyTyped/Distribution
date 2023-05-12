package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  /**
    * The block represents a line of text or one word of text.   WORD - A word that's detected on a document page. A word is one or more ISO basic Latin script characters that aren't separated by spaces.   LINE - A string of tab-delimited, contiguous words that are detected on a document page  
    */
  var BlockType: js.UndefOr[typings.awsSdk.clientsComprehendMod.BlockType] = js.undefined
  
  /**
    * Co-ordinates of the rectangle or polygon that contains the text.
    */
  var Geometry: js.UndefOr[typings.awsSdk.clientsComprehendMod.Geometry] = js.undefined
  
  /**
    * Unique identifier for the block.
    */
  var Id: js.UndefOr[String] = js.undefined
  
  /**
    * Page number where the block appears.
    */
  var Page: js.UndefOr[Integer] = js.undefined
  
  /**
    * A list of child blocks of the current block. For example, a LINE object has child blocks for each WORD block that's part of the line of text. 
    */
  var Relationships: js.UndefOr[ListOfRelationships] = js.undefined
  
  /**
    * The word or line of text extracted from the block.
    */
  var Text: js.UndefOr[String] = js.undefined
}
object Block {
  
  inline def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    inline def setBlockType(value: BlockType): Self = StObject.set(x, "BlockType", value.asInstanceOf[js.Any])
    
    inline def setBlockTypeUndefined: Self = StObject.set(x, "BlockType", js.undefined)
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setPage(value: Integer): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    inline def setRelationships(value: ListOfRelationships): Self = StObject.set(x, "Relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "Relationships", js.undefined)
    
    inline def setRelationshipsVarargs(value: RelationshipsListItem*): Self = StObject.set(x, "Relationships", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
