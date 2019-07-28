package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the given Amazon Comprehend resource you are querying.
    */
  var ResourceArn: js.UndefOr[ComprehendArn] = js.undefined
  /**
    * Tags associated with the Amazon Comprehend resource being queried. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(ResourceArn: ComprehendArn = null, Tags: TagList = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

