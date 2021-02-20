package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.UsesOnChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3DirectiveMetadataFacade extends StObject {
  
  var deps: js.Array[R3DependencyMetadataFacade] | Null = js.native
  
  var exportAs: js.Array[String] | Null = js.native
  
  var host: StringDictionary[String] = js.native
  
  var inputs: js.Array[String] = js.native
  
  var lifecycle: UsesOnChanges = js.native
  
  var name: String = js.native
  
  var outputs: js.Array[String] = js.native
  
  var propMetadata: StringDictionary[js.Array[_]] = js.native
  
  var providers: js.Array[Provider] | Null = js.native
  
  var queries: js.Array[R3QueryMetadataFacade] = js.native
  
  var selector: String | Null = js.native
  
  var `type`: js.Any = js.native
  
  var typeArgumentCount: Double = js.native
  
  var typeSourceSpan: ParseSourceSpan = js.native
  
  var usesInheritance: Boolean = js.native
  
  var viewQueries: js.Array[R3QueryMetadataFacade] = js.native
}
object R3DirectiveMetadataFacade {
  
  @scala.inline
  def apply(
    host: StringDictionary[String],
    inputs: js.Array[String],
    lifecycle: UsesOnChanges,
    name: String,
    outputs: js.Array[String],
    propMetadata: StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    `type`: js.Any,
    typeArgumentCount: Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade]
  ): R3DirectiveMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], lifecycle = lifecycle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], propMetadata = propMetadata.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any], typeSourceSpan = typeSourceSpan.asInstanceOf[js.Any], usesInheritance = usesInheritance.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveMetadataFacade]
  }
  
  @scala.inline
  implicit class R3DirectiveMetadataFacadeMutableBuilder[Self <: R3DirectiveMetadataFacade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeps(value: js.Array[R3DependencyMetadataFacade]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepsNull: Self = StObject.set(x, "deps", null)
    
    @scala.inline
    def setDepsVarargs(value: R3DependencyMetadataFacade*): Self = StObject.set(x, "deps", js.Array(value :_*))
    
    @scala.inline
    def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    @scala.inline
    def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value :_*))
    
    @scala.inline
    def setHost(value: StringDictionary[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setLifecycle(value: UsesOnChanges): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setPropMetadata(value: StringDictionary[js.Array[_]]): Self = StObject.set(x, "propMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersNull: Self = StObject.set(x, "providers", null)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: js.Array[R3QueryMetadataFacade]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesVarargs(value: R3QueryMetadataFacade*): Self = StObject.set(x, "queries", js.Array(value :_*))
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "typeSourceSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsesInheritance(value: Boolean): Self = StObject.set(x, "usesInheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewQueries(value: js.Array[R3QueryMetadataFacade]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewQueriesVarargs(value: R3QueryMetadataFacade*): Self = StObject.set(x, "viewQueries", js.Array(value :_*))
  }
}
