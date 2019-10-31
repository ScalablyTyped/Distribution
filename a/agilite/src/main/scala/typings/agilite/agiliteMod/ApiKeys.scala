package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agilite", "ApiKeys")
@js.native
class ApiKeys protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  def deleteData(recordId: String): js.Any = js.native
  def disableApiKey(recordId: String): js.Any = js.native
  def enableApiKey(recordId: String): js.Any = js.native
  def generateApiKey(recordId: String): js.Any = js.native
  def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
  def postData(data: js.Any): js.Any = js.native
  def putData(recordId: String, data: js.Any): js.Any = js.native
  def resetApiKeys(recordId: String): js.Any = js.native
}

