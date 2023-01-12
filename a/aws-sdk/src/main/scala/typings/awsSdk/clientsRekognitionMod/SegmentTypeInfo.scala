package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentTypeInfo extends StObject {
  
  /**
    * The version of the model used to detect segments.
    */
  var ModelVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The type of a segment (technical cue or shot detection).
    */
  var Type: js.UndefOr[SegmentType] = js.undefined
}
object SegmentTypeInfo {
  
  inline def apply(): SegmentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentTypeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentTypeInfo] (val x: Self) extends AnyVal {
    
    inline def setModelVersion(value: String): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setType(value: SegmentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
