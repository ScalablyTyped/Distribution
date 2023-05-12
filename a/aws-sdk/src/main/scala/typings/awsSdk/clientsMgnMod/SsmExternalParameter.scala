package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmExternalParameter extends StObject {
  
  /**
    * AWS Systems Manager Document external parameters dynamic path.
    */
  var dynamicPath: js.UndefOr[JmesPathString] = js.undefined
}
object SsmExternalParameter {
  
  inline def apply(): SsmExternalParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SsmExternalParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmExternalParameter] (val x: Self) extends AnyVal {
    
    inline def setDynamicPath(value: JmesPathString): Self = StObject.set(x, "dynamicPath", value.asInstanceOf[js.Any])
    
    inline def setDynamicPathUndefined: Self = StObject.set(x, "dynamicPath", js.undefined)
  }
}
