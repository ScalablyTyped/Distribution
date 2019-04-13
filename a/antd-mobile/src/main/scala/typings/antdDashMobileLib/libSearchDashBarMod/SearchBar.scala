package typings
package antdDashMobileLib.libSearchDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends reactLib.reactMod.Component[
      SearchBarProps, 
      antdDashMobileLib.libSearchDashBarPropsTypeMod.SearchBarState, 
      js.Any
    ] {
  var blurFromOnClear: scala.Boolean = js.native
  var firstFocus: scala.Boolean = js.native
  var inputContainerRef: js.Any = js.native
  var inputRef: stdLib.HTMLInputElement | scala.Null = js.native
  var onBlurTimeout: scala.Double | scala.Null = js.native
  var rightBtnInitMarginleft: java.lang.String | scala.Null = js.native
  var rightBtnRef: js.Any = js.native
  var syntheticPhContainerRef: js.Any = js.native
  var syntheticPhRef: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSearchBar(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSearchBar(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSearchBar(): scala.Unit = js.native
  def doClear(): scala.Unit = js.native
  def doClear(blurFromOnClear: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def onBlur(): scala.Unit = js.native
  def onCancel(): scala.Unit = js.native
  def onChange(e: reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement]): scala.Unit = js.native
  def onClear(): scala.Unit = js.native
  def onFocus(): scala.Unit = js.native
  def onSubmit(e: reactLib.reactMod.FormEvent[stdLib.HTMLFormElement]): scala.Unit = js.native
}

