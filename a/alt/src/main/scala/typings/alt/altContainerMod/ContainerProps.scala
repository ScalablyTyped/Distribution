package typings.alt.altContainerMod

import org.scalablytyped.runtime.StringDictionary
import typings.alt.AltJS.Alt
import typings.alt.AltJS.AltStore
import typings.react.mod.Component
import typings.react.mod.ReactElement
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
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (flux != null) __obj.updateDynamic("flux")(flux.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction1(shouldComponentUpdate))
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (stores != null) __obj.updateDynamic("stores")(stores.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[ContainerProps]
  }
}

