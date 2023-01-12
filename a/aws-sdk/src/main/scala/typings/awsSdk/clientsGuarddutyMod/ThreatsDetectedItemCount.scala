package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatsDetectedItemCount extends StObject {
  
  /**
    * Total number of infected files.
    */
  var Files: js.UndefOr[Integer] = js.undefined
}
object ThreatsDetectedItemCount {
  
  inline def apply(): ThreatsDetectedItemCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatsDetectedItemCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThreatsDetectedItemCount] (val x: Self) extends AnyVal {
    
    inline def setFiles(value: Integer): Self = StObject.set(x, "Files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "Files", js.undefined)
  }
}
