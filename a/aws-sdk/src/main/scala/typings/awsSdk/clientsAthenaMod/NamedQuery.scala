package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedQuery extends StObject {
  
  /**
    * The database to which the query belongs.
    */
  var Database: DatabaseString
  
  /**
    * The query description.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The query name.
    */
  var Name: NameString
  
  /**
    * The unique identifier of the query.
    */
  var NamedQueryId: js.UndefOr[typings.awsSdk.clientsAthenaMod.NamedQueryId] = js.undefined
  
  /**
    * The SQL statements that make up the query.
    */
  var QueryString: typings.awsSdk.clientsAthenaMod.QueryString
  
  /**
    * The name of the workgroup that contains the named query.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}
object NamedQuery {
  
  inline def apply(Database: DatabaseString, Name: NameString, QueryString: QueryString): NamedQuery = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedQuery]
  }
  
  extension [Self <: NamedQuery](x: Self) {
    
    inline def setDatabase(value: DatabaseString): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
    
    inline def setNamedQueryIdUndefined: Self = StObject.set(x, "NamedQueryId", js.undefined)
    
    inline def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
