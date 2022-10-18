package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetLinkAttributes extends StObject {
  
  /**
    * A list of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList
  
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clientsClouddirectoryMod.TypedLinkSpecifier
}
object BatchGetLinkAttributes {
  
  inline def apply(AttributeNames: AttributeNameList, TypedLinkSpecifier: TypedLinkSpecifier): BatchGetLinkAttributes = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetLinkAttributes]
  }
  
  extension [Self <: BatchGetLinkAttributes](x: Self) {
    
    inline def setAttributeNames(value: AttributeNameList): Self = StObject.set(x, "AttributeNames", value.asInstanceOf[js.Any])
    
    inline def setAttributeNamesVarargs(value: AttributeName*): Self = StObject.set(x, "AttributeNames", js.Array(value*))
    
    inline def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
}
