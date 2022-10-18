package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGameServerOutput extends StObject {
  
  /**
    * Object that describes the requested game server.
    */
  var GameServer: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameServer] = js.undefined
}
object DescribeGameServerOutput {
  
  inline def apply(): DescribeGameServerOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameServerOutput]
  }
  
  extension [Self <: DescribeGameServerOutput](x: Self) {
    
    inline def setGameServer(value: GameServer): Self = StObject.set(x, "GameServer", value.asInstanceOf[js.Any])
    
    inline def setGameServerUndefined: Self = StObject.set(x, "GameServer", js.undefined)
  }
}
