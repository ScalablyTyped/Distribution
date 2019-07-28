package typings.anydbDashSql.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexEntry extends js.Object {
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
    val __obj = js.Dynamic.literal(Cardinality = Cardinality, Collation = Collation, Column_name = Column_name, Comment = Comment, Index_comment = Index_comment, Index_type = Index_type, Key_name = Key_name, Non_unique = Non_unique, Packed = Packed, Seq_in_index = Seq_in_index, Sub_part = Sub_part, Table = Table)
  
    __obj.asInstanceOf[IndexEntry]
  }
}

