package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agilite", "Roles")
@js.native
class Roles protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  def assignRole(
    processKey: String,
    bpmRecordId: String,
    roleName: String,
    currentUser: String,
    responsibleUsers: js.Array[String]
  ): js.Any = js.native
  def changeConditionalLevels(recordId: String, conditionalLevels: js.Array[String]): js.Any = js.native
  def deleteData(recordId: String): js.Any = js.native
  def getAssignedRoles(processKey: String, bpmRecordId: String, roleNames: js.Array[String]): js.Any = js.native
  def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
  def getRole(roleNames: js.Array[String], conditionalLevels: js.Array[String], data: js.Any): js.Any = js.native
  def postData(data: js.Any): js.Any = js.native
  def putData(recordId: String, data: js.Any): js.Any = js.native
  def reAssignResponsibleUser(recordId: String, responsibleUser: String): js.Any = js.native
}

