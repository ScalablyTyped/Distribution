package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryInfo extends StObject {
  
  /**
    * The size of the memory, in MiB.
    */
  var SizeInMiB: js.UndefOr[MemorySize] = js.undefined
}
object MemoryInfo {
  
  inline def apply(): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    
    inline def setSizeInMiB(value: MemorySize): Self = StObject.set(x, "SizeInMiB", value.asInstanceOf[js.Any])
    
    inline def setSizeInMiBUndefined: Self = StObject.set(x, "SizeInMiB", js.undefined)
  }
}
