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
  def apply(
    Database: DatabaseString,
    Name: NameString,
    QueryString: QueryString,
    ClientRequestToken: IdempotencyToken = null,
    Description: DescriptionString = null,
    WorkGroup: WorkGroupName = null
  ): CreateNamedQueryInput = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamedQueryInput]
  }
}

