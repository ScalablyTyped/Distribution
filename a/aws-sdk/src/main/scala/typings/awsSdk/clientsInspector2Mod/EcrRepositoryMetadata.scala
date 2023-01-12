package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcrRepositoryMetadata extends StObject {
  
  /**
    * The name of the Amazon ECR repository.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The frequency of scans.
    */
  var scanFrequency: js.UndefOr[EcrScanFrequency] = js.undefined
}
object EcrRepositoryMetadata {
  
  inline def apply(): EcrRepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcrRepositoryMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcrRepositoryMetadata] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScanFrequency(value: EcrScanFrequency): Self = StObject.set(x, "scanFrequency", value.asInstanceOf[js.Any])
    
    inline def setScanFrequencyUndefined: Self = StObject.set(x, "scanFrequency", js.undefined)
  }
}
