package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerTargets extends js.Object {
  /**
    * Specifies DynamoDB targets.
    */
  var DynamoDBTargets: js.UndefOr[DynamoDBTargetList] = js.undefined
  /**
    * Specifies JDBC targets.
    */
  var JdbcTargets: js.UndefOr[JdbcTargetList] = js.undefined
  /**
    * Specifies Amazon S3 targets.
    */
  var S3Targets: js.UndefOr[S3TargetList] = js.undefined
}

object CrawlerTargets {
  @scala.inline
  def apply(
    DynamoDBTargets: DynamoDBTargetList = null,
    JdbcTargets: JdbcTargetList = null,
    S3Targets: S3TargetList = null
  ): CrawlerTargets = {
    val __obj = js.Dynamic.literal()
    if (DynamoDBTargets != null) __obj.updateDynamic("DynamoDBTargets")(DynamoDBTargets)
    if (JdbcTargets != null) __obj.updateDynamic("JdbcTargets")(JdbcTargets)
    if (S3Targets != null) __obj.updateDynamic("S3Targets")(S3Targets)
    __obj.asInstanceOf[CrawlerTargets]
  }
}

