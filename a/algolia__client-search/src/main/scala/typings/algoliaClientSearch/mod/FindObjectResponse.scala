package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindObjectResponse[TObject] extends js.Object {
  /**
    * The found object.
    */
  val `object`: TObject with ObjectWithObjectID
  /**
    * The page where the object was found.
    */
  val page: Double
  /**
    * The position where the object was found.
    */
  val position: Double
}

object FindObjectResponse {
  @scala.inline
  def apply[TObject](`object`: TObject with ObjectWithObjectID, page: Double, position: Double): FindObjectResponse[TObject] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindObjectResponse[TObject]]
  }
}

