package typings.activexShdocvw.SHDocVw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CScriptErrorList extends StObject {
  
  /* private */ @JSName("SHDocVw.CScriptErrorList_typekey")
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CScriptErrorList] (val x: Self) extends AnyVal {
    
    inline def setAdvanceError(value: () => Unit): Self = StObject.set(x, "advanceError", js.Any.fromFunction0(value))
    
    inline def setCanAdvanceError(value: () => Double): Self = StObject.set(x, "canAdvanceError", js.Any.fromFunction0(value))
    
    inline def setCanRetreatError(value: () => Double): Self = StObject.set(x, "canRetreatError", js.Any.fromFunction0(value))
    
    inline def setGetAlwaysShowLockState(value: () => Double): Self = StObject.set(x, "getAlwaysShowLockState", js.Any.fromFunction0(value))
    
    inline def setGetDetailsPaneOpen(value: () => Double): Self = StObject.set(x, "getDetailsPaneOpen", js.Any.fromFunction0(value))
    
    inline def setGetErrorChar(value: () => Double): Self = StObject.set(x, "getErrorChar", js.Any.fromFunction0(value))
    
    inline def setGetErrorCode(value: () => Double): Self = StObject.set(x, "getErrorCode", js.Any.fromFunction0(value))
    
    inline def setGetErrorLine(value: () => Double): Self = StObject.set(x, "getErrorLine", js.Any.fromFunction0(value))
    
    inline def setGetErrorMsg(value: () => String): Self = StObject.set(x, "getErrorMsg", js.Any.fromFunction0(value))
    
    inline def setGetErrorUrl(value: () => String): Self = StObject.set(x, "getErrorUrl", js.Any.fromFunction0(value))
    
    inline def setGetPerErrorDisplay(value: () => Double): Self = StObject.set(x, "getPerErrorDisplay", js.Any.fromFunction0(value))
    
    inline def setRetreatError(value: () => Unit): Self = StObject.set(x, "retreatError", js.Any.fromFunction0(value))
    
    inline def setSHDocVwDotCScriptErrorList_typekey(value: CScriptErrorList): Self = StObject.set(x, "SHDocVw.CScriptErrorList_typekey", value.asInstanceOf[js.Any])
    
    inline def setSetDetailsPaneOpen(value: Double => Unit): Self = StObject.set(x, "setDetailsPaneOpen", js.Any.fromFunction1(value))
    
    inline def setSetPerErrorDisplay(value: Double => Unit): Self = StObject.set(x, "setPerErrorDisplay", js.Any.fromFunction1(value))
  }
}
