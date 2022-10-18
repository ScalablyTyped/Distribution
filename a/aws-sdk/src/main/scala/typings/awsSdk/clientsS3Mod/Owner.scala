package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  /**
    * Container for the display name of the owner.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsS3Mod.DisplayName] = js.undefined
  
  /**
    * Container for the ID of the owner.
    */
  var ID: js.UndefOr[typings.awsSdk.clientsS3Mod.ID] = js.undefined
}
object Owner {
  
  inline def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  
  extension [Self <: Owner](x: Self) {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
  }
}
