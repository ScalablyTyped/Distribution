package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait appName extends js.Object {
  var MODULE_KEY_API_KEYS: String = js.native
  var MODULE_KEY_BOT_BUILDER: String = js.native
  var MODULE_KEY_BPM: String = js.native
  var MODULE_KEY_CONNECTORS: String = js.native
  var MODULE_KEY_DATA_MAPPING: String = js.native
  var MODULE_KEY_FILES: String = js.native
  var MODULE_KEY_KEYWORDS: String = js.native
  var MODULE_KEY_NUMBERING: String = js.native
  var MODULE_KEY_ROLES: String = js.native
  var MODULE_KEY_TEMPLATES: String = js.native
  var MODULE_KEY_TIER_STRUCTURES: String = js.native
  var MODULE_KEY_UTILS: String = js.native
}

object appName {
  @scala.inline
  def apply(
    MODULE_KEY_API_KEYS: String,
    MODULE_KEY_BOT_BUILDER: String,
    MODULE_KEY_BPM: String,
    MODULE_KEY_CONNECTORS: String,
    MODULE_KEY_DATA_MAPPING: String,
    MODULE_KEY_FILES: String,
    MODULE_KEY_KEYWORDS: String,
    MODULE_KEY_NUMBERING: String,
    MODULE_KEY_ROLES: String,
    MODULE_KEY_TEMPLATES: String,
    MODULE_KEY_TIER_STRUCTURES: String,
    MODULE_KEY_UTILS: String
  ): appName = {
    val __obj = js.Dynamic.literal(MODULE_KEY_API_KEYS = MODULE_KEY_API_KEYS.asInstanceOf[js.Any], MODULE_KEY_BOT_BUILDER = MODULE_KEY_BOT_BUILDER.asInstanceOf[js.Any], MODULE_KEY_BPM = MODULE_KEY_BPM.asInstanceOf[js.Any], MODULE_KEY_CONNECTORS = MODULE_KEY_CONNECTORS.asInstanceOf[js.Any], MODULE_KEY_DATA_MAPPING = MODULE_KEY_DATA_MAPPING.asInstanceOf[js.Any], MODULE_KEY_FILES = MODULE_KEY_FILES.asInstanceOf[js.Any], MODULE_KEY_KEYWORDS = MODULE_KEY_KEYWORDS.asInstanceOf[js.Any], MODULE_KEY_NUMBERING = MODULE_KEY_NUMBERING.asInstanceOf[js.Any], MODULE_KEY_ROLES = MODULE_KEY_ROLES.asInstanceOf[js.Any], MODULE_KEY_TEMPLATES = MODULE_KEY_TEMPLATES.asInstanceOf[js.Any], MODULE_KEY_TIER_STRUCTURES = MODULE_KEY_TIER_STRUCTURES.asInstanceOf[js.Any], MODULE_KEY_UTILS = MODULE_KEY_UTILS.asInstanceOf[js.Any])
    __obj.asInstanceOf[appName]
  }
  @scala.inline
  implicit class appNameOps[Self <: appName] (val x: Self) extends AnyVal {
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
    def setMODULE_KEY_API_KEYS(value: String): Self = this.set("MODULE_KEY_API_KEYS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_BOT_BUILDER(value: String): Self = this.set("MODULE_KEY_BOT_BUILDER", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_BPM(value: String): Self = this.set("MODULE_KEY_BPM", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_CONNECTORS(value: String): Self = this.set("MODULE_KEY_CONNECTORS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_DATA_MAPPING(value: String): Self = this.set("MODULE_KEY_DATA_MAPPING", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_FILES(value: String): Self = this.set("MODULE_KEY_FILES", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_KEYWORDS(value: String): Self = this.set("MODULE_KEY_KEYWORDS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_NUMBERING(value: String): Self = this.set("MODULE_KEY_NUMBERING", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_ROLES(value: String): Self = this.set("MODULE_KEY_ROLES", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_TEMPLATES(value: String): Self = this.set("MODULE_KEY_TEMPLATES", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_TIER_STRUCTURES(value: String): Self = this.set("MODULE_KEY_TIER_STRUCTURES", value.asInstanceOf[js.Any])
    @scala.inline
    def setMODULE_KEY_UTILS(value: String): Self = this.set("MODULE_KEY_UTILS", value.asInstanceOf[js.Any])
  }
  
}

