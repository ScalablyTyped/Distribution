package typings.autolinker

import org.scalablytyped.runtime.Instantiable1
import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilderCfg
import typings.autolinker.anon.Email
import typings.autolinker.anon.Hashtag
import typings.autolinker.autolinkerStrings.end
import typings.autolinker.autolinkerStrings.middle
import typings.autolinker.autolinkerStrings.smart
import typings.autolinker.htmlTagMod.HtmlTag
import typings.autolinker.htmlTagMod.HtmlTagCfg
import typings.autolinker.matchMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autolinkerMod {
  
  @JSImport("autolinker/dist/commonjs/autolinker", JSImport.Default)
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the Autolinker instance,
    *   specified in an Object (map).
    */
  class default () extends Autolinker {
    def this(cfg: AutolinkerConfig) = this()
  }
  /* static members */
  object default {
    
    /**
      * For backwards compatibility with Autolinker 1.x, the AnchorTagBuilder
      * class is provided as a static on the Autolinker class.
      */
    @JSImport("autolinker/dist/commonjs/autolinker", "default.AnchorTagBuilder")
    @js.native
    val AnchorTagBuilder: Instantiable1[
        /* cfg */ js.UndefOr[AnchorTagBuilderCfg], 
        typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
      ] = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the HtmlTag class is
      * provided as a static on the Autolinker class.
      */
    @JSImport("autolinker/dist/commonjs/autolinker", "default.HtmlTag")
    @js.native
    val HtmlTag: Instantiable1[/* cfg */ js.UndefOr[HtmlTagCfg], typings.autolinker.htmlTagMod.HtmlTag] = js.native
    
    /**
      * Automatically links URLs, Email addresses, Phone Numbers, Twitter handles,
      * Hashtags, and Mentions found in the given chunk of HTML. Does not link URLs
      * found within HTML tags.
      *
      * For instance, if given the text: `You should go to http://www.yahoo.com`,
      * then the result will be `You should go to &lt;a href="http://www.yahoo.com"&gt;http://www.yahoo.com&lt;/a&gt;`
      *
      * Example:
      *
      *     var linkedText = Autolinker.link( "Go to google.com", { newWindow: false } );
      *     // Produces: "Go to <a href="http://google.com">google.com</a>"
      *
      * @static
      * @param {String} textOrHtml The HTML or text to find matches within (depending
      *   on if the {@link #urls}, {@link #email}, {@link #phone}, {@link #mention},
      *   {@link #hashtag}, and {@link #mention} options are enabled).
      * @param {Object} [options] Any of the configuration options for the Autolinker
      *   class, specified in an Object (map). See the class description for an
      *   example call.
      * @return {String} The HTML text, with matches automatically linked.
      */
    @JSImport("autolinker/dist/commonjs/autolinker", "default.link")
    @js.native
    def link(textOrHtml: String): String = js.native
    @JSImport("autolinker/dist/commonjs/autolinker", "default.link")
    @js.native
    def link(textOrHtml: String, options: AutolinkerConfig): String = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the Matcher classes are
      * provided as statics on the Autolinker class.
      */
    @JSImport("autolinker/dist/commonjs/autolinker", "default.matcher")
    @js.native
    val matcher: Email = js.native
    
    /**
      * Parses the input `textOrHtml` looking for URLs, email addresses, phone
      * numbers, username handles, and hashtags (depending on the configuration
      * of the Autolinker instance), and returns an array of {@link Autolinker.match.Match}
      * objects describing those matches (without making any replacements).
      *
      * Note that if parsing multiple pieces of text, it is slightly more efficient
      * to create an Autolinker instance, and use the instance-level {@link #parse}
      * method.
      *
      * Example:
      *
      *     var matches = Autolinker.parse( "Hello google.com, I am asdf@asdf.com", {
      *         urls: true,
      *         email: true
      *     } );
      *
      *     console.log( matches.length );           // 2
      *     console.log( matches[ 0 ].getType() );   // 'url'
      *     console.log( matches[ 0 ].getUrl() );    // 'google.com'
      *     console.log( matches[ 1 ].getType() );   // 'email'
      *     console.log( matches[ 1 ].getEmail() );  // 'asdf@asdf.com'
      *
      * @static
      * @param {String} textOrHtml The HTML or text to find matches within
      *   (depending on if the {@link #urls}, {@link #email}, {@link #phone},
      *   {@link #hashtag}, and {@link #mention} options are enabled).
      * @param {Object} [options] Any of the configuration options for the Autolinker
      *   class, specified in an Object (map). See the class description for an
      *   example call.
      * @return {Autolinker.match.Match[]} The array of Matches found in the
      *   given input `textOrHtml`.
      */
    @JSImport("autolinker/dist/commonjs/autolinker", "default.parse")
    @js.native
    def parse(textOrHtml: String, options: AutolinkerConfig): js.Array[Match] = js.native
    
    /**
      * @static
      * @property {String} version
      *
      * The Autolinker version number in the form major.minor.patch
      *
      * Ex: 0.25.1
      */
    @JSImport("autolinker/dist/commonjs/autolinker", "default.version")
    @js.native
    val version: /* "3.14.2" */ String = js.native
    
    /**
      * For backwards compatibility with Autolinker 1.x, the Match classes are
      * provided as statics on the Autolinker class.
      */
    @JSImport("autolinker/dist/commonjs/autolinker", "default.match")
    @js.native
    val `match`: Hashtag = js.native
  }
  
  @js.native
  trait Autolinker extends StObject {
    
    /**
      * @cfg {String} className
      *
      * A CSS class name to add to the generated links. This class will be added
      * to all links, as well as this class plus match suffixes for styling
      * url/email/phone/hashtag/mention links differently.
      *
      * For example, if this config is provided as "myLink", then:
      *
      * - URL links will have the CSS classes: "myLink myLink-url"
      * - Email links will have the CSS classes: "myLink myLink-email", and
      * - Phone links will have the CSS classes: "myLink myLink-phone"
      * - Hashtag links will have the CSS classes: "myLink myLink-hashtag"
      * - Mention links will have the CSS classes: "myLink myLink-mention myLink-[type]"
      *   where [type] is either "instagram", "twitter" or "soundcloud"
      */
    val className: js.Any = js.native
    
    /**
      * After we have found all matches, we need to remove matches that overlap
      * with a previous match. This can happen for instance with URLs, where the
      * url 'google.com/#link' would match '#link' as a hashtag. Because the
      * '#link' part is contained in a larger match that comes before the HashTag
      * match, we'll remove the HashTag match.
      *
      * @private
      * @param {Autolinker.match.Match[]} matches
      * @return {Autolinker.match.Match[]}
      */
    var compactMatches: js.Any = js.native
    
    /**
      * @cfg {Object} context
      *
      * The context object (`this` reference) to call the `replaceFn` with.
      *
      * Defaults to this Autolinker instance.
      */
    val context: js.Any = js.native
    
    /**
      * Creates the return string value for a given match in the input string.
      *
      * This method handles the {@link #replaceFn}, if one was provided.
      *
      * @private
      * @param {Autolinker.match.Match} match The Match object that represents
      *   the match.
      * @return {String} The string that the `match` should be replaced with.
      *   This is usually the anchor tag string, but may be the `matchStr` itself
      *   if the match is not to be replaced.
      */
    var createMatchReturnVal: js.Any = js.native
    
    /**
      * @cfg {Boolean} [decodePercentEncoding=true]
      *
      * `true` to decode percent-encoded characters in URL matches, `false` to keep
      *  the percent-encoded characters.
      *
      *  Example when `true`: `https://en.wikipedia.org/wiki/San_Jos%C3%A9` will
      *  be displayed as `https://en.wikipedia.org/wiki/San_José`.
      */
    val decodePercentEncoding: js.Any = js.native
    
    /**
      * @cfg {Boolean} [email=true]
      *
      * `true` if email addresses should be automatically linked, `false` if they
      * should not be.
      */
    val email: js.Any = js.native
    
    /**
      * Lazily instantiates and returns the {@link Autolinker.matcher.Matcher}
      * instances for this Autolinker instance.
      *
      * @private
      * @return {Autolinker.matcher.Matcher[]}
      */
    var getMatchers: js.Any = js.native
    
    /**
      * Returns the {@link #tagBuilder} instance for this Autolinker instance,
      * lazily instantiating it if it does not yet exist.
      *
      * @private
      * @return {Autolinker.AnchorTagBuilder}
      */
    var getTagBuilder: js.Any = js.native
    
    /**
      * @cfg {Boolean/String} [hashtag=false]
      *
      * A string for the service name to have hashtags (ex: "#myHashtag")
      * auto-linked to. The currently-supported values are:
      *
      * - 'twitter'
      * - 'facebook'
      * - 'instagram'
      *
      * Pass `false` to skip auto-linking of hashtags.
      */
    val hashtag: js.Any = js.native
    
    /**
      * Automatically links URLs, Email addresses, Phone numbers, Hashtags,
      * and Mentions (Twitter, Instagram, Soundcloud) found in the given chunk of HTML. Does not link
      * URLs found within HTML tags.
      *
      * For instance, if given the text: `You should go to http://www.yahoo.com`,
      * then the result will be `You should go to
      * &lt;a href="http://www.yahoo.com"&gt;http://www.yahoo.com&lt;/a&gt;`
      *
      * This method finds the text around any HTML elements in the input
      * `textOrHtml`, which will be the text that is processed. Any original HTML
      * elements will be left as-is, as well as the text that is already wrapped
      * in anchor (&lt;a&gt;) tags.
      *
      * @param {String} textOrHtml The HTML or text to autolink matches within
      *   (depending on if the {@link #urls}, {@link #email}, {@link #phone}, {@link #hashtag}, and {@link #mention} options are enabled).
      * @return {String} The HTML, with matches automatically linked.
      */
    def link(textOrHtml: String): String = js.native
    
    /**
      * @private
      * @property {Autolinker.matcher.Matcher[]} matchers
      *
      * The {@link Autolinker.matcher.Matcher} instances for this Autolinker
      * instance.
      *
      * This is lazily created in {@link #getMatchers}.
      */
    var matchers: js.Any = js.native
    
    /**
      * @cfg {String/Boolean} [mention=false]
      *
      * A string for the service name to have mentions (ex: "@myuser")
      * auto-linked to. The currently supported values are:
      *
      * - 'twitter'
      * - 'instagram'
      * - 'soundcloud'
      *
      * Defaults to `false` to skip auto-linking of mentions.
      */
    val mention: js.Any = js.native
    
    /**
      * @cfg {Boolean} [newWindow=true]
      *
      * `true` if the links should open in a new window, `false` otherwise.
      */
    val newWindow: js.Any = js.native
    
    /**
      * Normalizes the {@link #stripPrefix} config into an Object with 2
      * properties: `scheme`, and `www` - both Booleans.
      *
      * See {@link #stripPrefix} config for details.
      *
      * @private
      * @param {Boolean/Object} stripPrefix
      * @return {Object}
      */
    var normalizeStripPrefixCfg: js.Any = js.native
    
    /**
      * Normalizes the {@link #truncate} config into an Object with 2 properties:
      * `length` (Number), and `location` (String).
      *
      * See {@link #truncate} config for details.
      *
      * @private
      * @param {Number/Object} truncate
      * @return {Object}
      */
    var normalizeTruncateCfg: js.Any = js.native
    
    /**
      * Normalizes the {@link #urls} config into an Object with 3 properties:
      * `schemeMatches`, `wwwMatches`, and `tldMatches`, all Booleans.
      *
      * See {@link #urls} config for details.
      *
      * @private
      * @param {Boolean/Object} urls
      * @return {Object}
      */
    var normalizeUrlsCfg: js.Any = js.native
    
    /**
      * Parses the input `textOrHtml` looking for URLs, email addresses, phone
      * numbers, username handles, and hashtags (depending on the configuration
      * of the Autolinker instance), and returns an array of {@link Autolinker.match.Match}
      * objects describing those matches (without making any replacements).
      *
      * This method is used by the {@link #link} method, but can also be used to
      * simply do parsing of the input in order to discover what kinds of links
      * there are and how many.
      *
      * Example usage:
      *
      *     var autolinker = new Autolinker( {
      *         urls: true,
      *         email: true
      *     } );
      *
      *     var matches = autolinker.parse( "Hello google.com, I am asdf@asdf.com" );
      *
      *     console.log( matches.length );           // 2
      *     console.log( matches[ 0 ].getType() );   // 'url'
      *     console.log( matches[ 0 ].getUrl() );    // 'google.com'
      *     console.log( matches[ 1 ].getType() );   // 'email'
      *     console.log( matches[ 1 ].getEmail() );  // 'asdf@asdf.com'
      *
      * @param {String} textOrHtml The HTML or text to find matches within
      *   (depending on if the {@link #urls}, {@link #email}, {@link #phone},
      *   {@link #hashtag}, and {@link #mention} options are enabled).
      * @return {Autolinker.match.Match[]} The array of Matches found in the
      *   given input `textOrHtml`.
      */
    def parse(textOrHtml: String): js.Array[Match] = js.native
    
    /**
      * Parses the input `text` looking for URLs, email addresses, phone
      * numbers, username handles, and hashtags (depending on the configuration
      * of the Autolinker instance), and returns an array of {@link Autolinker.match.Match}
      * objects describing those matches.
      *
      * This method processes a **non-HTML string**, and is used to parse and
      * match within the text nodes of an HTML string. This method is used
      * internally by {@link #parse}.
      *
      * @private
      * @param {String} text The text to find matches within (depending on if the
      *   {@link #urls}, {@link #email}, {@link #phone},
      *   {@link #hashtag}, and {@link #mention} options are enabled). This must be a non-HTML string.
      * @param {Number} [offset=0] The offset of the text node within the
      *   original string. This is used when parsing with the {@link #parse}
      *   method to generate correct offsets within the {@link Autolinker.match.Match}
      *   instances, but may be omitted if calling this method publicly.
      * @return {Autolinker.match.Match[]} The array of Matches found in the
      *   given input `text`.
      */
    var parseText: js.Any = js.native
    
    /**
      * @cfg {Boolean} [phone=true]
      *
      * `true` if Phone numbers ("(555)555-5555") should be automatically linked,
      * `false` if they should not be.
      */
    val phone: js.Any = js.native
    
    /**
      * Removes matches for matchers that were turned off in the options. For
      * example, if {@link #hashtag hashtags} were not to be matched, we'll
      * remove them from the `matches` array here.
      *
      * Note: we *must* use all Matchers on the input string, and then filter
      * them out later. For example, if the options were `{ url: false, hashtag: true }`,
      * we wouldn't want to match the text '#link' as a HashTag inside of the text
      * 'google.com/#link'. The way the algorithm works is that we match the full
      * URL first (which prevents the accidental HashTag match), and then we'll
      * simply throw away the URL match.
      *
      * @private
      * @param {Autolinker.match.Match[]} matches The array of matches to remove
      *   the unwanted matches from. Note: this array is mutated for the
      *   removals.
      * @return {Autolinker.match.Match[]} The mutated input `matches` array.
      */
    var removeUnwantedMatches: js.Any = js.native
    
    /**
      * @cfg {Function} replaceFn
      *
      * A function to individually process each match found in the input string.
      *
      * See the class's description for usage.
      *
      * The `replaceFn` can be called with a different context object (`this`
      * reference) using the {@link #context} cfg.
      *
      * This function is called with the following parameter:
      *
      * @cfg {Autolinker.match.Match} replaceFn.match The Match instance which
      *   can be used to retrieve information about the match that the `replaceFn`
      *   is currently processing. See {@link Autolinker.match.Match} subclasses
      *   for details.
      */
    val replaceFn: js.Any = js.native
    
    /**
      * @cfg {Boolean} [sanitizeHtml=false]
      *
      * `true` to HTML-encode the start and end brackets of existing HTML tags found
      * in the input string. This will escape `<` and `>` characters to `&lt;` and
      * `&gt;`, respectively.
      *
      * Setting this to `true` will prevent XSS (Cross-site Scripting) attacks,
      * but will remove the significance of existing HTML tags in the input string. If
      * you would like to maintain the significance of existing HTML tags while also
      * making the output HTML string safe, leave this option as `false` and use a
      * tool like https://github.com/cure53/DOMPurify (or others) on the input string
      * before running Autolinker.
      */
    val sanitizeHtml: js.Any = js.native
    
    /**
      * @cfg {Boolean/Object} [stripPrefix=true]
      *
      * `true` if 'http://' (or 'https://') and/or the 'www.' should be stripped
      * from the beginning of URL links' text, `false` otherwise. Defaults to
      * `true`.
      *
      * Examples:
      *
      *     stripPrefix: true
      *
      *     // or
      *
      *     stripPrefix: {
      *         scheme : true,
      *         www    : true
      *     }
      *
      * As shown above, this option also accepts an Object form with 2 properties
      * to allow for more customization of what exactly is prevented from being
      * displayed. Both default to `true`:
      *
      * @cfg {Boolean} [stripPrefix.scheme] `true` to prevent the scheme part of
      *   a URL match from being displayed to the user. Example:
      *   `'http://google.com'` will be displayed as `'google.com'`. `false` to
      *   not strip the scheme. NOTE: Only an `'http://'` or `'https://'` scheme
      *   will be removed, so as not to remove a potentially dangerous scheme
      *   (such as `'file://'` or `'javascript:'`)
      * @cfg {Boolean} [stripPrefix.www] www (Boolean): `true` to prevent the
      *   `'www.'` part of a URL match from being displayed to the user. Ex:
      *   `'www.google.com'` will be displayed as `'google.com'`. `false` to not
      *   strip the `'www'`.
      */
    val stripPrefix: js.Any = js.native
    
    /**
      * @cfg {Boolean} [stripTrailingSlash=true]
      *
      * `true` to remove the trailing slash from URL matches, `false` to keep
      *  the trailing slash.
      *
      *  Example when `true`: `http://google.com/` will be displayed as
      *  `http://google.com`.
      */
    val stripTrailingSlash: js.Any = js.native
    
    /**
      * @private
      * @property {Autolinker.AnchorTagBuilder} tagBuilder
      *
      * The AnchorTagBuilder instance used to build match replacement anchor tags.
      * Note: this is lazily instantiated in the {@link #getTagBuilder} method.
      */
    var tagBuilder: js.Any = js.native
    
    /**
      * @cfg {Number/Object} [truncate=0]
      *
      * ## Number Form
      *
      * A number for how many characters matched text should be truncated to
      * inside the text of a link. If the matched text is over this number of
      * characters, it will be truncated to this length by adding a two period
      * ellipsis ('..') to the end of the string.
      *
      * For example: A url like 'http://www.yahoo.com/some/long/path/to/a/file'
      * truncated to 25 characters might look something like this:
      * 'yahoo.com/some/long/pat..'
      *
      * Example Usage:
      *
      *     truncate: 25
      *
      *
      *  Defaults to `0` for "no truncation."
      *
      *
      * ## Object Form
      *
      * An Object may also be provided with two properties: `length` (Number) and
      * `location` (String). `location` may be one of the following: 'end'
      * (default), 'middle', or 'smart'.
      *
      * Example Usage:
      *
      *     truncate: { length: 25, location: 'middle' }
      *
      * @cfg {Number} [truncate.length=0] How many characters to allow before
      *   truncation will occur. Defaults to `0` for "no truncation."
      * @cfg {"end"/"middle"/"smart"} [truncate.location="end"]
      *
      * - 'end' (default): will truncate up to the number of characters, and then
      *   add an ellipsis at the end. Ex: 'yahoo.com/some/long/pat..'
      * - 'middle': will truncate and add the ellipsis in the middle. Ex:
      *   'yahoo.com/s..th/to/a/file'
      * - 'smart': for URLs where the algorithm attempts to strip out unnecessary
      *   parts first (such as the 'www.', then URL scheme, hash, etc.),
      *   attempting to make the URL human-readable before looking for a good
      *   point to insert the ellipsis if it is still too long. Ex:
      *   'yahoo.com/some..to/a/file'. For more details, see
      *   {@link Autolinker.truncate.TruncateSmart}.
      */
    val truncate: js.Any = js.native
    
    /**
      * @cfg {Boolean/Object} [urls]
      *
      * `true` if URLs should be automatically linked, `false` if they should not
      * be. Defaults to `true`.
      *
      * Examples:
      *
      *     urls: true
      *
      *     // or
      *
      *     urls: {
      *         schemeMatches : true,
      *         wwwMatches    : true,
      *         tldMatches    : true
      *     }
      *
      * As shown above, this option also accepts an Object form with 3 properties
      * to allow for more customization of what exactly gets linked. All default
      * to `true`:
      *
      * @cfg {Boolean} [urls.schemeMatches] `true` to match URLs found prefixed
      *   with a scheme, i.e. `http://google.com`, or `other+scheme://google.com`,
      *   `false` to prevent these types of matches.
      * @cfg {Boolean} [urls.wwwMatches] `true` to match urls found prefixed with
      *   `'www.'`, i.e. `www.google.com`. `false` to prevent these types of
      *   matches. Note that if the URL had a prefixed scheme, and
      *   `schemeMatches` is true, it will still be linked.
      * @cfg {Boolean} [urls.tldMatches] `true` to match URLs with known top
      *   level domains (.com, .net, etc.) that are not prefixed with a scheme or
      *   `'www.'`. This option attempts to match anything that looks like a URL
      *   in the given text. Ex: `google.com`, `asdf.org/?page=1`, etc. `false`
      *   to prevent these types of matches.
      */
    val urls: js.Any = js.native
    
    /**
      * The Autolinker version number exposed on the instance itself.
      *
      * Ex: 0.25.1
      */
    val version: /* "3.14.2" */ String = js.native
  }
  object Autolinker {
    
    @scala.inline
    def apply(
      className: js.Any,
      compactMatches: js.Any,
      context: js.Any,
      createMatchReturnVal: js.Any,
      decodePercentEncoding: js.Any,
      email: js.Any,
      getMatchers: js.Any,
      getTagBuilder: js.Any,
      hashtag: js.Any,
      link: String => String,
      matchers: js.Any,
      mention: js.Any,
      newWindow: js.Any,
      normalizeStripPrefixCfg: js.Any,
      normalizeTruncateCfg: js.Any,
      normalizeUrlsCfg: js.Any,
      parse: String => js.Array[Match],
      parseText: js.Any,
      phone: js.Any,
      removeUnwantedMatches: js.Any,
      replaceFn: js.Any,
      sanitizeHtml: js.Any,
      stripPrefix: js.Any,
      stripTrailingSlash: js.Any,
      tagBuilder: js.Any,
      truncate: js.Any,
      urls: js.Any,
      version: /* "3.14.2" */ String
    ): Autolinker = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], compactMatches = compactMatches.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createMatchReturnVal = createMatchReturnVal.asInstanceOf[js.Any], decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], getMatchers = getMatchers.asInstanceOf[js.Any], getTagBuilder = getTagBuilder.asInstanceOf[js.Any], hashtag = hashtag.asInstanceOf[js.Any], link = js.Any.fromFunction1(link), matchers = matchers.asInstanceOf[js.Any], mention = mention.asInstanceOf[js.Any], newWindow = newWindow.asInstanceOf[js.Any], normalizeStripPrefixCfg = normalizeStripPrefixCfg.asInstanceOf[js.Any], normalizeTruncateCfg = normalizeTruncateCfg.asInstanceOf[js.Any], normalizeUrlsCfg = normalizeUrlsCfg.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parseText = parseText.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], removeUnwantedMatches = removeUnwantedMatches.asInstanceOf[js.Any], replaceFn = replaceFn.asInstanceOf[js.Any], sanitizeHtml = sanitizeHtml.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autolinker]
    }
    
    @scala.inline
    implicit class AutolinkerMutableBuilder[Self <: Autolinker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: js.Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactMatches(value: js.Any): Self = StObject.set(x, "compactMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateMatchReturnVal(value: js.Any): Self = StObject.set(x, "createMatchReturnVal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodePercentEncoding(value: js.Any): Self = StObject.set(x, "decodePercentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: js.Any): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetMatchers(value: js.Any): Self = StObject.set(x, "getMatchers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetTagBuilder(value: js.Any): Self = StObject.set(x, "getTagBuilder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtag(value: js.Any): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String => String): Self = StObject.set(x, "link", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatchers(value: js.Any): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMention(value: js.Any): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewWindow(value: js.Any): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeStripPrefixCfg(value: js.Any): Self = StObject.set(x, "normalizeStripPrefixCfg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeTruncateCfg(value: js.Any): Self = StObject.set(x, "normalizeTruncateCfg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUrlsCfg(value: js.Any): Self = StObject.set(x, "normalizeUrlsCfg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParse(value: String => js.Array[Match]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseText(value: js.Any): Self = StObject.set(x, "parseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: js.Any): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUnwantedMatches(value: js.Any): Self = StObject.set(x, "removeUnwantedMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceFn(value: js.Any): Self = StObject.set(x, "replaceFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanitizeHtml(value: js.Any): Self = StObject.set(x, "sanitizeHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripPrefix(value: js.Any): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripTrailingSlash(value: js.Any): Self = StObject.set(x, "stripTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagBuilder(value: js.Any): Self = StObject.set(x, "tagBuilder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncate(value: js.Any): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrls(value: js.Any): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: /* "3.14.2" */ String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AutolinkerConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var context: js.UndefOr[js.Any] = js.native
    
    var decodePercentEncoding: js.UndefOr[Boolean] = js.native
    
    var email: js.UndefOr[Boolean] = js.native
    
    var hashtag: js.UndefOr[HashtagConfig] = js.native
    
    var mention: js.UndefOr[MentionConfig] = js.native
    
    var newWindow: js.UndefOr[Boolean] = js.native
    
    var phone: js.UndefOr[Boolean] = js.native
    
    var replaceFn: js.UndefOr[ReplaceFn | Null] = js.native
    
    var sanitizeHtml: js.UndefOr[Boolean] = js.native
    
    var stripPrefix: js.UndefOr[StripPrefixConfig] = js.native
    
    var stripTrailingSlash: js.UndefOr[Boolean] = js.native
    
    var truncate: js.UndefOr[TruncateConfig] = js.native
    
    var urls: js.UndefOr[UrlsConfig] = js.native
  }
  object AutolinkerConfig {
    
    @scala.inline
    def apply(): AutolinkerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutolinkerConfig]
    }
    
    @scala.inline
    implicit class AutolinkerConfigMutableBuilder[Self <: AutolinkerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDecodePercentEncoding(value: Boolean): Self = StObject.set(x, "decodePercentEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodePercentEncodingUndefined: Self = StObject.set(x, "decodePercentEncoding", js.undefined)
      
      @scala.inline
      def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setHashtag(value: HashtagConfig): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setMention(value: MentionConfig): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      @scala.inline
      def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
      
      @scala.inline
      def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setReplaceFn(value: /* match */ Match => ReplaceFnReturn): Self = StObject.set(x, "replaceFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplaceFnNull: Self = StObject.set(x, "replaceFn", null)
      
      @scala.inline
      def setReplaceFnUndefined: Self = StObject.set(x, "replaceFn", js.undefined)
      
      @scala.inline
      def setSanitizeHtml(value: Boolean): Self = StObject.set(x, "sanitizeHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSanitizeHtmlUndefined: Self = StObject.set(x, "sanitizeHtml", js.undefined)
      
      @scala.inline
      def setStripPrefix(value: StripPrefixConfig): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      @scala.inline
      def setStripTrailingSlash(value: Boolean): Self = StObject.set(x, "stripTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripTrailingSlashUndefined: Self = StObject.set(x, "stripTrailingSlash", js.undefined)
      
      @scala.inline
      def setTruncate(value: TruncateConfig): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setUrls(value: UrlsConfig): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerBooleans.`false`
    - typings.autolinker.autolinkerStrings.twitter
    - typings.autolinker.autolinkerStrings.facebook
    - typings.autolinker.autolinkerStrings.instagram
  */
  trait HashtagConfig extends StObject
  object HashtagConfig {
    
    @scala.inline
    def facebook: typings.autolinker.autolinkerStrings.facebook = "facebook".asInstanceOf[typings.autolinker.autolinkerStrings.facebook]
    
    @scala.inline
    def `false`: typings.autolinker.autolinkerBooleans.`false` = false.asInstanceOf[typings.autolinker.autolinkerBooleans.`false`]
    
    @scala.inline
    def instagram: typings.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typings.autolinker.autolinkerStrings.instagram]
    
    @scala.inline
    def twitter: typings.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typings.autolinker.autolinkerStrings.twitter]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerStrings.twitter
    - typings.autolinker.autolinkerStrings.facebook
    - typings.autolinker.autolinkerStrings.instagram
  */
  trait HashtagServices extends StObject
  object HashtagServices {
    
    @scala.inline
    def facebook: typings.autolinker.autolinkerStrings.facebook = "facebook".asInstanceOf[typings.autolinker.autolinkerStrings.facebook]
    
    @scala.inline
    def instagram: typings.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typings.autolinker.autolinkerStrings.instagram]
    
    @scala.inline
    def twitter: typings.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typings.autolinker.autolinkerStrings.twitter]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerBooleans.`false`
    - typings.autolinker.autolinkerStrings.twitter
    - typings.autolinker.autolinkerStrings.instagram
    - typings.autolinker.autolinkerStrings.soundcloud
  */
  trait MentionConfig extends StObject
  object MentionConfig {
    
    @scala.inline
    def `false`: typings.autolinker.autolinkerBooleans.`false` = false.asInstanceOf[typings.autolinker.autolinkerBooleans.`false`]
    
    @scala.inline
    def instagram: typings.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typings.autolinker.autolinkerStrings.instagram]
    
    @scala.inline
    def soundcloud: typings.autolinker.autolinkerStrings.soundcloud = "soundcloud".asInstanceOf[typings.autolinker.autolinkerStrings.soundcloud]
    
    @scala.inline
    def twitter: typings.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typings.autolinker.autolinkerStrings.twitter]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerStrings.twitter
    - typings.autolinker.autolinkerStrings.instagram
    - typings.autolinker.autolinkerStrings.soundcloud
  */
  trait MentionServices extends StObject
  object MentionServices {
    
    @scala.inline
    def instagram: typings.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typings.autolinker.autolinkerStrings.instagram]
    
    @scala.inline
    def soundcloud: typings.autolinker.autolinkerStrings.soundcloud = "soundcloud".asInstanceOf[typings.autolinker.autolinkerStrings.soundcloud]
    
    @scala.inline
    def twitter: typings.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typings.autolinker.autolinkerStrings.twitter]
  }
  
  type ReplaceFn = js.Function1[/* match */ Match, ReplaceFnReturn]
  
  type ReplaceFnReturn = js.UndefOr[Boolean | String | HtmlTag | Null | Unit]
  
  type StripPrefixConfig = Boolean | StripPrefixConfigObj
  
  @js.native
  trait StripPrefixConfigObj extends StObject {
    
    var scheme: js.UndefOr[Boolean] = js.native
    
    var www: js.UndefOr[Boolean] = js.native
  }
  object StripPrefixConfigObj {
    
    @scala.inline
    def apply(): StripPrefixConfigObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripPrefixConfigObj]
    }
    
    @scala.inline
    implicit class StripPrefixConfigObjMutableBuilder[Self <: StripPrefixConfigObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScheme(value: Boolean): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      @scala.inline
      def setWww(value: Boolean): Self = StObject.set(x, "www", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWwwUndefined: Self = StObject.set(x, "www", js.undefined)
    }
  }
  
  type TruncateConfig = Double | TruncateConfigObj
  
  @js.native
  trait TruncateConfigObj extends StObject {
    
    var length: js.UndefOr[Double] = js.native
    
    var location: js.UndefOr[end | middle | smart] = js.native
  }
  object TruncateConfigObj {
    
    @scala.inline
    def apply(): TruncateConfigObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncateConfigObj]
    }
    
    @scala.inline
    implicit class TruncateConfigObjMutableBuilder[Self <: TruncateConfigObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLocation(value: end | middle | smart): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerStrings.scheme
    - typings.autolinker.autolinkerStrings.www
    - typings.autolinker.autolinkerStrings.tld
  */
  trait UrlMatchTypeOptions extends StObject
  object UrlMatchTypeOptions {
    
    @scala.inline
    def scheme: typings.autolinker.autolinkerStrings.scheme = "scheme".asInstanceOf[typings.autolinker.autolinkerStrings.scheme]
    
    @scala.inline
    def tld: typings.autolinker.autolinkerStrings.tld = "tld".asInstanceOf[typings.autolinker.autolinkerStrings.tld]
    
    @scala.inline
    def www: typings.autolinker.autolinkerStrings.www = "www".asInstanceOf[typings.autolinker.autolinkerStrings.www]
  }
  
  type UrlsConfig = Boolean | UrlsConfigObj
  
  @js.native
  trait UrlsConfigObj extends StObject {
    
    var schemeMatches: js.UndefOr[Boolean] = js.native
    
    var tldMatches: js.UndefOr[Boolean] = js.native
    
    var wwwMatches: js.UndefOr[Boolean] = js.native
  }
  object UrlsConfigObj {
    
    @scala.inline
    def apply(): UrlsConfigObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlsConfigObj]
    }
    
    @scala.inline
    implicit class UrlsConfigObjMutableBuilder[Self <: UrlsConfigObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSchemeMatches(value: Boolean): Self = StObject.set(x, "schemeMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeMatchesUndefined: Self = StObject.set(x, "schemeMatches", js.undefined)
      
      @scala.inline
      def setTldMatches(value: Boolean): Self = StObject.set(x, "tldMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTldMatchesUndefined: Self = StObject.set(x, "tldMatches", js.undefined)
      
      @scala.inline
      def setWwwMatches(value: Boolean): Self = StObject.set(x, "wwwMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWwwMatchesUndefined: Self = StObject.set(x, "wwwMatches", js.undefined)
    }
  }
}
