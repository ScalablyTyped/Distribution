package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * animates a transformation attribute on a target element, thereby allowing animations to control translation, scaling, rotation and/or skewing.
  *
  * The member XAnimate::Attributes contains a short from {@link AnimationTransformType} .
  *
  * Depending on the value in XAnimate::Attributes, the members {@link XAnimate.From} , {@link XAnimate.To} , {@link XAnimate.By} or {@link
  * XAnimate.Values} contain the following
  *
  * {@link AnimationTransformType.TRANSLATE}; {@link ValuePair} of **tx** and **ty**{@link AnimationTransformType.SCALE}; {@link ValuePair} of **sx** and
  * **sy**{@link AnimationTransformType.ROTATE};  Values for a rotation angle{@link AnimationTransformType.SKEWX};  Values for a skew-angle{@link
  * AnimationTransformType.SKEWY};  Values for a skew-angle
  * @see http://www.w3.org/TR/SVG/animate.html#AnimateTransformElement
  */
trait XAnimateTransform extends XAnimate {
  /** @see AnimationTransformType */
  var TransformType: scala.Double
}

object XAnimateTransform {
  @scala.inline
  def apply(
    Acceleration: scala.Double,
    Accumulate: scala.Boolean,
    Additive: scala.Double,
    AttributeName: java.lang.String,
    AutoReverse: scala.Boolean,
    Begin: js.Any,
    By: js.Any,
    CalcMode: scala.Double,
    Decelerate: scala.Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: scala.Double,
    FillDefault: scala.Double,
    Formula: java.lang.String,
    From: js.Any,
    KeyTimes: activexDashInteropLib.SafeArray[scala.Double],
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: scala.Double,
    RestartDefault: scala.Double,
    SubItem: scala.Double,
    Target: js.Any,
    TimeFilter: activexDashInteropLib.SafeArray[TimeFilterPair],
    To: js.Any,
    TransformType: scala.Double,
    Type: scala.Double,
    UserData: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ValueType: scala.Double,
    Values: activexDashInteropLib.SafeArray[_],
    acquire: js.Function0[scala.Unit],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XAnimateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Acceleration")(Acceleration)
    __obj.updateDynamic("Accumulate")(Accumulate)
    __obj.updateDynamic("Additive")(Additive)
    __obj.updateDynamic("AttributeName")(AttributeName)
    __obj.updateDynamic("AutoReverse")(AutoReverse)
    __obj.updateDynamic("Begin")(Begin)
    __obj.updateDynamic("By")(By)
    __obj.updateDynamic("CalcMode")(CalcMode)
    __obj.updateDynamic("Decelerate")(Decelerate)
    __obj.updateDynamic("Duration")(Duration)
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("EndSync")(EndSync)
    __obj.updateDynamic("Fill")(Fill)
    __obj.updateDynamic("FillDefault")(FillDefault)
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("From")(From)
    __obj.updateDynamic("KeyTimes")(KeyTimes)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("RepeatCount")(RepeatCount)
    __obj.updateDynamic("RepeatDuration")(RepeatDuration)
    __obj.updateDynamic("Restart")(Restart)
    __obj.updateDynamic("RestartDefault")(RestartDefault)
    __obj.updateDynamic("SubItem")(SubItem)
    __obj.updateDynamic("Target")(Target)
    __obj.updateDynamic("TimeFilter")(TimeFilter)
    __obj.updateDynamic("To")(To)
    __obj.updateDynamic("TransformType")(TransformType)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UserData")(UserData)
    __obj.updateDynamic("ValueType")(ValueType)
    __obj.updateDynamic("Values")(Values)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setParent")(setParent)
    __obj.asInstanceOf[XAnimateTransform]
  }
}

