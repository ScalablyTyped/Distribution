package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreModel[S] extends js.Object {
  var afterEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, scala.Unit]] = js.undefined
  var alt: js.UndefOr[Alt] = js.undefined
  var beforeEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, scala.Unit]] = js.undefined
  //Actions
  var bindAction: js.UndefOr[js.Function2[/* action */ Action[_], /* handler */ ActionHandler, scala.Unit]] = js.undefined
  var bindActions: js.UndefOr[js.Function1[/* actions */ ActionsClass, scala.Unit]] = js.undefined
  var bindListeners: js.UndefOr[
    js.Function1[
      /* config */ org.scalablytyped.runtime.StringDictionary[Action[_] | Actions], 
      scala.Unit
    ]
  ] = js.undefined
  // TODO: Embed dispatcher interface in def
  var dispatcher: js.UndefOr[js.Any] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var emitChange: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var exportAsync: js.UndefOr[js.Function1[/* source */ Source, scala.Unit]] = js.undefined
  //Methods/Listeners
  var exportPublicMethods: js.UndefOr[js.Function1[/* exportConfig */ js.Any, scala.Unit]] = js.undefined
  //instance
  var getInstance: js.UndefOr[js.Function0[AltStore[S]]] = js.undefined
  var getState: js.UndefOr[js.Function0[S]] = js.undefined
  var observe: js.UndefOr[js.Function1[/* alt */ Alt, _]] = js.undefined
  var on: js.UndefOr[
    js.Function2[/* event */ lifeCycleEvents, /* callback */ js.Function0[_], scala.Unit]
  ] = js.undefined
  var onDeserialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], scala.Unit]] = js.undefined
  //events
  var onSerialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], scala.Unit]] = js.undefined
  var otherwise: js.UndefOr[js.Function2[/* data */ js.Any, /* action */ Action[_], scala.Unit]] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var reduce: js.UndefOr[js.Function2[/* state */ js.Any, /* config */ StoreReduce, js.Object]] = js.undefined
  var registerAsync: js.UndefOr[js.Function1[/* datasource */ Source, scala.Unit]] = js.undefined
  //state
  var setState: js.UndefOr[
    (js.Function1[/* state */ S, scala.Unit]) with (js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], scala.Unit])
  ] = js.undefined
  var waitFor: js.UndefOr[
    (js.Function1[/* store */ AltStore[_], scala.Unit]) with (js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], scala.Unit])
  ] = js.undefined
}

object StoreModel {
  @scala.inline
  def apply[S](
    afterEach: js.Function2[/* payload */ js.Object, /* state */ js.Object, scala.Unit] = null,
    alt: Alt = null,
    beforeEach: js.Function2[/* payload */ js.Object, /* state */ js.Object, scala.Unit] = null,
    bindAction: js.Function2[/* action */ Action[_], /* handler */ ActionHandler, scala.Unit] = null,
    bindActions: js.Function1[/* actions */ ActionsClass, scala.Unit] = null,
    bindListeners: js.Function1[
      /* config */ org.scalablytyped.runtime.StringDictionary[Action[_] | Actions], 
      scala.Unit
    ] = null,
    dispatcher: js.Any = null,
    displayName: java.lang.String = null,
    emitChange: js.Function0[scala.Unit] = null,
    exportAsync: js.Function1[/* source */ Source, scala.Unit] = null,
    exportPublicMethods: js.Function1[/* exportConfig */ js.Any, scala.Unit] = null,
    getInstance: js.Function0[AltStore[S]] = null,
    getState: js.Function0[S] = null,
    observe: js.Function1[/* alt */ Alt, _] = null,
    on: js.Function2[/* event */ lifeCycleEvents, /* callback */ js.Function0[_], scala.Unit] = null,
    onDeserialize: js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], scala.Unit] = null,
    onSerialize: js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], scala.Unit] = null,
    otherwise: js.Function2[/* data */ js.Any, /* action */ Action[_], scala.Unit] = null,
    preventDefault: js.Function0[scala.Unit] = null,
    reduce: js.Function2[/* state */ js.Any, /* config */ StoreReduce, js.Object] = null,
    registerAsync: js.Function1[/* datasource */ Source, scala.Unit] = null,
    setState: (js.Function1[/* state */ S, scala.Unit]) with (js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], scala.Unit]) = null,
    waitFor: (js.Function1[/* store */ AltStore[_], scala.Unit]) with (js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], scala.Unit]) = null
  ): StoreModel[S] = {
    val __obj = js.Dynamic.literal()
    if (afterEach != null) __obj.updateDynamic("afterEach")(afterEach)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(beforeEach)
    if (bindAction != null) __obj.updateDynamic("bindAction")(bindAction)
    if (bindActions != null) __obj.updateDynamic("bindActions")(bindActions)
    if (bindListeners != null) __obj.updateDynamic("bindListeners")(bindListeners)
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(dispatcher)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emitChange != null) __obj.updateDynamic("emitChange")(emitChange)
    if (exportAsync != null) __obj.updateDynamic("exportAsync")(exportAsync)
    if (exportPublicMethods != null) __obj.updateDynamic("exportPublicMethods")(exportPublicMethods)
    if (getInstance != null) __obj.updateDynamic("getInstance")(getInstance)
    if (getState != null) __obj.updateDynamic("getState")(getState)
    if (observe != null) __obj.updateDynamic("observe")(observe)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onDeserialize != null) __obj.updateDynamic("onDeserialize")(onDeserialize)
    if (onSerialize != null) __obj.updateDynamic("onSerialize")(onSerialize)
    if (otherwise != null) __obj.updateDynamic("otherwise")(otherwise)
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(preventDefault)
    if (reduce != null) __obj.updateDynamic("reduce")(reduce)
    if (registerAsync != null) __obj.updateDynamic("registerAsync")(registerAsync)
    if (setState != null) __obj.updateDynamic("setState")(setState)
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor)
    __obj.asInstanceOf[StoreModel[S]]
  }
}

