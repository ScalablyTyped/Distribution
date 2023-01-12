package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAWSOrganizationsAccessStatusOutput extends StObject {
  
  /**
    * The status of the portfolio share feature.
    */
  var AccessStatus: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.AccessStatus] = js.undefined
}
object GetAWSOrganizationsAccessStatusOutput {
  
  inline def apply(): GetAWSOrganizationsAccessStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAWSOrganizationsAccessStatusOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAWSOrganizationsAccessStatusOutput] (val x: Self) extends AnyVal {
    
    inline def setAccessStatus(value: AccessStatus): Self = StObject.set(x, "AccessStatus", value.asInstanceOf[js.Any])
    
    inline def setAccessStatusUndefined: Self = StObject.set(x, "AccessStatus", js.undefined)
  }
}
