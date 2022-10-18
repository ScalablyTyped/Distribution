package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2Bot extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Lex V2 bot.
    */
  var AliasArn: js.UndefOr[typings.awsSdk.clientsConnectMod.AliasArn] = js.undefined
}
object LexV2Bot {
  
  inline def apply(): LexV2Bot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexV2Bot]
  }
  
  extension [Self <: LexV2Bot](x: Self) {
    
    inline def setAliasArn(value: AliasArn): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
    
    inline def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
  }
}
