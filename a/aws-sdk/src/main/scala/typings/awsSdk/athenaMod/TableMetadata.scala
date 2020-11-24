package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableMetadata extends js.Object {
  
  /**
    * A list of the columns in the table.
    */
  var Columns: js.UndefOr[ColumnList] = js.native
  
  /**
    * The time that the table was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The last time the table was accessed.
    */
  var LastAccessTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the table.
    */
  var Name: NameString = js.native
  
  /**
    * A set of custom key/value pairs for table properties.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  
  /**
    * A list of the partition keys in the table.
    */
  var PartitionKeys: js.UndefOr[ColumnList] = js.native
  
  /**
    * The type of table. In Athena, only EXTERNAL_TABLE is supported.
    */
  var TableType: js.UndefOr[TableTypeString] = js.native
}
object TableMetadata {
  
  @scala.inline
  def apply(Name: NameString): TableMetadata = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableMetadata]
  }
  
  @scala.inline
  implicit class TableMetadataOps[Self <: TableMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("Columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: ColumnList): Self = this.set("Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("Columns", js.undefined)
    
    @scala.inline
    def setCreateTime(value: Timestamp): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    
    @scala.inline
    def setLastAccessTime(value: Timestamp): Self = this.set("LastAccessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessTime: Self = this.set("LastAccessTime", js.undefined)
    
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    
    @scala.inline
    def setPartitionKeysVarargs(value: Column*): Self = this.set("PartitionKeys", js.Array(value :_*))
    
    @scala.inline
    def setPartitionKeys(value: ColumnList): Self = this.set("PartitionKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartitionKeys: Self = this.set("PartitionKeys", js.undefined)
    
    @scala.inline
    def setTableType(value: TableTypeString): Self = this.set("TableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableType: Self = this.set("TableType", js.undefined)
  }
}
