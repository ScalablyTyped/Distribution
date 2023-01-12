package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteOutput extends StObject {
  
  var Site: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Site] = js.undefined
}
object GetSiteOutput {
  
  inline def apply(): GetSiteOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSiteOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSiteOutput] (val x: Self) extends AnyVal {
    
    inline def setSite(value: Site): Self = StObject.set(x, "Site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "Site", js.undefined)
  }
}
