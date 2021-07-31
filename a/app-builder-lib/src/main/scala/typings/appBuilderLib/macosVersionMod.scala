package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macosVersionMod {
  
  @JSImport("app-builder-lib/out/util/macosVersion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isMacOsCatalina(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOsCatalina")().asInstanceOf[Boolean]
  
  @scala.inline
  def isMacOsHighSierra(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOsHighSierra")().asInstanceOf[Boolean]
  
  @scala.inline
  def isMacOsSierra(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOsSierra")().asInstanceOf[js.Promise[Boolean]]
}
