package typings.antDesignCssinjs

import typings.antDesignCssinjs.esLintersInterfaceMod.LinterInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintersUtilsMod {
  
  @JSImport("@ant-design/cssinjs/es/linters/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lintWarning(message: String, info: LinterInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lintWarning")(message.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
