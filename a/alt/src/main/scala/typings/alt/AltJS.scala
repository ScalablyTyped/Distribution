package typings.alt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AltJS {
  
  @js.native
  sealed trait lifeCycleEvents extends StObject
  @JSGlobal("AltJS.lifeCycleEvents")
  @js.native
  object lifeCycleEvents extends StObject {
    
    @js.native
    sealed trait bootstrap extends lifeCycleEvents
    
    @js.native
    sealed trait error extends lifeCycleEvents
    
    @js.native
    sealed trait init extends lifeCycleEvents
    
    @js.native
    sealed trait rollback extends lifeCycleEvents
    
    @js.native
    sealed trait snapshot extends lifeCycleEvents
  }
  
  @js.native
  trait Action[T] extends StObject {
    
    def apply(args: T): Unit = js.native
    
    def defer(data: js.Any): Unit = js.native
  }
  
  type ActionHandler = js.Function1[/* repeated */ js.Any, js.Any]
  
  type Actions = StringDictionary[Action[js.Any]]
  
  @js.native
  trait ActionsClass extends StObject {
    
    var actions: js.UndefOr[Actions] = js.native
    
    def dispatch(payload: js.Any*): Unit = js.native
    
    var generateActions: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.native
  }
  object ActionsClass {
    
    @scala.inline
    def apply(dispatch: /* repeated */ js.Any => Unit): ActionsClass = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch))
      __obj.asInstanceOf[ActionsClass]
    }
    
    @scala.inline
    implicit class ActionsClassMutableBuilder[Self <: ActionsClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setDispatch(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateActions(value: /* repeated */ String => Unit): Self = StObject.set(x, "generateActions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGenerateActionsUndefined: Self = StObject.set(x, "generateActions", js.undefined)
    }
  }
  
  type ActionsClassConstructor = Instantiable1[/* alt */ Alt, ActionsClass]
  
  @js.native
  trait Alt extends StObject {
    
    var actions: Actions = js.native
    
    //Actions methods
    def addActions(actionsName: String, ActionsClass: ActionsClassConstructor): Unit = js.native
    
    //Stores methods
    def addStore(name: String, store: StoreModel[_]): Unit = js.native
    def addStore(name: String, store: StoreModel[_], saveStore: Boolean): Unit = js.native
    
    def bootstrap(jsonData: String): Unit = js.native
    
    def createActions[T](ActionsClass: ActionsClassConstructor): T = js.native
    def createActions[T](
      ActionsClass: ActionsClassConstructor,
      exportObj: js.UndefOr[scala.Nothing],
      constructorArgs: js.Any*
    ): T = js.native
    def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: js.Object): T = js.native
    def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: js.Object, constructorArgs: js.Any*): T = js.native
    
    def createStore[S](store: StoreModel[S]): AltStore[S] = js.native
    def createStore[S](store: StoreModel[S], name: String): AltStore[S] = js.native
    
    def dispatch(): Unit = js.native
    def dispatch(action: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], details: js.Any): Unit = js.native
    def dispatch(action: js.UndefOr[scala.Nothing], data: js.Object): Unit = js.native
    def dispatch(action: js.UndefOr[scala.Nothing], data: js.Object, details: js.Any): Unit = js.native
    def dispatch(action: String): Unit = js.native
    def dispatch(action: String, data: js.UndefOr[scala.Nothing], details: js.Any): Unit = js.native
    def dispatch(action: String, data: js.Object): Unit = js.native
    def dispatch(action: String, data: js.Object, details: js.Any): Unit = js.native
    def dispatch(action: Action[_]): Unit = js.native
    def dispatch(action: Action[_], data: js.UndefOr[scala.Nothing], details: js.Any): Unit = js.native
    def dispatch(action: Action[_], data: js.Object): Unit = js.native
    def dispatch(action: Action[_], data: js.Object, details: js.Any): Unit = js.native
    
    def flush(): js.Object = js.native
    
    def generateActions[T](actions: String*): T = js.native
    
    def getActions(actionsName: String): Actions = js.native
    
    def getStore(name: String): AltStore[_] = js.native
    
    def recycle(stores: AltStore[_]*): Unit = js.native
    
    def rollback(): Unit = js.native
    
    def takeSnapshot(storeNames: String*): String = js.native
  }
  
  @js.native
  trait AltConfig extends StObject {
    
    var batchingFunction: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.native
    
    var deserialize: js.UndefOr[
        js.Function1[/* deserializeFn */ js.Function1[/* serialData */ String, js.Object], Unit]
      ] = js.native
    
    var dispatcher: js.UndefOr[js.Any] = js.native
    
    var serialize: js.UndefOr[js.Function1[/* serializeFn */ js.Function1[/* data */ js.Object, String], Unit]] = js.native
    
    var storeTransforms: js.UndefOr[js.Array[StateTransform]] = js.native
  }
  object AltConfig {
    
    @scala.inline
    def apply(): AltConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AltConfig]
    }
    
    @scala.inline
    implicit class AltConfigMutableBuilder[Self <: AltConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchingFunction(value: /* callback */ js.Function1[/* repeated */ js.Any, _] => Unit): Self = StObject.set(x, "batchingFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBatchingFunctionUndefined: Self = StObject.set(x, "batchingFunction", js.undefined)
      
      @scala.inline
      def setDeserialize(value: /* deserializeFn */ js.Function1[/* serialData */ String, js.Object] => Unit): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      @scala.inline
      def setDispatcher(value: js.Any): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
      
      @scala.inline
      def setSerialize(value: /* serializeFn */ js.Function1[/* data */ js.Object, String] => Unit): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setStoreTransforms(value: js.Array[StateTransform]): Self = StObject.set(x, "storeTransforms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreTransformsUndefined: Self = StObject.set(x, "storeTransforms", js.undefined)
      
      @scala.inline
      def setStoreTransformsVarargs(value: StateTransform*): Self = StObject.set(x, "storeTransforms", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AltFactory
    extends Instantiable0[Alt]
       with Instantiable1[/* config */ AltConfig, Alt]
  
  @js.native
  trait AltStore[S] extends StObject {
    
    def emitChange(): Unit = js.native
    
    def getState(): S = js.native
    
    def listen(handler: js.Function1[/* state */ S, _]): js.Function0[Unit] = js.native
    
    def unlisten(handler: js.Function1[/* state */ S, _]): Unit = js.native
  }
  object AltStore {
    
    @scala.inline
    def apply[S](
      emitChange: () => Unit,
      getState: () => S,
      listen: js.Function1[/* state */ S, _] => js.Function0[Unit],
      unlisten: js.Function1[/* state */ S, _] => Unit
    ): AltStore[S] = {
      val __obj = js.Dynamic.literal(emitChange = js.Any.fromFunction0(emitChange), getState = js.Any.fromFunction0(getState), listen = js.Any.fromFunction1(listen), unlisten = js.Any.fromFunction1(unlisten))
      __obj.asInstanceOf[AltStore[S]]
    }
    
    @scala.inline
    implicit class AltStoreMutableBuilder[Self <: AltStore[_], S] (val x: Self with AltStore[S]) extends AnyVal {
      
      @scala.inline
      def setEmitChange(value: () => Unit): Self = StObject.set(x, "emitChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListen(value: js.Function1[/* state */ S, _] => js.Function0[Unit]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnlisten(value: js.Function1[/* state */ S, _] => Unit): Self = StObject.set(x, "unlisten", js.Any.fromFunction1(value))
    }
  }
  
  type ExportConfig = StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]
  
  type Source = StringDictionary[js.Function0[SourceModel[js.Any]]]
  
  @js.native
  trait SourceModel[S] extends StObject {
    
    def error(args: js.Any): Unit = js.native
    
    var interceptResponse: js.UndefOr[
        js.Function3[/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any, _]
      ] = js.native
    
    var loading: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.native
    
    var local: js.UndefOr[js.Function2[/* state */ js.Any, /* repeated */ js.Any, _]] = js.native
    
    def remote(state: js.Any, args: js.Any*): js.Promise[S] = js.native
    
    var shouldFetch: js.UndefOr[js.Function1[/* fetchFn */ js.Function1[/* repeated */ js.Any, Boolean], Unit]] = js.native
    
    def success(state: S): Unit = js.native
  }
  object SourceModel {
    
    @scala.inline
    def apply[S](
      error: js.Any => Unit,
      remote: (js.Any, /* repeated */ js.Any) => js.Promise[S],
      success: S => Unit
    ): SourceModel[S] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), remote = js.Any.fromFunction2(remote), success = js.Any.fromFunction1(success))
      __obj.asInstanceOf[SourceModel[S]]
    }
    
    @scala.inline
    implicit class SourceModelMutableBuilder[Self <: SourceModel[_], S] (val x: Self with SourceModel[S]) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInterceptResponse(value: (/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any) => _): Self = StObject.set(x, "interceptResponse", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInterceptResponseUndefined: Self = StObject.set(x, "interceptResponse", js.undefined)
      
      @scala.inline
      def setLoading(value: /* args */ js.Any => Unit): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setLocal(value: (/* state */ js.Any, /* repeated */ js.Any) => _): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setRemote(value: (js.Any, /* repeated */ js.Any) => js.Promise[S]): Self = StObject.set(x, "remote", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldFetch(value: /* fetchFn */ js.Function1[/* repeated */ js.Any, Boolean] => Unit): Self = StObject.set(x, "shouldFetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldFetchUndefined: Self = StObject.set(x, "shouldFetch", js.undefined)
      
      @scala.inline
      def setSuccess(value: S => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    }
  }
  
  type StateTransform = js.Function1[/* store */ StoreModel[js.Any], AltStore[js.Any]]
  
  @js.native
  trait StoreModel[S] extends StObject {
    
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
    implicit class StoreModelMutableBuilder[Self <: StoreModel[_], S] (val x: Self with StoreModel[S]) extends AnyVal {
      
      @scala.inline
      def setAfterEach(value: (/* payload */ js.Object, /* state */ js.Object) => Unit): Self = StObject.set(x, "afterEach", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
      
      @scala.inline
      def setAlt(value: Alt): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setBeforeEach(value: (/* payload */ js.Object, /* state */ js.Object) => Unit): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
      
      @scala.inline
      def setBindAction(value: (/* action */ Action[_], /* handler */ ActionHandler) => Unit): Self = StObject.set(x, "bindAction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBindActionUndefined: Self = StObject.set(x, "bindAction", js.undefined)
      
      @scala.inline
      def setBindActions(value: /* actions */ ActionsClass => Unit): Self = StObject.set(x, "bindActions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBindActionsUndefined: Self = StObject.set(x, "bindActions", js.undefined)
      
      @scala.inline
      def setBindListeners(value: /* config */ StringDictionary[Action[_] | Actions] => Unit): Self = StObject.set(x, "bindListeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBindListenersUndefined: Self = StObject.set(x, "bindListeners", js.undefined)
      
      @scala.inline
      def setDispatcher(value: js.Any): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setEmitChange(value: () => Unit): Self = StObject.set(x, "emitChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmitChangeUndefined: Self = StObject.set(x, "emitChange", js.undefined)
      
      @scala.inline
      def setExportAsync(value: /* source */ Source => Unit): Self = StObject.set(x, "exportAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExportAsyncUndefined: Self = StObject.set(x, "exportAsync", js.undefined)
      
      @scala.inline
      def setExportPublicMethods(value: /* exportConfig */ js.Any => Unit): Self = StObject.set(x, "exportPublicMethods", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExportPublicMethodsUndefined: Self = StObject.set(x, "exportPublicMethods", js.undefined)
      
      @scala.inline
      def setGetInstance(value: () => AltStore[S]): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInstanceUndefined: Self = StObject.set(x, "getInstance", js.undefined)
      
      @scala.inline
      def setGetState(value: () => S): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      @scala.inline
      def setObserve(value: /* alt */ Alt => _): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
      
      @scala.inline
      def setOn(value: (/* event */ lifeCycleEvents, /* callback */ js.Function0[_]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDeserialize(value: /* fn */ js.Function1[/* data */ js.Any, _] => Unit): Self = StObject.set(x, "onDeserialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeserializeUndefined: Self = StObject.set(x, "onDeserialize", js.undefined)
      
      @scala.inline
      def setOnSerialize(value: /* fn */ js.Function1[/* data */ js.Any, _] => Unit): Self = StObject.set(x, "onSerialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSerializeUndefined: Self = StObject.set(x, "onSerialize", js.undefined)
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOtherwise(value: (/* data */ js.Any, /* action */ Action[_]) => Unit): Self = StObject.set(x, "otherwise", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setReduce(value: (/* state */ js.Any, /* config */ StoreReduce) => js.Object): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      @scala.inline
      def setRegisterAsync(value: /* datasource */ Source => Unit): Self = StObject.set(x, "registerAsync", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterAsyncUndefined: Self = StObject.set(x, "registerAsync", js.undefined)
      
      @scala.inline
      def setSetState(
        value: (js.UndefOr[js.Function1[/* state */ S, Unit]]) with (js.UndefOr[
              js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]
            ])
      ): Self = StObject.set(x, "setState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitFor(
        value: (js.UndefOr[js.Function1[/* store */ AltStore[_], Unit]]) with (js.UndefOr[js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit]])
      ): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoreReduce extends StObject {
    
    var action: js.Any = js.native
    
    var data: js.Any = js.native
  }
  object StoreReduce {
    
    @scala.inline
    def apply(action: js.Any, data: js.Any): StoreReduce = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreReduce]
    }
    
    @scala.inline
    implicit class StoreReduceMutableBuilder[Self <: StoreReduce] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: js.Any): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
