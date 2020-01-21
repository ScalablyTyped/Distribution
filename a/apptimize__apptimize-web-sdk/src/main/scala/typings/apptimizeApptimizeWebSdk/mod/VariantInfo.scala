package typings.apptimizeApptimizeWebSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantInfo extends js.Object {
  def getAnonymousUserId(): String
  def getCurrentPhase(): Double
  def getCycle(): Double
  def getExperimentId(): Double
  def getExperimentName(): String
  def getExperimentType(): Double
  def getExperimentTypeName(): String
  def getParticipationPhase(): Double
  def getUserHasParticipated(): Boolean
  def getUserId(): String
  def getVariantId(): Double
  def getVariantName(): String
}

object VariantInfo {
  @scala.inline
  def apply(
    getAnonymousUserId: () => String,
    getCurrentPhase: () => Double,
    getCycle: () => Double,
    getExperimentId: () => Double,
    getExperimentName: () => String,
    getExperimentType: () => Double,
    getExperimentTypeName: () => String,
    getParticipationPhase: () => Double,
    getUserHasParticipated: () => Boolean,
    getUserId: () => String,
    getVariantId: () => Double,
    getVariantName: () => String
  ): VariantInfo = {
    val __obj = js.Dynamic.literal(getAnonymousUserId = js.Any.fromFunction0(getAnonymousUserId), getCurrentPhase = js.Any.fromFunction0(getCurrentPhase), getCycle = js.Any.fromFunction0(getCycle), getExperimentId = js.Any.fromFunction0(getExperimentId), getExperimentName = js.Any.fromFunction0(getExperimentName), getExperimentType = js.Any.fromFunction0(getExperimentType), getExperimentTypeName = js.Any.fromFunction0(getExperimentTypeName), getParticipationPhase = js.Any.fromFunction0(getParticipationPhase), getUserHasParticipated = js.Any.fromFunction0(getUserHasParticipated), getUserId = js.Any.fromFunction0(getUserId), getVariantId = js.Any.fromFunction0(getVariantId), getVariantName = js.Any.fromFunction0(getVariantName))
  
    __obj.asInstanceOf[VariantInfo]
  }
}

