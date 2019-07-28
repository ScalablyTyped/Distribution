package typings.alt.altContainerMod

import org.scalablytyped.runtime.StringDictionary
import typings.alt.AltJSNs.Alt
import typings.alt.AltJSNs.AltStore
import typings.react.reactMod.Component
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerProps extends js.Object {
  var actions: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  var component: js.UndefOr[Component[_, js.Object, _]] = js.undefined
  var flux: js.UndefOr[Alt] = js.undefined
  var inject: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var render: js.UndefOr[js.Function1[/* repeated */ js.Any, ReactElement]] = js.undefined
  var shouldComponentUpdate: js.UndefOr[js.Function1[/* props */ js.Any, Boolean]] = js.undefined
  var store: js.UndefOr[AltStore[_]] = js.undefined
  var stores: js.UndefOr[js.Array[AltStore[_]]] = js.undefined
  var transform: js.UndefOr[js.Function2[/* store */ AltStore[_], /* actions */ js.Any, _]] = js.undefined
}

object ContainerProps {
  @scala.inline
  def apply(
    actions: StringDictionary[js.Object] = null,
    component: Component[_, js.Object, _] = null,
    flux: Alt = null,
    inject: StringDictionary[js.Any] = null,
    render: /* repeated */ js.Any => ReactElement = null,
    shouldComponentUpdate: /* props */ js.Any => Boolean = null,
    store: AltStore[_] = null,
    stores: js.Array[AltStore[_]] = null,
    transform: (/* store */ AltStore[_], /* actions */ js.Any) => _ = null
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

