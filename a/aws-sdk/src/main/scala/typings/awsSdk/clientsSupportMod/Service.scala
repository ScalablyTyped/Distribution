package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /**
    * A list of categories that describe the type of support issue a case describes. Categories consist of a category name and a category code. Category names and codes are passed to Amazon Web Services Support when you call CreateCase.
    */
  var categories: js.UndefOr[CategoryList] = js.undefined
  
  /**
    * The code for an Amazon Web Services service returned by the DescribeServices response. The name element contains the corresponding friendly name.
    */
  var code: js.UndefOr[ServiceCode] = js.undefined
  
  /**
    * The friendly name for an Amazon Web Services service. The code element contains the corresponding code.
    */
  var name: js.UndefOr[ServiceName] = js.undefined
}
object Service {
  
  inline def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setCategories(value: CategoryList): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: Category*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCode(value: ServiceCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
