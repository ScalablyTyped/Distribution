package typings.alt.AltJS

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreModel[S] extends js.Object {
  var afterEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.undefined
  var alt: js.UndefOr[Alt] = js.undefined
  var beforeEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.undefined
  //Actions
  var bindAction: js.UndefOr[js.Function2[/* action */ Action[_], /* handler */ ActionHandler, Unit]] = js.undefined
  var bindActions: js.UndefOr[js.Function1[/* actions */ ActionsClass, Unit]] = js.undefined
  var bindListeners: js.UndefOr[js.Function1[/* config */ StringDictionary[Action[_] | Actions], Unit]] = js.undefined
  // TODO: Embed dispatcher interface in def
  var dispatcher: js.UndefOr[js.Any] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var emitChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var exportAsync: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.undefined
  //Methods/Listeners
  var exportPublicMethods: js.UndefOr[js.Function1[/* exportConfig */ js.Any, Unit]] = js.undefined
  //instance
  var getInstance: js.UndefOr[js.Function0[AltStore[S]]] = js.undefined
  var getState: js.UndefOr[js.Function0[S]] = js.undefined
  var observe: js.UndefOr[js.Function1[/* alt */ Alt, _]] = js.undefined
  var on: js.UndefOr[js.Function2[/* event */ lifeCycleEvents, /* callback */ js.Function0[_], Unit]] = js.undefined
  var onDeserialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], Unit]] = js.undefined
  //events
  var onSerialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], Unit]] = js.undefined
  var otherwise: js.UndefOr[js.Function2[/* data */ js.Any, /* action */ Action[_], Unit]] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reduce: js.UndefOr[js.Function2[/* state */ js.Any, /* config */ StoreReduce, js.Object]] = js.undefined
  var registerAsync: js.UndefOr[js.Function1[/* datasource */ Source, Unit]] = js.undefined
  //state
  var setState: js.UndefOr[
    (js.Function1[/* state */ S, Unit]) with (js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit])
  ] = js.undefined
  var waitFor: js.UndefOr[
    (js.Function1[/* store */ AltStore[_], Unit]) with (js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit])
  ] = js.undefined
}

object StoreModel {
  @scala.inline
  def apply[S](
    afterEach: (/* payload */ js.Object, /* state */ js.Object) => Unit = null,
    alt: Alt = null,
    beforeEach: (/* payload */ js.Object, /* state */ js.Object) => Unit = null,
    bindAction: (/* action */ Action[_], /* handler */ ActionHandler) => Unit = null,
    bindActions: /* actions */ ActionsClass => Unit = null,
    bindListeners: /* config */ StringDictionary[Action[_] | Actions] => Unit = null,
    dispatcher: js.Any = null,
    displayName: String = null,
    emitChange: () => Unit = null,
    exportAsync: /* source */ Source => Unit = null,
    exportPublicMethods: /* exportConfig */ js.Any => Unit = null,
    getInstance: () => AltStore[S] = null,
    getState: () => S = null,
    observe: /* alt */ Alt => _ = null,
    on: (/* event */ lifeCycleEvents, /* callback */ js.Function0[_]) => Unit = null,
    onDeserialize: /* fn */ js.Function1[/* data */ js.Any, _] => Unit = null,
    onSerialize: /* fn */ js.Function1[/* data */ js.Any, _] => Unit = null,
    otherwise: (/* data */ js.Any, /* action */ Action[_]) => Unit = null,
    preventDefault: () => Unit = null,
    reduce: (/* state */ js.Any, /* config */ StoreReduce) => js.Object = null,
    registerAsync: /* datasource */ Source => Unit = null,
    setState: (js.Function1[/* state */ S, Unit]) with (js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]) = null,
    waitFor: (js.Function1[/* store */ AltStore[_], Unit]) with (js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit]) = null
  ): StoreModel[S] = {
    val __obj = js.Dynamic.literal()
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction2(afterEach))
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction2(beforeEach))
    if (bindAction != null) __obj.updateDynamic("bindAction")(js.Any.fromFunction2(bindAction))
    if (bindActions != null) __obj.updateDynamic("bindActions")(js.Any.fromFunction1(bindActions))
    if (bindListeners != null) __obj.updateDynamic("bindListeners")(js.Any.fromFunction1(bindListeners))
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(dispatcher)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emitChange != null) __obj.updateDynamic("emitChange")(js.Any.fromFunction0(emitChange))
    if (exportAsync != null) __obj.updateDynamic("exportAsync")(js.Any.fromFunction1(exportAsync))
    if (exportPublicMethods != null) __obj.updateDynamic("exportPublicMethods")(js.Any.fromFunction1(exportPublicMethods))
    if (getInstance != null) __obj.updateDynamic("getInstance")(js.Any.fromFunction0(getInstance))
    if (getState != null) __obj.updateDynamic("getState")(js.Any.fromFunction0(getState))
    if (observe != null) __obj.updateDynamic("observe")(js.Any.fromFunction1(observe))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction2(on))
    if (onDeserialize != null) __obj.updateDynamic("onDeserialize")(js.Any.fromFunction1(onDeserialize))
    if (onSerialize != null) __obj.updateDynamic("onSerialize")(js.Any.fromFunction1(onSerialize))
    if (otherwise != null) __obj.updateDynamic("otherwise")(js.Any.fromFunction2(otherwise))
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (reduce != null) __obj.updateDynamic("reduce")(js.Any.fromFunction2(reduce))
    if (registerAsync != null) __obj.updateDynamic("registerAsync")(js.Any.fromFunction1(registerAsync))
    if (setState != null) __obj.updateDynamic("setState")(setState)
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor)
    __obj.asInstanceOf[StoreModel[S]]
  }
}

