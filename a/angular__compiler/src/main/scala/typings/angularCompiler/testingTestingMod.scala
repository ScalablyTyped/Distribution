package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.mod.CompileReflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/compiler/testing/testing", "MockDirectiveResolver")
  @js.native
  class MockDirectiveResolver protected ()
    extends typings.angularCompiler.indexMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/testing", "MockNgModuleResolver")
  @js.native
  class MockNgModuleResolver protected ()
    extends typings.angularCompiler.indexMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/testing", "MockPipeResolver")
  @js.native
  class MockPipeResolver protected ()
    extends typings.angularCompiler.indexMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @JSImport("@angular/compiler/testing/testing", "MockResourceLoader")
  @js.native
  class MockResourceLoader ()
    extends typings.angularCompiler.indexMod.MockResourceLoader
  
  @JSImport("@angular/compiler/testing/testing", "MockSchemaRegistry")
  @js.native
  class MockSchemaRegistry protected ()
    extends typings.angularCompiler.indexMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
}
