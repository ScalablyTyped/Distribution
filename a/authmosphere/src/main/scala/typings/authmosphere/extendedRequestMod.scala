package typings.authmosphere

import typings.authmosphere.anon.Scope
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedRequestMod {
  
  @js.native
  trait ExtendedRequest
    extends Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    @JSName("$$tokeninfo")
    var DollarDollartokeninfo: js.UndefOr[Scope] = js.native
  }
}
