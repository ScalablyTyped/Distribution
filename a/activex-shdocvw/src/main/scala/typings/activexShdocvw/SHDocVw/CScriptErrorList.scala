package typings.activexShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CScriptErrorList extends js.Object {
  @JSName("SHDocVw.CScriptErrorList_typekey")
  var SHDocVwDotCScriptErrorList_typekey: CScriptErrorList
  def advanceError(): Unit
  def canAdvanceError(): Double
  def canRetreatError(): Double
  def getAlwaysShowLockState(): Double
  def getDetailsPaneOpen(): Double
  def getErrorChar(): Double
  def getErrorCode(): Double
  def getErrorLine(): Double
  def getErrorMsg(): String
  def getErrorUrl(): String
  def getPerErrorDisplay(): Double
  def retreatError(): Unit
  def setDetailsPaneOpen(fDetailsPaneOpen: Double): Unit
  def setPerErrorDisplay(fPerErrorDisplay: Double): Unit
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
}

