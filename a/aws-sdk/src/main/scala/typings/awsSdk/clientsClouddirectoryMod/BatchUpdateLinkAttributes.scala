package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateLinkAttributes extends StObject {
  
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList
  
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clientsClouddirectoryMod.TypedLinkSpecifier
}
object BatchUpdateLinkAttributes {
  
  inline def apply(AttributeUpdates: LinkAttributeUpdateList, TypedLinkSpecifier: TypedLinkSpecifier): BatchUpdateLinkAttributes = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateLinkAttributes]
  }
  
  extension [Self <: BatchUpdateLinkAttributes](x: Self) {
    
    inline def setAttributeUpdates(value: LinkAttributeUpdateList): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdatesVarargs(value: LinkAttributeUpdate*): Self = StObject.set(x, "AttributeUpdates", js.Array(value*))
    
    inline def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
}
