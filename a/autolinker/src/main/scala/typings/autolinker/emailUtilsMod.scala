package typings.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailUtilsMod {
  
  @JSImport("autolinker/dist/commonjs/parser/email-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmailLocalPartChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmailLocalPartChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmailLocalPartStartChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmailLocalPartStartChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidEmail(emailAddress: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidEmail")(emailAddress.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("autolinker/dist/commonjs/parser/email-utils", "mailtoSchemePrefixRe")
  @js.native
  val mailtoSchemePrefixRe: js.RegExp = js.native
}
