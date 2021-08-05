package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PFaxServer extends StObject {
  
  val pFaxServer: FaxServer
}
object PFaxServer {
  
  inline def apply(pFaxServer: FaxServer): PFaxServer = {
    val __obj = js.Dynamic.literal(pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PFaxServer]
  }
  
  extension [Self <: PFaxServer](x: Self) {
    
    inline def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
