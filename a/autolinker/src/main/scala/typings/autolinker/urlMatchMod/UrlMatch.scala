package typings.autolinker.urlMatchMod

import typings.autolinker.autolinkerMod.UrlMatchTypeOptions
import typings.autolinker.matchMatchMod.Match
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/match/url-match", "UrlMatch")
@js.native
class UrlMatch protected () extends Match {
  /**
    * @method constructor
    * @param {Object} cfg The configuration properties for the Match
    *   instance, specified in an Object (map).
    */
  def this(cfg: UrlMatchConfig) = this()
  /**
    * @cfg {Boolean} decodePercentEncoding (required)
    * @inheritdoc Autolinker#cfg-decodePercentEncoding
    */
  val decodePercentEncoding: js.Any = js.native
  /**
    * @private
    * @property {Boolean} protocolPrepended
    *
    * Will be set to `true` if the 'http://' protocol has been prepended to the {@link #url} (because the
    * {@link #url} did not have a protocol)
    */
  var protocolPrepended: Boolean = js.native
  /**
    * @cfg {Boolean} protocolRelativeMatch (required)
    *
    * `true` if the URL is a protocol-relative match. A protocol-relative match
    * is a URL that starts with '//', and will be either http:// or https://
    * based on the protocol that the site is loaded under.
    */
  val protocolRelativeMatch: js.Any = js.native
  /**
    * @private
    * @property {RegExp} protocolRelativeRegex
    *
    * The regular expression used to remove the protocol-relative '//' from the {@link #url} string, for purposes
    * of {@link #getAnchorText}. A protocol-relative URL is, for example, "//yahoo.com"
    */
  var protocolRelativeRegex: RegExp = js.native
  /**
    * @cfg {Boolean} protocolUrlMatch (required)
    *
    * `true` if the URL is a match which already has a protocol (i.e.
    * 'http://'), `false` if the match was from a 'www' or known TLD match.
    */
  val protocolUrlMatch: js.Any = js.native
  /**
    * Decodes percent-encoded characters from the given `anchorText`, in
    * preparation for the text to be displayed.
    *
    * @private
    * @param {String} anchorText The text of the anchor that is being
    *   generated, for which to decode any percent-encoded characters.
    * @return {String} The `anchorText`, with the percent-encoded characters
    *   decoded.
    */
  var removePercentEncoding: js.Any = js.native
  /**
    * Removes any trailing slash from the given `anchorText`, in preparation for the text to be displayed.
    *
    * @private
    * @param {String} anchorText The text of the anchor that is being generated, for which to remove any trailing
    *   slash ('/') that may exist.
    * @return {String} The `anchorText`, with the trailing slash removed.
    */
  var removeTrailingSlash: js.Any = js.native
  /**
    * @private
    * @property {RegExp} schemePrefixRegex
    *
    * A regular expression used to remove the 'http://' or 'https://' from
    * URLs.
    */
  var schemePrefixRegex: RegExp = js.native
  /**
    * @cfg {Object} stripPrefix (required)
    *
    * The Object form of {@link Autolinker#cfg-stripPrefix}.
    */
  val stripPrefix: js.Any = js.native
  /**
    * Strips any protocol-relative '//' from the anchor text.
    *
    * @private
    * @param {String} text The text of the anchor that is being generated, for which to strip off the
    *   protocol-relative prefix (such as stripping off "//")
    * @return {String} The `anchorText`, with the protocol-relative prefix stripped.
    */
  var stripProtocolRelativePrefix: js.Any = js.native
  /**
    * Strips the scheme prefix (such as "http://" or "https://") from the given
    * `url`.
    *
    * @private
    * @param {String} url The text of the anchor that is being generated, for
    *   which to strip off the url scheme.
    * @return {String} The `url`, with the scheme stripped.
    */
  var stripSchemePrefix: js.Any = js.native
  /**
    * @cfg {Boolean} stripTrailingSlash (required)
    * @inheritdoc Autolinker#cfg-stripTrailingSlash
    */
  val stripTrailingSlash: js.Any = js.native
  /**
    * Strips the 'www' prefix from the given `url`.
    *
    * @private
    * @param {String} url The text of the anchor that is being generated, for
    *   which to strip off the 'www' if it exists.
    * @return {String} The `url`, with the 'www' stripped.
    */
  var stripWwwPrefix: js.Any = js.native
  /**
    * @cfg {String} url (required)
    *
    * The url that was matched.
    */
  var url: js.Any = js.native
  /**
    * @cfg {"scheme"/"www"/"tld"} urlMatchType (required)
    *
    * The type of URL match that this class represents. This helps to determine
    * if the match was made in the original text with a prefixed scheme (ex:
    * 'http://www.google.com'), a prefixed 'www' (ex: 'www.google.com'), or
    * was matched by a known top-level domain (ex: 'google.com').
    */
  val urlMatchType: js.Any = js.native
  /**
    * @private
    * @property {RegExp} wwwPrefixRegex
    *
    * A regular expression used to remove the 'www.' from URLs.
    */
  var wwwPrefixRegex: RegExp = js.native
  /**
    * Returns the url that was matched, assuming the protocol to be 'http://' if the original
    * match was missing a protocol.
    *
    * @return {String}
    */
  def getUrl(): String = js.native
  /**
    * Returns a string name for the type of URL match that this class
    * represents.
    *
    * This helps to determine if the match was made in the original text with a
    * prefixed scheme (ex: 'http://www.google.com'), a prefixed 'www' (ex:
    * 'www.google.com'), or was matched by a known top-level domain (ex:
    * 'google.com').
    *
    * @return {"scheme"/"www"/"tld"}
    */
  def getUrlMatchType(): UrlMatchTypeOptions = js.native
}

