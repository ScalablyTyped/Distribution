package typings.autolinker

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.mod.HtmlTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/match", "Match")
  @js.native
  abstract class Match protected () extends StObject {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatchConfig) = this()
    
    /**
      * @cfg {Autolinker.AnchorTagBuilder} tagBuilder (required)
      *
      * Reference to the AnchorTagBuilder instance to use to generate an anchor
      * tag for the Match.
      */
    var __jsduckDummyDocProp: js.Any = js.native
    
    /**
      * Builds and returns an {@link Autolinker.HtmlTag} instance based on the
      * Match.
      *
      * This can be used to easily generate anchor tags from matches, and either
      * return their HTML string, or modify them before doing so.
      *
      * Example Usage:
      *
      *     var tag = match.buildTag();
      *     tag.addClass( 'cordova-link' );
      *     tag.setAttr( 'target', '_system' );
      *
      *     tag.toAnchorString();  // <a href="http://google.com" class="cordova-link" target="_system">Google</a>
      *
      * Example Usage in {@link Autolinker#replaceFn}:
      *
      *     var html = Autolinker.link( "Test google.com", {
      *         replaceFn : function( match ) {
      *             var tag = match.buildTag();  // returns an {@link Autolinker.HtmlTag} instance
      *             tag.setAttr( 'rel', 'nofollow' );
      *
      *             return tag;
      *         }
      *     } );
      *
      *     // generated html:
      *     //   Test <a href="http://google.com" target="_blank" rel="nofollow">google.com</a>
      */
    def buildTag(): HtmlTag = js.native
    
    /**
      * Returns the anchor href that should be generated for the match.
      *
      * @abstract
      * @return {String}
      */
    def getAnchorHref(): String = js.native
    
    /**
      * Returns the anchor text that should be generated for the match.
      *
      * @abstract
      * @return {String}
      */
    def getAnchorText(): String = js.native
    
    /**
      * Returns the CSS class suffix(es) for this match.
      *
      * A CSS class suffix is appended to the {@link Autolinker#className} in
      * the {@link Autolinker.AnchorTagBuilder} when a match is translated into
      * an anchor tag.
      *
      * For example, if {@link Autolinker#className} was configured as 'myLink',
      * and this method returns `[ 'url' ]`, the final class name of the element
      * will become: 'myLink myLink-url'.
      *
      * The match may provide multiple CSS class suffixes to be appended to the
      * {@link Autolinker#className} in order to facilitate better styling
      * options for different match criteria. See {@link Autolinker.match.Mention}
      * for an example.
      *
      * By default, this method returns a single array with the match's
      * {@link #getType type} name, but may be overridden by subclasses.
      *
      * @return {String[]}
      */
    def getCssClassSuffixes(): js.Array[String] = js.native
    
    /**
      * Returns the original text that was matched.
      *
      * @return {String}
      */
    def getMatchedText(): String = js.native
    
    /**
      * Returns the offset of where the match was made in the input string. This
      * is the 0-based index of the match.
      *
      * @return {Number}
      */
    def getOffset(): Double = js.native
    
    /**
      * Returns a string name for the type of match that this class represents.
      *
      * @abstract
      * @return {String}
      */
    def getType(): String = js.native
    
    /**
      * @cfg {String} matchedText (required)
      *
      * The original text that was matched by the {@link Autolinker.matcher.Matcher}.
      */
    val matchedText: String = js.native
    
    /**
      * @cfg {Number} offset (required)
      *
      * The offset of where the match was made in the input string.
      */
    var offset: js.Any = js.native
    
    /**
      * Sets the {@link #offset} of where the match was made in the input string.
      *
      * A {@link Autolinker.matcher.Matcher} will be fed only HTML text nodes,
      * and will therefore set an original offset that is relative to the HTML
      * text node itself. However, we want this offset to be relative to the full
      * HTML input string, and thus if using {@link Autolinker#parse} (rather
      * than calling a {@link Autolinker.matcher.Matcher} directly), then this
      * offset is corrected after the Matcher itself has done its job.
      *
      * @param {Number} offset
      */
    def setOffset(offset: Double): Unit = js.native
    
    val tagBuilder: js.Any = js.native
  }
  
  @js.native
  trait MatchConfig extends StObject {
    
    var matchedText: String = js.native
    
    var offset: Double = js.native
    
    var tagBuilder: AnchorTagBuilder = js.native
  }
  object MatchConfig {
    
    @scala.inline
    def apply(matchedText: String, offset: Double, tagBuilder: AnchorTagBuilder): MatchConfig = {
      val __obj = js.Dynamic.literal(matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchConfig]
    }
    
    @scala.inline
    implicit class MatchConfigMutableBuilder[Self <: MatchConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchedText(value: String): Self = StObject.set(x, "matchedText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagBuilder(value: AnchorTagBuilder): Self = StObject.set(x, "tagBuilder", value.asInstanceOf[js.Any])
    }
  }
}
