package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceServerScopeType extends StObject {
  
  /**
    * A description of the scope.
    */
  var ScopeDescription: ResourceServerScopeDescriptionType
  
  /**
    * The name of the scope.
    */
  var ScopeName: ResourceServerScopeNameType
}
object ResourceServerScopeType {
  
  inline def apply(ScopeDescription: ResourceServerScopeDescriptionType, ScopeName: ResourceServerScopeNameType): ResourceServerScopeType = {
    val __obj = js.Dynamic.literal(ScopeDescription = ScopeDescription.asInstanceOf[js.Any], ScopeName = ScopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScopeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceServerScopeType] (val x: Self) extends AnyVal {
    
    inline def setScopeDescription(value: ResourceServerScopeDescriptionType): Self = StObject.set(x, "ScopeDescription", value.asInstanceOf[js.Any])
    
    inline def setScopeName(value: ResourceServerScopeNameType): Self = StObject.set(x, "ScopeName", value.asInstanceOf[js.Any])
  }
}
