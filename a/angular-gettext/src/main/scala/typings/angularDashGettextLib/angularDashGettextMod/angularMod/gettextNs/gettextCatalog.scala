package typings
package angularDashGettextLib.angularDashGettextMod.angularMod.gettextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait gettextCatalog extends js.Object {
  /** The default language, in which you're application is written. This defaults to English and it's generally a bad idea to use anything else: if your language has different pluralization rules you'll end up with incorrect translations. Deprecated
    * @deprecreated
    */
  var baseLanguage: java.lang.String = js.native
  //////////////
  /// Fields ///
  //////////////
  /** (default: false): Whether or not to prefix untranslated strings with [MISSING]: or a custom prefix. */
  var debug: scala.Boolean = js.native
  /** (default: [MISSING]:): Custom prefix for untranslated strings. */
  var debugPrefix: java.lang.String = js.native
  /** (default: false): Whether or not to wrap all processed text with markers.Example output: [Welcome] */
  var showTranslatedMarkers: scala.Boolean = js.native
  /** (default: [): Custom prefix to mark strings that have been run through angular-gettext. */
  var translatedMarkerPrefix: java.lang.String = js.native
  /** (default: ]): Custom suffix to mark strings that have been run through angular-gettext. */
  var translatedMarkerSuffix: java.lang.String = js.native
  /** Returns the current language. */
  def getCurrentLanguage(): java.lang.String = js.native
  /** Translate a plural string with the given context. */
  def getPlural(n: scala.Double, string: java.lang.String, stringPlural: java.lang.String): java.lang.String = js.native
  def getPlural(n: scala.Double, string: java.lang.String, stringPlural: java.lang.String, scope: js.Any): java.lang.String = js.native
  def getPlural(
    n: scala.Double,
    string: java.lang.String,
    stringPlural: java.lang.String,
    scope: js.Any,
    context: java.lang.String
  ): java.lang.String = js.native
  /** Translate a string with the given scope. Uses Angular.JS interpolation, so something like this will do what you expect:
    * var hello = gettextCatalog.getString("Hello {{name}}!", { name: "Ruben" });
    * // var hello will be "Hallo Ruben!" in Dutch.
    * The scope parameter is optional: pass null (or don't pass anything) if you're not using it: this skips interpolation and is a lot faster.
    */
  def getString(string: java.lang.String): java.lang.String = js.native
  def getString(string: java.lang.String, scope: js.Any): java.lang.String = js.native
  def getString(string: java.lang.String, scope: js.Any, context: java.lang.String): java.lang.String = js.native
  /** Get the correct pluralized (but untranslated) string for the value of n. */
  def getStringForm(string: java.lang.String, n: scala.Double): java.lang.String = js.native
  /** Load a set of translation strings from a given URL.This should be a JSON catalog generated with grunt-angular-gettext. More details https://angular-gettext.rocketeer.be/dev-guide/lazy-loading/ */
  def loadRemote(url: java.lang.String): angularLib.angularMod.angularNs.IHttpPromise[_] = js.native
  ///////////////
  /// Methods ///
  ///////////////
  /** Sets the current language and makes sure that all translations get updated correctly. */
  def setCurrentLanguage(lang: java.lang.String): scala.Unit = js.native
  /** Processes an object of string definitions. More details https://angular-gettext.rocketeer.be/dev-guide/manual-setstrings/
    * @param language A language code.
    * @param strings A dictionary of strings. The format of this dictionary is:
    *                   - Keys: Singular English strings (as defined in the source files)
    *                   - Values: Either a single string for signular-only strings or an array of plural forms.
    */
  def setStrings(
    language: java.lang.String,
    strings: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): scala.Unit = js.native
}

