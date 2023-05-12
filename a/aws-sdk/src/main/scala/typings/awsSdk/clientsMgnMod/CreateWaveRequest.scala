package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWaveRequest extends StObject {
  
  /**
    * Wave description.
    */
  var description: js.UndefOr[WaveDescription] = js.undefined
  
  /**
    * Wave name.
    */
  var name: WaveName
  
  /**
    * Wave tags.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateWaveRequest {
  
  inline def apply(name: WaveName): CreateWaveRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWaveRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWaveRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: WaveDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: WaveName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
