package typings
package antdLib.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascader
  extends reactLib.reactMod.Component[CascaderProps, CascaderState, js.Any] {
  var cachedOptions: js.Array[CascaderOptionType] = js.native
  var input: js.Any = js.native
  def blur(): scala.Unit = js.native
  def clearSelection(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCascader(nextProps: CascaderProps): scala.Unit = js.native
  def flattenTree(options: js.Array[CascaderOptionType]): js.Array[js.Array[CascaderOptionType]] = js.native
  def flattenTree(
    options: js.Array[CascaderOptionType],
    changeOnSelect: js.UndefOr[scala.Nothing],
    fieldNames: FieldNamesType
  ): js.Array[js.Array[CascaderOptionType]] = js.native
  def flattenTree(
    options: js.Array[CascaderOptionType],
    changeOnSelect: js.UndefOr[scala.Nothing],
    fieldNames: FieldNamesType,
    ancestor: js.Array[CascaderOptionType]
  ): js.Array[js.Array[CascaderOptionType]] = js.native
  def flattenTree(
    options: js.Array[CascaderOptionType],
    changeOnSelect: js.UndefOr[scala.Nothing],
    fieldNames: js.UndefOr[scala.Nothing],
    ancestor: js.Array[CascaderOptionType]
  ): js.Array[js.Array[CascaderOptionType]] = js.native
  def flattenTree(options: js.Array[CascaderOptionType], changeOnSelect: scala.Boolean): js.Array[js.Array[CascaderOptionType]] = js.native
  def flattenTree(options: js.Array[CascaderOptionType], changeOnSelect: scala.Boolean, fieldNames: FieldNamesType): js.Array[js.Array[CascaderOptionType]] = js.native
  def flattenTree(
    options: js.Array[CascaderOptionType],
    changeOnSelect: scala.Boolean,
    fieldNames: FieldNamesType,
    ancestor: js.Array[CascaderOptionType]
  ): js.Array[js.Array[CascaderOptionType]] = js.native
  def flattenTree(
    options: js.Array[CascaderOptionType],
    changeOnSelect: scala.Boolean,
    fieldNames: js.UndefOr[scala.Nothing],
    ancestor: js.Array[CascaderOptionType]
  ): js.Array[js.Array[CascaderOptionType]] = js.native
  def focus(): scala.Unit = js.native
  def generateFilteredOptions(): js.Array[CascaderOptionType] = js.native
  def generateFilteredOptions(prefixCls: java.lang.String): js.Array[CascaderOptionType] = js.native
  def getLabel(): js.Any = js.native
  def handleChange(value: js.Any, selectedOptions: js.Array[CascaderOptionType]): scala.Unit = js.native
  def handleInputBlur(): scala.Unit = js.native
  def handleInputChange(e: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def handleInputClick(e: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def handleKeyDown(e: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
  def handlePopupVisibleChange(popupVisible: scala.Boolean): scala.Unit = js.native
  def saveInput(node: antdLib.libInputMod.default): scala.Unit = js.native
  def setValue(value: js.Array[java.lang.String]): scala.Unit = js.native
  def setValue(value: js.Array[java.lang.String], selectedOptions: js.Array[CascaderOptionType]): scala.Unit = js.native
}

