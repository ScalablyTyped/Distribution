package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.mod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTestingMod {
  
  @JSImport("@angular/compiler/testing/src/testing", "MockDirectiveResolver")
  @js.native
  class MockDirectiveResolver protected ()
    extends typings.angularCompiler.directiveResolverMockMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/src/testing", "MockNgModuleResolver")
  @js.native
  class MockNgModuleResolver protected ()
    extends typings.angularCompiler.ngModuleResolverMockMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/src/testing", "MockPipeResolver")
  @js.native
  class MockPipeResolver protected ()
    extends typings.angularCompiler.pipeResolverMockMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/src/testing", "MockResourceLoader")
  @js.native
  class MockResourceLoader ()
    extends typings.angularCompiler.resourceLoaderMockMod.MockResourceLoader
  
  @JSImport("@angular/compiler/testing/src/testing", "MockSchemaRegistry")
  @js.native
  class MockSchemaRegistry protected ()
    extends typings.angularCompiler.schemaRegistryMockMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
}
