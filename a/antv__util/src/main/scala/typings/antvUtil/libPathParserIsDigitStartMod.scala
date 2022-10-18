package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathParserIsDigitStartMod {
  
  @JSImport("@antv/util/lib/path/parser/is-digit-start", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDigit(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDigit")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDigitStart(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDigitStart")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
