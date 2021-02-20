package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.mod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingPublicApiMod {
  
  @JSImport("@angular/compiler/testing/public_api", "MockDirectiveResolver")
  @js.native
  class MockDirectiveResolver protected ()
    extends typings.angularCompiler.srcTestingMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/public_api", "MockNgModuleResolver")
  @js.native
  class MockNgModuleResolver protected ()
    extends typings.angularCompiler.srcTestingMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/public_api", "MockPipeResolver")
  @js.native
  class MockPipeResolver protected ()
    extends typings.angularCompiler.srcTestingMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/public_api", "MockResourceLoader")
  @js.native
  class MockResourceLoader ()
    extends typings.angularCompiler.srcTestingMod.MockResourceLoader
  
  @JSImport("@angular/compiler/testing/public_api", "MockSchemaRegistry")
  @js.native
  class MockSchemaRegistry protected ()
    extends typings.angularCompiler.srcTestingMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
}
