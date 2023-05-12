package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalNavigationConfiguration extends StObject {
  
  /**
    * The sheet that is targeted for navigation in the same analysis.
    */
  var TargetSheetId: ShortRestrictiveResourceId
}
object LocalNavigationConfiguration {
  
  inline def apply(TargetSheetId: ShortRestrictiveResourceId): LocalNavigationConfiguration = {
    val __obj = js.Dynamic.literal(TargetSheetId = TargetSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalNavigationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalNavigationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTargetSheetId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "TargetSheetId", value.asInstanceOf[js.Any])
  }
}
