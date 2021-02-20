package typings.angularCompiler.coreMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directive extends StObject {
  
  var exportAs: js.UndefOr[String] = js.native
  
  var guards: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var host: js.UndefOr[StringDictionary[String]] = js.native
  
  var inputs: js.UndefOr[js.Array[String]] = js.native
  
  var outputs: js.UndefOr[js.Array[String]] = js.native
  
  var providers: js.UndefOr[js.Array[Provider]] = js.native
  
  var queries: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var selector: js.UndefOr[String] = js.native
}
object Directive {
  
  @scala.inline
  def apply(): Directive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Directive]
  }
  
  @scala.inline
  implicit class DirectiveMutableBuilder[Self <: Directive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportAs(value: String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    @scala.inline
    def setGuards(value: StringDictionary[js.Any]): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardsUndefined: Self = StObject.set(x, "guards", js.undefined)
    
    @scala.inline
    def setHost(value: StringDictionary[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
    
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: StringDictionary[js.Any]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
