package typings.authmosphere

import typings.authmosphere.anon.Scope
import typings.expressServeStaticCore.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedRequestMod {
  
  @js.native
  trait ExtendedRequest
    extends StObject
       with Request {
    
    @JSName("$$tokeninfo")
    var DollarDollartokeninfo: js.UndefOr[Scope] = js.native
  }
}
