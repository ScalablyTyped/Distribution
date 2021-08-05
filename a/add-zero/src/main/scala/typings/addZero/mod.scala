package typings.addZero

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(value: String): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: String, digits: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Double, digits: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("add-zero", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
