package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFilterResponse extends js.Object {
  /**
    * The name of the successfully created filter.
    */
  var Name: FilterName
}

object CreateFilterResponse {
  @scala.inline
  def apply(Name: FilterName): CreateFilterResponse = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[CreateFilterResponse]
  }
}

