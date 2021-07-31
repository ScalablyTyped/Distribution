package typings.anydbSql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexEntry extends StObject {
  
  var Cardinality: Double
  
  var Collation: String
  
  var Column_name: String
  
  var Comment: String
  
  var Index_comment: String
  
  var Index_type: String
  
  var Key_name: String
  
  var Non_unique: Boolean
  
  var Packed: Boolean
  
  var Seq_in_index: Double
  
  var Sub_part: String
  
  var Table: String
}
object IndexEntry {
  
  @scala.inline
  def apply(
    Cardinality: Double,
    Collation: String,
    Column_name: String,
    Comment: String,
    Index_comment: String,
    Index_type: String,
    Key_name: String,
    Non_unique: Boolean,
    Packed: Boolean,
    Seq_in_index: Double,
    Sub_part: String,
    Table: String
  ): IndexEntry = {
    val __obj = js.Dynamic.literal(Cardinality = Cardinality.asInstanceOf[js.Any], Collation = Collation.asInstanceOf[js.Any], Column_name = Column_name.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Index_comment = Index_comment.asInstanceOf[js.Any], Index_type = Index_type.asInstanceOf[js.Any], Key_name = Key_name.asInstanceOf[js.Any], Non_unique = Non_unique.asInstanceOf[js.Any], Packed = Packed.asInstanceOf[js.Any], Seq_in_index = Seq_in_index.asInstanceOf[js.Any], Sub_part = Sub_part.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexEntry]
  }
  
  @scala.inline
  implicit class IndexEntryMutableBuilder[Self <: IndexEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardinality(value: Double): Self = StObject.set(x, "Cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollation(value: String): Self = StObject.set(x, "Collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_name(value: String): Self = StObject.set(x, "Column_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex_comment(value: String): Self = StObject.set(x, "Index_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex_type(value: String): Self = StObject.set(x, "Index_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_name(value: String): Self = StObject.set(x, "Key_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNon_unique(value: Boolean): Self = StObject.set(x, "Non_unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacked(value: Boolean): Self = StObject.set(x, "Packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq_in_index(value: Double): Self = StObject.set(x, "Seq_in_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub_part(value: String): Self = StObject.set(x, "Sub_part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
  }
}
