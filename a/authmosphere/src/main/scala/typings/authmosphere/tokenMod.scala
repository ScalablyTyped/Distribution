package typings.authmosphere

import typings.authmosphere.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authmosphere/lib/src/types/Token", JSImport.Namespace)
@js.native
object tokenMod extends js.Object {
  
  type Token[CustomTokenPart] = CustomTokenPart with Accesstoken
}
