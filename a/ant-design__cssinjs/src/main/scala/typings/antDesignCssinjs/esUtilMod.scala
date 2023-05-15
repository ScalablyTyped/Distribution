package typings.antDesignCssinjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("@ant-design/cssinjs/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenToken(token: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenToken")(token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def supportLayer(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportLayer")().asInstanceOf[Boolean]
  
  inline def token2key(token: Any, salt: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("token2key")(token.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[String]
}
