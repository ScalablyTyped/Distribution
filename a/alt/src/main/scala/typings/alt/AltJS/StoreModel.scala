package typings.alt.AltJS

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreModel[S] extends js.Object {
  var afterEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.native
  var alt: js.UndefOr[Alt] = js.native
  var beforeEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.native
  //Actions
  var bindAction: js.UndefOr[js.Function2[/* action */ Action[_], /* handler */ ActionHandler, Unit]] = js.native
  var bindActions: js.UndefOr[js.Function1[/* actions */ ActionsClass, Unit]] = js.native
  var bindListeners: js.UndefOr[js.Function1[/* config */ StringDictionary[Action[_] | Actions], Unit]] = js.native
  // TODO: Embed dispatcher interface in def
  var dispatcher: js.UndefOr[js.Any] = js.native
  var displayName: js.UndefOr[String] = js.native
  var emitChange: js.UndefOr[js.Function0[Unit]] = js.native
  var exportAsync: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.native
  //Methods/Listeners
  var exportPublicMethods: js.UndefOr[js.Function1[/* exportConfig */ js.Any, Unit]] = js.native
  //instance
  var getInstance: js.UndefOr[js.Function0[AltStore[S]]] = js.native
  var getState: js.UndefOr[js.Function0[S]] = js.native
  var observe: js.UndefOr[js.Function1[/* alt */ Alt, _]] = js.native
  var on: js.UndefOr[js.Function2[/* event */ lifeCycleEvents, /* callback */ js.Function0[_], Unit]] = js.native
  var onDeserialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], Unit]] = js.native
  //events
  var onSerialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], Unit]] = js.native
  var otherwise: js.UndefOr[js.Function2[/* data */ js.Any, /* action */ Action[_], Unit]] = js.native
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
  var reduce: js.UndefOr[js.Function2[/* state */ js.Any, /* config */ StoreReduce, js.Object]] = js.native
  var registerAsync: js.UndefOr[js.Function1[/* datasource */ Source, Unit]] = js.native
  //state
  var setState: (js.UndefOr[js.Function1[/* state */ S, Unit]]) with (js.UndefOr[
    js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]
  ]) = js.native
  var waitFor: (js.UndefOr[js.Function1[/* store */ AltStore[_], Unit]]) with (js.UndefOr[js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit]]) = js.native
}

object StoreModel {
  @scala.inline
  def apply[S](
    setState: (js.UndefOr[js.Function1[/* state */ S, Unit]]) with (js.UndefOr[
      js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]
    ]),
    waitFor: (js.UndefOr[js.Function1[/* store */ AltStore[_], Unit]]) with (js.UndefOr[js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit]])
  ): StoreModel[S] = {
    val __obj = js.Dynamic.literal(setState = setState.asInstanceOf[js.Any], waitFor = waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreModel[S]]
  }
  @scala.inline
  implicit class StoreModelOps[Self <: StoreModel[_], S] (val x: Self with StoreModel[S]) extends AnyVal {
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
    def setSetState(
      value: (js.UndefOr[js.Function1[/* state */ S, Unit]]) with (js.UndefOr[
          js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]
        ])
    ): Self = this.set("setState", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitFor(
      value: (js.UndefOr[js.Function1[/* store */ AltStore[_], Unit]]) with (js.UndefOr[js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit]])
    ): Self = this.set("waitFor", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterEach(value: (/* payload */ js.Object, /* state */ js.Object) => Unit): Self = this.set("afterEach", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterEach: Self = this.set("afterEach", js.undefined)
    @scala.inline
    def setAlt(value: Alt): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setBeforeEach(value: (/* payload */ js.Object, /* state */ js.Object) => Unit): Self = this.set("beforeEach", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeEach: Self = this.set("beforeEach", js.undefined)
    @scala.inline
    def setBindAction(value: (/* action */ Action[_], /* handler */ ActionHandler) => Unit): Self = this.set("bindAction", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBindAction: Self = this.set("bindAction", js.undefined)
    @scala.inline
    def setBindActions(value: /* actions */ ActionsClass => Unit): Self = this.set("bindActions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindActions: Self = this.set("bindActions", js.undefined)
    @scala.inline
    def setBindListeners(value: /* config */ StringDictionary[Action[_] | Actions] => Unit): Self = this.set("bindListeners", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBindListeners: Self = this.set("bindListeners", js.undefined)
    @scala.inline
    def setDispatcher(value: js.Any): Self = this.set("dispatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDispatcher: Self = this.set("dispatcher", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmitChange(value: () => Unit): Self = this.set("emitChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEmitChange: Self = this.set("emitChange", js.undefined)
    @scala.inline
    def setExportAsync(value: /* source */ Source => Unit): Self = this.set("exportAsync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExportAsync: Self = this.set("exportAsync", js.undefined)
    @scala.inline
    def setExportPublicMethods(value: /* exportConfig */ js.Any => Unit): Self = this.set("exportPublicMethods", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExportPublicMethods: Self = this.set("exportPublicMethods", js.undefined)
    @scala.inline
    def setGetInstance(value: () => AltStore[S]): Self = this.set("getInstance", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetInstance: Self = this.set("getInstance", js.undefined)
    @scala.inline
    def setGetState(value: () => S): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetState: Self = this.set("getState", js.undefined)
    @scala.inline
    def setObserve(value: /* alt */ Alt => _): Self = this.set("observe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteObserve: Self = this.set("observe", js.undefined)
    @scala.inline
    def setOn(value: (/* event */ lifeCycleEvents, /* callback */ js.Function0[_]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnDeserialize(value: /* fn */ js.Function1[/* data */ js.Any, _] => Unit): Self = this.set("onDeserialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeserialize: Self = this.set("onDeserialize", js.undefined)
    @scala.inline
    def setOnSerialize(value: /* fn */ js.Function1[/* data */ js.Any, _] => Unit): Self = this.set("onSerialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSerialize: Self = this.set("onSerialize", js.undefined)
    @scala.inline
    def setOtherwise(value: (/* data */ js.Any, /* action */ Action[_]) => Unit): Self = this.set("otherwise", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOtherwise: Self = this.set("otherwise", js.undefined)
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    @scala.inline
    def setReduce(value: (/* state */ js.Any, /* config */ StoreReduce) => js.Object): Self = this.set("reduce", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReduce: Self = this.set("reduce", js.undefined)
    @scala.inline
    def setRegisterAsync(value: /* datasource */ Source => Unit): Self = this.set("registerAsync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRegisterAsync: Self = this.set("registerAsync", js.undefined)
  }
  
}

