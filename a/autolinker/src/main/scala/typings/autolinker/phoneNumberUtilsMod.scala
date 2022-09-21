package typings.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneNumberUtilsMod {
  
  @JSImport("autolinker/dist/commonjs/parser/phone-number-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPhoneNumberControlChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneNumberControlChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPhoneNumberSeparatorChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneNumberSeparatorChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPhoneNumber(phoneNumberText: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPhoneNumber")(phoneNumberText.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
