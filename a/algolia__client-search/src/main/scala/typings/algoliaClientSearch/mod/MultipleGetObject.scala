package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleGetObject extends js.Object {
  /**
    * The attributes that should be returned with the object.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The index name.
    */
  val indexName: String
  /**
    * The object id.
    */
  val objectID: String
}

object MultipleGetObject {
  @scala.inline
  def apply(indexName: String, objectID: String, attributesToRetrieve: js.Array[String] = null): MultipleGetObject = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleGetObject]
  }
}

