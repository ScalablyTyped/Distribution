package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceEventWindow extends StObject {
  
  /**
    * One or more targets associated with the event window.
    */
  var AssociationTarget: js.UndefOr[InstanceEventWindowAssociationTarget] = js.undefined
  
  /**
    * The cron expression defined for the event window.
    */
  var CronExpression: js.UndefOr[InstanceEventWindowCronExpression] = js.undefined
  
  /**
    * The ID of the event window.
    */
  var InstanceEventWindowId: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceEventWindowId] = js.undefined
  
  /**
    * The name of the event window.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the event window.
    */
  var State: js.UndefOr[InstanceEventWindowState] = js.undefined
  
  /**
    * The instance tags associated with the event window.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * One or more time ranges defined for the event window.
    */
  var TimeRanges: js.UndefOr[InstanceEventWindowTimeRangeList] = js.undefined
}
object InstanceEventWindow {
  
  inline def apply(): InstanceEventWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceEventWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceEventWindow] (val x: Self) extends AnyVal {
    
    inline def setAssociationTarget(value: InstanceEventWindowAssociationTarget): Self = StObject.set(x, "AssociationTarget", value.asInstanceOf[js.Any])
    
    inline def setAssociationTargetUndefined: Self = StObject.set(x, "AssociationTarget", js.undefined)
    
    inline def setCronExpression(value: InstanceEventWindowCronExpression): Self = StObject.set(x, "CronExpression", value.asInstanceOf[js.Any])
    
    inline def setCronExpressionUndefined: Self = StObject.set(x, "CronExpression", js.undefined)
    
    inline def setInstanceEventWindowId(value: InstanceEventWindowId): Self = StObject.set(x, "InstanceEventWindowId", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowIdUndefined: Self = StObject.set(x, "InstanceEventWindowId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: InstanceEventWindowState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTimeRanges(value: InstanceEventWindowTimeRangeList): Self = StObject.set(x, "TimeRanges", value.asInstanceOf[js.Any])
    
    inline def setTimeRangesUndefined: Self = StObject.set(x, "TimeRanges", js.undefined)
    
    inline def setTimeRangesVarargs(value: InstanceEventWindowTimeRange*): Self = StObject.set(x, "TimeRanges", js.Array(value*))
  }
}
