package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("agilite", "BPM")
@js.native
class BPM protected () extends js.Object {
  def this(config: AgiliteConfig) = this()
  def clearHistoryData(profileKey: String): js.Any = js.native
  def deleteData(recordId: String): js.Any = js.native
  def execute(
    processKey: String,
    bpmRecordId: String,
    optionSelected: String,
    currentUser: String,
    comments: String,
    data: js.Any
  ): js.Any = js.native
  def getActiveSteps(processKey: String): js.Any = js.native
  def getActiveUsers(processKey: String): js.Any = js.native
  def getByProfileKey(profileKey: String): js.Any = js.native
  def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Any = js.native
  // tslint:disable-next-line max-line-length
  def getRecordState(
    processKeys: js.Array[String],
    bpmRecordIds: js.Array[String],
    stepNames: js.Array[String],
    responsibleUsers: js.Array[String],
    relevantUsers: js.Array[String],
    includeHistory: Boolean,
    includeStepOptions: Boolean,
    includeVisibleObjects: Boolean,
    page: js.Any,
    pageLimit: js.Any
  ): js.Any = js.native
  def postData(data: js.Any): js.Any = js.native
  def putData(recordId: String, data: js.Any): js.Any = js.native
  def registerBPMRecord(processKey: String, currentUser: String): js.Any = js.native
}

