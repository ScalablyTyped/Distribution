package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrailInfo extends StObject {
  
  /**
    * The Amazon Web Services Region in which a trail was created.
    */
  var HomeRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a trail.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of a trail.
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}
object TrailInfo {
  
  inline def apply(): TrailInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrailInfo] (val x: Self) extends AnyVal {
    
    inline def setHomeRegion(value: String): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTrailARN(value: String): Self = StObject.set(x, "TrailARN", value.asInstanceOf[js.Any])
    
    inline def setTrailARNUndefined: Self = StObject.set(x, "TrailARN", js.undefined)
  }
}
