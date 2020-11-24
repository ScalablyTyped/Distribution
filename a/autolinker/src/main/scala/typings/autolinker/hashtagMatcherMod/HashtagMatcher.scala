package typings.autolinker.hashtagMatcherMod

import typings.autolinker.autolinkerMod.HashtagServices
import typings.autolinker.matcherMatcherMod.Matcher
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("autolinker/dist/commonjs/matcher/hashtag-matcher", "HashtagMatcher")
@js.native
class HashtagMatcher protected () extends Matcher {
  /**
    * @method constructor
    * @param {Object} cfg The configuration properties for the Match instance,
    *   specified in an Object (map).
    */
  def this(cfg: HashtagMatcherConfig) = this()
  
  /**
    * The regular expression to match Hashtags. Example match:
    *
    *     #asdf
    *
    * @protected
    * @property {RegExp} matcherRegex
    */
  var matcherRegex: RegExp = js.native
  
  /**
    * The regular expression to use to check the character before a username match to
    * make sure we didn't accidentally match an email address.
    *
    * For example, the string "asdf@asdf.com" should not match "@asdf" as a username.
    *
    * @protected
    * @property {RegExp} nonWordCharRegex
    */
  var nonWordCharRegex: RegExp = js.native
  
  /**
    * @cfg {String} serviceName
    *
    * The service to point hashtag matches to. See {@link Autolinker#hashtag}
    * for available values.
    */
  val serviceName: HashtagServices = js.native
}
