package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoEnableNewRegionConfiguration extends StObject {
  
  /**
    * The Amazon Web Services Regions where Security Lake is automatically enabled.
    */
  var region: Region
  
  /**
    * The Amazon Web Services sources that are automatically enabled in Security Lake.
    */
  var sources: AwsSourceTypeList
}
object AutoEnableNewRegionConfiguration {
  
  inline def apply(region: Region, sources: AwsSourceTypeList): AutoEnableNewRegionConfiguration = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoEnableNewRegionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoEnableNewRegionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setSources(value: AwsSourceTypeList): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: AwsLogSourceType*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
