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
      /* config */ ScalablyTyped.runtime.StringDictionary[Action[_] | Actions], 
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

