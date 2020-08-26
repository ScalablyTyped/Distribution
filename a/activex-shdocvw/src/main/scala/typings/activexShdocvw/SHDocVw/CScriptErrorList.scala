package typings.activexShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CScriptErrorList extends js.Object {
  @JSName("SHDocVw.CScriptErrorList_typekey")
  var SHDocVwDotCScriptErrorList_typekey: CScriptErrorList = js.native
  def advanceError(): Unit = js.native
  def canAdvanceError(): Double = js.native
  def canRetreatError(): Double = js.native
  def getAlwaysShowLockState(): Double = js.native
  def getDetailsPaneOpen(): Double = js.native
  def getErrorChar(): Double = js.native
  def getErrorCode(): Double = js.native
  def getErrorLine(): Double = js.native
  def getErrorMsg(): String = js.native
  def getErrorUrl(): String = js.native
  def getPerErrorDisplay(): Double = js.native
  def retreatError(): Unit = js.native
  def setDetailsPaneOpen(fDetailsPaneOpen: Double): Unit = js.native
  def setPerErrorDisplay(fPerErrorDisplay: Double): Unit = js.native
}

object CScriptErrorList {
  @scala.inline
  def apply(
    SHDocVwDotCScriptErrorList_typekey: CScriptErrorList,
    advanceError: () => Unit,
    canAdvanceError: () => Double,
    canRetreatError: () => Double,
    getAlwaysShowLockState: () => Double,
    getDetailsPaneOpen: () => Double,
    getErrorChar: () => Double,
    getErrorCode: () => Double,
    getErrorLine: () => Double,
    getErrorMsg: () => String,
    getErrorUrl: () => String,
    getPerErrorDisplay: () => Double,
    retreatError: () => Unit,
    setDetailsPaneOpen: Double => Unit,
    setPerErrorDisplay: Double => Unit
  ): CScriptErrorList = {
    val __obj = js.Dynamic.literal(advanceError = js.Any.fromFunction0(advanceError), canAdvanceError = js.Any.fromFunction0(canAdvanceError), canRetreatError = js.Any.fromFunction0(canRetreatError), getAlwaysShowLockState = js.Any.fromFunction0(getAlwaysShowLockState), getDetailsPaneOpen = js.Any.fromFunction0(getDetailsPaneOpen), getErrorChar = js.Any.fromFunction0(getErrorChar), getErrorCode = js.Any.fromFunction0(getErrorCode), getErrorLine = js.Any.fromFunction0(getErrorLine), getErrorMsg = js.Any.fromFunction0(getErrorMsg), getErrorUrl = js.Any.fromFunction0(getErrorUrl), getPerErrorDisplay = js.Any.fromFunction0(getPerErrorDisplay), retreatError = js.Any.fromFunction0(retreatError), setDetailsPaneOpen = js.Any.fromFunction1(setDetailsPaneOpen), setPerErrorDisplay = js.Any.fromFunction1(setPerErrorDisplay))
    __obj.updateDynamic("SHDocVw.CScriptErrorList_typekey")(SHDocVwDotCScriptErrorList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CScriptErrorList]
  }
  @scala.inline
  implicit class CScriptErrorListOps[Self <: CScriptErrorList] (val x: Self) extends AnyVal {
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
    def setSHDocVwDotCScriptErrorList_typekey(value: CScriptErrorList): Self = this.set("SHDocVw.CScriptErrorList_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvanceError(value: () => Unit): Self = this.set("advanceError", js.Any.fromFunction0(value))
    @scala.inline
    def setCanAdvanceError(value: () => Double): Self = this.set("canAdvanceError", js.Any.fromFunction0(value))
    @scala.inline
    def setCanRetreatError(value: () => Double): Self = this.set("canRetreatError", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAlwaysShowLockState(value: () => Double): Self = this.set("getAlwaysShowLockState", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDetailsPaneOpen(value: () => Double): Self = this.set("getDetailsPaneOpen", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorChar(value: () => Double): Self = this.set("getErrorChar", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = this.set("getErrorCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorLine(value: () => Double): Self = this.set("getErrorLine", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorMsg(value: () => String): Self = this.set("getErrorMsg", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorUrl(value: () => String): Self = this.set("getErrorUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPerErrorDisplay(value: () => Double): Self = this.set("getPerErrorDisplay", js.Any.fromFunction0(value))
    @scala.inline
    def setRetreatError(value: () => Unit): Self = this.set("retreatError", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDetailsPaneOpen(value: Double => Unit): Self = this.set("setDetailsPaneOpen", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPerErrorDisplay(value: Double => Unit): Self = this.set("setPerErrorDisplay", js.Any.fromFunction1(value))
  }
  
}

