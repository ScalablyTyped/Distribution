package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HubContentDependency extends StObject {
  
  /**
    * The hub content dependency copy path.
    */
  var DependencyCopyPath: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DependencyCopyPath] = js.undefined
  
  /**
    * The hub content dependency origin path.
    */
  var DependencyOriginPath: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DependencyOriginPath] = js.undefined
}
object HubContentDependency {
  
  inline def apply(): HubContentDependency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HubContentDependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HubContentDependency] (val x: Self) extends AnyVal {
    
    inline def setDependencyCopyPath(value: DependencyCopyPath): Self = StObject.set(x, "DependencyCopyPath", value.asInstanceOf[js.Any])
    
    inline def setDependencyCopyPathUndefined: Self = StObject.set(x, "DependencyCopyPath", js.undefined)
    
    inline def setDependencyOriginPath(value: DependencyOriginPath): Self = StObject.set(x, "DependencyOriginPath", value.asInstanceOf[js.Any])
    
    inline def setDependencyOriginPathUndefined: Self = StObject.set(x, "DependencyOriginPath", js.undefined)
  }
}
