package typings.angularCompilerCli

import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompiler.mod.SchemaMetadata
import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompilerCli.apiApiMod.TemplateDiagnostic
import typings.angularCompilerCli.apiApiMod.TemplateId
import typings.angularCompilerCli.tcbUtilMod.TemplateSourceResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/dom", "RegistryDomSchemaChecker")
  @js.native
  open class RegistryDomSchemaChecker protected ()
    extends StObject
       with DomSchemaChecker {
    def this(resolver: TemplateSourceResolver) = this()
    
    /* private */ var _diagnostics: Any = js.native
    
    /**
      * Check a non-Angular element and record any diagnostics about it.
      *
      * @param id the template ID, suitable for resolution with a `TcbSourceResolver`.
      * @param element the element node in question.
      * @param schemas any active schemas for the template, which might affect the validity of the
      * element.
      * @param hostIsStandalone boolean indicating whether the element's host is a standalone
      *     component.
      */
    /* CompleteClass */
    override def checkElement(id: String, element: TmplAstElement, schemas: js.Array[SchemaMetadata], hostIsStandalone: Boolean): Unit = js.native
    def checkElement(
      id: TemplateId,
      element: TmplAstElement,
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ): Unit = js.native
    
    /**
      * Check a property binding on an element and record any diagnostics about it.
      *
      * @param id the template ID, suitable for resolution with a `TcbSourceResolver`.
      * @param element the element node in question.
      * @param name the name of the property being checked.
      * @param span the source span of the binding. This is redundant with `element.attributes` but is
      * passed separately to avoid having to look up the particular property name.
      * @param schemas any active schemas for the template, which might affect the validity of the
      * property.
      */
    /* CompleteClass */
    override def checkProperty(
      id: String,
      element: TmplAstElement,
      name: String,
      span: ParseSourceSpan,
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ): Unit = js.native
    def checkProperty(
      id: TemplateId,
      element: TmplAstElement,
      name: String,
      span: ParseSourceSpan,
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ): Unit = js.native
    
    /**
      * Get the `ts.Diagnostic`s that have been generated via `checkElement` and `checkProperty` calls
      * thus far.
      */
    /* CompleteClass */
    override val diagnostics: js.Array[TemplateDiagnostic] = js.native
    @JSName("diagnostics")
    def diagnostics_MRegistryDomSchemaChecker: js.Array[TemplateDiagnostic] = js.native
    
    /* private */ var resolver: Any = js.native
  }
  
  trait DomSchemaChecker extends StObject {
    
    /**
      * Check a non-Angular element and record any diagnostics about it.
      *
      * @param id the template ID, suitable for resolution with a `TcbSourceResolver`.
      * @param element the element node in question.
      * @param schemas any active schemas for the template, which might affect the validity of the
      * element.
      * @param hostIsStandalone boolean indicating whether the element's host is a standalone
      *     component.
      */
    def checkElement(id: String, element: TmplAstElement, schemas: js.Array[SchemaMetadata], hostIsStandalone: Boolean): Unit
    
    /**
      * Check a property binding on an element and record any diagnostics about it.
      *
      * @param id the template ID, suitable for resolution with a `TcbSourceResolver`.
      * @param element the element node in question.
      * @param name the name of the property being checked.
      * @param span the source span of the binding. This is redundant with `element.attributes` but is
      * passed separately to avoid having to look up the particular property name.
      * @param schemas any active schemas for the template, which might affect the validity of the
      * property.
      */
    def checkProperty(
      id: String,
      element: TmplAstElement,
      name: String,
      span: ParseSourceSpan,
      schemas: js.Array[SchemaMetadata],
      hostIsStandalone: Boolean
    ): Unit
    
    /**
      * Get the `ts.Diagnostic`s that have been generated via `checkElement` and `checkProperty` calls
      * thus far.
      */
    val diagnostics: js.Array[TemplateDiagnostic]
  }
  object DomSchemaChecker {
    
    inline def apply(
      checkElement: (String, TmplAstElement, js.Array[SchemaMetadata], Boolean) => Unit,
      checkProperty: (String, TmplAstElement, String, ParseSourceSpan, js.Array[SchemaMetadata], Boolean) => Unit,
      diagnostics: js.Array[TemplateDiagnostic]
    ): DomSchemaChecker = {
      val __obj = js.Dynamic.literal(checkElement = js.Any.fromFunction4(checkElement), checkProperty = js.Any.fromFunction6(checkProperty), diagnostics = diagnostics.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomSchemaChecker]
    }
    
    extension [Self <: DomSchemaChecker](x: Self) {
      
      inline def setCheckElement(value: (String, TmplAstElement, js.Array[SchemaMetadata], Boolean) => Unit): Self = StObject.set(x, "checkElement", js.Any.fromFunction4(value))
      
      inline def setCheckProperty(
        value: (String, TmplAstElement, String, ParseSourceSpan, js.Array[SchemaMetadata], Boolean) => Unit
      ): Self = StObject.set(x, "checkProperty", js.Any.fromFunction6(value))
      
      inline def setDiagnostics(value: js.Array[TemplateDiagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsVarargs(value: TemplateDiagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    }
  }
}
