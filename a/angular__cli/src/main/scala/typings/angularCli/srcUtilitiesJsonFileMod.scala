package typings.angularCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesJsonFileMod {
  
  @JSImport("@angular/cli/src/utilities/json-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseJson(content: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readAndParseJson(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readAndParseJson")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type InsertionIndex = js.Function1[/* properties */ js.Array[String], Double]
  
  type JSONPath = js.Array[String | Double]
}
