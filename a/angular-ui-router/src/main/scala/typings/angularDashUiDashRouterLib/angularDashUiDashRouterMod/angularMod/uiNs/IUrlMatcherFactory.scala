package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUrlMatcherFactory extends js.Object {
  /**
    * Defines whether URL matching should be case sensitive (the default behavior), or not.
    *
    * @param value {boolean} false to match URL in a case sensitive manner; otherwise true;
    *
    * @returns {boolean} the current value of caseInsensitive
    */
  def caseInsensitive(): scala.Boolean = js.native
  def caseInsensitive(value: scala.Boolean): scala.Boolean = js.native
  /**
    * Creates a UrlMatcher for the specified pattern.
    *
    * @param pattern {string} The URL pattern.
    *
    * @returns {IUrlMatcher} The UrlMatcher.
    */
  def compile(pattern: java.lang.String): IUrlMatcher = js.native
  /**
    * Sets the default behavior when generating or matching URLs with default parameter values
    *
    * @param value {string} A string that defines the default parameter URL squashing behavior. nosquash: When generating an href with a default parameter value, do not squash the parameter value from the URL slash: When generating an href with a default parameter value, squash (remove) the parameter value, and, if the parameter is surrounded by slashes, squash (remove) one slash from the URL any other string, e.g. "~": When generating an href with a default parameter value, squash (remove) the parameter value from the URL and replace it with this string.
    */
  def defaultSquashPolicy(value: java.lang.String): scala.Unit = js.native
  /**
    * Returns true if the specified object is a UrlMatcher, or false otherwise.
    *
    * @param o {any} The object to perform the type check against.
    *
    * @returns {boolean} Returns true if the object matches the IUrlMatcher interface, by implementing all the same methods.
    */
  def isMatcher(o: js.Any): scala.Boolean = js.native
  /**
    * Defines whether URLs should match trailing slashes, or not (the default behavior).
    *
    * @param value {boolean} false to match trailing slashes in URLs, otherwise true.
    *
    * @returns {boolean} the current value of strictMode
    */
  def strictMode(): scala.Boolean = js.native
  def strictMode(value: scala.Boolean): scala.Boolean = js.native
  /**
    * Returns a type definition for the specified name
    *
    * @param name {string} The type definition name
    *
    * @returns {IType} The type definition
    */
  def `type`(name: java.lang.String): IType = js.native
  /**
    * Registers a custom Type object that can be used to generate URLs with typed parameters.
    *
    * @param {IType} definition The type definition.
    * @param {any[]} inlineAnnotedDefinitionFn A function that is injected before the app runtime starts. The result of this function is merged into the existing definition.
    *
    * @returns {IUrlMatcherFactory} Returns $urlMatcherFactoryProvider.
    */
  def `type`(name: java.lang.String, definition: IType): IUrlMatcherFactory = js.native
  def `type`(
    name: java.lang.String,
    definition: IType,
    definitionFn: js.Function1[/* repeated */ js.Any, IType]
  ): IUrlMatcherFactory = js.native
  def `type`(name: java.lang.String, definition: IType, inlineAnnotedDefinitionFn: js.Array[_]): IUrlMatcherFactory = js.native
}

