package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSource extends StObject {
  
  /**
    * The ID of the source.
    */
  var SourceId: js.UndefOr[String256] = js.undefined
  
  /**
    * The type of the source.
    */
  var SourceType: js.UndefOr[String256] = js.undefined
  
  /**
    * The URI of the source.
    */
  var SourceUri: String2048
}
object ActionSource {
  
  inline def apply(SourceUri: String2048): ActionSource = {
    val __obj = js.Dynamic.literal(SourceUri = SourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSource] (val x: Self) extends AnyVal {
    
    inline def setSourceId(value: String256): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    inline def setSourceType(value: String256): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setSourceUri(value: String2048): Self = StObject.set(x, "SourceUri", value.asInstanceOf[js.Any])
  }
}
