package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationOutput extends StObject {
  
  /**
    * 
    */
  var Application: js.UndefOr[typings.awsSdk.clientsSsmsapMod.Application] = js.undefined
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object GetApplicationOutput {
  
  inline def apply(): GetApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationOutput]
  }
  
  extension [Self <: GetApplicationOutput](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
