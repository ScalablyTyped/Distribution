package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * The configuration for an Amazon Lex V2 bot.
    */
  var Lex: LexConfiguration
}
object Configuration {
  
  inline def apply(Lex: LexConfiguration): Configuration = {
    val __obj = js.Dynamic.literal(Lex = Lex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    inline def setLex(value: LexConfiguration): Self = StObject.set(x, "Lex", value.asInstanceOf[js.Any])
  }
}
