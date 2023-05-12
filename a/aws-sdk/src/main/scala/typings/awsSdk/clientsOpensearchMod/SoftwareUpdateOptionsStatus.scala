package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareUpdateOptionsStatus extends StObject {
  
  /**
    * The service software update options for a domain.
    */
  var Options: js.UndefOr[SoftwareUpdateOptions] = js.undefined
  
  /**
    * The status of service software update options, including creation date and last updated date.
    */
  var Status: js.UndefOr[OptionStatus] = js.undefined
}
object SoftwareUpdateOptionsStatus {
  
  inline def apply(): SoftwareUpdateOptionsStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareUpdateOptionsStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoftwareUpdateOptionsStatus] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: SoftwareUpdateOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
