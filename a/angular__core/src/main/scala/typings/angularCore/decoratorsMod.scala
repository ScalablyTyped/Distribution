package typings.angularCore

import typings.angularCore.importsMod.Import
import typings.typescript.mod.Decorator
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCallDecoratorImport(typeChecker: TypeChecker, decorator: Decorator): Import | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCallDecoratorImport")(typeChecker.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any])).asInstanceOf[Import | Null]
}
