package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceTableFeatureDetails extends js.Object {
  /**
    * Represents the GSI properties for the table when the backup was created. It includes the IndexName, KeySchema, Projection and ProvisionedThroughput for the GSIs on the table at the time of backup. 
    */
  var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexes] = js.undefined
  /**
    * Represents the LSI properties for the table when the backup was created. It includes the IndexName, KeySchema and Projection for the LSIs on the table at the time of backup. 
    */
  var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexes] = js.undefined
  /**
    * The description of the server-side encryption status on the table when the backup was created.
    */
  var SSEDescription: js.UndefOr[SSEDescription] = js.undefined
  /**
    * Stream settings on the table when the backup was created.
    */
  var StreamDescription: js.UndefOr[StreamSpecification] = js.undefined
  /**
    * Time to Live settings on the table when the backup was created.
    */
  var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription] = js.undefined
}

