package typings.anydbSql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexEntry extends js.Object {
  
  var Cardinality: Double = js.native
  
  var Collation: String = js.native
  
  var Column_name: String = js.native
  
  var Comment: String = js.native
  
  var Index_comment: String = js.native
  
  var Index_type: String = js.native
  
  var Key_name: String = js.native
  
  var Non_unique: Boolean = js.native
  
  var Packed: Boolean = js.native
  
  var Seq_in_index: Double = js.native
  
  var Sub_part: String = js.native
  
  var Table: String = js.native
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
  implicit class IndexEntryOps[Self <: IndexEntry] (val x: Self) extends AnyVal {
    
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
    def setCardinality(value: Double): Self = this.set("Cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollation(value: String): Self = this.set("Collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_name(value: String): Self = this.set("Column_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex_comment(value: String): Self = this.set("Index_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex_type(value: String): Self = this.set("Index_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_name(value: String): Self = this.set("Key_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNon_unique(value: Boolean): Self = this.set("Non_unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacked(value: Boolean): Self = this.set("Packed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq_in_index(value: Double): Self = this.set("Seq_in_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub_part(value: String): Self = this.set("Sub_part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = this.set("Table", value.asInstanceOf[js.Any])
  }
}
