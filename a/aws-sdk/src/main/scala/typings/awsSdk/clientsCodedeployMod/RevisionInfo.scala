package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevisionInfo extends StObject {
  
  /**
    * Information about an application revision, including usage details and associated deployment groups.
    */
  var genericRevisionInfo: js.UndefOr[GenericRevisionInfo] = js.undefined
  
  /**
    * Information about the location and type of an application revision.
    */
  var revisionLocation: js.UndefOr[RevisionLocation] = js.undefined
}
object RevisionInfo {
  
  inline def apply(): RevisionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionInfo]
  }
  
  extension [Self <: RevisionInfo](x: Self) {
    
    inline def setGenericRevisionInfo(value: GenericRevisionInfo): Self = StObject.set(x, "genericRevisionInfo", value.asInstanceOf[js.Any])
    
    inline def setGenericRevisionInfoUndefined: Self = StObject.set(x, "genericRevisionInfo", js.undefined)
    
    inline def setRevisionLocation(value: RevisionLocation): Self = StObject.set(x, "revisionLocation", value.asInstanceOf[js.Any])
    
    inline def setRevisionLocationUndefined: Self = StObject.set(x, "revisionLocation", js.undefined)
  }
}
