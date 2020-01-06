package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tagging extends js.Object {
  /**
    * A collection for a set of tags
    */
  var TagSet: typings.awsDashSdk.clientsS3Mod.TagSet = js.native
}

object Tagging {
  @scala.inline
  def apply(TagSet: TagSet): Tagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tagging]
  }
}

