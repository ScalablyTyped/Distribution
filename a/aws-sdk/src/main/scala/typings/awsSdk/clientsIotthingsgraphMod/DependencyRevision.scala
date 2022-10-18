package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyRevision extends StObject {
  
  /**
    * The ID of the workflow or system.
    */
  var id: js.UndefOr[Urn] = js.undefined
  
  /**
    * The revision number of the workflow or system.
    */
  var revisionNumber: js.UndefOr[Version] = js.undefined
}
object DependencyRevision {
  
  inline def apply(): DependencyRevision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependencyRevision]
  }
  
  extension [Self <: DependencyRevision](x: Self) {
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRevisionNumber(value: Version): Self = StObject.set(x, "revisionNumber", value.asInstanceOf[js.Any])
    
    inline def setRevisionNumberUndefined: Self = StObject.set(x, "revisionNumber", js.undefined)
  }
}
