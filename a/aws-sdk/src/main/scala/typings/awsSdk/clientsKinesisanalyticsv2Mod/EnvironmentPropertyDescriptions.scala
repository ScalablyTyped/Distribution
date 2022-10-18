package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentPropertyDescriptions extends StObject {
  
  /**
    * Describes the execution property groups.
    */
  var PropertyGroupDescriptions: js.UndefOr[PropertyGroups] = js.undefined
}
object EnvironmentPropertyDescriptions {
  
  inline def apply(): EnvironmentPropertyDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentPropertyDescriptions]
  }
  
  extension [Self <: EnvironmentPropertyDescriptions](x: Self) {
    
    inline def setPropertyGroupDescriptions(value: PropertyGroups): Self = StObject.set(x, "PropertyGroupDescriptions", value.asInstanceOf[js.Any])
    
    inline def setPropertyGroupDescriptionsUndefined: Self = StObject.set(x, "PropertyGroupDescriptions", js.undefined)
    
    inline def setPropertyGroupDescriptionsVarargs(value: PropertyGroup*): Self = StObject.set(x, "PropertyGroupDescriptions", js.Array(value*))
  }
}
