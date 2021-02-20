package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BstrMessageIdPFaxServer extends StObject {
  
  val bstrMessageId: String = js.native
  
  val pFaxServer: FaxServer = js.native
}
object BstrMessageIdPFaxServer {
  
  @scala.inline
  def apply(bstrMessageId: String, pFaxServer: FaxServer): BstrMessageIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrMessageId = bstrMessageId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrMessageIdPFaxServer]
  }
  
  @scala.inline
  implicit class BstrMessageIdPFaxServerMutableBuilder[Self <: BstrMessageIdPFaxServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBstrMessageId(value: String): Self = StObject.set(x, "bstrMessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
