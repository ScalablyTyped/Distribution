package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alias.
    */
  var AliasArn: js.UndefOr[FunctionArn] = js.undefined
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: js.UndefOr[Version] = js.undefined
  /**
    * The name of the alias.
    */
  var Name: js.UndefOr[Alias] = js.undefined
  /**
    * A unique identifier that changes when you update the alias.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
}

object AliasConfiguration {
  @scala.inline
  def apply(
    AliasArn: FunctionArn = null,
    Description: Description = null,
    FunctionVersion: Version = null,
    Name: Alias = null,
    RevisionId: String = null,
    RoutingConfig: AliasRoutingConfiguration = null
  ): AliasConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    if (RoutingConfig != null) __obj.updateDynamic("RoutingConfig")(RoutingConfig)
    __obj.asInstanceOf[AliasConfiguration]
  }
}

