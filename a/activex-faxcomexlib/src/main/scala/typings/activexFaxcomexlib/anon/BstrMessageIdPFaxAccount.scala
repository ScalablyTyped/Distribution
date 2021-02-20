package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BstrMessageIdPFaxAccount extends StObject {
  
  val bstrMessageId: String = js.native
  
  val pFaxAccount: FaxAccount = js.native
}
object BstrMessageIdPFaxAccount {
  
  @scala.inline
  def apply(bstrMessageId: String, pFaxAccount: FaxAccount): BstrMessageIdPFaxAccount = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageIdPFaxAccount]
  }
  
  @scala.inline
  implicit class BstrMessageIdPFaxAccountMutableBuilder[Self <: BstrMessageIdPFaxAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrMessageId(value: String): Self = StObject.set(x, "bstrMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
  }
}
