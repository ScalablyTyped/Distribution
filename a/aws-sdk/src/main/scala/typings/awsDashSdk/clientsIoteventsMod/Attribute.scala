package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * An expression that specifies an attribute-value pair in a JSON structure. Use this to specify an attribute from the JSON payload that is made available by the input. Inputs are derived from messages sent to the AWS IoT Events system (BatchPutMessage). Each such message contains a JSON payload, and the attribute (and its paired value) specified here are available for use in the "condition" expressions used by detectors.  Syntax: &lt;field-name&gt;.&lt;field-name&gt;... 
    */
  var jsonPath: AttributeJsonPath
}

object Attribute {
  @scala.inline
  def apply(jsonPath: AttributeJsonPath): Attribute = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath)
  
    __obj.asInstanceOf[Attribute]
  }
}

