package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminologyDataLocation extends js.Object {
  /**
    * The location of the custom terminology data.
    */
  var Location: String = js.native
  /**
    * The repository type for the custom terminology data.
    */
  var RepositoryType: String = js.native
}

object TerminologyDataLocation {
  @scala.inline
  def apply(Location: String, RepositoryType: String): TerminologyDataLocation = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], RepositoryType = RepositoryType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TerminologyDataLocation]
  }
}

