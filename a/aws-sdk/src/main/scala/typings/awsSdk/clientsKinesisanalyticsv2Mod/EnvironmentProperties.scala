package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentProperties extends StObject {
  
  /**
    * Describes the execution property groups.
    */
  var PropertyGroups: typings.awsSdk.clientsKinesisanalyticsv2Mod.PropertyGroups
}
object EnvironmentProperties {
  
  inline def apply(PropertyGroups: PropertyGroups): EnvironmentProperties = {
    val __obj = js.Dynamic.literal(PropertyGroups = PropertyGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentProperties] (val x: Self) extends AnyVal {
    
    inline def setPropertyGroups(value: PropertyGroups): Self = StObject.set(x, "PropertyGroups", value.asInstanceOf[js.Any])
    
    inline def setPropertyGroupsVarargs(value: PropertyGroup*): Self = StObject.set(x, "PropertyGroups", js.Array(value*))
  }
}
