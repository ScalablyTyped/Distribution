package typings.autolinker

import typings.autolinker.abstractMatchMod.AbstractMatchConfig
import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilderCfg
import typings.autolinker.autolinkerMod.AutolinkerConfig
import typings.autolinker.emailMatchMod.EmailMatchConfig
import typings.autolinker.hashtagMatchMod.HashtagMatchConfig
import typings.autolinker.htmlTagMod.HtmlTagCfg
import typings.autolinker.matchMatchMod.Match
import typings.autolinker.mentionMatchMod.MentionMatchConfig
import typings.autolinker.parseMatchesMod.ParseMatchesArgs
import typings.autolinker.phoneMatchMod.PhoneMatchConfig
import typings.autolinker.urlMatchMod.UrlMatchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("autolinker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("autolinker", JSImport.Default)
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the Autolinker instance,
    *   specified in an Object (map).
    */
  open class default ()
    extends typings.autolinker.autolinkerMod.default {
    def this(cfg: AutolinkerConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("autolinker", JSImport.Default)
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
    @JSImport("autolinker", "default.version")
    @js.native
    val version: /* "4.0.0" */ String = js.native
  }
  
  @JSImport("autolinker", "AbstractMatch")
  @js.native
  abstract class AbstractMatch protected ()
    extends typings.autolinker.matchMod.AbstractMatch {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: AbstractMatchConfig) = this()
  }
  
  @JSImport("autolinker", "AnchorTagBuilder")
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the AnchorTagBuilder instance, specified in an Object (map).
    */
  open class AnchorTagBuilder ()
    extends typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder {
    def this(cfg: AnchorTagBuilderCfg) = this()
  }
  
  @JSImport("autolinker", "Autolinker")
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the Autolinker instance,
    *   specified in an Object (map).
    */
  open class Autolinker ()
    extends typings.autolinker.autolinkerMod.default {
    def this(cfg: AutolinkerConfig) = this()
  }
  /* static members */
  object Autolinker {
    
    @JSImport("autolinker", "Autolinker")
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
    @JSImport("autolinker", "Autolinker.version")
    @js.native
    val version: /* "4.0.0" */ String = js.native
  }
  
  @JSImport("autolinker", "EmailMatch")
  @js.native
  open class EmailMatch protected ()
    extends typings.autolinker.matchMod.EmailMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
  }
  
  @JSImport("autolinker", "HashtagMatch")
  @js.native
  open class HashtagMatch protected ()
    extends typings.autolinker.matchMod.HashtagMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
  }
  
  @JSImport("autolinker", "HtmlTag")
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration properties for this class, in an Object (map)
    */
  open class HtmlTag ()
    extends typings.autolinker.htmlTagMod.HtmlTag {
    def this(cfg: HtmlTagCfg) = this()
  }
  
  @JSImport("autolinker", "MentionMatch")
  @js.native
  open class MentionMatch protected ()
    extends typings.autolinker.matchMod.MentionMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
  }
  
  @JSImport("autolinker", "PhoneMatch")
  @js.native
  open class PhoneMatch protected ()
    extends typings.autolinker.matchMod.PhoneMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
  }
  
  @JSImport("autolinker", "UrlMatch")
  @js.native
  open class UrlMatch protected ()
    extends typings.autolinker.matchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
  
  inline def excludeUnbalancedTrailingBracesAndPunctuation(matchedText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("excludeUnbalancedTrailingBracesAndPunctuation")(matchedText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseMatches(text: String, args: ParseMatchesArgs): js.Array[Match] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMatches")(text.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[Match]]
}
