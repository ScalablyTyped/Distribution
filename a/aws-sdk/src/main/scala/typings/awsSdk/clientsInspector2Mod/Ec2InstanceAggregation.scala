package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ec2InstanceAggregation extends StObject {
  
  /**
    * The AMI IDs associated with the Amazon EC2 instances to aggregate findings for.
    */
  var amis: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The Amazon EC2 instance IDs to aggregate findings for.
    */
  var instanceIds: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The Amazon EC2 instance tags to aggregate findings for.
    */
  var instanceTags: js.UndefOr[MapFilterList] = js.undefined
  
  /**
    * The operating system types to aggregate findings for. Valid values must be uppercase and underscore separated, examples are ORACLE_LINUX_7 and ALPINE_LINUX_3_8.
    */
  var operatingSystems: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The value to sort results by.
    */
  var sortBy: js.UndefOr[Ec2InstanceSortBy] = js.undefined
  
  /**
    * The order to sort results by.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object Ec2InstanceAggregation {
  
  inline def apply(): Ec2InstanceAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ec2InstanceAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ec2InstanceAggregation] (val x: Self) extends AnyVal {
    
    inline def setAmis(value: StringFilterList): Self = StObject.set(x, "amis", value.asInstanceOf[js.Any])
    
    inline def setAmisUndefined: Self = StObject.set(x, "amis", js.undefined)
    
    inline def setAmisVarargs(value: StringFilter*): Self = StObject.set(x, "amis", js.Array(value*))
    
    inline def setInstanceIds(value: StringFilterList): Self = StObject.set(x, "instanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "instanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: StringFilter*): Self = StObject.set(x, "instanceIds", js.Array(value*))
    
    inline def setInstanceTags(value: MapFilterList): Self = StObject.set(x, "instanceTags", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagsUndefined: Self = StObject.set(x, "instanceTags", js.undefined)
    
    inline def setInstanceTagsVarargs(value: MapFilter*): Self = StObject.set(x, "instanceTags", js.Array(value*))
    
    inline def setOperatingSystems(value: StringFilterList): Self = StObject.set(x, "operatingSystems", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemsUndefined: Self = StObject.set(x, "operatingSystems", js.undefined)
    
    inline def setOperatingSystemsVarargs(value: StringFilter*): Self = StObject.set(x, "operatingSystems", js.Array(value*))
    
    inline def setSortBy(value: Ec2InstanceSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
