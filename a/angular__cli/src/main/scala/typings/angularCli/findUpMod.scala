package typings.angularCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findUpMod {
  
  @JSImport("@angular/cli/src/utilities/find-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findUp(names: String, from: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(names.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def findUp(names: js.Array[String], from: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findUp")(names.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
