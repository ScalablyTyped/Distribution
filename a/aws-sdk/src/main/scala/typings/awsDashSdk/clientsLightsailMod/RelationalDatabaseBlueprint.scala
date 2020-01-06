package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseBlueprint extends js.Object {
  /**
    * The ID for the database blueprint.
    */
  var blueprintId: js.UndefOr[String] = js.native
  /**
    * The database software of the database blueprint (for example, MySQL).
    */
  var engine: js.UndefOr[RelationalDatabaseEngine] = js.native
  /**
    * The description of the database engine for the database blueprint.
    */
  var engineDescription: js.UndefOr[String] = js.native
  /**
    * The database engine version for the database blueprint (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[String] = js.native
  /**
    * The description of the database engine version for the database blueprint.
    */
  var engineVersionDescription: js.UndefOr[String] = js.native
  /**
    * A Boolean value indicating whether the engine version is the default for the database blueprint.
    */
  var isEngineDefault: js.UndefOr[Boolean] = js.native
}

object RelationalDatabaseBlueprint {
  @scala.inline
  def apply(
    blueprintId: String = null,
    engine: RelationalDatabaseEngine = null,
    engineDescription: String = null,
    engineVersion: String = null,
    engineVersionDescription: String = null,
    isEngineDefault: js.UndefOr[Boolean] = js.undefined
  ): RelationalDatabaseBlueprint = {
    val __obj = js.Dynamic.literal()
    if (blueprintId != null) __obj.updateDynamic("blueprintId")(blueprintId.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineDescription != null) __obj.updateDynamic("engineDescription")(engineDescription.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (engineVersionDescription != null) __obj.updateDynamic("engineVersionDescription")(engineVersionDescription.asInstanceOf[js.Any])
    if (!js.isUndefined(isEngineDefault)) __obj.updateDynamic("isEngineDefault")(isEngineDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseBlueprint]
  }
}

