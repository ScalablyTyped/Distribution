package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceResponse extends StObject {
  
  /**
    * The ARN, metadata, created and last-updated timestamps, and the name of the AppInstance. All timestamps use epoch milliseconds.
    */
  var AppInstance: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.AppInstance] = js.undefined
}
object DescribeAppInstanceResponse {
  
  inline def apply(): DescribeAppInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstance(value: AppInstance): Self = StObject.set(x, "AppInstance", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUndefined: Self = StObject.set(x, "AppInstance", js.undefined)
  }
}
