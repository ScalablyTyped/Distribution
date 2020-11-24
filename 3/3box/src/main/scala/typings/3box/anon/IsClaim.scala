package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsClaim extends js.Object {
  
  def isClaim(claim: String): js.Promise[Boolean] = js.native
  def isClaim(claim: String, opts: Audience): js.Promise[Boolean] = js.native
  
  def isMuportDID(address: String): js.Promise[Boolean] = js.native
  
  def verifyClaim(claim: String): js.Promise[js.Object] = js.native
  def verifyClaim(claim: String, opts: Audience): js.Promise[js.Object] = js.native
}
