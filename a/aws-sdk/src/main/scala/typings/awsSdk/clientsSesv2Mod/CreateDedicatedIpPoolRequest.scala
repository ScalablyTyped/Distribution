package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDedicatedIpPoolRequest extends StObject {
  
  /**
    * The name of the dedicated IP pool.
    */
  var PoolName: typings.awsSdk.clientsSesv2Mod.PoolName
  
  /**
    * The type of scaling mode.
    */
  var ScalingMode: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ScalingMode] = js.undefined
  
  /**
    * An object that defines the tags (keys and values) that you want to associate with the pool.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDedicatedIpPoolRequest {
  
  inline def apply(PoolName: PoolName): CreateDedicatedIpPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDedicatedIpPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDedicatedIpPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    inline def setScalingMode(value: ScalingMode): Self = StObject.set(x, "ScalingMode", value.asInstanceOf[js.Any])
    
    inline def setScalingModeUndefined: Self = StObject.set(x, "ScalingMode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
