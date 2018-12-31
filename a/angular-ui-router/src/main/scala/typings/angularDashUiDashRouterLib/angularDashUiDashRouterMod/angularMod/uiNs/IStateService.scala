package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateService extends js.Object {
  @JSName("$current")
  var $current: IResolvedState = js.native
  /** A reference to the state's config object. However you passed it in. Useful for accessing custom data. */
  var current: IState = js.native
  /** A param object, e.g. {sectionId: section.id)}, that you'd like to test against the current active state. */
  var params: IStateParamsService = js.native
  /** Currently pending transition. A promise that'll resolve or reject. */
  var transition: angularLib.angularMod.angularNs.IPromise[js.Object] = js.native
  def get(): js.Array[IState] = js.native
  def get(state: IState): IState = js.native
  def get(state: IState, context: IState): IState = js.native
  def get(state: IState, context: java.lang.String): IState = js.native
  def get(state: java.lang.String): IState = js.native
  def get(state: java.lang.String, context: IState): IState = js.native
  def get(state: java.lang.String, context: java.lang.String): IState = js.native
  def go(to: IState): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def go(to: IState, params: js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def go(to: IState, params: js.Object, options: IStateOptions): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Convenience method for transitioning to a new state. $state.go calls $state.transitionTo internally but automatically sets options to { location: true, inherit: true, relative: $state.$current, notify: true }. This allows you to easily use an absolute or relative to path and specify only the parameters you'd like to update (while letting unspecified parameters inherit from the currently active ancestor states).
    *
    * @param to Absolute state name or relative state path. Some examples:
    *
    * $state.go('contact.detail') - will go to the contact.detail state
    * $state.go('^') - will go to a parent state
    * $state.go('^.sibling') - will go to a sibling state
    * $state.go('.child.grandchild') - will go to grandchild state
    *
    * @param params A map of the parameters that will be sent to the state, will populate $stateParams. Any parameters that are not specified will be inherited from currently defined parameters. This allows, for example, going to a sibling state that shares parameters specified in a parent state. Parameter inheritance only works between common ancestor states, I.e. transitioning to a sibling will get you the parameters for all parents, transitioning to a child will get you all current parameters, etc.
    *
    * @param options Options object.
    */
  def go(to: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def go(to: java.lang.String, params: js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def go(to: java.lang.String, params: js.Object, options: IStateOptions): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def href(state: IState): java.lang.String = js.native
  def href(state: IState, params: js.Object): java.lang.String = js.native
  def href(state: IState, params: js.Object, options: IHrefOptions): java.lang.String = js.native
  def href(state: java.lang.String): java.lang.String = js.native
  def href(state: java.lang.String, params: js.Object): java.lang.String = js.native
  def href(state: java.lang.String, params: js.Object, options: IHrefOptions): java.lang.String = js.native
  def includes(state: java.lang.String): scala.Boolean = js.native
  def includes(state: java.lang.String, params: js.Object): scala.Boolean = js.native
  def includes(state: java.lang.String, params: js.Object, options: js.Any): scala.Boolean = js.native
  def is(state: IState): scala.Boolean = js.native
  def is(state: IState, params: js.Object): scala.Boolean = js.native
  def is(state: java.lang.String): scala.Boolean = js.native
  def is(state: java.lang.String, params: js.Object): scala.Boolean = js.native
  def reload(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def reload(reloadState: IState): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def reload(reloadState: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def transitionTo(state: IState): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def transitionTo(state: IState, params: js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def transitionTo(state: IState, params: js.Object, options: IStateOptions): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def transitionTo(state: IState, params: js.Object, updateLocation: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def transitionTo(state: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def transitionTo(state: java.lang.String, params: js.Object): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def transitionTo(state: java.lang.String, params: js.Object, options: IStateOptions): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def transitionTo(state: java.lang.String, params: js.Object, updateLocation: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
}

