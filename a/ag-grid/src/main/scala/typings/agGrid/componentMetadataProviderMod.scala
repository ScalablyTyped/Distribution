package typings.agGrid

import typings.agGrid.anon.InstantiableIComponent
import typings.agGrid.componentProviderMod.AgGridComponentFunctionInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMetadataProviderMod {
  
  @JSImport("ag-grid/dist/lib/components/framework/componentMetadataProvider", "ComponentMetadataProvider")
  @js.native
  class ComponentMetadataProvider () extends StObject {
    
    var agComponentUtils: js.Any = js.native
    
    var componentMetaData: js.Any = js.native
    
    def postConstruct(): Unit = js.native
    
    def retrieve(name: String): ComponentMetadata = js.native
  }
  
  trait ComponentMetadata extends StObject {
    
    var functionAdapter: js.UndefOr[
        js.Function1[/* callback */ AgGridComponentFunctionInput, InstantiableIComponent]
      ] = js.undefined
    
    var mandatoryMethodList: js.Array[String]
    
    var optionalMethodList: js.Array[String]
  }
  object ComponentMetadata {
    
    @scala.inline
    def apply(mandatoryMethodList: js.Array[String], optionalMethodList: js.Array[String]): ComponentMetadata = {
      val __obj = js.Dynamic.literal(mandatoryMethodList = mandatoryMethodList.asInstanceOf[js.Any], optionalMethodList = optionalMethodList.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentMetadata]
    }
    
    @scala.inline
    implicit class ComponentMetadataMutableBuilder[Self <: ComponentMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunctionAdapter(value: /* callback */ AgGridComponentFunctionInput => InstantiableIComponent): Self = StObject.set(x, "functionAdapter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunctionAdapterUndefined: Self = StObject.set(x, "functionAdapter", js.undefined)
      
      @scala.inline
      def setMandatoryMethodList(value: js.Array[String]): Self = StObject.set(x, "mandatoryMethodList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatoryMethodListVarargs(value: String*): Self = StObject.set(x, "mandatoryMethodList", js.Array(value :_*))
      
      @scala.inline
      def setOptionalMethodList(value: js.Array[String]): Self = StObject.set(x, "optionalMethodList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalMethodListVarargs(value: String*): Self = StObject.set(x, "optionalMethodList", js.Array(value :_*))
    }
  }
}
