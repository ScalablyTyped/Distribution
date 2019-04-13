package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterAttribute extends js.Object {
  /**
    * The field identifier.
    */
  var key: attributeNameString
  /**
    * The field value, expressed as a String.
    */
  var stringValue: attributeValueString
}

object ParameterAttribute {
  @scala.inline
  def apply(key: attributeNameString, stringValue: attributeValueString): ParameterAttribute = {
    val __obj = js.Dynamic.literal(key = key, stringValue = stringValue)
  
    __obj.asInstanceOf[ParameterAttribute]
  }
}

