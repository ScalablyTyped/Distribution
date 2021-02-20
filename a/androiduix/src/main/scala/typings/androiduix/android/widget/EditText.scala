package typings.androiduix.android.widget

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditText extends TextView {
  
  def _setInputType(value: String): Unit = js.native
  
  /* private */ def checkFilterKeyEventToDom(event: js.Any): js.Any = js.native
  
  /* protected */ def filterKeyCodeByInputType(keyCode: Double): Boolean = js.native
  
  /* protected */ def filterKeyCodeOnInput(keyCode: Double): Boolean = js.native
  
  /* private */ def filterKeyEvent(event: js.Any): js.Any = js.native
  
  var inputElement: js.Any = js.native
  
  def isInputElementShowed(): Boolean = js.native
  
  var mForceDisableDraw: js.Any = js.native
  
  var mInputType: js.Any = js.native
  
  var mMaxLength: js.Any = js.native
  
  var mMultiLineInputElement: js.Any = js.native
  
  var mSingleLineInputElement: js.Any = js.native
  
  /* private */ def onDomTextInput(e: js.Any): js.Any = js.native
  
  /* protected */ def onInputElementFocusChanged(focused: Boolean): Unit = js.native
  
  /* protected */ def onInputValueChange(e: js.Any): Unit = js.native
  
  /* protected */ def setForceDisableDrawText(disable: Boolean): Unit = js.native
  
  /* private */ def switchToInputElement(inputElement: js.Any): js.Any = js.native
  
  /* protected */ def switchToMultiLineInputElement(): Unit = js.native
  
  /* private */ def switchToSingleLineInputElement(): js.Any = js.native
  
  /* private */ def syncTextBoundInfoToInputElement(): js.Any = js.native
  
  /* protected */ def tryDismissInputElement(): Unit = js.native
  
  /* protected */ def tryShowInputElement(): Unit = js.native
}
