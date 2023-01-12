package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowflakeMetadata extends StObject {
  
  /**
    *  Specifies the supported Amazon Web Services Regions when using Snowflake. 
    */
  var supportedRegions: js.UndefOr[RegionList] = js.undefined
}
object SnowflakeMetadata {
  
  inline def apply(): SnowflakeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnowflakeMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnowflakeMetadata] (val x: Self) extends AnyVal {
    
    inline def setSupportedRegions(value: RegionList): Self = StObject.set(x, "supportedRegions", value.asInstanceOf[js.Any])
    
    inline def setSupportedRegionsUndefined: Self = StObject.set(x, "supportedRegions", js.undefined)
    
    inline def setSupportedRegionsVarargs(value: Region*): Self = StObject.set(x, "supportedRegions", js.Array(value*))
  }
}
