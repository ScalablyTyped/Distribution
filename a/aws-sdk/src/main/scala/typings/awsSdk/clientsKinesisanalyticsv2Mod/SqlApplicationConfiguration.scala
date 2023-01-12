package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlApplicationConfiguration extends StObject {
  
  /**
    * The array of Input objects describing the input streams used by the application.
    */
  var Inputs: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.Inputs] = js.undefined
  
  /**
    * The array of Output objects describing the destination streams used by the application.
    */
  var Outputs: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.Outputs] = js.undefined
  
  /**
    * The array of ReferenceDataSource objects describing the reference data sources used by the application.
    */
  var ReferenceDataSources: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ReferenceDataSources] = js.undefined
}
object SqlApplicationConfiguration {
  
  inline def apply(): SqlApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlApplicationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: Inputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "Inputs", js.undefined)
    
    inline def setInputsVarargs(value: Input*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setOutputs(value: Outputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setReferenceDataSources(value: ReferenceDataSources): Self = StObject.set(x, "ReferenceDataSources", value.asInstanceOf[js.Any])
    
    inline def setReferenceDataSourcesUndefined: Self = StObject.set(x, "ReferenceDataSources", js.undefined)
    
    inline def setReferenceDataSourcesVarargs(value: ReferenceDataSource*): Self = StObject.set(x, "ReferenceDataSources", js.Array(value*))
  }
}
