package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetResult extends js.Object {
  /**
    * The key for the facet values. This is the same as the DocumentAttributeKey provided in the query.
    */
  var DocumentAttributeKey: js.UndefOr[typings.awsDashSdk.clientsKendraMod.DocumentAttributeKey] = js.native
  /**
    * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents that share the key value.
    */
  var DocumentAttributeValueCountPairs: js.UndefOr[DocumentAttributeValueCountPairList] = js.native
}

object FacetResult {
  @scala.inline
  def apply(
    DocumentAttributeKey: DocumentAttributeKey = null,
    DocumentAttributeValueCountPairs: DocumentAttributeValueCountPairList = null
  ): FacetResult = {
    val __obj = js.Dynamic.literal()
    if (DocumentAttributeKey != null) __obj.updateDynamic("DocumentAttributeKey")(DocumentAttributeKey.asInstanceOf[js.Any])
    if (DocumentAttributeValueCountPairs != null) __obj.updateDynamic("DocumentAttributeValueCountPairs")(DocumentAttributeValueCountPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetResult]
  }
}

