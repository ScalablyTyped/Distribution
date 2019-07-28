package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParametersRequest extends js.Object {
  /**
    * The names of the parameters to delete.
    */
  var Names: ParameterNameList
}

object DeleteParametersRequest {
  @scala.inline
  def apply(Names: ParameterNameList): DeleteParametersRequest = {
    val __obj = js.Dynamic.literal(Names = Names)
  
    __obj.asInstanceOf[DeleteParametersRequest]
  }
}

