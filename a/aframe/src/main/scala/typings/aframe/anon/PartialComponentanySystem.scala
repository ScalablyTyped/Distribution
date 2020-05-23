package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.Schema_
import typings.aframe.mod.System
import typings.three.mod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.Component<any, aframe.aframe.System<any>>> */
trait PartialComponentanySystem extends js.Object {
  var attrName: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  var el: js.UndefOr[Entity[ObjectMap[Component[_, System[_]]]]] = js.undefined
  var events: js.UndefOr[js.Any] = js.undefined
  var extendSchema: js.UndefOr[js.Function1[/* update */ Schema_[js.Object], Unit]] = js.undefined
  var flushToDOM: js.UndefOr[js.Function0[Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var init: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  var initialized: js.UndefOr[Boolean] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var schema: js.UndefOr[Schema_[_]] = js.undefined
  var system: js.UndefOr[System[_]] = js.undefined
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.undefined
  var tock: js.UndefOr[
    js.Function3[/* time */ Double, /* timeDelta */ Double, /* camera */ Camera, Unit]
  ] = js.undefined
  var update: js.UndefOr[js.Function1[/* oldData */ js.Any, Unit]] = js.undefined
  var updateSchema: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialComponentanySystem {
  @scala.inline
  def apply(
    attrName: String = null,
    data: js.Any = null,
    dependencies: js.Array[String] = null,
    el: Entity[ObjectMap[Component[_, System[_]]]] = null,
    events: js.Any = null,
    extendSchema: /* update */ Schema_[js.Object] => Unit = null,
    flushToDOM: () => Unit = null,
    id: String = null,
    init: /* data */ js.UndefOr[js.Any] => Unit = null,
    initialized: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pause: () => Unit = null,
    play: () => Unit = null,
    remove: () => Unit = null,
    schema: Schema_[_] = null,
    system: System[_] = null,
    tick: (/* time */ Double, /* timeDelta */ Double) => Unit = null,
    tock: (/* time */ Double, /* timeDelta */ Double, /* camera */ Camera) => Unit = null,
    update: /* oldData */ js.Any => Unit = null,
    updateSchema: () => Unit = null
  ): PartialComponentanySystem = {
    val __obj = js.Dynamic.literal()
    if (attrName != null) __obj.updateDynamic("attrName")(attrName.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (extendSchema != null) __obj.updateDynamic("extendSchema")(js.Any.fromFunction1(extendSchema))
    if (flushToDOM != null) __obj.updateDynamic("flushToDOM")(js.Any.fromFunction0(flushToDOM))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (!js.isUndefined(initialized)) __obj.updateDynamic("initialized")(initialized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction0(pause))
    if (play != null) __obj.updateDynamic("play")(js.Any.fromFunction0(play))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(js.Any.fromFunction2(tick))
    if (tock != null) __obj.updateDynamic("tock")(js.Any.fromFunction3(tock))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    if (updateSchema != null) __obj.updateDynamic("updateSchema")(js.Any.fromFunction0(updateSchema))
    __obj.asInstanceOf[PartialComponentanySystem]
  }
}

