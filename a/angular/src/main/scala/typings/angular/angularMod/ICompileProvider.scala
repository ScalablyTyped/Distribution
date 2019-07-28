package typings.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompileProvider extends IServiceProvider {
  def aHrefSanitizationWhitelist(): RegExp = js.native
  def aHrefSanitizationWhitelist(regexp: RegExp): ICompileProvider = js.native
  /**
    * It indicates to the compiler whether or not directives on comments should be compiled.
    * It results in a compilation performance gain since the compiler doesn't have to check comments when looking for directives.
    * Defaults to true.
    * See: https://docs.angularjs.org/api/ng/provider/$compileProvider#commentDirectivesEnabled
    */
  def commentDirectivesEnabled(): Boolean = js.native
  def commentDirectivesEnabled(enabled: Boolean): ICompileProvider = js.native
  def component(name: String, options: IComponentOptions): ICompileProvider = js.native
  def component(`object`: StringDictionary[IComponentOptions]): ICompileProvider = js.native
  /**
    * It indicates to the compiler whether or not directives on element classes should be compiled.
    * It results in a compilation performance gain since the compiler doesn't have to check element classes when looking for directives.
    * Defaults to true.
    * See: https://docs.angularjs.org/api/ng/provider/$compileProvider#cssClassDirectivesEnabled
    */
  def cssClassDirectivesEnabled(): Boolean = js.native
  def cssClassDirectivesEnabled(enabled: Boolean): ICompileProvider = js.native
  def debugInfoEnabled(): Boolean = js.native
  def debugInfoEnabled(enabled: Boolean): ICompileProvider = js.native
  def directive[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](
    name: String,
    directiveFactory: Injectable[IDirectiveFactory[TScope, TElement, TAttributes, TController]]
  ): ICompileProvider = js.native
  def directive[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](
    `object`: StringDictionary[Injectable[IDirectiveFactory[TScope, TElement, TAttributes, TController]]]
  ): ICompileProvider = js.native
  def imgSrcSanitizationWhitelist(): RegExp = js.native
  def imgSrcSanitizationWhitelist(regexp: RegExp): ICompileProvider = js.native
  /**
    * Sets the number of times $onChanges hooks can trigger new changes before giving up and assuming that the model is unstable.
    * Increasing the TTL could have performance implications, so you should not change it without proper justification.
    * Default: 10.
    * See: https://docs.angularjs.org/api/ng/provider/$compileProvider#onChangesTtl
    */
  def onChangesTtl(): Double = js.native
  def onChangesTtl(limit: Double): ICompileProvider = js.native
  /**
    * Call this method to enable/disable whether directive controllers are assigned bindings before calling the controller's constructor.
    * If enabled (true), the compiler assigns the value of each of the bindings to the properties of the controller object before the constructor of this object is called.
    * If disabled (false), the compiler calls the constructor first before assigning bindings.
    * Defaults to false.
    * See: https://docs.angularjs.org/api/ng/provider/$compileProvider#preAssignBindingsEnabled
    */
  def preAssignBindingsEnabled(): Boolean = js.native
  def preAssignBindingsEnabled(enabled: Boolean): ICompileProvider = js.native
  /**
    * Call this method to enable/disable strict component bindings check.
    * If enabled, the compiler will enforce that for all bindings of a
    * component that are not set as optional with ?, an attribute needs
    * to be provided on the component's HTML tag.
    * Defaults to false.
    * See: https://docs.angularjs.org/api/ng/provider/$compileProvider#strictComponentBindingsEnabled
    */
  def strictComponentBindingsEnabled(): Boolean = js.native
  def strictComponentBindingsEnabled(enabled: Boolean): ICompileProvider = js.native
}

