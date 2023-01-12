package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleInstanceResult extends StObject {
  
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[typings.awsSdk.clientsEc2Mod.BundleTask] = js.undefined
}
object BundleInstanceResult {
  
  inline def apply(): BundleInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleInstanceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleInstanceResult] (val x: Self) extends AnyVal {
    
    inline def setBundleTask(value: BundleTask): Self = StObject.set(x, "BundleTask", value.asInstanceOf[js.Any])
    
    inline def setBundleTaskUndefined: Self = StObject.set(x, "BundleTask", js.undefined)
  }
}
