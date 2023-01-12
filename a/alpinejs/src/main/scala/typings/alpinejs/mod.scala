package typings.alpinejs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.alpinejs.anon.During
import typings.alpinejs.anon.InitialValue
import typings.alpinejs.anon.Name
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Record
import typings.std.ThisType
import typings.vueReactivity.mod.ReactiveEffect
import typings.vueReactivity.mod.ReactiveEffectOptions
import typings.vueReactivity.mod.UnwrapNestedRefs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("alpinejs", JSImport.Default)
  @js.native
  val default: Alpine = js.native
  
  @js.native
  trait Alpine extends StObject {
    
    def addInitSelector(selectorCallback: js.Function0[String]): Unit = js.native
    
    def addRootSelector(selectorCallback: js.Function0[String]): Unit = js.native
    
    def addScopeToNode(node: Node, data: js.Object): js.Function0[Unit] = js.native
    def addScopeToNode(node: Node, data: js.Object, referenceNode: Node): js.Function0[Unit] = js.native
    
    def clone(oldEl: Node, newEl: Node): Unit = js.native
    
    def closestDataStack(node: Node): js.Array[js.Object] = js.native
    
    def closestRoot(el: Node): js.UndefOr[Node] = js.native
    def closestRoot(el: Node, includeInitSelectors: Boolean): js.UndefOr[Node] = js.native
    
    /**
      * Provides a way to reuse x-data contexts within your application.
      *
      * @param name the id of the x-data context
      * @param callback the initializer of the x-data context
      */
    def data(name: String, callback: js.Function1[/* repeated */ Any, AlpineComponent[Record[String, Any]]]): Unit = js.native
    
    def debounce[A /* <: js.Array[Any] */, R](func: js.Function1[/* args */ A, R]): js.Function1[/* args */ A, R] = js.native
    def debounce[A /* <: js.Array[Any] */, R](func: js.Function1[/* args */ A, R], wait: Double): js.Function1[/* args */ A, R] = js.native
    
    def deferMutations(): Unit = js.native
    
    /**
      * Allows you to register your own custom directives.
      *
      * @param name the name of the directive, "foo" would be consumed as "x-foo"
      * @param handler a callback function to apply the directive on the node element
      */
    def directive(
      name: String,
      handler: js.Function3[
          /* el */ Node, 
          /* directive */ DirectiveParameters, 
          /* utilities */ DirectiveUtilities, 
          Unit
        ]
    ): Unit = js.native
    
    def disableEffectScheduling(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * As soon as effect is called, it will run the provided callback
      * functionbut actively look for any interactions with reactive
      * data. If it detects an interaction (a get or set from the
      * aforementioned reactive proxy) it will keep track of it and
      * make sure to re-run the callback if any of reactive data
      * changes in the future.
      *
      * @param callback the function to be run while looking for reactive interactions
      */
    def effect(callback: js.Function0[Any]): ReactiveEffectRunner[Any] = js.native
    def effect(callback: js.Function0[Any], options: ReactiveEffectOptions): ReactiveEffectRunner[Any] = js.native
    def effect(callback: ReactiveEffectRunner[Any]): ReactiveEffectRunner[Any] = js.native
    def effect(callback: ReactiveEffectRunner[Any], options: ReactiveEffectOptions): ReactiveEffectRunner[Any] = js.native
    
    def evaluate(el: Node, expression: String): Any = js.native
    def evaluate(el: Node, expression: String, extras: js.Object): Any = js.native
    
    def evaluateLater(el: Node, expression: String): js.Function1[/* resultCallback */ js.Function1[/* result */ Any, Unit], Unit] = js.native
    @JSName("evaluateLater")
    var evaluateLater_Original: Evaluator = js.native
    
    def flushAndStopDeferringMutations(): Unit = js.native
    
    def initTree(el: Node): Unit = js.native
    def initTree(el: Node, walker: Walker): Unit = js.native
    
    /**
      * **INTERNAL: not public API and is subject to change without major release**
      * @internal
      */
    def interceptor[V](
      callback: js.Function5[
          /* initialValue */ V, 
          /* getter */ js.Function0[V], 
          /* setter */ js.Function1[/* value */ V, Unit], 
          /* path */ String, 
          /* key */ String, 
          V
        ]
    ): js.Function1[/* initialValue */ V, V] = js.native
    def interceptor[V](
      callback: js.Function5[
          /* initialValue */ V, 
          /* getter */ js.Function0[V], 
          /* setter */ js.Function1[/* value */ V, Unit], 
          /* path */ String, 
          /* key */ String, 
          V
        ],
      mutateObj: js.Function1[/* obj */ InitialValue[V], Unit]
    ): js.Function1[/* initialValue */ V, V] = js.native
    
    /**
      * Registers a global magics helper, which can be referenced in
      * expressions using $[name]. Return a function instead of a value
      * in the callback to provide a function magic helper
      * through $[name](...).
      *
      * @param name identifier of the magic function, without prefixed '$'
      * @param callback function to evaluate the magic helper
      */
    def magic(
      name: String,
      callback: js.Function2[/* el */ Node, /* extras */ typings.alpinejs.anon.Alpine, Any]
    ): Unit = js.native
    
    def mapAttributes(callback: AttributeTransformer[Any]): Unit = js.native
    
    def mergeProxies(objects: js.Array[Any]): Any = js.native
    def mergeProxies[T, U](objects: js.Tuple2[T, U]): T & U = js.native
    def mergeProxies[T, U, V](objects: js.Tuple3[T, U, V]): T & U & V = js.native
    def mergeProxies[T, U, V, W](objects: js.Tuple4[T, U, V, W]): T & U & V & W = js.native
    @JSName("mergeProxies")
    def mergeProxies_Object(objects: js.Array[Any]): js.Object = js.native
    @JSName("mergeProxies")
    def mergeProxies_T_T[T](objects: js.Array[T]): T = js.native
    
    def mutateDom[R](callback: js.Function0[R]): R = js.native
    
    def nextTick(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Convenience method to prevent consumers of a plugin from having
      * to register multiple different directives and magics themselves,
      * by providing the Alpine global object as argument in the callback.
      *
      * @param callback plugin installation function
      */
    def plugin(callback: js.Function1[/* alpine */ this.type, Unit]): Unit = js.native
    
    def prefix(newPrefix: String): Unit = js.native
    
    def prefixed(): String = js.native
    def prefixed(subject: String): String = js.native
    
    /**
      * Returns the raw, original object of a reactive proxy. This is an escape
      * hatch that can be used to temporarily read without incurring proxy
      * access/tracking overhead or write without triggering changes. It is not
      * recommended to hold a persistent reference to the original object.
      * Use with caution.
      *
      * @param observed the reactive, proxied object
      */
    def raw[T](observed: T): T = js.native
    
    // following TSDoc under MIT was taken from
    // https://github.com/vuejs/vue-next/blob/92f11d6740929f5b591740e30ae5fba50940ec82/packages/reactivity/src/reactive.ts#L65-L87
    /**
      * Creates a reactive copy of the original object.
      * The reactive conversion is "deep"—it affects all nested properties. In the
      * ES2015 Proxy based implementation, the returned proxy is **not** equal to the
      * original object. It is recommended to work exclusively with the reactive
      * proxy and avoid relying on the original object.
      *
      * A reactive object also automatically unwraps refs contained in it, so you
      * don't need to use `.value` when accessing and mutating their value:
      *
      * ```js
      * const count = ref(0)
      * const obj = reactive({
      *   count
      * })
      *
      * obj.count++
      * obj.count // -> 1
      * count.value // -> 1
      * ```
      */
    def reactive[T /* <: js.Object */](target: T): UnwrapNestedRefs[T] = js.native
    
    /**
      * Releases/stops a reactive effect, if it is currently active.
      *
      * @param runner the reactive effect runner to be stopped
      */
    def release(runner: ReactiveEffectRunner[Any]): Unit = js.native
    
    def setEvaluator(newEvaluator: Evaluator): Unit = js.native
    
    def setReactivityEngine(engine: ReactivityEngine): Unit = js.native
    
    def setStyles(el: Node, value: String): js.Function0[Unit] = js.native
    /**
      * INTERNAL
      * @internal
      */
    def setStyles(el: Node, value: Record[String, String]): js.Function0[Unit] = js.native
    
    def skipDuringClone[R](
      callback: js.Function3[/* el */ Node, /* params */ DirectiveParameters, /* utils */ DirectiveUtilities, R]
    ): js.Function3[/* el */ Node, /* params */ DirectiveParameters, /* utils */ DirectiveUtilities, R] = js.native
    def skipDuringClone[R](
      callback: js.Function3[/* el */ Node, /* params */ DirectiveParameters, /* utils */ DirectiveUtilities, R],
      fallback: js.Function3[/* el */ Node, /* params */ DirectiveParameters, /* utils */ DirectiveUtilities, R]
    ): js.Function3[/* el */ Node, /* params */ DirectiveParameters, /* utils */ DirectiveUtilities, R] = js.native
    
    /**
      * Initializes Alpine.js, which is required if Alpine is imported
      * into a bundle instead of included from a script tag.
      *
      * Extensions must have been registered IN BETWEEN when the Alpine
      * global object is imported and when Alpine is initialized with
      * the Alpine.start() call.
      */
    def start(): Unit = js.native
    
    /**
      * Retrieves state in the global store.
      *
      * @param name state key
      */
    def store(name: String): XData = js.native
    /**
      * Sets state in the global store.
      *
      * @param name state key
      * @param value the initial state value
      */
    def store(name: String, value: XData): Unit = js.native
    
    def throttle[A /* <: js.Array[Any] */](func: js.Function1[/* args */ A, Unit]): js.Function1[/* args */ A, Unit] = js.native
    def throttle[A /* <: js.Array[Any] */](func: js.Function1[/* args */ A, Unit], limit: Double): js.Function1[/* args */ A, Unit] = js.native
    
    /**
      * **INTERNAL**
      * @internal
      */
    def transition(
      el: Node,
      setFunction: js.Function2[/* el */ Node, /* styles */ (Record[String, String]) | String, js.Function0[Unit]],
      duringStartAndEnd: During,
      before: js.Function0[Unit],
      after: js.Function0[Unit]
    ): Unit = js.native
    
    /**
      * Version of Alpine.js
      */
    var version: String = js.native
  }
  
  type AlpineComponent[T] = T & XDataContext & (ThisType[T & XDataContext & AlpineMagics[T]])
  
  @js.native
  trait AlpineMagics[T] extends StObject {
    
    /**
      * Access to current Alpine data.
      */
    @JSName("$data")
    var $data: T = js.native
    
    /**
      * Dispatch browser events.
      *
      * @param event the event name
      * @param data an event-dependent value associated with the event, the value is then available to the handler using the CustomEvent.detail property
      */
    @JSName("$dispatch")
    def $dispatch(event: String): Unit = js.native
    @JSName("$dispatch")
    def $dispatch(event: String, data: Any): Unit = js.native
    
    /**
      * Retrieve the current DOM node.
      */
    @JSName("$el")
    var $el: HTMLElement = js.native
    
    /**
      * Generate an element's ID and ensure that it won't conflict with other IDs of the same name on the same page.
      *
      * @param name the name of the id
      * @param key suffix on the end of the generated ID, usually helpful for the purpose of identifying id in a loop
      */
    @JSName("$id")
    def $id(name: String): String = js.native
    @JSName("$id")
    def $id(name: String, key: String): String = js.native
    @JSName("$id")
    def $id(name: String, key: Double): String = js.native
    
    /**
      * Execute a given expression AFTER Alpine has made its reactive DOM updates.
      *
      * @param callback a callback that will be fired after Alpine finishes updating the DOM
      */
    @JSName("$nextTick")
    def $nextTick(): js.Promise[Unit] = js.native
    @JSName("$nextTick")
    def $nextTick(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    /**
      * Retrieve DOM elements marked with x-ref inside the component.
      */
    @JSName("$refs")
    var $refs: Record[String, HTMLElement] = js.native
    
    /**
      * Access registered global Alpine stores.
      */
    @JSName("$store")
    var $store: XData = js.native
    
    /**
      * Fire the given callback when the value in the property is changed.
      *
      * @param property the component property
      * @param callback a callback that will fire when a given property is changed
      */
    @JSName("$watch")
    def $watch[V /* <: /* import warning: importer.ImportType#apply Failed type conversion: string extends keyof T ? T[string] : any */ js.Any */](property: String, callback: js.Function2[/* newValue */ V, /* oldValue */ V, Unit]): Unit = js.native
  }
  
  type AttributeTransformer[T] = js.Function1[/* args */ Name[T], Name[T]]
  
  trait DirectiveParameters extends StObject {
    
    var expression: String
    
    var modifiers: js.Array[String]
    
    var original: String
    
    var `type`: String
    
    var value: String
  }
  object DirectiveParameters {
    
    inline def apply(expression: String, modifiers: js.Array[String], original: String, `type`: String, value: String): DirectiveParameters = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectiveParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectiveParameters] (val x: Self) extends AnyVal {
      
      inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setModifiers(value: js.Array[String]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersVarargs(value: String*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectiveUtilities extends StObject {
    
    var Alpine: typings.alpinejs.mod.Alpine
    
    def cleanup(): Unit
    
    def effect(): Unit
    
    def evaluate(expression: String): Any
    
    def evaluateLater(expression: String): js.Function1[/* result */ Any, Unit]
  }
  object DirectiveUtilities {
    
    inline def apply(
      Alpine: Alpine,
      cleanup: () => Unit,
      effect: () => Unit,
      evaluate: String => Any,
      evaluateLater: String => js.Function1[/* result */ Any, Unit]
    ): DirectiveUtilities = {
      val __obj = js.Dynamic.literal(Alpine = Alpine.asInstanceOf[js.Any], cleanup = js.Any.fromFunction0(cleanup), effect = js.Any.fromFunction0(effect), evaluate = js.Any.fromFunction1(evaluate), evaluateLater = js.Any.fromFunction1(evaluateLater))
      __obj.asInstanceOf[DirectiveUtilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectiveUtilities] (val x: Self) extends AnyVal {
      
      inline def setAlpine(value: Alpine): Self = StObject.set(x, "Alpine", value.asInstanceOf[js.Any])
      
      inline def setCleanup(value: () => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      inline def setEffect(value: () => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction0(value))
      
      inline def setEvaluate(value: String => Any): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
      
      inline def setEvaluateLater(value: String => js.Function1[/* result */ Any, Unit]): Self = StObject.set(x, "evaluateLater", js.Any.fromFunction1(value))
    }
  }
  
  type Evaluator = js.Function2[
    /* el */ Node, 
    /* expression */ String, 
    js.Function1[/* resultCallback */ js.Function1[/* result */ Any, Unit], Unit]
  ]
  
  @js.native
  trait ReactiveEffectRunner[T] extends StObject {
    
    def apply(): T = js.native
    
    var effect: ReactiveEffect[Any] = js.native
  }
  
  trait ReactivityEngine extends StObject {
    
    def effect(callback: js.Function0[Any]): ReactiveEffectRunner[Any]
    def effect(callback: js.Function0[Any], options: ReactiveEffectOptions): ReactiveEffectRunner[Any]
    def effect(callback: ReactiveEffectRunner[Any]): ReactiveEffectRunner[Any]
    def effect(callback: ReactiveEffectRunner[Any], options: ReactiveEffectOptions): ReactiveEffectRunner[Any]
    @JSName("effect")
    var effect_Original: js.Function2[
        /* callback */ js.Function0[Any] | ReactiveEffectRunner[Any], 
        /* options */ js.UndefOr[ReactiveEffectOptions], 
        ReactiveEffectRunner[Any]
      ]
    
    def raw[T](observed: T): T
    @JSName("raw")
    var raw_Original: js.Function1[/* observed */ Any, Any]
    
    def reactive[T /* <: js.Object */](target: T): UnwrapNestedRefs[T]
    @JSName("reactive")
    var reactive_Original: js.Function1[/* target */ js.Object, UnwrapNestedRefs[js.Object]]
    
    def release(runner: ReactiveEffectRunner[Any]): Unit
    @JSName("release")
    var release_Original: js.Function1[/* runner */ ReactiveEffectRunner[Any], Unit]
  }
  object ReactivityEngine {
    
    inline def apply(
      effect: (/* callback */ js.Function0[Any] | ReactiveEffectRunner[Any], /* options */ js.UndefOr[ReactiveEffectOptions]) => ReactiveEffectRunner[Any],
      raw: /* observed */ Any => Any,
      reactive: /* target */ js.Object => UnwrapNestedRefs[js.Object],
      release: /* runner */ ReactiveEffectRunner[Any] => Unit
    ): ReactivityEngine = {
      val __obj = js.Dynamic.literal(effect = js.Any.fromFunction2(effect), raw = js.Any.fromFunction1(raw), reactive = js.Any.fromFunction1(reactive), release = js.Any.fromFunction1(release))
      __obj.asInstanceOf[ReactivityEngine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReactivityEngine] (val x: Self) extends AnyVal {
      
      inline def setEffect(
        value: (/* callback */ js.Function0[Any] | ReactiveEffectRunner[Any], /* options */ js.UndefOr[ReactiveEffectOptions]) => ReactiveEffectRunner[Any]
      ): Self = StObject.set(x, "effect", js.Any.fromFunction2(value))
      
      inline def setRaw(value: /* observed */ Any => Any): Self = StObject.set(x, "raw", js.Any.fromFunction1(value))
      
      inline def setReactive(value: /* target */ js.Object => UnwrapNestedRefs[js.Object]): Self = StObject.set(x, "reactive", js.Any.fromFunction1(value))
      
      inline def setRelease(value: /* runner */ ReactiveEffectRunner[Any] => Unit): Self = StObject.set(x, "release", js.Any.fromFunction1(value))
    }
  }
  
  type Walker = js.Function2[
    /* el */ Node, 
    /* callback */ js.Function2[/* el */ Node, /* skip */ js.Function0[Unit], Unit], 
    Unit
  ]
  
  type XData = XDataContext | String | Double | Boolean
  
  trait XDataContext
    extends StObject
       with /* stateKey */ StringDictionary[Any] {
    
    /**
      * Will be executed before Alpine initializes teh rest of the component.
      */
    var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object XDataContext {
    
    inline def apply(): XDataContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XDataContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XDataContext] (val x: Self) extends AnyVal {
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
  
  type _To = Alpine
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Alpine = default
}
