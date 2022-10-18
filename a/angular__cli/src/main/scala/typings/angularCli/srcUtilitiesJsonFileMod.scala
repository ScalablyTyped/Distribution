package typings.angularCli

import typings.angularCli.angularCliBooleans.`false`
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesJsonFileMod {
  
  @JSImport("@angular/cli/src/utilities/json-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/cli/src/utilities/json-file", "JSONFile")
  @js.native
  open class JSONFile protected () extends StObject {
    def this(path: String) = this()
    
    /* private */ def JsonAst: Any = js.native
    
    /* private */ var _jsonAst: Any = js.native
    
    var content: String = js.native
    
    def get(jsonPath: JSONPath): Any = js.native
    
    def modify(jsonPath: JSONPath): Boolean = js.native
    def modify(jsonPath: JSONPath, value: Unit, insertInOrder: InsertionIndex): Boolean = js.native
    def modify(jsonPath: JSONPath, value: JsonValue): Boolean = js.native
    def modify(jsonPath: JSONPath, value: JsonValue, insertInOrder: InsertionIndex): Boolean = js.native
    @JSName("modify")
    def modify_false(jsonPath: JSONPath, value: Unit, insertInOrder: `false`): Boolean = js.native
    @JSName("modify")
    def modify_false(jsonPath: JSONPath, value: JsonValue, insertInOrder: `false`): Boolean = js.native
    
    /* private */ val path: Any = js.native
    
    def save(): Unit = js.native
  }
  
  inline def parseJson(content: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJson")(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def readAndParseJson(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readAndParseJson")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type InsertionIndex = js.Function1[/* properties */ js.Array[String], Double]
  
  type JSONPath = js.Array[String | Double]
}
