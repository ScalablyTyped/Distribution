package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefResource extends StObject {
  
  /**
    * The ARN of the experiment or launch.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The day and time that this experiment or launch ended.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * The day and time that this experiment or launch was most recently updated.
    */
  var lastUpdatedOn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the experiment or launch.
    */
  var name: String
  
  /**
    * The day and time that this experiment or launch started.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the experiment or launch.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the resource that this structure contains information about is an experiment or a launch.
    */
  var `type`: String
}
object RefResource {
  
  inline def apply(name: String, `type`: String): RefResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefResource] (val x: Self) extends AnyVal {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLastUpdatedOn(value: String): Self = StObject.set(x, "lastUpdatedOn", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedOnUndefined: Self = StObject.set(x, "lastUpdatedOn", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
