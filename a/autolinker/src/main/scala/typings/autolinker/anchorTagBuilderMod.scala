package typings.autolinker

import org.scalablytyped.runtime.StringDictionary
import typings.autolinker.autolinkerMod.TruncateConfigObj
import typings.autolinker.htmlTagMod.HtmlTag
import typings.autolinker.matchMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchorTagBuilderMod {
  
  @JSImport("autolinker/dist/commonjs/anchor-tag-builder", "AnchorTagBuilder")
  @js.native
  /**
    * @method constructor
    * @param {Object} [cfg] The configuration options for the AnchorTagBuilder instance, specified in an Object (map).
    */
  class AnchorTagBuilder () extends StObject {
    def this(cfg: AnchorTagBuilderCfg) = this()
    
    /**
      * Generates the actual anchor (&lt;a&gt;) tag to use in place of the
      * matched text, via its `match` object.
      *
      * @param {Autolinker.match.Match} match The Match instance to generate an
      *   anchor tag from.
      * @return {Autolinker.HtmlTag} The HtmlTag instance for the anchor tag.
      */
    def build(`match`: Match): HtmlTag = js.native
    
    /**
      * @cfg {String} className
      * @inheritdoc Autolinker#className
      */
    val className: js.Any = js.native
    
    /**
      * Creates the Object (map) of the HTML attributes for the anchor (&lt;a&gt;)
      *   tag being generated.
      *
      * @protected
      * @param {Autolinker.match.Match} match The Match instance to generate an
      *   anchor tag from.
      * @return {Object} A key/value Object (map) of the anchor tag's attributes.
      */
    /* protected */ def createAttrs(`match`: Match): StringDictionary[String] = js.native
    
    /**
      * Creates the CSS class that will be used for a given anchor tag, based on
      * the `matchType` and the {@link #className} config.
      *
      * Example returns:
      *
      * - ""                                      // no {@link #className}
      * - "myLink myLink-url"                     // url match
      * - "myLink myLink-email"                   // email match
      * - "myLink myLink-phone"                   // phone match
      * - "myLink myLink-hashtag"                 // hashtag match
      * - "myLink myLink-mention myLink-twitter"  // mention match with Twitter service
      *
      * @protected
      * @param {Autolinker.match.Match} match The Match instance to generate an
      *   anchor tag from.
      * @return {String} The CSS class string for the link. Example return:
      *   "myLink myLink-url". If no {@link #className} was configured, returns
      *   an empty string.
      */
    /* protected */ def createCssClass(`match`: Match): String = js.native
    
    /**
      * Performs the truncation of the `anchorText` based on the {@link #truncate}
      * option. If the `anchorText` is longer than the length specified by the
      * {@link #truncate} option, the truncation is performed based on the
      * `location` property. See {@link #truncate} for details.
      *
      * @private
      * @param {String} anchorText The anchor tag's text (i.e. what will be
      *   displayed).
      * @return {String} The truncated anchor text.
      */
    var doTruncate: js.Any = js.native
    
    /**
      * @cfg {Boolean} newWindow
      * @inheritdoc Autolinker#newWindow
      */
    val newWindow: js.Any = js.native
    
    /**
      * Processes the `anchorText` by truncating the text according to the
      * {@link #truncate} config.
      *
      * @private
      * @param {String} anchorText The anchor tag's text (i.e. what will be
      *   displayed).
      * @return {String} The processed `anchorText`.
      */
    var processAnchorText: js.Any = js.native
    
    /**
      * @cfg {Object} truncate
      * @inheritdoc Autolinker#truncate
      */
    val truncate: js.Any = js.native
  }
  
  @js.native
  trait AnchorTagBuilderCfg extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var newWindow: js.UndefOr[Boolean] = js.native
    
    var truncate: js.UndefOr[TruncateConfigObj] = js.native
  }
  object AnchorTagBuilderCfg {
    
    @scala.inline
    def apply(): AnchorTagBuilderCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorTagBuilderCfg]
    }
    
    @scala.inline
    implicit class AnchorTagBuilderCfgMutableBuilder[Self <: AnchorTagBuilderCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setNewWindow(value: Boolean): Self = StObject.set(x, "newWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewWindowUndefined: Self = StObject.set(x, "newWindow", js.undefined)
      
      @scala.inline
      def setTruncate(value: TruncateConfigObj): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
}
