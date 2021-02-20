package typings.activexDiskquota

import typings.activexDiskquota.DiskQuotaTypeLibrary.DIDiskQuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait PUser extends StObject {
    
    val pUser: DIDiskQuotaUser = js.native
  }
  object PUser {
    
    @scala.inline
    def apply(pUser: DIDiskQuotaUser): PUser = {
      val __obj = js.Dynamic.literal(pUser = pUser.asInstanceOf[js.Any])
      __obj.asInstanceOf[PUser]
    }
    
    @scala.inline
    implicit class PUserMutableBuilder[Self <: PUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPUser(value: DIDiskQuotaUser): Self = StObject.set(x, "pUser", value.asInstanceOf[js.Any])
    }
  }
}
