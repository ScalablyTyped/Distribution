package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.EditText")
@js.native
class EditText protected () extends TextView {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: js.Any) = this()
  var inputElement: js.Any = js.native
  var mForceDisableDraw: js.Any = js.native
  var mInputType: js.Any = js.native
  var mMaxLength: js.Any = js.native
  var mMultiLineInputElement: js.Any = js.native
  var mSingleLineInputElement: js.Any = js.native
  def _setInputType(value: java.lang.String): scala.Unit = js.native
  /* private */ def checkFilterKeyEventToDom(event: js.Any): js.Any = js.native
  /* protected */ def filterKeyCodeByInputType(keyCode: scala.Double): scala.Boolean = js.native
  /* protected */ def filterKeyCodeOnInput(keyCode: scala.Double): scala.Boolean = js.native
  /* private */ def filterKeyEvent(event: js.Any): js.Any = js.native
  def isInputElementShowed(): scala.Boolean = js.native
  /* private */ def onDomTextInput(e: js.Any): js.Any = js.native
  /* protected */ def onInputElementFocusChanged(focused: scala.Boolean): scala.Unit = js.native
  /* protected */ def onInputValueChange(e: js.Any): scala.Unit = js.native
  /* protected */ def setForceDisableDrawText(disable: scala.Boolean): scala.Unit = js.native
  /* private */ def switchToInputElement(inputElement: js.Any): js.Any = js.native
  /* protected */ def switchToMultiLineInputElement(): scala.Unit = js.native
  /* private */ def switchToSingleLineInputElement(): js.Any = js.native
  /* private */ def syncTextBoundInfoToInputElement(): js.Any = js.native
  /* protected */ def tryDismissInputElement(): scala.Unit = js.native
  /* protected */ def tryShowInputElement(): scala.Unit = js.native
}

