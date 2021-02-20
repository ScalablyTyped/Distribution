package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedQuery extends StObject {
  
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
  implicit class NamedQueryMutableBuilder[Self <: NamedQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: DatabaseString): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedQueryIdUndefined: Self = StObject.set(x, "NamedQueryId", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
