package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Blocks are modular and reusable pieces of data or content. A block has primary user
  * (indicated by user_id) and can only be edited by the user who created it.
  * However, any block can be reused in multiple channels (this is called a connection).
  * The channels a block appears in across Arena are listed in the blocks' connections attribute.
  */
trait Block extends StObject {
  
  /**
    * This will always be "Block"
    */
  var base_class: String
  
  /**
    * The type of block. Can be "Image", "Text", "Link", "Media", or "Attachment"
    */
  var `class`: BlockType
  
  /**
    * The number of comments on a block
    */
  var comment_count: Double
  
  /**
    * An array of User representations of each of the channels the block appears in
    */
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  /**
    * If the block is of class "Text", this will be the text content as markdown
    */
  var content: String | Null
  
  /**
    * If the block is of class "Text", this will be the text content as HTML
    */
  var content_html: String | Null
  
  /**
    * Timestamp when the block was created
    */
  var created_at: Timestamp
  
  /**
    * This is used for captioning any type of block. Returns markdown.
    */
  var description: String | Null
  
  /**
    * This is used for captioning any type of block. Returns HTML
    */
  var description_html: String | Null
  
  /**
    * If the title is present on the block, this will be identical to the title.
    * Otherwise it will be a truncated string of the *description* or *content*.
    * If neither of those are present, it will be "Untitled"
    */
  var generated_title: String
  
  /**
    * The internal ID of the block
    */
  var id: Double
  
  /**
    * If the Block is of class "Image" or "Link",
    * this will be a User representation of the various sizes of images that Arena provides
    * (in the case of a "Link" it will be a screenshot of the website).
    */
  var image: Image | Null
  
  /**
    * If the Block is saved from somewhere on the web,
    * this returns a User representation of the source
    */
  var source: Source | Null
  
  /**
    * Represents the state of the blocks processing lifecycle.
    * (this will most often "Available" but can also be "Failure", "Processed", "Processing")
    */
  var state: String
  
  /**
    * The title of the block
    */
  var title: String | Null
  
  /**
    * Timestamp when the block was last updated
    */
  var updated_at: Timestamp
  
  /**
    * More information on the channel author
    */
  var user: User
}
object Block {
  
  inline def apply(
    base_class: String,
    `class`: BlockType,
    comment_count: Double,
    created_at: Timestamp,
    generated_title: String,
    id: Double,
    state: String,
    updated_at: Timestamp,
    user: User
  ): Block = {
    val __obj = js.Dynamic.literal(base_class = base_class.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], generated_title = generated_title.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], content = null, content_html = null, description = null, description_html = null, image = null, source = null, title = null)
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setBase_class(value: String): Self = StObject.set(x, "base_class", value.asInstanceOf[js.Any])
    
    inline def setClass(value: BlockType): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContent_html(value: String): Self = StObject.set(x, "content_html", value.asInstanceOf[js.Any])
    
    inline def setContent_htmlNull: Self = StObject.set(x, "content_html", null)
    
    inline def setCreated_at(value: Timestamp): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescription_html(value: String): Self = StObject.set(x, "description_html", value.asInstanceOf[js.Any])
    
    inline def setDescription_htmlNull: Self = StObject.set(x, "description_html", null)
    
    inline def setGenerated_title(value: String): Self = StObject.set(x, "generated_title", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setUpdated_at(value: Timestamp): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
