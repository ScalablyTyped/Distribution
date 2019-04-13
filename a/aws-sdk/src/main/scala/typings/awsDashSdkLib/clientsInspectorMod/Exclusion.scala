package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exclusion extends js.Object {
  /**
    * The ARN that specifies the exclusion.
    */
  var arn: Arn
  /**
    * The system-defined attributes for the exclusion.
    */
  var attributes: js.UndefOr[AttributeList] = js.undefined
  /**
    * The description of the exclusion.
    */
  var description: Text
  /**
    * The recommendation for the exclusion.
    */
  var recommendation: Text
  /**
    * The AWS resources for which the exclusion pertains.
    */
  var scopes: ScopeList
  /**
    * The name of the exclusion.
    */
  var title: Text
}

object Exclusion {
  @scala.inline
  def apply(
    arn: Arn,
    description: Text,
    recommendation: Text,
    scopes: ScopeList,
    title: Text,
    attributes: AttributeList = null
  ): Exclusion = {
    val __obj = js.Dynamic.literal(arn = arn, description = description, recommendation = recommendation, scopes = scopes, title = title)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[Exclusion]
  }
}

