package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BstrJobIdPFaxServer extends StObject {
  
  val bstrJobId: String
  
  val pFaxServer: FaxServer
}
object BstrJobIdPFaxServer {
  
  inline def apply(bstrJobId: String, pFaxServer: FaxServer): BstrJobIdPFaxServer = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrJobIdPFaxServer]
  }
  
  extension [Self <: BstrJobIdPFaxServer](x: Self) {
    
    inline def setBstrJobId(value: String): Self = StObject.set(x, "bstrJobId", value.asInstanceOf[js.Any])
    
    inline def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
