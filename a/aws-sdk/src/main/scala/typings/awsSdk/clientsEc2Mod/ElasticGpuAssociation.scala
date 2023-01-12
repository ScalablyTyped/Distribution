package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticGpuAssociation extends StObject {
  
  /**
    * The ID of the association.
    */
  var ElasticGpuAssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the association between the instance and the Elastic Graphics accelerator.
    */
  var ElasticGpuAssociationState: js.UndefOr[String] = js.undefined
  
  /**
    * The time the Elastic Graphics accelerator was associated with the instance.
    */
  var ElasticGpuAssociationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[typings.awsSdk.clientsEc2Mod.ElasticGpuId] = js.undefined
}
object ElasticGpuAssociation {
  
  inline def apply(): ElasticGpuAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElasticGpuAssociation] (val x: Self) extends AnyVal {
    
    inline def setElasticGpuAssociationId(value: String): Self = StObject.set(x, "ElasticGpuAssociationId", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuAssociationIdUndefined: Self = StObject.set(x, "ElasticGpuAssociationId", js.undefined)
    
    inline def setElasticGpuAssociationState(value: String): Self = StObject.set(x, "ElasticGpuAssociationState", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuAssociationStateUndefined: Self = StObject.set(x, "ElasticGpuAssociationState", js.undefined)
    
    inline def setElasticGpuAssociationTime(value: String): Self = StObject.set(x, "ElasticGpuAssociationTime", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuAssociationTimeUndefined: Self = StObject.set(x, "ElasticGpuAssociationTime", js.undefined)
    
    inline def setElasticGpuId(value: ElasticGpuId): Self = StObject.set(x, "ElasticGpuId", value.asInstanceOf[js.Any])
    
    inline def setElasticGpuIdUndefined: Self = StObject.set(x, "ElasticGpuId", js.undefined)
  }
}
