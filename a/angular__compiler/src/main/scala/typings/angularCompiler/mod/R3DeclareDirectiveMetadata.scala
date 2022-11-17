package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareDirectiveMetadata
  extends StObject
     with R3PartialDeclaration {
  
  /**
    * The names by which the directive is exported.
    */
  var exportAs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Information about host bindings present on the component.
    */
  var host: js.UndefOr[Attributes] = js.undefined
  
  /**
    * Additional directives applied to the directive host.
    */
  var hostDirectives: js.UndefOr[js.Array[R3DeclareHostDirectiveMetadata]] = js.undefined
  
  /**
    * A mapping of inputs from class property names to binding property names, or to a tuple of
    * binding property name and class property name if the names are different.
    */
  var inputs: js.UndefOr[StringDictionary[String | (js.Tuple2[String, String])]] = js.undefined
  
  /**
    * Whether the directive is standalone. Defaults to false.
    */
  var isStandalone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A mapping of outputs from class property names to binding property names.
    */
  var outputs: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The list of providers provided by the directive.
    */
  var providers: js.UndefOr[Expression] = js.undefined
  
  /**
    * Information about the content queries made by the directive.
    */
  var queries: js.UndefOr[js.Array[R3DeclareQueryMetadata]] = js.undefined
  
  /**
    * Unparsed selector of the directive.
    */
  var selector: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the directive has an inheritance clause. Defaults to false.
    */
  var usesInheritance: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the directive implements the `ngOnChanges` hook. Defaults to false.
    */
  var usesOnChanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the view queries made by the directive.
    */
  var viewQueries: js.UndefOr[js.Array[R3DeclareQueryMetadata]] = js.undefined
}
object R3DeclareDirectiveMetadata {
  
  inline def apply(minVersion: String, ngImport: Expression, `type`: Expression, version: String): R3DeclareDirectiveMetadata = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareDirectiveMetadata]
  }
  
  extension [Self <: R3DeclareDirectiveMetadata](x: Self) {
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setHost(value: Attributes): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostDirectives(value: js.Array[R3DeclareHostDirectiveMetadata]): Self = StObject.set(x, "hostDirectives", value.asInstanceOf[js.Any])
    
    inline def setHostDirectivesUndefined: Self = StObject.set(x, "hostDirectives", js.undefined)
    
    inline def setHostDirectivesVarargs(value: R3DeclareHostDirectiveMetadata*): Self = StObject.set(x, "hostDirectives", js.Array(value*))
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setIsStandaloneUndefined: Self = StObject.set(x, "isStandalone", js.undefined)
    
    inline def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setProviders(value: Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setQueries(value: js.Array[R3DeclareQueryMetadata]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: R3DeclareQueryMetadata*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setUsesInheritance(value: Boolean): Self = StObject.set(x, "usesInheritance", value.asInstanceOf[js.Any])
    
    inline def setUsesInheritanceUndefined: Self = StObject.set(x, "usesInheritance", js.undefined)
    
    inline def setUsesOnChanges(value: Boolean): Self = StObject.set(x, "usesOnChanges", value.asInstanceOf[js.Any])
    
    inline def setUsesOnChangesUndefined: Self = StObject.set(x, "usesOnChanges", js.undefined)
    
    inline def setViewQueries(value: js.Array[R3DeclareQueryMetadata]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
    
    inline def setViewQueriesUndefined: Self = StObject.set(x, "viewQueries", js.undefined)
    
    inline def setViewQueriesVarargs(value: R3DeclareQueryMetadata*): Self = StObject.set(x, "viewQueries", js.Array(value*))
  }
}
