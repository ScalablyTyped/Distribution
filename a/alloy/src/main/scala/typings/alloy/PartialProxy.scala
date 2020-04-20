package typings.alloy

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<titanium.Titanium.Proxy> */
trait PartialProxy extends js.Object {
  var addEventListener: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit], Unit]
  ] = js.undefined
  var apiName: js.UndefOr[String] = js.undefined
  var applyProperties: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
  var bubbleParent: js.UndefOr[Boolean] = js.undefined
  var fireEvent: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  var getApiName: js.UndefOr[js.Function0[String]] = js.undefined
  var getBubbleParent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var getLifecycleContainer: js.UndefOr[js.Function0[Window | TabGroup]] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var lifecycleContainer: js.UndefOr[Window | TabGroup] = js.undefined
  var removeEventListener: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit], Unit]
  ] = js.undefined
  var setBubbleParent: js.UndefOr[js.Function1[/* bubbleParent */ Boolean, Unit]] = js.undefined
  var setLifecycleContainer: js.UndefOr[js.Function1[/* lifecycleContainer */ Window | TabGroup, Unit]] = js.undefined
}

object PartialProxy {
  @scala.inline
  def apply(
    addEventListener: (/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit]) => Unit = null,
    apiName: String = null,
    applyProperties: /* props */ js.Any => Unit = null,
    bubbleParent: js.UndefOr[Boolean] = js.undefined,
    fireEvent: /* name */ String => Unit = null,
    getApiName: () => String = null,
    getBubbleParent: () => Boolean = null,
    getLifecycleContainer: () => Window | TabGroup = null,
    id: String | Double = null,
    lifecycleContainer: Window | TabGroup = null,
    removeEventListener: (/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit]) => Unit = null,
    setBubbleParent: /* bubbleParent */ Boolean => Unit = null,
    setLifecycleContainer: /* lifecycleContainer */ Window | TabGroup => Unit = null
  ): PartialProxy = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2(addEventListener))
    if (apiName != null) __obj.updateDynamic("apiName")(apiName.asInstanceOf[js.Any])
    if (applyProperties != null) __obj.updateDynamic("applyProperties")(js.Any.fromFunction1(applyProperties))
    if (!js.isUndefined(bubbleParent)) __obj.updateDynamic("bubbleParent")(bubbleParent.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction1(fireEvent))
    if (getApiName != null) __obj.updateDynamic("getApiName")(js.Any.fromFunction0(getApiName))
    if (getBubbleParent != null) __obj.updateDynamic("getBubbleParent")(js.Any.fromFunction0(getBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2(removeEventListener))
    if (setBubbleParent != null) __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1(setBubbleParent))
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(js.Any.fromFunction1(setLifecycleContainer))
    __obj.asInstanceOf[PartialProxy]
  }
}

