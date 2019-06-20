package typings
package altLib.altContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var actions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Object]] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.Component[_, js.Object, _]] = js.undefined
  var flux: js.UndefOr[altLib.AltJSNs.Alt] = js.undefined
  var inject: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, reactLib.reactMod.ReactElement]] = js.undefined
  var shouldComponentUpdate: js.UndefOr[js.Function1[/* props */ js.Any, scala.Boolean]] = js.undefined
  var store: js.UndefOr[altLib.AltJSNs.AltStore[_]] = js.undefined
  var stores: js.UndefOr[js.Array[altLib.AltJSNs.AltStore[_]]] = js.undefined
  var transform: js.UndefOr[js.Function2[/* store */ altLib.AltJSNs.AltStore[_], /* actions */ js.Any, _]] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    actions: org.scalablytyped.runtime.StringDictionary[js.Object] = null,
    component: reactLib.reactMod.Component[_, js.Object, _] = null,
    flux: altLib.AltJSNs.Alt = null,
    inject: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    render: /* repeated */ js.Any => reactLib.reactMod.ReactElement = null,
    shouldComponentUpdate: /* props */ js.Any => scala.Boolean = null,
    store: altLib.AltJSNs.AltStore[_] = null,
    stores: js.Array[altLib.AltJSNs.AltStore[_]] = null,
    transform: (/* store */ altLib.AltJSNs.AltStore[_], /* actions */ js.Any) => _ = null
  ): ContainerProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (component != null) __obj.updateDynamic("component")(component)
    if (flux != null) __obj.updateDynamic("flux")(flux)
    if (inject != null) __obj.updateDynamic("inject")(inject)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction1(shouldComponentUpdate))
    if (store != null) __obj.updateDynamic("store")(store)
    if (stores != null) __obj.updateDynamic("stores")(stores)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[ContainerProps]
  }
}

