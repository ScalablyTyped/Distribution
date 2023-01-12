package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseLabelFilter extends StObject {
  
  /**
    * Optional release label application filter. For example, spark@2.1.0.
    */
  var Application: js.UndefOr[String] = js.undefined
  
  /**
    * Optional release label version prefix filter. For example, emr-5.
    */
  var Prefix: js.UndefOr[String] = js.undefined
}
object ReleaseLabelFilter {
  
  inline def apply(): ReleaseLabelFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseLabelFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseLabelFilter] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: String): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
