package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineStatusReason extends StObject {
  
  /**
    * A description of why a pipeline has a certain status.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object PipelineStatusReason {
  
  inline def apply(): PipelineStatusReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineStatusReason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineStatusReason] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
