package typings.autolinker

import typings.autolinker.distCommonjsAnchorTagBuilderMod.AnchorTagBuilder
import typings.autolinker.distCommonjsMatchAbstractMatchMod.AbstractMatch
import typings.autolinker.distCommonjsMatchAbstractMatchMod.AbstractMatchConfig
import typings.autolinker.distCommonjsMatchMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsMatchEmailMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/email-match", "EmailMatch")
  @js.native
  open class EmailMatch protected ()
    extends AbstractMatch
       with Match {
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
    /* private */ val email: Any = js.native
    
    /**
      * Returns the email address that was matched.
      *
      * @return {String}
      */
    def getEmail(): String = js.native
    
    /**
      * @public
      * @property {'email'} type
      *
      * A string name for the type of match that this class represents. Can be
      * used in a TypeScript discriminating union to type-narrow from the
      * `Match` type.
      */
    @JSName("type")
    val type_EmailMatch: typings.autolinker.autolinkerStrings.email = js.native
  }
  
  trait EmailMatchConfig
    extends StObject
       with AbstractMatchConfig {
    
    var email: String
  }
  object EmailMatchConfig {
    
    inline def apply(email: String, matchedText: String, offset: Double, tagBuilder: AnchorTagBuilder): EmailMatchConfig = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailMatchConfig]
    }
    
    extension [Self <: EmailMatchConfig](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
}
