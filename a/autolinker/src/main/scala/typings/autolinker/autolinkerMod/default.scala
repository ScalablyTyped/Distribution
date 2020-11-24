package typings.autolinker.autolinkerMod

import org.scalablytyped.runtime.Instantiable1
import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilderCfg
import typings.autolinker.anon.Email
import typings.autolinker.anon.Hashtag
import typings.autolinker.htmlTagMod.HtmlTagCfg
import typings.autolinker.matchMatchMod.Match
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("autolinker/dist/commonjs/autolinker", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * For backwards compatibility with Autolinker 1.x, the AnchorTagBuilder
    * class is provided as a static on the Autolinker class.
    */
  val AnchorTagBuilder: Instantiable1[
    /* cfg */ js.UndefOr[AnchorTagBuilderCfg], 
    typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
  ] = js.native
  
  /**
    * For backwards compatibility with Autolinker 1.x, the HtmlTag class is
    * provided as a static on the Autolinker class.
    */
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
  def link(textOrHtml: String): String = js.native
  def link(textOrHtml: String, options: AutolinkerConfig): String = js.native
  
  /**
    * For backwards compatibility with Autolinker 1.x, the Match classes are
    * provided as statics on the Autolinker class.
    */
  val `match`: Hashtag = js.native
  
  /**
    * For backwards compatibility with Autolinker 1.x, the Matcher classes are
    * provided as statics on the Autolinker class.
    */
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
  def parse(textOrHtml: String, options: AutolinkerConfig): js.Array[Match] = js.native
  
  /**
    * @static
    * @property {String} version
    *
    * The Autolinker version number in the form major.minor.patch
    *
    * Ex: 0.25.1
    */
  val version: /* "3.14.2" */ String = js.native
}
