package typings.autolinker

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.matchMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherMatcherMod {
  
  @JSImport("autolinker/dist/commonjs/matcher/matcher", "Matcher")
  @js.native
  abstract class Matcher protected () extends StObject {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
    
    /**
      * @cfg {Autolinker.AnchorTagBuilder} tagBuilder (required)
      *
      * Reference to the AnchorTagBuilder instance to use to generate HTML tags
      * for {@link Autolinker.match.Match Matches}.
      */
    var __jsduckDummyDocProp: js.Any = js.native
    
    /**
      * Parses the input `text` and returns the array of {@link Autolinker.match.Match Matches}
      * for the matcher.
      *
      * @abstract
      * @param {String} text The text to scan and replace matches in.
      * @return {Autolinker.match.Match[]}
      */
    def parseMatches(text: String): js.Array[Match] = js.native
    
    var tagBuilder: AnchorTagBuilder = js.native
  }
  
  trait MatcherConfig extends StObject {
    
    var tagBuilder: AnchorTagBuilder
  }
  object MatcherConfig {
    
    @scala.inline
    def apply(tagBuilder: AnchorTagBuilder): MatcherConfig = {
      val __obj = js.Dynamic.literal(tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatcherConfig]
    }
    
    @scala.inline
    implicit class MatcherConfigMutableBuilder[Self <: MatcherConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagBuilder(value: AnchorTagBuilder): Self = StObject.set(x, "tagBuilder", value.asInstanceOf[js.Any])
    }
  }
}
