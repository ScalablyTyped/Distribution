package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagOptionInput extends js.Object {
  /**
    * The TagOption identifier.
    */
  var Id: TagOptionId
}

object DeleteTagOptionInput {
  @scala.inline
  def apply(Id: TagOptionId): DeleteTagOptionInput = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteTagOptionInput]
  }
}

