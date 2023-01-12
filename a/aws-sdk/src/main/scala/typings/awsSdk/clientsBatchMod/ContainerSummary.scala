package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSummary extends StObject {
  
  /**
    * The exit code to return upon completion.
    */
  var exitCode: js.UndefOr[Integer] = js.undefined
  
  /**
    * A short (255 max characters) human-readable string to provide additional details for a running or stopped container.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object ContainerSummary {
  
  inline def apply(): ContainerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerSummary] (val x: Self) extends AnyVal {
    
    inline def setExitCode(value: Integer): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
