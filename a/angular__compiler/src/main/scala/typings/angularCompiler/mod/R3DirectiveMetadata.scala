package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.angularCompilerStrings.invalid
import typings.angularCompiler.anon.UsesOnChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DirectiveMetadata extends StObject {
  
  /**
    * Dependencies of the directive's constructor.
    */
  var deps: js.Array[R3DependencyMetadata] | invalid | Null
  
  /**
    * Reference name under which to export the directive's type in a template,
    * if any.
    */
  var exportAs: js.Array[String] | Null
  
  /**
    * Whether or not the component or directive inherits its entire decorator from its base class.
    */
  var fullInheritance: Boolean
  
  /**
    * Mappings indicating how the directive interacts with its host element (host bindings,
    * listeners, etc).
    */
  var host: R3HostMetadata
  
  /**
    * Additional directives applied to the directive host.
    */
  var hostDirectives: js.Array[R3HostDirectiveMetadata] | Null
  
  /**
    * A mapping of inputs from class property names to binding property names, or to a tuple of
    * binding property name and class property name if the names are different.
    */
  var inputs: StringDictionary[R3InputMetadata]
  
  /**
    * Whether or not the component or directive is standalone.
    */
  var isStandalone: Boolean
  
  /**
    * Information about usage of specific lifecycle events which require special treatment in the
    * code generator.
    */
  var lifecycle: UsesOnChanges
  
  /**
    * Name of the directive type.
    */
  var name: String
  
  /**
    * A mapping of outputs from class property names to binding property names, or to a tuple of
    * binding property name and class property name if the names are different.
    */
  var outputs: StringDictionary[String]
  
  /**
    * The list of providers defined in the directive.
    */
  var providers: Expression | Null
  
  /**
    * Information about the content queries made by the directive.
    */
  var queries: js.Array[R3QueryMetadata]
  
  /**
    * Unparsed selector of the directive, or `null` if there was no selector.
    */
  var selector: String | Null
  
  /**
    * An expression representing a reference to the directive itself.
    */
  var `type`: R3Reference
  
  /**
    * Number of generic type parameters of the type itself.
    */
  var typeArgumentCount: Double
  
  /**
    * A source span for the directive type.
    */
  var typeSourceSpan: ParseSourceSpan
  
  /**
    * Whether or not the component or directive inherits from another class
    */
  var usesInheritance: Boolean
  
  /**
    * Information about the view queries made by the directive.
    */
  var viewQueries: js.Array[R3QueryMetadata]
}
object R3DirectiveMetadata {
  
  inline def apply(
    fullInheritance: Boolean,
    host: R3HostMetadata,
    inputs: StringDictionary[R3InputMetadata],
    isStandalone: Boolean,
    lifecycle: UsesOnChanges,
    name: String,
    outputs: StringDictionary[String],
    queries: js.Array[R3QueryMetadata],
    `type`: R3Reference,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadata]
  ): R3DirectiveMetadata = {
    val __obj = js.Dynamic.literal(fullInheritance = fullInheritance.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isStandalone = isStandalone.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], deps = null, exportAs = null, hostDirectives = null, providers = null, selector = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DirectiveMetadata] (val x: Self) extends AnyVal {
    
    inline def setDeps(value: js.Array[R3DependencyMetadata] | invalid): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsNull: Self = StObject.set(x, "deps", null)
    
    inline def setDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setFullInheritance(value: Boolean): Self = StObject.set(x, "fullInheritance", value.asInstanceOf[js.Any])
    
    inline def setHost(value: R3HostMetadata): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostDirectives(value: js.Array[R3HostDirectiveMetadata]): Self = StObject.set(x, "hostDirectives", value.asInstanceOf[js.Any])
    
    inline def setHostDirectivesNull: Self = StObject.set(x, "hostDirectives", null)
    
    inline def setHostDirectivesVarargs(value: R3HostDirectiveMetadata*): Self = StObject.set(x, "hostDirectives", js.Array(value*))
    
    inline def setInputs(value: StringDictionary[R3InputMetadata]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setLifecycle(value: UsesOnChanges): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersNull: Self = StObject.set(x, "providers", null)
    
    inline def setQueries(value: js.Array[R3QueryMetadata]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: R3QueryMetadata*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    
    inline def setTypeSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "typeSourceSpan", value.asInstanceOf[js.Any])
    
    inline def setUsesInheritance(value: Boolean): Self = StObject.set(x, "usesInheritance", value.asInstanceOf[js.Any])
    
    inline def setViewQueries(value: js.Array[R3QueryMetadata]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
    
    inline def setViewQueriesVarargs(value: R3QueryMetadata*): Self = StObject.set(x, "viewQueries", js.Array(value*))
  }
}
