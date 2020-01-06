package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exclusion extends js.Object {
  /**
    * The ARN that specifies the exclusion.
    */
  var arn: Arn = js.native
  /**
    * The system-defined attributes for the exclusion.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  /**
    * The description of the exclusion.
    */
  var description: Text = js.native
  /**
    * The recommendation for the exclusion.
    */
  var recommendation: Text = js.native
  /**
    * The AWS resources for which the exclusion pertains.
    */
  var scopes: ScopeList = js.native
  /**
    * The name of the exclusion.
    */
  var title: Text = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
}

