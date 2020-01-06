package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var NamedQueryId: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.NamedQueryId] = js.native
  /**
    * The SQL query statements that comprise the query.
    */
  var QueryString: typings.awsDashSdk.clientsAthenaMod.QueryString = js.native
  /**
    * The name of the workgroup that contains the named query.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.native
}

object NamedQuery {
  @scala.inline
  def apply(
    Database: DatabaseString,
    Name: NameString,
    QueryString: QueryString,
    Description: DescriptionString = null,
    NamedQueryId: NamedQueryId = null,
    WorkGroup: WorkGroupName = null
  ): NamedQuery = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (NamedQueryId != null) __obj.updateDynamic("NamedQueryId")(NamedQueryId.asInstanceOf[js.Any])
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedQuery]
  }
}

