package typings.autolinker

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher/url-match-validator", JSImport.Namespace)
@js.native
object urlMatchValidatorMod extends js.Object {
  @js.native
  class UrlMatchValidator () extends js.Object
  
  /* static members */
  @js.native
  object UrlMatchValidator extends js.Object {
    var containsMultipleDots: js.Any = js.native
    /**
      * Regex to test for a full protocol, with the two trailing slashes. Ex: 'http://'
      *
      * @private
      * @property {RegExp} hasFullProtocolRegex
      */
    var hasFullProtocolRegex: RegExp = js.native
    /**
      * Regex to determine if at least one word char exists after the protocol (i.e. after the ':')
      *
      * @private
      * @property {RegExp} hasWordCharAfterProtocolRegex
      */
    var hasWordCharAfterProtocolRegex: RegExp = js.native
    /**
      * Regex to determine if the string is a valid IP address
      *
      * @private
      * @property {RegExp} ipRegex
      */
    var ipRegex: RegExp = js.native
    /**
      * Regex to find the URI scheme, such as 'mailto:'.
      *
      * This is used to filter out 'javascript:' and 'vbscript:' schemes.
      *
      * @private
      * @property {RegExp} uriSchemeRegex
      */
    var uriSchemeRegex: RegExp = js.native
    /**
      * Determines if a given URL match found by the {@link Autolinker.matcher.Url UrlMatcher}
      * is valid. Will return `false` for:
      *
      * 1) URL matches which do not have at least have one period ('.') in the
      *    domain name (effectively skipping over matches like "abc:def").
      *    However, URL matches with a protocol will be allowed (ex: 'http://localhost')
      * 2) URL matches which do not have at least one word character in the
      *    domain name (effectively skipping over matches like "git:1.0").
      *    However, URL matches with a protocol will be allowed (ex: 'intra-net://271219.76')
      * 3) A protocol-relative url match (a URL beginning with '//') whose
      *    previous character is a word character (effectively skipping over
      *    strings like "abc//google.com")
      *
      * Otherwise, returns `true`.
      *
      * @param {String} urlMatch The matched URL, if there was one. Will be an
      *   empty string if the match is not a URL match.
      * @param {String} protocolUrlMatch The match URL string for a protocol
      *   match. Ex: 'http://yahoo.com'. This is used to match something like
      *   'http://localhost', where we won't double check that the domain name
      *   has at least one '.' in it.
      * @return {Boolean} `true` if the match given is valid and should be
      *   processed, or `false` if the match is invalid and/or should just not be
      *   processed.
      */
    def isValid(urlMatch: String, protocolUrlMatch: String): Boolean = js.native
    def isValidIpAddress(uriSchemeMatch: String): Boolean = js.native
    /**
      * Determines if the URI scheme is a valid scheme to be autolinked. Returns
      * `false` if the scheme is 'javascript:' or 'vbscript:'
      *
      * @private
      * @param {String} uriSchemeMatch The match URL string for a full URI scheme
      *   match. Ex: 'http://yahoo.com' or 'mailto:a@a.com'.
      * @return {Boolean} `true` if the scheme is a valid one, `false` otherwise.
      */
    def isValidUriScheme(uriSchemeMatch: String): Boolean = js.native
    /**
      * Determines if a URL match does not have either:
      *
      * a) a full protocol (i.e. 'http://'), or
      * b) at least one word character after the protocol (i.e. in the domain name)
      *
      * At least one letter character must exist in the domain name after a
      * protocol match. Ex: skip over something like "git:1.0"
      *
      * @private
      * @param {String} urlMatch The matched URL, if there was one. Will be an
      *   empty string if the match is not a URL match.
      * @param {String} protocolUrlMatch The match URL string for a protocol
      *   match. Ex: 'http://yahoo.com'. This is used to know whether or not we
      *   have a protocol in the URL string, in order to check for a word
      *   character after the protocol separator (':').
      * @return {Boolean} `true` if the URL match does not have a full protocol, or
      * at least one word character in it, `false` otherwise.
      */
    def urlMatchDoesNotHaveAtLeastOneWordChar(urlMatch: String, protocolUrlMatch: String): Boolean = js.native
    /**
      * Determines if a URL match does not have either:
      *
      * a) a full protocol (i.e. 'http://'), or
      * b) at least one dot ('.') in the domain name (for a non-full-protocol
      *    match).
      *
      * Either situation is considered an invalid URL (ex: 'git:d' does not have
      * either the '://' part, or at least one dot in the domain name. If the
      * match was 'git:abc.com', we would consider this valid.)
      *
      * @private
      * @param {String} urlMatch The matched URL, if there was one. Will be an
      *   empty string if the match is not a URL match.
      * @param {String} protocolUrlMatch The match URL string for a protocol
      *   match. Ex: 'http://yahoo.com'. This is used to match something like
      *   'http://localhost', where we won't double check that the domain name
      *   has at least one '.' in it.
      * @return {Boolean} `true` if the URL match does not have a full protocol,
      *   or at least one dot ('.') in a non-full-protocol match.
      */
    def urlMatchDoesNotHaveProtocolOrDot(urlMatch: String, protocolUrlMatch: String): Boolean = js.native
  }
  
}

