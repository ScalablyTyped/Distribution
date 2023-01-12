package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportContext extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the license configuration that this generator reports on.
    */
  var licenseConfigurationArns: ArnList
}
object ReportContext {
  
  inline def apply(licenseConfigurationArns: ArnList): ReportContext = {
    val __obj = js.Dynamic.literal(licenseConfigurationArns = licenseConfigurationArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportContext] (val x: Self) extends AnyVal {
    
    inline def setLicenseConfigurationArns(value: ArnList): Self = StObject.set(x, "licenseConfigurationArns", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnsVarargs(value: Arn*): Self = StObject.set(x, "licenseConfigurationArns", js.Array(value*))
  }
}
