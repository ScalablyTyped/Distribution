package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathManagerMod {
  
  @JSImport("app-builder-lib/out/util/pathManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTemplatePath(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplatePath")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getVendorPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVendorPath")().asInstanceOf[String]
  @scala.inline
  def getVendorPath(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVendorPath")(file.asInstanceOf[js.Any]).asInstanceOf[String]
}
