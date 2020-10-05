package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/testing/src/schema_registry_mock", JSImport.Namespace)
@js.native
object schemaRegistryMockMod extends js.Object {
  @js.native
  class MockSchemaRegistry protected () extends ElementSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
    var attrPropMapping: StringDictionary[String] = js.native
    var existingElements: StringDictionary[Boolean] = js.native
    var existingProperties: StringDictionary[Boolean] = js.native
    var invalidAttributes: js.Array[String] = js.native
    var invalidProperties: js.Array[String] = js.native
  }
  
}

