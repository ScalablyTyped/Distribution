package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagProjectResult extends StObject {
  
  /**
    * The tags for the project.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object TagProjectResult {
  
  inline def apply(): TagProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagProjectResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagProjectResult] (val x: Self) extends AnyVal {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
