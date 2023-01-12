package typings.autolinker

import typings.autolinker.autolinkerStrings.end
import typings.autolinker.autolinkerStrings.middle
import typings.autolinker.autolinkerStrings.smart
import typings.autolinker.distCommonjsHtmlTagMod.HtmlTag
import typings.autolinker.distCommonjsMatchMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAutolinkerMod {
  
  @JSImport("autolinker/dist/commonjs/autolinker", JSImport.Default)
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the Autolinker instance,
    *   specified in an Object (map).
    */
  open class default ()
    extends StObject
       with Autolinker {
    def this(cfg: AutolinkerConfig) = this()
    
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
    /* private */ /* CompleteClass */
    override val className: Any = js.native
    
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
    /* private */ /* CompleteClass */
    var compactMatches: Any = js.native
    
    /**
      * @cfg {Object} context
      *
      * The context object (`this` reference) to call the `replaceFn` with.
      *
      * Defaults to this Autolinker instance.
      */
    /* private */ /* CompleteClass */
    override val context: Any = js.native
    
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
    /* private */ /* CompleteClass */
    var createMatchReturnVal: Any = js.native
    
    /**
      * @cfg {Boolean} [decodePercentEncoding=true]
      *
      * `true` to decode percent-encoded characters in URL matches, `false` to keep
      *  the percent-encoded characters.
      *
      *  Example when `true`: `https://en.wikipedia.org/wiki/San_Jos%C3%A9` will
      *  be displayed as `https://en.wikipedia.org/wiki/San_José`.
      */
    /* private */ /* CompleteClass */
    override val decodePercentEncoding: Any = js.native
    
    /**
      * @cfg {Boolean} [email=true]
      *
      * `true` if email addresses should be automatically linked, `false` if they
      * should not be.
      */
    /* private */ /* CompleteClass */
    override val email: Any = js.native
    
    /**
      * Returns the {@link #tagBuilder} instance for this Autolinker instance,
      * lazily instantiating it if it does not yet exist.
      *
      * @private
      * @return {Autolinker.AnchorTagBuilder}
      */
    /* private */ /* CompleteClass */
    var getTagBuilder: Any = js.native
    
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
    /* private */ /* CompleteClass */
    override val hashtag: Any = js.native
    
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
    /* CompleteClass */
    override def link(textOrHtml: String): String = js.native
    
    /**
      * @cfg {String/Boolean} [mention=false]
      *
      * A string for the service name to have mentions (ex: "@myuser")
      * auto-linked to. The currently supported values are:
      *
      * - 'twitter'
      * - 'instagram'
      * - 'soundcloud'
      * - 'tiktok'
      *
      * Defaults to `false` to skip auto-linking of mentions.
      */
    /* private */ /* CompleteClass */
    override val mention: Any = js.native
    
    /**
      * @cfg {Boolean} [newWindow=true]
      *
      * `true` if the links should open in a new window, `false` otherwise.
      */
    /* private */ /* CompleteClass */
    override val newWindow: Any = js.native
    
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
    /* CompleteClass */
    override def parse(textOrHtml: String): js.Array[Match] = js.native
    
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
    /* private */ /* CompleteClass */
    var parseText: Any = js.native
    
    /**
      * @cfg {Boolean} [phone=true]
      *
      * `true` if Phone numbers ("(555)555-5555") should be automatically linked,
      * `false` if they should not be.
      */
    /* private */ /* CompleteClass */
    override val phone: Any = js.native
    
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
    /* private */ /* CompleteClass */
    var removeUnwantedMatches: Any = js.native
    
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
    /* private */ /* CompleteClass */
    override val replaceFn: Any = js.native
    
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
    /* private */ /* CompleteClass */
    override val sanitizeHtml: Any = js.native
    
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
    /* private */ /* CompleteClass */
    override val stripPrefix: Any = js.native
    
    /**
      * @cfg {Boolean} [stripTrailingSlash=true]
      *
      * `true` to remove the trailing slash from URL matches, `false` to keep
      *  the trailing slash.
      *
      *  Example when `true`: `http://google.com/` will be displayed as
      *  `http://google.com`.
      */
    /* private */ /* CompleteClass */
    override val stripTrailingSlash: Any = js.native
    
    /**
      * @private
      * @property {Autolinker.AnchorTagBuilder} tagBuilder
      *
      * The AnchorTagBuilder instance used to build match replacement anchor tags.
      * Note: this is lazily instantiated in the {@link #getTagBuilder} method.
      */
    /* private */ /* CompleteClass */
    var tagBuilder: Any = js.native
    
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
    /* private */ /* CompleteClass */
    override val truncate: Any = js.native
    
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
      *         tldMatches    : true,
      *         ipV4Matches   : true
      *     }
      *
      * As shown above, this option also accepts an Object form with 3 properties
      * to allow for more customization of what exactly gets linked. All default
      * to `true`:
      *
      * @cfg {Boolean} [urls.schemeMatches] `true` to match URLs found prefixed
      *   with a scheme, i.e. `http://google.com`, or `other+scheme://google.com`,
      *   `false` to prevent these types of matches.
      * @cfg {Boolean} [urls.tldMatches] `true` to match URLs with known top
      *   level domains (.com, .net, etc.) that are not prefixed with a scheme
      *   (such as 'http://'). This option attempts to match anything that looks
      *   like a URL in the given text. Ex: `google.com`, `asdf.org/?page=1`, etc.
      *   `false` to prevent these types of matches.
      * @cfg {Boolean} [urls.ipV4Matches] `true` to match IPv4 addresses in text
      *   that are not prefixed with a scheme (such as 'http://'). This option
      *   attempts to match anything that looks like an IPv4 address in text. Ex:
      *   `192.168.0.1`, `10.0.0.1/?page=1`, etc. `false` to prevent these types
      *   of matches.
      */
    /* private */ /* CompleteClass */
    override val urls: Any = js.native
    
    /**
      * The Autolinker version number exposed on the instance itself.
      *
      * Ex: 0.25.1
      *
      * @property {String} version
      */
    /* CompleteClass */
    override val version: /* "4.0.0" */ String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("autolinker/dist/commonjs/autolinker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def link(textOrHtml: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(textOrHtml.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def link(textOrHtml: String, options: AutolinkerConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(textOrHtml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
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
    inline def parse(textOrHtml: String, options: AutolinkerConfig): js.Array[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(textOrHtml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Match]]
    
    /**
      * @static
      * @property {String} version
      *
      * The Autolinker version number in the form major.minor.patch
      *
      * Ex: 3.15.0
      */
    @JSImport("autolinker/dist/commonjs/autolinker", "default.version")
    @js.native
    val version: /* "4.0.0" */ String = js.native
  }
  
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
    /* private */ val className: Any
    
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
    /* private */ var compactMatches: Any
    
    /**
      * @cfg {Object} context
      *
      * The context object (`this` reference) to call the `replaceFn` with.
      *
      * Defaults to this Autolinker instance.
      */
    /* private */ val context: Any
    
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
    /* private */ var createMatchReturnVal: Any
    
    /**
      * @cfg {Boolean} [decodePercentEncoding=true]
      *
      * `true` to decode percent-encoded characters in URL matches, `false` to keep
      *  the percent-encoded characters.
      *
      *  Example when `true`: `https://en.wikipedia.org/wiki/San_Jos%C3%A9` will
      *  be displayed as `https://en.wikipedia.org/wiki/San_José`.
      */
    /* private */ val decodePercentEncoding: Any
    
    /**
      * @cfg {Boolean} [email=true]
      *
      * `true` if email addresses should be automatically linked, `false` if they
      * should not be.
      */
    /* private */ val email: Any
    
    /**
      * Returns the {@link #tagBuilder} instance for this Autolinker instance,
      * lazily instantiating it if it does not yet exist.
      *
      * @private
      * @return {Autolinker.AnchorTagBuilder}
      */
    /* private */ var getTagBuilder: Any
    
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
    /* private */ val hashtag: Any
    
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
    def link(textOrHtml: String): String
    
    /**
      * @cfg {String/Boolean} [mention=false]
      *
      * A string for the service name to have mentions (ex: "@myuser")
      * auto-linked to. The currently supported values are:
      *
      * - 'twitter'
      * - 'instagram'
      * - 'soundcloud'
      * - 'tiktok'
      *
      * Defaults to `false` to skip auto-linking of mentions.
      */
    /* private */ val mention: Any
    
    /**
      * @cfg {Boolean} [newWindow=true]
      *
      * `true` if the links should open in a new window, `false` otherwise.
      */
    /* private */ val newWindow: Any
    
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
    def parse(textOrHtml: String): js.Array[Match]
    
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
    /* private */ var parseText: Any
    
    /**
      * @cfg {Boolean} [phone=true]
      *
      * `true` if Phone numbers ("(555)555-5555") should be automatically linked,
      * `false` if they should not be.
      */
    /* private */ val phone: Any
    
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
    /* private */ var removeUnwantedMatches: Any
    
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
    /* private */ val replaceFn: Any
    
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
    /* private */ val sanitizeHtml: Any
    
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
    /* private */ val stripPrefix: Any
    
    /**
      * @cfg {Boolean} [stripTrailingSlash=true]
      *
      * `true` to remove the trailing slash from URL matches, `false` to keep
      *  the trailing slash.
      *
      *  Example when `true`: `http://google.com/` will be displayed as
      *  `http://google.com`.
      */
    /* private */ val stripTrailingSlash: Any
    
    /**
      * @private
      * @property {Autolinker.AnchorTagBuilder} tagBuilder
      *
      * The AnchorTagBuilder instance used to build match replacement anchor tags.
      * Note: this is lazily instantiated in the {@link #getTagBuilder} method.
      */
    /* private */ var tagBuilder: Any
    
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
    /* private */ val truncate: Any
    
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
      *         tldMatches    : true,
      *         ipV4Matches   : true
      *     }
      *
      * As shown above, this option also accepts an Object form with 3 properties
      * to allow for more customization of what exactly gets linked. All default
      * to `true`:
      *
      * @cfg {Boolean} [urls.schemeMatches] `true` to match URLs found prefixed
      *   with a scheme, i.e. `http://google.com`, or `other+scheme://google.com`,
      *   `false` to prevent these types of matches.
      * @cfg {Boolean} [urls.tldMatches] `true` to match URLs with known top
      *   level domains (.com, .net, etc.) that are not prefixed with a scheme
      *   (such as 'http://'). This option attempts to match anything that looks
      *   like a URL in the given text. Ex: `google.com`, `asdf.org/?page=1`, etc.
      *   `false` to prevent these types of matches.
      * @cfg {Boolean} [urls.ipV4Matches] `true` to match IPv4 addresses in text
      *   that are not prefixed with a scheme (such as 'http://'). This option
      *   attempts to match anything that looks like an IPv4 address in text. Ex:
      *   `192.168.0.1`, `10.0.0.1/?page=1`, etc. `false` to prevent these types
      *   of matches.
      */
    /* private */ val urls: Any
    
    /**
      * The Autolinker version number exposed on the instance itself.
      *
      * Ex: 0.25.1
      *
      * @property {String} version
      */
    val version: /* "4.0.0" */ String
  }
  object Autolinker {
    
    inline def apply(
      className: Any,
      compactMatches: Any,
      context: Any,
      createMatchReturnVal: Any,
      decodePercentEncoding: Any,
      email: Any,
      getTagBuilder: Any,
      hashtag: Any,
      link: String => String,
      mention: Any,
      newWindow: Any,
      parse: String => js.Array[Match],
      parseText: Any,
      phone: Any,
      removeUnwantedMatches: Any,
      replaceFn: Any,
      sanitizeHtml: Any,
      stripPrefix: Any,
      stripTrailingSlash: Any,
      tagBuilder: Any,
      truncate: Any,
      urls: Any,
      version: /* "4.0.0" */ String
    ): Autolinker = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], compactMatches = compactMatches.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], createMatchReturnVal = createMatchReturnVal.asInstanceOf[js.Any], decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], getTagBuilder = getTagBuilder.asInstanceOf[js.Any], hashtag = hashtag.asInstanceOf[js.Any], link = js.Any.fromFunction1(link), mention = mention.asInstanceOf[js.Any], newWindow = newWindow.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), parseText = parseText.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], removeUnwantedMatches = removeUnwantedMatches.asInstanceOf[js.Any], replaceFn = replaceFn.asInstanceOf[js.Any], sanitizeHtml = sanitizeHtml.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autolinker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Autolinker] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCompactMatches(value: Any): Self = StObject.set(x, "compactMatches", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setCreateMatchReturnVal(value: Any): Self = StObject.set(x, "createMatchReturnVal", value.asInstanceOf[js.Any])
      
      inline def setDecodePercentEncoding(value: Any): Self = StObject.set(x, "decodePercentEncoding", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: Any): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setGetTagBuilder(value: Any): Self = StObject.set(x, "getTagBuilder", value.asInstanceOf[js.Any])
      
      inline def setHashtag(value: Any): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String => String): Self = StObject.set(x, "link", js.Any.fromFunction1(value))
      
      inline def setMention(value: Any): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      inline def setNewWindow(value: Any): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
      
      inline def setParse(value: String => js.Array[Match]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setParseText(value: Any): Self = StObject.set(x, "parseText", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: Any): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setRemoveUnwantedMatches(value: Any): Self = StObject.set(x, "removeUnwantedMatches", value.asInstanceOf[js.Any])
      
      inline def setReplaceFn(value: Any): Self = StObject.set(x, "replaceFn", value.asInstanceOf[js.Any])
      
      inline def setSanitizeHtml(value: Any): Self = StObject.set(x, "sanitizeHtml", value.asInstanceOf[js.Any])
      
      inline def setStripPrefix(value: Any): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripTrailingSlash(value: Any): Self = StObject.set(x, "stripTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setTagBuilder(value: Any): Self = StObject.set(x, "tagBuilder", value.asInstanceOf[js.Any])
      
      inline def setTruncate(value: Any): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: Any): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: /* "4.0.0" */ String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutolinkerConfig extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var decodePercentEncoding: js.UndefOr[Boolean] = js.undefined
    
    var email: js.UndefOr[Boolean] = js.undefined
    
    var hashtag: js.UndefOr[HashtagConfig] = js.undefined
    
    var mention: js.UndefOr[MentionConfig] = js.undefined
    
    var newWindow: js.UndefOr[Boolean] = js.undefined
    
    var phone: js.UndefOr[Boolean] = js.undefined
    
    var replaceFn: js.UndefOr[ReplaceFn | Null] = js.undefined
    
    var sanitizeHtml: js.UndefOr[Boolean] = js.undefined
    
    var stripPrefix: js.UndefOr[StripPrefixConfig] = js.undefined
    
    var stripTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var truncate: js.UndefOr[TruncateConfig] = js.undefined
    
    var urls: js.UndefOr[UrlsConfig] = js.undefined
  }
  object AutolinkerConfig {
    
    inline def apply(): AutolinkerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutolinkerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutolinkerConfig] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDecodePercentEncoding(value: Boolean): Self = StObject.set(x, "decodePercentEncoding", value.asInstanceOf[js.Any])
      
      inline def setDecodePercentEncodingUndefined: Self = StObject.set(x, "decodePercentEncoding", js.undefined)
      
      inline def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHashtag(value: HashtagConfig): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      inline def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      inline def setMention(value: MentionConfig): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      inline def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      inline def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
      
      inline def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
      
      inline def setPhone(value: Boolean): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setReplaceFn(value: /* match */ Match => ReplaceFnReturn): Self = StObject.set(x, "replaceFn", js.Any.fromFunction1(value))
      
      inline def setReplaceFnNull: Self = StObject.set(x, "replaceFn", null)
      
      inline def setReplaceFnUndefined: Self = StObject.set(x, "replaceFn", js.undefined)
      
      inline def setSanitizeHtml(value: Boolean): Self = StObject.set(x, "sanitizeHtml", value.asInstanceOf[js.Any])
      
      inline def setSanitizeHtmlUndefined: Self = StObject.set(x, "sanitizeHtml", js.undefined)
      
      inline def setStripPrefix(value: StripPrefixConfig): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
      
      inline def setStripTrailingSlash(value: Boolean): Self = StObject.set(x, "stripTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setStripTrailingSlashUndefined: Self = StObject.set(x, "stripTrailingSlash", js.undefined)
      
      inline def setTruncate(value: TruncateConfig): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setUrls(value: UrlsConfig): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerBooleans.`false`
    - typings.autolinker.autolinkerStrings.twitter
    - typings.autolinker.autolinkerStrings.facebook
    - typings.autolinker.autolinkerStrings.instagram
    - typings.autolinker.autolinkerStrings.tiktok
  */
  trait HashtagConfig extends StObject
  object HashtagConfig {
    
    inline def facebook: typings.autolinker.autolinkerStrings.facebook = "facebook".asInstanceOf[typings.autolinker.autolinkerStrings.facebook]
    
    inline def `false`: typings.autolinker.autolinkerBooleans.`false` = false.asInstanceOf[typings.autolinker.autolinkerBooleans.`false`]
    
    inline def instagram: typings.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typings.autolinker.autolinkerStrings.instagram]
    
    inline def tiktok: typings.autolinker.autolinkerStrings.tiktok = "tiktok".asInstanceOf[typings.autolinker.autolinkerStrings.tiktok]
    
    inline def twitter: typings.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typings.autolinker.autolinkerStrings.twitter]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.autolinker.autolinkerBooleans.`false`
    - typings.autolinker.autolinkerStrings.twitter
    - typings.autolinker.autolinkerStrings.instagram
    - typings.autolinker.autolinkerStrings.soundcloud
    - typings.autolinker.autolinkerStrings.tiktok
  */
  trait MentionConfig extends StObject
  object MentionConfig {
    
    inline def `false`: typings.autolinker.autolinkerBooleans.`false` = false.asInstanceOf[typings.autolinker.autolinkerBooleans.`false`]
    
    inline def instagram: typings.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typings.autolinker.autolinkerStrings.instagram]
    
    inline def soundcloud: typings.autolinker.autolinkerStrings.soundcloud = "soundcloud".asInstanceOf[typings.autolinker.autolinkerStrings.soundcloud]
    
    inline def tiktok: typings.autolinker.autolinkerStrings.tiktok = "tiktok".asInstanceOf[typings.autolinker.autolinkerStrings.tiktok]
    
    inline def twitter: typings.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typings.autolinker.autolinkerStrings.twitter]
  }
  
  type ReplaceFn = js.Function1[/* match */ Match, ReplaceFnReturn]
  
  type ReplaceFnReturn = js.UndefOr[Boolean | String | HtmlTag | Null | Unit]
  
  type StripPrefixConfig = Boolean | StripPrefixConfigObj
  
  trait StripPrefixConfigObj extends StObject {
    
    var scheme: js.UndefOr[Boolean] = js.undefined
    
    var www: js.UndefOr[Boolean] = js.undefined
  }
  object StripPrefixConfigObj {
    
    inline def apply(): StripPrefixConfigObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripPrefixConfigObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StripPrefixConfigObj] (val x: Self) extends AnyVal {
      
      inline def setScheme(value: Boolean): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setWww(value: Boolean): Self = StObject.set(x, "www", value.asInstanceOf[js.Any])
      
      inline def setWwwUndefined: Self = StObject.set(x, "www", js.undefined)
    }
  }
  
  type TruncateConfig = Double | TruncateConfigObj
  
  trait TruncateConfigObj extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[end | middle | smart] = js.undefined
  }
  object TruncateConfigObj {
    
    inline def apply(): TruncateConfigObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncateConfigObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TruncateConfigObj] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLocation(value: end | middle | smart): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  type UrlsConfig = Boolean | UrlsConfigObj
  
  trait UrlsConfigObj extends StObject {
    
    var ipV4Matches: js.UndefOr[Boolean] = js.undefined
    
    var schemeMatches: js.UndefOr[Boolean] = js.undefined
    
    var tldMatches: js.UndefOr[Boolean] = js.undefined
  }
  object UrlsConfigObj {
    
    inline def apply(): UrlsConfigObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlsConfigObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlsConfigObj] (val x: Self) extends AnyVal {
      
      inline def setIpV4Matches(value: Boolean): Self = StObject.set(x, "ipV4Matches", value.asInstanceOf[js.Any])
      
      inline def setIpV4MatchesUndefined: Self = StObject.set(x, "ipV4Matches", js.undefined)
      
      inline def setSchemeMatches(value: Boolean): Self = StObject.set(x, "schemeMatches", value.asInstanceOf[js.Any])
      
      inline def setSchemeMatchesUndefined: Self = StObject.set(x, "schemeMatches", js.undefined)
      
      inline def setTldMatches(value: Boolean): Self = StObject.set(x, "tldMatches", value.asInstanceOf[js.Any])
      
      inline def setTldMatchesUndefined: Self = StObject.set(x, "tldMatches", js.undefined)
    }
  }
}
