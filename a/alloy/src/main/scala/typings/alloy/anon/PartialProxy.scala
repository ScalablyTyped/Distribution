package typings.alloy.anon

import typings.titanium.Titanium.Event
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<titanium.Titanium.Proxy> */
@js.native
trait PartialProxy extends js.Object {
  var addEventListener: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit], Unit]
  ] = js.native
  var apiName: js.UndefOr[String] = js.native
  var applyProperties: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
  var bubbleParent: js.UndefOr[Boolean] = js.native
  var fireEvent: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  var getApiName: js.UndefOr[js.Function0[String]] = js.native
  var getBubbleParent: js.UndefOr[js.Function0[Boolean]] = js.native
  var getLifecycleContainer: js.UndefOr[js.Function0[Window | TabGroup]] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var lifecycleContainer: js.UndefOr[Window | TabGroup] = js.native
  var removeEventListener: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit], Unit]
  ] = js.native
  var setBubbleParent: js.UndefOr[js.Function1[/* bubbleParent */ Boolean, Unit]] = js.native
  var setLifecycleContainer: js.UndefOr[js.Function1[/* lifecycleContainer */ Window | TabGroup, Unit]] = js.native
}

object PartialProxy {
  @scala.inline
  def apply(): PartialProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProxy]
  }
  @scala.inline
  implicit class PartialProxyOps[Self <: PartialProxy] (val x: Self) extends AnyVal {
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
    def setAddEventListener(value: (/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit]) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddEventListener: Self = this.set("addEventListener", js.undefined)
    @scala.inline
    def setApiName(value: String): Self = this.set("apiName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiName: Self = this.set("apiName", js.undefined)
    @scala.inline
    def setApplyProperties(value: /* props */ js.Any => Unit): Self = this.set("applyProperties", js.Any.fromFunction1(value))
    @scala.inline
    def deleteApplyProperties: Self = this.set("applyProperties", js.undefined)
    @scala.inline
    def setBubbleParent(value: Boolean): Self = this.set("bubbleParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleParent: Self = this.set("bubbleParent", js.undefined)
    @scala.inline
    def setFireEvent(value: /* name */ String => Unit): Self = this.set("fireEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFireEvent: Self = this.set("fireEvent", js.undefined)
    @scala.inline
    def setGetApiName(value: () => String): Self = this.set("getApiName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetApiName: Self = this.set("getApiName", js.undefined)
    @scala.inline
    def setGetBubbleParent(value: () => Boolean): Self = this.set("getBubbleParent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBubbleParent: Self = this.set("getBubbleParent", js.undefined)
    @scala.inline
    def setGetLifecycleContainer(value: () => Window | TabGroup): Self = this.set("getLifecycleContainer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLifecycleContainer: Self = this.set("getLifecycleContainer", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLifecycleContainer(value: Window | TabGroup): Self = this.set("lifecycleContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleContainer: Self = this.set("lifecycleContainer", js.undefined)
    @scala.inline
    def setRemoveEventListener(value: (/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit]) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveEventListener: Self = this.set("removeEventListener", js.undefined)
    @scala.inline
    def setSetBubbleParent(value: /* bubbleParent */ Boolean => Unit): Self = this.set("setBubbleParent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBubbleParent: Self = this.set("setBubbleParent", js.undefined)
    @scala.inline
    def setSetLifecycleContainer(value: /* lifecycleContainer */ Window | TabGroup => Unit): Self = this.set("setLifecycleContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLifecycleContainer: Self = this.set("setLifecycleContainer", js.undefined)
  }
  
}

