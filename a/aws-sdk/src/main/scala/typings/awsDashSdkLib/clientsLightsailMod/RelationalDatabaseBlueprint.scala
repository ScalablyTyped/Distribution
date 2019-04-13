package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabaseBlueprint extends js.Object {
  /**
    * The ID for the database blueprint.
    */
  var blueprintId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The database software of the database blueprint (for example, MySQL).
    */
  var engine: js.UndefOr[RelationalDatabaseEngine] = js.undefined
  /**
    * The description of the database engine for the database blueprint.
    */
  var engineDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The database engine version for the database blueprint (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The description of the database engine version for the database blueprint.
    */
  var engineVersionDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Boolean value indicating whether the engine version is the default for the database blueprint.
    */
  var isEngineDefault: js.UndefOr[scala.Boolean] = js.undefined
}

object RelationalDatabaseBlueprint {
  @scala.inline
  def apply(
    blueprintId: java.lang.String = null,
    engine: RelationalDatabaseEngine = null,
    engineDescription: java.lang.String = null,
    engineVersion: java.lang.String = null,
    engineVersionDescription: java.lang.String = null,
    isEngineDefault: js.UndefOr[scala.Boolean] = js.undefined
  ): RelationalDatabaseBlueprint = {
    val __obj = js.Dynamic.literal()
    if (blueprintId != null) __obj.updateDynamic("blueprintId")(blueprintId)
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineDescription != null) __obj.updateDynamic("engineDescription")(engineDescription)
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion)
    if (engineVersionDescription != null) __obj.updateDynamic("engineVersionDescription")(engineVersionDescription)
    if (!js.isUndefined(isEngineDefault)) __obj.updateDynamic("isEngineDefault")(isEngineDefault)
    __obj.asInstanceOf[RelationalDatabaseBlueprint]
  }
}

