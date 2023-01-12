package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineActivity extends StObject {
  
  /**
    * Adds other attributes based on existing attributes in the message.
    */
  var addAttributes: js.UndefOr[AddAttributesActivity] = js.undefined
  
  /**
    * Determines the source of the messages to be processed.
    */
  var channel: js.UndefOr[ChannelActivity] = js.undefined
  
  /**
    * Specifies where to store the processed message data.
    */
  var datastore: js.UndefOr[DatastoreActivity] = js.undefined
  
  /**
    * Adds data from the IoT device registry to your message.
    */
  var deviceRegistryEnrich: js.UndefOr[DeviceRegistryEnrichActivity] = js.undefined
  
  /**
    * Adds information from the IoT Device Shadow service to a message.
    */
  var deviceShadowEnrich: js.UndefOr[DeviceShadowEnrichActivity] = js.undefined
  
  /**
    * Filters a message based on its attributes.
    */
  var filter: js.UndefOr[FilterActivity] = js.undefined
  
  /**
    * Runs a Lambda function to modify the message.
    */
  var lambda: js.UndefOr[LambdaActivity] = js.undefined
  
  /**
    * Computes an arithmetic expression using the message's attributes and adds it to the message.
    */
  var math: js.UndefOr[MathActivity] = js.undefined
  
  /**
    * Removes attributes from a message.
    */
  var removeAttributes: js.UndefOr[RemoveAttributesActivity] = js.undefined
  
  /**
    * Used to create a new message using only the specified attributes from the original message. 
    */
  var selectAttributes: js.UndefOr[SelectAttributesActivity] = js.undefined
}
object PipelineActivity {
  
  inline def apply(): PipelineActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineActivity] (val x: Self) extends AnyVal {
    
    inline def setAddAttributes(value: AddAttributesActivity): Self = StObject.set(x, "addAttributes", value.asInstanceOf[js.Any])
    
    inline def setAddAttributesUndefined: Self = StObject.set(x, "addAttributes", js.undefined)
    
    inline def setChannel(value: ChannelActivity): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setDatastore(value: DatastoreActivity): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setDatastoreUndefined: Self = StObject.set(x, "datastore", js.undefined)
    
    inline def setDeviceRegistryEnrich(value: DeviceRegistryEnrichActivity): Self = StObject.set(x, "deviceRegistryEnrich", value.asInstanceOf[js.Any])
    
    inline def setDeviceRegistryEnrichUndefined: Self = StObject.set(x, "deviceRegistryEnrich", js.undefined)
    
    inline def setDeviceShadowEnrich(value: DeviceShadowEnrichActivity): Self = StObject.set(x, "deviceShadowEnrich", value.asInstanceOf[js.Any])
    
    inline def setDeviceShadowEnrichUndefined: Self = StObject.set(x, "deviceShadowEnrich", js.undefined)
    
    inline def setFilter(value: FilterActivity): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLambda(value: LambdaActivity): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setMath(value: MathActivity): Self = StObject.set(x, "math", value.asInstanceOf[js.Any])
    
    inline def setMathUndefined: Self = StObject.set(x, "math", js.undefined)
    
    inline def setRemoveAttributes(value: RemoveAttributesActivity): Self = StObject.set(x, "removeAttributes", value.asInstanceOf[js.Any])
    
    inline def setRemoveAttributesUndefined: Self = StObject.set(x, "removeAttributes", js.undefined)
    
    inline def setSelectAttributes(value: SelectAttributesActivity): Self = StObject.set(x, "selectAttributes", value.asInstanceOf[js.Any])
    
    inline def setSelectAttributesUndefined: Self = StObject.set(x, "selectAttributes", js.undefined)
  }
}
