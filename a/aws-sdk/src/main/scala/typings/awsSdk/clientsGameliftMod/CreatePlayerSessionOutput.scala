package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlayerSessionOutput extends StObject {
  
  /**
    * Object that describes the newly created player session record.
    */
  var PlayerSession: js.UndefOr[typings.awsSdk.clientsGameliftMod.PlayerSession] = js.undefined
}
object CreatePlayerSessionOutput {
  
  inline def apply(): CreatePlayerSessionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePlayerSessionOutput]
  }
  
  extension [Self <: CreatePlayerSessionOutput](x: Self) {
    
    inline def setPlayerSession(value: PlayerSession): Self = StObject.set(x, "PlayerSession", value.asInstanceOf[js.Any])
    
    inline def setPlayerSessionUndefined: Self = StObject.set(x, "PlayerSession", js.undefined)
  }
}
