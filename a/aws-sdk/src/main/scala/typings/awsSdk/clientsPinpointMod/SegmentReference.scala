package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentReference extends StObject {
  
  /**
    * The unique identifier for the segment.
    */
  var Id: string
  
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[integer] = js.undefined
}
object SegmentReference {
  
  inline def apply(Id: string): SegmentReference = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentReference]
  }
  
  extension [Self <: SegmentReference](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
