package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  /**
    * The ID of the skill store category.
    */
  var CategoryId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.CategoryId] = js.undefined
  
  /**
    * The name of the skill store category.
    */
  var CategoryName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.CategoryName] = js.undefined
}
object Category {
  
  inline def apply(): Category = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setCategoryId(value: CategoryId): Self = StObject.set(x, "CategoryId", value.asInstanceOf[js.Any])
    
    inline def setCategoryIdUndefined: Self = StObject.set(x, "CategoryId", js.undefined)
    
    inline def setCategoryName(value: CategoryName): Self = StObject.set(x, "CategoryName", value.asInstanceOf[js.Any])
    
    inline def setCategoryNameUndefined: Self = StObject.set(x, "CategoryName", js.undefined)
  }
}
