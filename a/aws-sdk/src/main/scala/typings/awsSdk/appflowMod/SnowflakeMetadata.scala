package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowflakeMetadata extends StObject {
  
  /**
    *  Specifies the supported AWS Regions when using Snowflake. 
    */
  var supportedRegions: js.UndefOr[RegionList] = js.undefined
}
object SnowflakeMetadata {
  
  @scala.inline
  def apply(): SnowflakeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnowflakeMetadata]
  }
  
  @scala.inline
  implicit class SnowflakeMetadataMutableBuilder[Self <: SnowflakeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportedRegions(value: RegionList): Self = StObject.set(x, "supportedRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRegionsUndefined: Self = StObject.set(x, "supportedRegions", js.undefined)
    
    @scala.inline
    def setSupportedRegionsVarargs(value: Region*): Self = StObject.set(x, "supportedRegions", js.Array(value :_*))
  }
}
