package typings.autolinker

import typings.autolinker.matcherMatcherMod.Matcher
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher/phone-matcher", JSImport.Namespace)
@js.native
object phoneMatcherMod extends js.Object {
  @js.native
  class PhoneMatcher () extends Matcher {
    /**
      * The regular expression to match Phone numbers. Example match:
      *
      *     (123) 456-7890
      *
      * This regular expression has the following capturing groups:
      *
      * 1 or 2. The prefixed '+' sign, if there is one.
      *
      * @protected
      * @property {RegExp} matcherRegex
      */
    var matcherRegex: RegExp = js.native
    /* protected */ def testMatch(text: String): Boolean = js.native
  }
  
}

