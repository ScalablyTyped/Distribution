package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNamedQueryInput extends StObject {
  
  /**
    * A unique case-sensitive string used to ensure the request to create the query is idempotent (executes only once). If another CreateNamedQuery request is received, the same response is returned and another query is not created. If a parameter has changed, for example, the QueryString, an error is returned.  This token is listed as not required because AWS SDKs (for example the AWS SDK for Java) auto-generate the token for users. If you are not using the AWS SDK or the AWS CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[IdempotencyToken] = js.native
  
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
    * The contents of the query with all query statements.
    */
  var QueryString: typings.awsSdk.athenaMod.QueryString = js.native
  
  /**
    * The name of the workgroup in which the named query is being created.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}
object CreateNamedQueryInput {
  
  @scala.inline
  def apply(Database: DatabaseString, Name: NameString, QueryString: QueryString): CreateNamedQueryInput = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamedQueryInput]
  }
  
  @scala.inline
  implicit class CreateNamedQueryInputMutableBuilder[Self <: CreateNamedQueryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: IdempotencyToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setDatabase(value: DatabaseString): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: QueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
