package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeTarget extends js.Object {
  /**
    * A value that indicates whether the target version is applied to any source DB instances that have AutoMinorVersionUpgrade set to true.
    */
  var AutoUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * The version of the database engine that a DB instance can be upgraded to.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The name of the upgrade target database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * The version number of the upgrade target database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * A value that indicates whether a database engine is upgraded to a major version.
    */
  var IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
}

object UpgradeTarget {
  @scala.inline
  def apply(
    AutoUpgrade: js.UndefOr[Boolean] = js.undefined,
    Description: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    IsMajorVersionUpgrade: js.UndefOr[Boolean] = js.undefined
  ): UpgradeTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoUpgrade)) __obj.updateDynamic("AutoUpgrade")(AutoUpgrade)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(IsMajorVersionUpgrade)) __obj.updateDynamic("IsMajorVersionUpgrade")(IsMajorVersionUpgrade)
    __obj.asInstanceOf[UpgradeTarget]
  }
}

