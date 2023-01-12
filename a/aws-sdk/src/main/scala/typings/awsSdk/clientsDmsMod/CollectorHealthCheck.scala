package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectorHealthCheck extends StObject {
  
  /**
    * The status of the Fleet Advisor collector.
    */
  var CollectorStatus: js.UndefOr[typings.awsSdk.clientsDmsMod.CollectorStatus] = js.undefined
  
  /**
    * Whether the local collector can access its Amazon S3 bucket.
    */
  var LocalCollectorS3Access: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Whether the role that you provided when creating the Fleet Advisor collector has sufficient permissions to access the Fleet Advisor web collector.
    */
  var WebCollectorGrantedRoleBasedAccess: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Whether the web collector can access its Amazon S3 bucket.
    */
  var WebCollectorS3Access: js.UndefOr[BooleanOptional] = js.undefined
}
object CollectorHealthCheck {
  
  inline def apply(): CollectorHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectorHealthCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectorHealthCheck] (val x: Self) extends AnyVal {
    
    inline def setCollectorStatus(value: CollectorStatus): Self = StObject.set(x, "CollectorStatus", value.asInstanceOf[js.Any])
    
    inline def setCollectorStatusUndefined: Self = StObject.set(x, "CollectorStatus", js.undefined)
    
    inline def setLocalCollectorS3Access(value: BooleanOptional): Self = StObject.set(x, "LocalCollectorS3Access", value.asInstanceOf[js.Any])
    
    inline def setLocalCollectorS3AccessUndefined: Self = StObject.set(x, "LocalCollectorS3Access", js.undefined)
    
    inline def setWebCollectorGrantedRoleBasedAccess(value: BooleanOptional): Self = StObject.set(x, "WebCollectorGrantedRoleBasedAccess", value.asInstanceOf[js.Any])
    
    inline def setWebCollectorGrantedRoleBasedAccessUndefined: Self = StObject.set(x, "WebCollectorGrantedRoleBasedAccess", js.undefined)
    
    inline def setWebCollectorS3Access(value: BooleanOptional): Self = StObject.set(x, "WebCollectorS3Access", value.asInstanceOf[js.Any])
    
    inline def setWebCollectorS3AccessUndefined: Self = StObject.set(x, "WebCollectorS3Access", js.undefined)
  }
}
