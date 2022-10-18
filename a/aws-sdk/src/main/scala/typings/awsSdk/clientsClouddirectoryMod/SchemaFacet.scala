package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFacet extends StObject {
  
  /**
    * The name of the facet. If this value is set, SchemaArn must also be set.
    */
  var FacetName: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.FacetName] = js.undefined
  
  /**
    * The ARN of the schema that contains the facet with no minor component. See arns and In-Place Schema Upgrade for a description of when to provide minor versions. If this value is set, FacetName must also be set.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}
object SchemaFacet {
  
  inline def apply(): SchemaFacet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFacet]
  }
  
  extension [Self <: SchemaFacet](x: Self) {
    
    inline def setFacetName(value: FacetName): Self = StObject.set(x, "FacetName", value.asInstanceOf[js.Any])
    
    inline def setFacetNameUndefined: Self = StObject.set(x, "FacetName", js.undefined)
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
    
    inline def setSchemaArnUndefined: Self = StObject.set(x, "SchemaArn", js.undefined)
  }
}
