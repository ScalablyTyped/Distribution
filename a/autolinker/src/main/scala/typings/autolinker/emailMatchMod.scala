package typings.autolinker

import typings.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.matchMatchMod.Match
import typings.autolinker.matchMatchMod.MatchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/email-match", "EmailMatch")
  @js.native
  class EmailMatch protected () extends Match {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
    
    /**
      * @cfg {String} email (required)
      *
      * The email address that was matched.
      */
    val email: js.Any = js.native
    
    /**
      * Returns the email address that was matched.
      *
      * @return {String}
      */
    def getEmail(): String = js.native
  }
  
  trait EmailMatchConfig
    extends StObject
       with MatchConfig {
    
    var email: String
  }
  object EmailMatchConfig {
    
    @scala.inline
    def apply(email: String, matchedText: String, offset: Double, tagBuilder: AnchorTagBuilder): EmailMatchConfig = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailMatchConfig]
    }
    
    @scala.inline
    implicit class EmailMatchConfigMutableBuilder[Self <: EmailMatchConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
}
