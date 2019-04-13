package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /**
    * The data source's ARN.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * The database name.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The data source's type, AutoSelectOpsworksMysqlInstance, OpsworksMysqlInstance, RdsDbInstance, or None.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(Arn: String = null, DatabaseName: String = null, Type: String = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[DataSource]
  }
}

