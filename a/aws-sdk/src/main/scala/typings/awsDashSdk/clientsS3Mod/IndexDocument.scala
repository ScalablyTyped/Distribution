package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexDocument extends js.Object {
  /**
    * A suffix that is appended to a request that is for a directory on the website endpoint (for example,if the suffix is index.html and you make a request to samplebucket/images/ the data that is returned will be for the object with the key name images/index.html) The suffix must not be empty and must not include a slash character.
    */
  var Suffix: typings.awsDashSdk.clientsS3Mod.Suffix = js.native
}

object IndexDocument {
  @scala.inline
  def apply(Suffix: Suffix): IndexDocument = {
    val __obj = js.Dynamic.literal(Suffix = Suffix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IndexDocument]
  }
}

