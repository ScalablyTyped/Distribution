package typings.autolinker

import typings.autolinker.matcherMatcherMod.Matcher
import typings.autolinker.matcherMatcherMod.MatcherConfig
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneMatcherMod {
  
  @JSImport("autolinker/dist/commonjs/matcher/phone-matcher", "PhoneMatcher")
  @js.native
  class PhoneMatcher protected () extends Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
    
    /**
      * The regular expression to match Phone numbers. Example matches:
      *
      *     (123) 456-7890
      *     123 456 7890
      *     123-456-7890
      *     +18004441234,,;,10226420346#
      *     +1 (800) 444 1234
      *     10226420346#
      *     1-800-444-1234,1022,64,20346#
      *
      * This regular expression has the following capturing groups:
      *
      * 1 or 2. The prefixed '+' sign, if there is one.
      *
      * @protected
      * @property {RegExp} matcherRegex
      */
    /* protected */ var matcherRegex: RegExp = js.native
    
    /* protected */ def testMatch(text: String): Boolean = js.native
  }
}
