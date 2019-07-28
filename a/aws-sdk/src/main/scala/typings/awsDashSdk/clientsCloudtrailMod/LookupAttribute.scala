package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupAttribute extends js.Object {
  /**
    * Specifies an attribute on which to filter the events returned.
    */
  var AttributeKey: LookupAttributeKey
  /**
    * Specifies a value for the specified AttributeKey.
    */
  var AttributeValue: String
}

object LookupAttribute {
  @scala.inline
  def apply(AttributeKey: LookupAttributeKey, AttributeValue: String): LookupAttribute = {
    val __obj = js.Dynamic.literal(AttributeKey = AttributeKey.asInstanceOf[js.Any], AttributeValue = AttributeValue)
  
    __obj.asInstanceOf[LookupAttribute]
  }
}

