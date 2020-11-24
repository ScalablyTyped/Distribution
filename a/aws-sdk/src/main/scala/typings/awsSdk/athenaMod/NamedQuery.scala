package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedQuery extends js.Object {
  
  /**
    * The database to which the query belongs.
    */
  var Database: DatabaseString = js.native
  
  /**
    * The query description.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The query name.
    */
  var Name: NameString = js.native
  
  /**
    * The unique identifier of the query.
    */
  var NamedQueryId: js.UndefOr[typings.awsSdk.athenaMod.NamedQueryId] = js.native
  
  /**
    * The SQL query statements that comprise the query.
    */
  var QueryString: typings.awsSdk.athenaMod.QueryString = js.native
  
  /**
    * The name of the workgroup that contains the named query.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}
object NamedQuery {
  
  @scala.inline
  def apply(Database: DatabaseString, Name: NameString, QueryString: QueryString): NamedQuery = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedQuery]
  }
  
  @scala.inline
  implicit class NamedQueryOps[Self <: NamedQuery] (val x: Self) extends AnyVal {
    
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
    def setDatabase(value: DatabaseString): Self = this.set("Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: QueryString): Self = this.set("QueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setNamedQueryId(value: NamedQueryId): Self = this.set("NamedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedQueryId: Self = this.set("NamedQueryId", js.undefined)
    
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = this.set("WorkGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkGroup: Self = this.set("WorkGroup", js.undefined)
  }
}
