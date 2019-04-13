package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $rootScope - $rootScopeProvider - service in module ng
  * see https://docs.angularjs.org/api/ng/type/$rootScope.Scope and https://docs.angularjs.org/api/ng/service/$rootScope
  */
@js.native
trait IRootScopeService extends js.Object {
  // Hidden members
  @JSName("$$isolateBindings")
  var $$isolateBindings: js.Any = js.native
  @JSName("$$phase")
  var $$phase: js.Any = js.native
  @JSName("$id")
  var $id: scala.Double = js.native
  @JSName("$parent")
  var $parent: IScope = js.native
  @JSName("$root")
  var $root: IRootScopeService = js.native
  @JSName("$apply")
  def $apply(): js.Any = js.native
  @JSName("$apply")
  def $apply(exp: java.lang.String): js.Any = js.native
  @JSName("$apply")
  def $apply(exp: js.Function1[/* scope */ IScope, _]): js.Any = js.native
  @JSName("$applyAsync")
  def $applyAsync(): js.Any = js.native
  @JSName("$applyAsync")
  def $applyAsync(exp: java.lang.String): js.Any = js.native
  @JSName("$applyAsync")
  def $applyAsync(exp: js.Function1[/* scope */ IScope, _]): js.Any = js.native
  /**
    * Dispatches an event name downwards to all child scopes (and their children) notifying the registered $rootScope.Scope listeners.
    *
    * The event life cycle starts at the scope on which $broadcast was called. All listeners listening for name event on this scope get notified. Afterwards, the event propagates to all direct and indirect scopes of the current scope and calls all registered listeners along the way. The event cannot be canceled.
    *
    * Any exception emitted from the listeners will be passed onto the $exceptionHandler service.
    *
    * @param name Event name to broadcast.
    * @param args Optional one or more arguments which will be passed onto the event listeners.
    */
  @JSName("$broadcast")
  def $broadcast(name: java.lang.String, args: js.Any*): IAngularEvent = js.native
  @JSName("$destroy")
  def $destroy(): scala.Unit = js.native
  @JSName("$digest")
  def $digest(): scala.Unit = js.native
  /**
    * Dispatches an event name upwards through the scope hierarchy notifying the registered $rootScope.Scope listeners.
    *
    * The event life cycle starts at the scope on which $emit was called. All listeners listening for name event on this scope get notified. Afterwards, the event traverses upwards toward the root scope and calls all registered listeners along the way. The event will stop propagating if one of the listeners cancels it.
    *
    * Any exception emitted from the listeners will be passed onto the $exceptionHandler service.
    *
    * @param name Event name to emit.
    * @param args Optional one or more arguments which will be passed onto the event listeners.
    */
  @JSName("$emit")
  def $emit(name: java.lang.String, args: js.Any*): IAngularEvent = js.native
  @JSName("$eval")
  def $eval(): js.Any = js.native
  @JSName("$eval")
  def $eval(expression: java.lang.String): js.Any = js.native
  @JSName("$eval")
  def $eval(expression: java.lang.String, locals: js.Object): js.Any = js.native
  @JSName("$eval")
  def $eval(expression: js.Function1[/* scope */ IScope, _]): js.Any = js.native
  @JSName("$eval")
  def $eval(expression: js.Function1[/* scope */ IScope, _], locals: js.Object): js.Any = js.native
  @JSName("$evalAsync")
  def $evalAsync(): scala.Unit = js.native
  @JSName("$evalAsync")
  def $evalAsync(expression: java.lang.String): scala.Unit = js.native
  @JSName("$evalAsync")
  def $evalAsync(expression: java.lang.String, locals: js.Object): scala.Unit = js.native
  @JSName("$evalAsync")
  def $evalAsync(expression: js.Function1[/* scope */ IScope, scala.Unit]): scala.Unit = js.native
  @JSName("$evalAsync")
  def $evalAsync(expression: js.Function1[/* scope */ IScope, scala.Unit], locals: js.Object): scala.Unit = js.native
  /**
    * Call this method to determine if this scope has been explicitly suspended. It will not
    * tell you whether an ancestor has been suspended.
    * To determine if this scope will be excluded from a digest triggered at the $rootScope,
    * for example, you must check all its ancestors:
    *
    * ```
    * function isExcludedFromDigest(scope) {
    *   while(scope) {
    *     if (scope.$isSuspended()) return true;
    *     scope = scope.$parent;
    *   }
    *   return false;
    * ```
    *
    * Be aware that a scope may not be included in digests if it has a suspended ancestor,
    * even if `$isSuspended()` returns false.
    *
    * @returns true if the current scope has been suspended.
    */
  @JSName("$isSuspended")
  def $isSuspended(): scala.Boolean = js.native
  // Defaults to false by the implementation checking strategy
  @JSName("$new")
  def $new(): IScope = js.native
  @JSName("$new")
  def $new(isolate: scala.Boolean): IScope = js.native
  @JSName("$new")
  def $new(isolate: scala.Boolean, parent: IScope): IScope = js.native
  /**
    * Listens on events of a given type. See $emit for discussion of event life cycle.
    *
    * The event listener function format is: function(event, args...).
    *
    * @param name Event name to listen on.
    * @param listener Function to call when the event is emitted.
    */
  @JSName("$on")
  def $on(
    name: java.lang.String,
    listener: js.Function2[/* event */ IAngularEvent, /* repeated */ js.Any, _]
  ): js.Function0[scala.Unit] = js.native
  /**
    * Resume watchers of this scope subtree in case it was suspended.
    *
    * See {$rootScope.Scope#$suspend} for information about the dangers of using this approach.
    */
  @JSName("$resume")
  def $resume(): scala.Unit = js.native
  /**
    * Suspend watchers of this scope subtree so that they will not be invoked during digest.
    *
    * This can be used to optimize your application when you know that running those watchers
    * is redundant.
    *
    * **Warning**
    *
    * Suspending scopes from the digest cycle can have unwanted and difficult to debug results.
    * Only use this approach if you are confident that you know what you are doing and have
    * ample tests to ensure that bindings get updated as you expect.
    *
    * Some of the things to consider are:
    *
    * * Any external event on a directive/component will not trigger a digest while the hosting
    *   scope is suspended - even if the event handler calls `$apply()` or `$rootScope.$digest()`.
    * * Transcluded content exists on a scope that inherits from outside a directive but exists
    *   as a child of the directive's containing scope. If the containing scope is suspended the
    *   transcluded scope will also be suspended, even if the scope from which the transcluded
    *   scope inherits is not suspended.
    * * Multiple directives trying to manage the suspended status of a scope can confuse each other:
    *    * A call to `$suspend()` on an already suspended scope is a no-op.
    *    * A call to `$resume()` on a non-suspended scope is a no-op.
    *    * If two directives suspend a scope, then one of them resumes the scope, the scope will no
    *      longer be suspended. This could result in the other directive believing a scope to be
    *      suspended when it is not.
    * * If a parent scope is suspended then all its descendants will be also excluded from future
    *   digests whether or not they have been suspended themselves. Note that this also applies to
    *   isolate child scopes.
    * * Calling `$digest()` directly on a descendant of a suspended scope will still run the watchers
    *   for that scope and its descendants. When digesting we only check whether the current scope is
    *   locally suspended, rather than checking whether it has a suspended ancestor.
    * * Calling `$resume()` on a scope that has a suspended ancestor will not cause the scope to be
    *   included in future digests until all its ancestors have been resumed.
    * * Resolved promises, e.g. from explicit `$q` deferreds and `$http` calls, trigger `$apply()`
    *   against the `$rootScope` and so will still trigger a global digest even if the promise was
    *   initiated by a component that lives on a suspended scope.
    */
  @JSName("$suspend")
  def $suspend(): scala.Unit = js.native
  @JSName("$watch")
  def $watch(watchExpression: java.lang.String): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch(watchExpression: java.lang.String, listener: java.lang.String): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch(watchExpression: java.lang.String, listener: java.lang.String, objectEquality: scala.Boolean): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch(watchExpression: js.Function1[/* scope */ IScope, _]): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch(watchExpression: js.Function1[/* scope */ IScope, _], listener: java.lang.String): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch(
    watchExpression: js.Function1[/* scope */ IScope, _],
    listener: java.lang.String,
    objectEquality: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch[T](
    watchExpression: java.lang.String,
    listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _]
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch[T](
    watchExpression: java.lang.String,
    listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _],
    objectEquality: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch[T](
    watchExpression: js.Function1[/* scope */ IScope, T],
    listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _]
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch[T](
    watchExpression: js.Function1[/* scope */ IScope, T],
    listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _],
    objectEquality: scala.Boolean
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watchCollection")
  def $watchCollection[T](
    watchExpression: java.lang.String,
    listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _]
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watchCollection")
  def $watchCollection[T](
    watchExpression: js.Function1[/* scope */ IScope, T],
    listener: js.Function3[/* newValue */ T, /* oldValue */ T, /* scope */ IScope, _]
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watchGroup")
  def $watchGroup(
    watchExpressions: js.Array[_ | angularLib.Anon_Scope],
    listener: js.Function3[/* newValue */ js.Any, /* oldValue */ js.Any, /* scope */ IScope, _]
  ): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch_T[T](watchExpression: java.lang.String): js.Function0[scala.Unit] = js.native
  @JSName("$watch")
  def $watch_T[T](watchExpression: js.Function1[/* scope */ IScope, T]): js.Function0[scala.Unit] = js.native
}

