package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExclusionPreview extends StObject {
  
  /**
    * The system-defined attributes for the exclusion preview.
    */
  var attributes: js.UndefOr[AttributeList] = js.undefined
  
  /**
    * The description of the exclusion preview.
    */
  var description: Text
  
  /**
    * The recommendation for the exclusion preview.
    */
  var recommendation: Text
  
  /**
    * The AWS resources for which the exclusion preview pertains.
    */
  var scopes: ScopeList
  
  /**
    * The name of the exclusion preview.
    */
  var title: Text
}
object ExclusionPreview {
  
  inline def apply(description: Text, recommendation: Text, scopes: ScopeList, title: Text): ExclusionPreview = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusionPreview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExclusionPreview] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDescription(value: Text): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setRecommendation(value: Text): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: ScopeList): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: Scope*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
