package typings
package atAntDashDesignReactDashNativeLib.libPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Picker
  extends reactLib.reactMod.Component[PickerProps, js.Any, js.Any] {
  var scrollValue: js.Any = js.native
  def fixOnOk(cascader: js.Any): scala.Unit = js.native
  def getCascade(
    cascade: js.UndefOr[scala.Nothing],
    data: js.Array[
      js.Array[atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData
    ],
    cols: js.UndefOr[scala.Nothing],
    itemStyle: js.Any,
    indicatorStyle: js.Any
  ): atAntDashDesignReactDashNativeLib.Anon_Cascader = js.native
  def getCascade(
    cascade: js.UndefOr[scala.Nothing],
    data: js.Array[
      js.Array[atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData
    ],
    cols: scala.Double,
    itemStyle: js.Any,
    indicatorStyle: js.Any
  ): atAntDashDesignReactDashNativeLib.Anon_Cascader = js.native
  def getCascade(
    cascade: scala.Boolean,
    data: js.Array[
      js.Array[atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData
    ],
    cols: js.UndefOr[scala.Nothing],
    itemStyle: js.Any,
    indicatorStyle: js.Any
  ): atAntDashDesignReactDashNativeLib.Anon_Cascader = js.native
  def getCascade(
    cascade: scala.Boolean,
    data: js.Array[
      js.Array[atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData] | atAntDashDesignReactDashNativeLib.libPickerPropsTypeMod.PickerData
    ],
    cols: scala.Double,
    itemStyle: js.Any,
    indicatorStyle: js.Any
  ): atAntDashDesignReactDashNativeLib.Anon_Cascader = js.native
  def getPickerCol(): js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def getSel(): js.UndefOr[java.lang.String] = js.native
  def onOk(v: js.Any): scala.Unit = js.native
  def onPickerChange(v: js.Any): scala.Unit = js.native
  def onVisibleChange(visible: scala.Boolean): scala.Unit = js.native
  def setCasecadeScrollValue(v: js.Any): scala.Unit = js.native
  def setScrollValue(v: js.Any): scala.Unit = js.native
}

