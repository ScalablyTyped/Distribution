package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BstrMessageId extends StObject {
  
  val bstrMessageId: String = js.native
  
  val fAddedToReceiveFolder: Boolean = js.native
  
  val pFaxAccount: FaxAccount = js.native
}
object BstrMessageId {
  
  @scala.inline
  def apply(bstrMessageId: String, fAddedToReceiveFolder: Boolean, pFaxAccount: FaxAccount): BstrMessageId = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], fAddedToReceiveFolder = fAddedToReceiveFolder.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageId]
  }
  
  @scala.inline
  implicit class BstrMessageIdMutableBuilder[Self <: BstrMessageId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrMessageId(value: String): Self = StObject.set(x, "bstrMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAddedToReceiveFolder(value: Boolean): Self = StObject.set(x, "fAddedToReceiveFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
  }
}
