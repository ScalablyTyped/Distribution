package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    * The data source's ARN.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The database name.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * The data source's type, AutoSelectOpsworksMysqlInstance, OpsworksMysqlInstance, RdsDbInstance, or None.
    */
  var Type: js.UndefOr[String] = js.native
}

object DataSource {
  @scala.inline
  def apply(Arn: String = null, DatabaseName: String = null, Type: String = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

