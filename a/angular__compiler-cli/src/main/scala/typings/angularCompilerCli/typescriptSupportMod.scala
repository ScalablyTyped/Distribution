package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptSupportMod {
  
  @JSImport("@angular/compiler-cli/src/typescript_support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkVersion(version: String, minVersion: String, maxVersion: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkVersion")(version.asInstanceOf[js.Any], minVersion.asInstanceOf[js.Any], maxVersion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def restoreTypeScriptVersionForTesting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreTypeScriptVersionForTesting")().asInstanceOf[Unit]
  
  inline def setTypeScriptVersionForTesting(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTypeScriptVersionForTesting")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def verifySupportedTypeScriptVersion(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifySupportedTypeScriptVersion")().asInstanceOf[Unit]
}
