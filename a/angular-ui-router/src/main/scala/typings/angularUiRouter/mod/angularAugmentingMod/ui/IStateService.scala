package typings.angularUiRouter.mod.angularAugmentingMod.ui

import typings.angular.mod.IPromise
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
  var transition: IPromise[js.Object] = js.native
  def get(): js.Array[IState] = js.native
  def get(state: String): IState = js.native
  def get(state: String, context: String): IState = js.native
  def get(state: String, context: IState): IState = js.native
  def get(state: IState): IState = js.native
  def get(state: IState, context: String): IState = js.native
  def get(state: IState, context: IState): IState = js.native
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
  def go(to: String): IPromise[_] = js.native
  def go(to: String, params: js.UndefOr[scala.Nothing], options: IStateOptions): IPromise[_] = js.native
  def go(to: String, params: js.Object): IPromise[_] = js.native
  def go(to: String, params: js.Object, options: IStateOptions): IPromise[_] = js.native
  def go(to: IState): IPromise[_] = js.native
  def go(to: IState, params: js.UndefOr[scala.Nothing], options: IStateOptions): IPromise[_] = js.native
  def go(to: IState, params: js.Object): IPromise[_] = js.native
  def go(to: IState, params: js.Object, options: IStateOptions): IPromise[_] = js.native
  def href(state: String): String = js.native
  def href(state: String, params: js.UndefOr[scala.Nothing], options: IHrefOptions): String = js.native
  def href(state: String, params: js.Object): String = js.native
  def href(state: String, params: js.Object, options: IHrefOptions): String = js.native
  def href(state: IState): String = js.native
  def href(state: IState, params: js.UndefOr[scala.Nothing], options: IHrefOptions): String = js.native
  def href(state: IState, params: js.Object): String = js.native
  def href(state: IState, params: js.Object, options: IHrefOptions): String = js.native
  def includes(state: String): Boolean = js.native
  def includes(state: String, params: js.UndefOr[scala.Nothing], options: js.Any): Boolean = js.native
  def includes(state: String, params: js.Object): Boolean = js.native
  def includes(state: String, params: js.Object, options: js.Any): Boolean = js.native
  def is(state: String): Boolean = js.native
  def is(state: String, params: js.Object): Boolean = js.native
  def is(state: IState): Boolean = js.native
  def is(state: IState, params: js.Object): Boolean = js.native
  def reload(): IPromise[_] = js.native
  def reload(reloadState: String): IPromise[_] = js.native
  def reload(reloadState: IState): IPromise[_] = js.native
  def transitionTo(state: String): IPromise[_] = js.native
  def transitionTo(state: String, params: js.UndefOr[scala.Nothing], options: IStateOptions): IPromise[_] = js.native
  def transitionTo(state: String, params: js.UndefOr[scala.Nothing], updateLocation: Boolean): IPromise[_] = js.native
  def transitionTo(state: String, params: js.Object): IPromise[_] = js.native
  def transitionTo(state: String, params: js.Object, options: IStateOptions): IPromise[_] = js.native
  def transitionTo(state: String, params: js.Object, updateLocation: Boolean): IPromise[_] = js.native
  def transitionTo(state: IState): IPromise[_] = js.native
  def transitionTo(state: IState, params: js.UndefOr[scala.Nothing], options: IStateOptions): IPromise[_] = js.native
  def transitionTo(state: IState, params: js.UndefOr[scala.Nothing], updateLocation: Boolean): IPromise[_] = js.native
  def transitionTo(state: IState, params: js.Object): IPromise[_] = js.native
  def transitionTo(state: IState, params: js.Object, options: IStateOptions): IPromise[_] = js.native
  def transitionTo(state: IState, params: js.Object, updateLocation: Boolean): IPromise[_] = js.native
}

