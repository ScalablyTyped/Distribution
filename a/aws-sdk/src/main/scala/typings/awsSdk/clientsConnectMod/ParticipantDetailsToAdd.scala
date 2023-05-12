package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantDetailsToAdd extends StObject {
  
  /**
    * The display name of the participant.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsConnectMod.DisplayName] = js.undefined
  
  /**
    * The role of the participant being added.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.clientsConnectMod.ParticipantRole] = js.undefined
}
object ParticipantDetailsToAdd {
  
  inline def apply(): ParticipantDetailsToAdd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantDetailsToAdd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantDetailsToAdd] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
  }
}
