package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agilite extends js.Object {
  var ApiKeys: typings.agilite.mod.ApiKeys
  var BPM: typings.agilite.mod.BPM
  var Connectors: typings.agilite.mod.Connectors
  var DataMappings: typings.agilite.mod.DataMappings
  var Files: typings.agilite.mod.Files
  var Keywords: typings.agilite.mod.Keywords
  var Numbering: typings.agilite.mod.Numbering
  var Roles: typings.agilite.mod.Roles
  var Templates: typings.agilite.mod.Templates
  var TierStructures: typings.agilite.mod.TierStructures
  var Utils: typings.agilite.mod.Utils
  var appName: typings.agilite.mod.appName
  var config: AgiliteConfig
  var reqType: typings.agilite.mod.reqType
  def executeCRUDRequest(appName: String, reqType: String, data: js.Any, headers: js.Any): js.Any
  def getConfig(): AgiliteConfig
}

object Agilite {
  @scala.inline
  def apply(
    ApiKeys: ApiKeys,
    BPM: BPM,
    Connectors: Connectors,
    DataMappings: DataMappings,
    Files: Files,
    Keywords: Keywords,
    Numbering: Numbering,
    Roles: Roles,
    Templates: Templates,
    TierStructures: TierStructures,
    Utils: Utils,
    appName: appName,
    config: AgiliteConfig,
    executeCRUDRequest: (String, String, js.Any, js.Any) => js.Any,
    getConfig: () => AgiliteConfig,
    reqType: reqType
  ): Agilite = {
    val __obj = js.Dynamic.literal(ApiKeys = ApiKeys.asInstanceOf[js.Any], BPM = BPM.asInstanceOf[js.Any], Connectors = Connectors.asInstanceOf[js.Any], DataMappings = DataMappings.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Numbering = Numbering.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any], Templates = Templates.asInstanceOf[js.Any], TierStructures = TierStructures.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], executeCRUDRequest = js.Any.fromFunction4(executeCRUDRequest), getConfig = js.Any.fromFunction0(getConfig), reqType = reqType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agilite]
  }
}

