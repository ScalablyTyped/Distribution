package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxJobStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PFaxAccount extends StObject {
  
  val bstrJobId: String
  
  val pFaxAccount: FaxAccount
  
  val pJobStatus: FaxJobStatus
}
object PFaxAccount {
  
  @scala.inline
  def apply(bstrJobId: String, pFaxAccount: FaxAccount, pJobStatus: FaxJobStatus): PFaxAccount = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any], pJobStatus = pJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PFaxAccount]
  }
  
  @scala.inline
  implicit class PFaxAccountMutableBuilder[Self <: PFaxAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrJobId(value: String): Self = StObject.set(x, "bstrJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPJobStatus(value: FaxJobStatus): Self = StObject.set(x, "pJobStatus", value.asInstanceOf[js.Any])
  }
}
