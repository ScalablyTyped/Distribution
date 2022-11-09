package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetViewOutput extends StObject {
  
  /**
    * Tag key and value pairs that are attached to the view.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A structure that contains the details for the requested view.
    */
  var View: js.UndefOr[typings.awsSdk.clientsResourceexplorer2Mod.View] = js.undefined
}
object GetViewOutput {
  
  inline def apply(): GetViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetViewOutput]
  }
  
  extension [Self <: GetViewOutput](x: Self) {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "View", js.undefined)
  }
}
