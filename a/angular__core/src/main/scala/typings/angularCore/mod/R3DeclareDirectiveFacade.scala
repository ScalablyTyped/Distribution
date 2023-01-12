package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareDirectiveFacade extends StObject {
  
  var exportAs: js.UndefOr[js.Array[String]] = js.undefined
  
  var host: js.UndefOr[Attributes] = js.undefined
  
  var inputs: js.UndefOr[StringDictionary[String | (js.Tuple2[String, String])]] = js.undefined
  
  var isStandalone: js.UndefOr[Boolean] = js.undefined
  
  var outputs: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var providers: js.UndefOr[OpaqueValue] = js.undefined
  
  var queries: js.UndefOr[js.Array[R3DeclareQueryMetadataFacade]] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var `type`: Type2
  
  var usesInheritance: js.UndefOr[Boolean] = js.undefined
  
  var usesOnChanges: js.UndefOr[Boolean] = js.undefined
  
  var viewQueries: js.UndefOr[js.Array[R3DeclareQueryMetadataFacade]] = js.undefined
}
object R3DeclareDirectiveFacade {
  
  inline def apply(`type`: Type2): R3DeclareDirectiveFacade = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareDirectiveFacade]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclareDirectiveFacade] (val x: Self) extends AnyVal {
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setHost(value: Attributes): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setIsStandalone(value: Boolean): Self = StObject.set(x, "isStandalone", value.asInstanceOf[js.Any])
    
    inline def setIsStandaloneUndefined: Self = StObject.set(x, "isStandalone", js.undefined)
    
    inline def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setProviders(value: OpaqueValue): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setQueries(value: js.Array[R3DeclareQueryMetadataFacade]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: R3DeclareQueryMetadataFacade*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setType(value: Type2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsesInheritance(value: Boolean): Self = StObject.set(x, "usesInheritance", value.asInstanceOf[js.Any])
    
    inline def setUsesInheritanceUndefined: Self = StObject.set(x, "usesInheritance", js.undefined)
    
    inline def setUsesOnChanges(value: Boolean): Self = StObject.set(x, "usesOnChanges", value.asInstanceOf[js.Any])
    
    inline def setUsesOnChangesUndefined: Self = StObject.set(x, "usesOnChanges", js.undefined)
    
    inline def setViewQueries(value: js.Array[R3DeclareQueryMetadataFacade]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
    
    inline def setViewQueriesUndefined: Self = StObject.set(x, "viewQueries", js.undefined)
    
    inline def setViewQueriesVarargs(value: R3DeclareQueryMetadataFacade*): Self = StObject.set(x, "viewQueries", js.Array(value*))
  }
}
