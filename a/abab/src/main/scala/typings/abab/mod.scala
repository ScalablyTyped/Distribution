package typings.abab

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("abab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atob(encodedData: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(encodedData.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def btoa(stringToEncode: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(stringToEncode.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
