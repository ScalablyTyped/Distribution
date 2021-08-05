package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.UsesOnChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DirectiveMetadataFacade extends StObject {
  
  var deps: js.Array[R3DependencyMetadataFacade] | Null
  
  var exportAs: js.Array[String] | Null
  
  var host: StringDictionary[String]
  
  var inputs: js.Array[String]
  
  var lifecycle: UsesOnChanges
  
  var name: String
  
  var outputs: js.Array[String]
  
  var propMetadata: StringDictionary[js.Array[js.Any]]
  
  var providers: js.Array[Provider] | Null
  
  var queries: js.Array[R3QueryMetadataFacade]
  
  var selector: String | Null
  
  var `type`: js.Any
  
  var typeArgumentCount: Double
  
  var typeSourceSpan: ParseSourceSpan
  
  var usesInheritance: Boolean
  
  var viewQueries: js.Array[R3QueryMetadataFacade]
}
object R3DirectiveMetadataFacade {
  
  inline def apply(
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: UsesOnChanges,
    name: String,
    outputs: js.Array[String],
    propMetadata: StringDictionary[js.Array[js.Any]],
    queries: js.Array[R3QueryMetadataFacade],
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade]
  ): R3DirectiveMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], deps = null, exportAs = null, providers = null, selector = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveMetadataFacade]
  }
  
  extension [Self <: R3DirectiveMetadataFacade](x: Self) {
    
    inline def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsNull: Self = StObject.set(x, "deps", null)
    
    inline def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value :_*))
    
    inline def setHost(value: StringDictionary[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setLifecycle(value: UsesOnChanges): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    inline def setPropMetadata(value: StringDictionary[js.Array[js.Any]]): Self = StObject.set(x, "propMetadata", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersNull: Self = StObject.set(x, "providers", null)
    
    inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    inline def setQueries(value: js.Array[R3QueryMetadataFacade]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: R3QueryMetadataFacade*): Self = StObject.set(x, "queries", js.Array(value :_*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    
    inline def setTypeSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "typeSourceSpan", value.asInstanceOf[js.Any])
    
    inline def setUsesInheritance(value: Boolean): Self = StObject.set(x, "usesInheritance", value.asInstanceOf[js.Any])
    
    inline def setViewQueries(value: js.Array[R3QueryMetadataFacade]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
    
    inline def setViewQueriesVarargs(value: R3QueryMetadataFacade*): Self = StObject.set(x, "viewQueries", js.Array(value :_*))
  }
}
