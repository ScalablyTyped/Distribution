package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminologyDataLocation extends js.Object {
  /**
    * The location of the custom terminology data.
    */
  var Location: String
  /**
    * The repository type for the custom terminology data.
    */
  var RepositoryType: String
}

object TerminologyDataLocation {
  @scala.inline
  def apply(Location: String, RepositoryType: String): TerminologyDataLocation = {
    val __obj = js.Dynamic.literal(Location = Location, RepositoryType = RepositoryType)
  
    __obj.asInstanceOf[TerminologyDataLocation]
  }
}

