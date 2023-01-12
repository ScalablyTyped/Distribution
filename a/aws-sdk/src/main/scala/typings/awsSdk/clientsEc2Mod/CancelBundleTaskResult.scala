package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelBundleTaskResult extends StObject {
  
  /**
    * Information about the bundle task.
    */
  var BundleTask: js.UndefOr[typings.awsSdk.clientsEc2Mod.BundleTask] = js.undefined
}
object CancelBundleTaskResult {
  
  inline def apply(): CancelBundleTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelBundleTaskResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelBundleTaskResult] (val x: Self) extends AnyVal {
    
    inline def setBundleTask(value: BundleTask): Self = StObject.set(x, "BundleTask", value.asInstanceOf[js.Any])
    
    inline def setBundleTaskUndefined: Self = StObject.set(x, "BundleTask", js.undefined)
  }
}
