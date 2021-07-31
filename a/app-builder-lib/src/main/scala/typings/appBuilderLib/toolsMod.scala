package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsMod {
  
  @JSImport("app-builder-lib/out/targets/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLinuxToolsPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinuxToolsPath")().asInstanceOf[js.Promise[String]]
}
