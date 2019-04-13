package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedQuery extends js.Object {
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
  var NamedQueryId: js.UndefOr[NamedQueryId] = js.undefined
  /**
    * The SQL query statements that comprise the query.
    */
  var QueryString: awsDashSdkLib.clientsAthenaMod.QueryString
  /**
    * The name of the workgroup that contains the named query.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
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
    val __obj = js.Dynamic.literal(Database = Database, Name = Name, QueryString = QueryString)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (NamedQueryId != null) __obj.updateDynamic("NamedQueryId")(NamedQueryId)
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup)
    __obj.asInstanceOf[NamedQuery]
  }
}

