package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicDetails extends StObject {
  
  /**
    * The data sets that the topic is associated with.
    */
  var DataSets: js.UndefOr[Datasets] = js.undefined
  
  /**
    * The description of the topic.
    */
  var Description: js.UndefOr[LimitedString] = js.undefined
  
  /**
    * The name of the topic.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object TopicDetails {
  
  inline def apply(): TopicDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicDetails] (val x: Self) extends AnyVal {
    
    inline def setDataSets(value: Datasets): Self = StObject.set(x, "DataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "DataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: DatasetMetadata*): Self = StObject.set(x, "DataSets", js.Array(value*))
    
    inline def setDescription(value: LimitedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
