package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexBot extends StObject {
  
  /**
    * The Amazon Web Services Region where the Amazon Lex bot was created.
    */
  var LexRegion: typings.awsSdk.clientsConnectMod.LexRegion
  
  /**
    * The name of the Amazon Lex bot.
    */
  var Name: BotName
}
object LexBot {
  
  inline def apply(LexRegion: LexRegion, Name: BotName): LexBot = {
    val __obj = js.Dynamic.literal(LexRegion = LexRegion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexBot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexBot] (val x: Self) extends AnyVal {
    
    inline def setLexRegion(value: LexRegion): Self = StObject.set(x, "LexRegion", value.asInstanceOf[js.Any])
    
    inline def setName(value: BotName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
