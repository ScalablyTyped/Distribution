package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agilite extends js.Object {
  var ApiKeys: typings.agilite.mod.ApiKeys = js.native
  var BPM: typings.agilite.mod.BPM = js.native
  var Connectors: typings.agilite.mod.Connectors = js.native
  var DataMappings: typings.agilite.mod.DataMappings = js.native
  var Files: typings.agilite.mod.Files = js.native
  var Keywords: typings.agilite.mod.Keywords = js.native
  var Numbering: typings.agilite.mod.Numbering = js.native
  var Roles: typings.agilite.mod.Roles = js.native
  var Templates: typings.agilite.mod.Templates = js.native
  var TierStructures: typings.agilite.mod.TierStructures = js.native
  var Utils: typings.agilite.mod.Utils = js.native
  var appName: typings.agilite.mod.appName = js.native
  var config: AgiliteConfig = js.native
  var reqType: typings.agilite.mod.reqType = js.native
  def executeCRUDRequest(appName: String, reqType: String, data: js.Any, headers: js.Any): js.Any = js.native
  def getConfig(): AgiliteConfig = js.native
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
  @scala.inline
  implicit class AgiliteOps[Self <: Agilite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiKeys(value: ApiKeys): Self = this.set("ApiKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setBPM(value: BPM): Self = this.set("BPM", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectors(value: Connectors): Self = this.set("Connectors", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataMappings(value: DataMappings): Self = this.set("DataMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiles(value: Files): Self = this.set("Files", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeywords(value: Keywords): Self = this.set("Keywords", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumbering(value: Numbering): Self = this.set("Numbering", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoles(value: Roles): Self = this.set("Roles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplates(value: Templates): Self = this.set("Templates", value.asInstanceOf[js.Any])
    @scala.inline
    def setTierStructures(value: TierStructures): Self = this.set("TierStructures", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtils(value: Utils): Self = this.set("Utils", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppName(value: appName): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: AgiliteConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecuteCRUDRequest(value: (String, String, js.Any, js.Any) => js.Any): Self = this.set("executeCRUDRequest", js.Any.fromFunction4(value))
    @scala.inline
    def setGetConfig(value: () => AgiliteConfig): Self = this.set("getConfig", js.Any.fromFunction0(value))
    @scala.inline
    def setReqType(value: reqType): Self = this.set("reqType", value.asInstanceOf[js.Any])
  }
  
}

