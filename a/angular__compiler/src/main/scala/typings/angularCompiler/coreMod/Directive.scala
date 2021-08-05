package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directive extends StObject {
  
  var exportAs: js.UndefOr[String] = js.undefined
  
  var guards: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var host: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var inputs: js.UndefOr[js.Array[String]] = js.undefined
  
  var outputs: js.UndefOr[js.Array[String]] = js.undefined
  
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
  
  var queries: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
}
object Directive {
  
  inline def apply(): Directive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Directive]
  }
  
  extension [Self <: Directive](x: Self) {
    
    inline def setExportAs(value: String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setGuards(value: StringDictionary[js.Any]): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    inline def setGuardsUndefined: Self = StObject.set(x, "guards", js.undefined)
    
    inline def setHost(value: StringDictionary[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    inline def setQueries(value: StringDictionary[js.Any]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
