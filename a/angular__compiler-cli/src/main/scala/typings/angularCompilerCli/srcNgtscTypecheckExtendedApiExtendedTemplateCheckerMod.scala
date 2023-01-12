package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typings.typescript.mod.ClassDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckExtendedApiExtendedTemplateCheckerMod {
  
  trait ExtendedTemplateChecker extends StObject {
    
    /**
      * Run `TemplateCheck`s for a component and return the generated `ts.Diagnostic`s.
      */
    def getDiagnosticsForComponent(component: ClassDeclaration): js.Array[TemplateDiagnostic]
  }
  object ExtendedTemplateChecker {
    
    inline def apply(getDiagnosticsForComponent: ClassDeclaration => js.Array[TemplateDiagnostic]): ExtendedTemplateChecker = {
      val __obj = js.Dynamic.literal(getDiagnosticsForComponent = js.Any.fromFunction1(getDiagnosticsForComponent))
      __obj.asInstanceOf[ExtendedTemplateChecker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendedTemplateChecker] (val x: Self) extends AnyVal {
      
      inline def setGetDiagnosticsForComponent(value: ClassDeclaration => js.Array[TemplateDiagnostic]): Self = StObject.set(x, "getDiagnosticsForComponent", js.Any.fromFunction1(value))
    }
  }
}
