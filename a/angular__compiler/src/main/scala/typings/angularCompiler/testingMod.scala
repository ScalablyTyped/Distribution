package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.mod.CompileReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockDirectiveResolver protected ()
    extends typings.angularCompiler.testingTestingMod.MockDirectiveResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @js.native
  class MockNgModuleResolver protected ()
    extends typings.angularCompiler.testingTestingMod.MockNgModuleResolver {
    def this(reflector: CompileReflector) = this()
  }
  
  @js.native
  class MockPipeResolver protected ()
    extends typings.angularCompiler.testingTestingMod.MockPipeResolver {
    def this(refector: CompileReflector) = this()
  }
  
  @js.native
  class MockResourceLoader ()
    extends typings.angularCompiler.resourceLoaderMockMod.MockResourceLoader
  
  @js.native
  class MockSchemaRegistry protected ()
    extends typings.angularCompiler.testingTestingMod.MockSchemaRegistry {
    def this(
      existingProperties: StringDictionary[Boolean],
      attrPropMapping: StringDictionary[String],
      existingElements: StringDictionary[Boolean],
      invalidProperties: js.Array[String],
      invalidAttributes: js.Array[String]
    ) = this()
  }
  
}

