package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsOfResourceOutput extends js.Object {
  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call ListTagsOfResource again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  /**
    * The tags currently associated with the Amazon DynamoDB resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

