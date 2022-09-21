package typings.angularDevkitCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringsMod {
  
  @JSImport("@angular-devkit/core/src/utils/strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def capitalize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def classify(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("classify")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dasherize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dasherize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decamelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decamelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def levenshtein(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def underscore(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("underscore")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
