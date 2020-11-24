package typings.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/util/macosVersion", JSImport.Namespace)
@js.native
object macosVersionMod extends js.Object {
  
  def isMacOsCatalina(): Boolean = js.native
  
  def isMacOsHighSierra(): Boolean = js.native
  
  def isMacOsSierra(): js.Promise[Boolean] = js.native
}
