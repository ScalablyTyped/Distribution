package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusionPreview extends js.Object {
  /**
    * The system-defined attributes for the exclusion preview.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  /**
    * The description of the exclusion preview.
    */
  var description: Text = js.native
  /**
    * The recommendation for the exclusion preview.
    */
  var recommendation: Text = js.native
  /**
    * The AWS resources for which the exclusion preview pertains.
    */
  var scopes: ScopeList = js.native
  /**
    * The name of the exclusion preview.
    */
  var title: Text = js.native
}

object ExclusionPreview {
  @scala.inline
  def apply(
    description: Text,
    recommendation: Text,
    scopes: ScopeList,
    title: Text,
    attributes: AttributeList = null
  ): ExclusionPreview = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusionPreview]
  }
}

