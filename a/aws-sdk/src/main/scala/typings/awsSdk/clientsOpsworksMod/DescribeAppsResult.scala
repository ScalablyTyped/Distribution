package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppsResult extends StObject {
  
  /**
    * An array of App objects that describe the specified apps. 
    */
  var Apps: js.UndefOr[typings.awsSdk.clientsOpsworksMod.Apps] = js.undefined
}
object DescribeAppsResult {
  
  inline def apply(): DescribeAppsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppsResult] (val x: Self) extends AnyVal {
    
    inline def setApps(value: Apps): Self = StObject.set(x, "Apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "Apps", js.undefined)
    
    inline def setAppsVarargs(value: App*): Self = StObject.set(x, "Apps", js.Array(value*))
  }
}
