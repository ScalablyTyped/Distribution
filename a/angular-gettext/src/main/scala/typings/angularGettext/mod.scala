package typings.angularGettext

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IHttpPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object angularAugmentingMod {
    
    object gettext {
      
      @js.native
      trait gettextCatalog extends StObject {
        
        /** The default language, in which you're application is written. This defaults to English and it's generally a bad idea to use anything else: if your language has different pluralization rules you'll end up with incorrect translations. Deprecated
          * @deprecreated
          */
        var baseLanguage: String = js.native
        
        //////////////
        /// Fields ///
        //////////////
        /** (default: false): Whether or not to prefix untranslated strings with [MISSING]: or a custom prefix. */
        var debug: Boolean = js.native
        
        /** (default: [MISSING]:): Custom prefix for untranslated strings. */
        var debugPrefix: String = js.native
        
        /** Returns the current language. */
        def getCurrentLanguage(): String = js.native
        
        /** Translate a plural string with the given context. */
        def getPlural(n: Double, string: String, stringPlural: String): String = js.native
        def getPlural(n: Double, string: String, stringPlural: String, scope: Any): String = js.native
        def getPlural(n: Double, string: String, stringPlural: String, scope: Any, context: String): String = js.native
        def getPlural(n: Double, string: String, stringPlural: String, scope: Unit, context: String): String = js.native
        
        /** Translate a string with the given scope. Uses Angular.JS interpolation, so something like this will do what you expect:
          * var hello = gettextCatalog.getString("Hello {{name}}!", { name: "Ruben" });
          * // var hello will be "Hallo Ruben!" in Dutch.
          * The scope parameter is optional: pass null (or don't pass anything) if you're not using it: this skips interpolation and is a lot faster.
          */
        def getString(string: String): String = js.native
        def getString(string: String, scope: Any): String = js.native
        def getString(string: String, scope: Any, context: String): String = js.native
        def getString(string: String, scope: Unit, context: String): String = js.native
        
        /** Get the correct pluralized (but untranslated) string for the value of n. */
        def getStringForm(string: String, n: Double): String = js.native
        
        /** Load a set of translation strings from a given URL.This should be a JSON catalog generated with grunt-angular-gettext. More details https://angular-gettext.rocketeer.be/dev-guide/lazy-loading/ */
        def loadRemote(url: String): IHttpPromise[Any] = js.native
        
        ///////////////
        /// Methods ///
        ///////////////
        /** Sets the current language and makes sure that all translations get updated correctly. */
        def setCurrentLanguage(lang: String): Unit = js.native
        
        /** Processes an object of string definitions. More details https://angular-gettext.rocketeer.be/dev-guide/manual-setstrings/
          * @param language A language code.
          * @param strings A dictionary of strings. The format of this dictionary is:
          *                   - Keys: Singular English strings (as defined in the source files)
          *                   - Values: Either a single string for signular-only strings or an array of plural forms.
          */
        def setStrings(language: String, strings: StringDictionary[String | js.Array[String]]): Unit = js.native
        
        /** (default: false): Whether or not to wrap all processed text with markers.Example output: [Welcome] */
        var showTranslatedMarkers: Boolean = js.native
        
        /** (default: [): Custom prefix to mark strings that have been run through angular-gettext. */
        var translatedMarkerPrefix: String = js.native
        
        /** (default: ]): Custom suffix to mark strings that have been run through angular-gettext. */
        var translatedMarkerSuffix: String = js.native
      }
      
      /** If you have text that should be translated in your JavaScript code, wrap it with a call to a function named gettext. This module provides an injectable function to do so */
      type gettextFunction = js.Function1[/* dummyString */ String, String]
    }
  }
  
  type gettextCatalog = typings.angularGettext.mod.angularAugmentingMod.gettext.gettextCatalog
}
