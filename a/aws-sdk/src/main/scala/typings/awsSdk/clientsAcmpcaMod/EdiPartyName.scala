package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdiPartyName extends StObject {
  
  /**
    * Specifies the name assigner.
    */
  var NameAssigner: js.UndefOr[String256] = js.undefined
  
  /**
    * Specifies the party name.
    */
  var PartyName: String256
}
object EdiPartyName {
  
  inline def apply(PartyName: String256): EdiPartyName = {
    val __obj = js.Dynamic.literal(PartyName = PartyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdiPartyName]
  }
  
  extension [Self <: EdiPartyName](x: Self) {
    
    inline def setNameAssigner(value: String256): Self = StObject.set(x, "NameAssigner", value.asInstanceOf[js.Any])
    
    inline def setNameAssignerUndefined: Self = StObject.set(x, "NameAssigner", js.undefined)
    
    inline def setPartyName(value: String256): Self = StObject.set(x, "PartyName", value.asInstanceOf[js.Any])
  }
}
