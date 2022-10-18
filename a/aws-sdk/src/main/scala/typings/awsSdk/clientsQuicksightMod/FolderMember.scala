package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderMember extends StObject {
  
  /**
    * The ID of an asset in the folder.
    */
  var MemberId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The type of asset that it is.
    */
  var MemberType: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MemberType] = js.undefined
}
object FolderMember {
  
  inline def apply(): FolderMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderMember]
  }
  
  extension [Self <: FolderMember](x: Self) {
    
    inline def setMemberId(value: RestrictiveResourceId): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
    
    inline def setMemberType(value: MemberType): Self = StObject.set(x, "MemberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "MemberType", js.undefined)
  }
}
