package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNamedQueryInput extends js.Object {
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
  implicit class CreateNamedQueryInputOps[Self <: CreateNamedQueryInput] (val x: Self) extends AnyVal {
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
    def setClientRequestToken(value: IdempotencyToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = this.set("WorkGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkGroup: Self = this.set("WorkGroup", js.undefined)
  }
  
}

