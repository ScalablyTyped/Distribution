package typings.awsDashSdk.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTerminologyRequest extends js.Object {
  /**
    * The name of the custom terminology being deleted. 
    */
  var Name: ResourceName
}

object DeleteTerminologyRequest {
  @scala.inline
  def apply(Name: ResourceName): DeleteTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteTerminologyRequest]
  }
}

