package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlApplicationConfigurationDescription extends StObject {
  
  /**
    * The array of InputDescription objects describing the input streams used by the application.
    */
  var InputDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.InputDescriptions] = js.undefined
  
  /**
    * The array of OutputDescription objects describing the destination streams used by the application.
    */
  var OutputDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.OutputDescriptions] = js.undefined
  
  /**
    * The array of ReferenceDataSourceDescription objects describing the reference data sources used by the application.
    */
  var ReferenceDataSourceDescriptions: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ReferenceDataSourceDescriptions] = js.undefined
}
object SqlApplicationConfigurationDescription {
  
  inline def apply(): SqlApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlApplicationConfigurationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlApplicationConfigurationDescription] (val x: Self) extends AnyVal {
    
    inline def setInputDescriptions(value: InputDescriptions): Self = StObject.set(x, "InputDescriptions", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptionsUndefined: Self = StObject.set(x, "InputDescriptions", js.undefined)
    
    inline def setInputDescriptionsVarargs(value: InputDescription*): Self = StObject.set(x, "InputDescriptions", js.Array(value*))
    
    inline def setOutputDescriptions(value: OutputDescriptions): Self = StObject.set(x, "OutputDescriptions", value.asInstanceOf[js.Any])
    
    inline def setOutputDescriptionsUndefined: Self = StObject.set(x, "OutputDescriptions", js.undefined)
    
    inline def setOutputDescriptionsVarargs(value: OutputDescription*): Self = StObject.set(x, "OutputDescriptions", js.Array(value*))
    
    inline def setReferenceDataSourceDescriptions(value: ReferenceDataSourceDescriptions): Self = StObject.set(x, "ReferenceDataSourceDescriptions", value.asInstanceOf[js.Any])
    
    inline def setReferenceDataSourceDescriptionsUndefined: Self = StObject.set(x, "ReferenceDataSourceDescriptions", js.undefined)
    
    inline def setReferenceDataSourceDescriptionsVarargs(value: ReferenceDataSourceDescription*): Self = StObject.set(x, "ReferenceDataSourceDescriptions", js.Array(value*))
  }
}
