package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BstrJobId extends StObject {
  
  val bstrJobId: String = js.native
  
  val pFaxAccount: FaxAccount = js.native
}
object BstrJobId {
  
  @scala.inline
  def apply(bstrJobId: String, pFaxAccount: FaxAccount): BstrJobId = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrJobId]
  }
  
  @scala.inline
  implicit class BstrJobIdMutableBuilder[Self <: BstrJobId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrJobId(value: String): Self = StObject.set(x, "bstrJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
  }
}
