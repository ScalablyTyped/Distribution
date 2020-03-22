package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectsOptions extends js.Object {
  /**
    * The attributes that should come with witch object.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
}

object GetObjectsOptions {
  @scala.inline
  def apply(attributesToRetrieve: js.Array[String] = null): GetObjectsOptions = {
    val __obj = js.Dynamic.literal()
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsOptions]
  }
}

