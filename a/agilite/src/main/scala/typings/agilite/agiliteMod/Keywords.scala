package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agilite", "Keywords")
@js.native
class Keywords protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  var outputFormat: typings.agilite.agiliteMod.outputFormat = js.native
  var sort: typings.agilite.agiliteMod.sort = js.native
  def deleteData(recordId: String): js.Any = js.native
  def getByProfileKey(profileKey: String, sort: String, outputFormat: String): js.Any = js.native
  def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
  def getLabelByValue(profileKey: String, value: String, outputFormat: String): js.Any = js.native
  def getProfileKeysByGroup(groupName: String, sort: String): js.Any = js.native
  def getValueByLabel(profileKey: String, label: String, outputFormat: String): js.Any = js.native
  def postData(data: js.Any): js.Any = js.native
  def putData(recordId: String, data: js.Any): js.Any = js.native
}

