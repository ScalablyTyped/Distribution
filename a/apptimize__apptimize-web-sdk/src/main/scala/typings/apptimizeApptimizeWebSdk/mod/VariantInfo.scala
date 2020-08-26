package typings.apptimizeApptimizeWebSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantInfo extends js.Object {
  def getAnonymousUserId(): String = js.native
  def getCurrentPhase(): Double = js.native
  def getCycle(): Double = js.native
  def getExperimentId(): Double = js.native
  def getExperimentName(): String = js.native
  def getExperimentType(): Double = js.native
  def getExperimentTypeName(): String = js.native
  def getParticipationPhase(): Double = js.native
  def getUserHasParticipated(): Boolean = js.native
  def getUserId(): String = js.native
  def getVariantId(): Double = js.native
  def getVariantName(): String = js.native
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
  @scala.inline
  implicit class VariantInfoOps[Self <: VariantInfo] (val x: Self) extends AnyVal {
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
    def setGetAnonymousUserId(value: () => String): Self = this.set("getAnonymousUserId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentPhase(value: () => Double): Self = this.set("getCurrentPhase", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCycle(value: () => Double): Self = this.set("getCycle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExperimentId(value: () => Double): Self = this.set("getExperimentId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExperimentName(value: () => String): Self = this.set("getExperimentName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExperimentType(value: () => Double): Self = this.set("getExperimentType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetExperimentTypeName(value: () => String): Self = this.set("getExperimentTypeName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParticipationPhase(value: () => Double): Self = this.set("getParticipationPhase", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserHasParticipated(value: () => Boolean): Self = this.set("getUserHasParticipated", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserId(value: () => String): Self = this.set("getUserId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVariantId(value: () => Double): Self = this.set("getVariantId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVariantName(value: () => String): Self = this.set("getVariantName", js.Any.fromFunction0(value))
  }
  
}

