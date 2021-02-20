package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macosVersionMod {
  
  @JSImport("app-builder-lib/out/util/macosVersion", "isMacOsCatalina")
  @js.native
  def isMacOsCatalina(): Boolean = js.native
  
  @JSImport("app-builder-lib/out/util/macosVersion", "isMacOsHighSierra")
  @js.native
  def isMacOsHighSierra(): Boolean = js.native
  
  @JSImport("app-builder-lib/out/util/macosVersion", "isMacOsSierra")
  @js.native
  def isMacOsSierra(): js.Promise[Boolean] = js.native
}
