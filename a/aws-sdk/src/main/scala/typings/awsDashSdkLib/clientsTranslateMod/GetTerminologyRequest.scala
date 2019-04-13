package typings
package awsDashSdkLib.clientsTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTerminologyRequest extends js.Object {
  /**
    * The name of the custom terminology being retrieved.
    */
  var Name: ResourceName
  /**
    * The data format of the custom terminology being retrieved, either CSV or TMX.
    */
  var TerminologyDataFormat: awsDashSdkLib.clientsTranslateMod.TerminologyDataFormat
}

object GetTerminologyRequest {
  @scala.inline
  def apply(Name: ResourceName, TerminologyDataFormat: TerminologyDataFormat): GetTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name, TerminologyDataFormat = TerminologyDataFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTerminologyRequest]
  }
}

