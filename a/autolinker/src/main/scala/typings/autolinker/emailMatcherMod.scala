package typings.autolinker

import typings.autolinker.matcherMatcherMod.Matcher
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher/email-matcher", JSImport.Namespace)
@js.native
object emailMatcherMod extends js.Object {
  @js.native
  class EmailMatcher () extends Matcher {
    /**
      * Valid characters that can be used in the "local" part of an email address,
      * i.e. the "name" part of "name@site.com"
      */
    var localPartCharRegex: RegExp = js.native
    /**
      * Stricter TLD regex which adds a beginning and end check to ensure
      * the string is a valid TLD
      */
    var strictTldRegex: RegExp = js.native
  }
  
}

