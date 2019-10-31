package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agilite extends js.Object {
  var ApiKeys: typings.agilite.agiliteMod.ApiKeys
  var BPM: typings.agilite.agiliteMod.BPM
  var Connectors: typings.agilite.agiliteMod.Connectors
  var DataMappings: typings.agilite.agiliteMod.DataMappings
  var Files: typings.agilite.agiliteMod.Files
  var Keywords: typings.agilite.agiliteMod.Keywords
  var Numbering: typings.agilite.agiliteMod.Numbering
  var Roles: typings.agilite.agiliteMod.Roles
  var Templates: typings.agilite.agiliteMod.Templates
  var TierStructures: typings.agilite.agiliteMod.TierStructures
  var Utils: typings.agilite.agiliteMod.Utils
  var appName: typings.agilite.agiliteMod.appName
  var config: AgiliteConfig
  var reqType: typings.agilite.agiliteMod.reqType
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
    val __obj = js.Dynamic.literal(ApiKeys = ApiKeys, BPM = BPM, Connectors = Connectors, DataMappings = DataMappings, Files = Files, Keywords = Keywords, Numbering = Numbering, Roles = Roles, Templates = Templates, TierStructures = TierStructures, Utils = Utils, appName = appName, config = config, executeCRUDRequest = js.Any.fromFunction4(executeCRUDRequest), getConfig = js.Any.fromFunction0(getConfig), reqType = reqType)
  
    __obj.asInstanceOf[Agilite]
  }
}

