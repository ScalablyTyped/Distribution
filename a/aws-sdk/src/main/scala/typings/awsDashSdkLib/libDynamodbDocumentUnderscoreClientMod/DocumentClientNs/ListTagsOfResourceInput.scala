package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListTagsOfResourceInput extends js.Object {
  /**
       * An optional string that, if supplied, must be copied from the output of a previous call to ListTagOfResource. When provided in this manner, this API fetches the next page of results.
       */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  /**
       * The Amazon DynamoDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
       */
  var ResourceArn: ResourceArnString
}

