package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompatibleVersionsMap extends StObject {
  
  /**
    * The current version that the OpenSearch Service domain is running.
    */
  var SourceVersion: js.UndefOr[VersionString] = js.undefined
  
  /**
    * The possible versions that you can upgrade the domain to.
    */
  var TargetVersions: js.UndefOr[VersionList] = js.undefined
}
object CompatibleVersionsMap {
  
  inline def apply(): CompatibleVersionsMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompatibleVersionsMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompatibleVersionsMap] (val x: Self) extends AnyVal {
    
    inline def setSourceVersion(value: VersionString): Self = StObject.set(x, "SourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "SourceVersion", js.undefined)
    
    inline def setTargetVersions(value: VersionList): Self = StObject.set(x, "TargetVersions", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionsUndefined: Self = StObject.set(x, "TargetVersions", js.undefined)
    
    inline def setTargetVersionsVarargs(value: VersionString*): Self = StObject.set(x, "TargetVersions", js.Array(value*))
  }
}
