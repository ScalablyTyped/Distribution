package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Highlight extends js.Object {
  /** The description of the highlight. */
  var description: String
  /** The duration of the highlight. */
  var duration: Double
  /** The imageURL of the highlight. */
  var imageURL: String
  /** The name of the highlight. */
  var name: String
  /** The starttime of the highlight. */
  var starttime: Double
}

object Highlight {
  @scala.inline
  def apply(description: String, duration: Double, imageURL: String, name: String, starttime: Double): Highlight = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], imageURL = imageURL.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
}

