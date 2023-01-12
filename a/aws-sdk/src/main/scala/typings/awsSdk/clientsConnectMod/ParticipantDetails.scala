package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantDetails extends StObject {
  
  /**
    * Display name of the participant.
    */
  var DisplayName: typings.awsSdk.clientsConnectMod.DisplayName
}
object ParticipantDetails {
  
  inline def apply(DisplayName: DisplayName): ParticipantDetails = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantDetails] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
  }
}
