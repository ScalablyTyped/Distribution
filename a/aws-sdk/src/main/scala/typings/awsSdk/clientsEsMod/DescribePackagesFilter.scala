package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackagesFilter extends StObject {
  
  /**
    * Any field from PackageDetails.
    */
  var Name: js.UndefOr[DescribePackagesFilterName] = js.undefined
  
  /**
    * A non-empty list of values for the specified field.
    */
  var Value: js.UndefOr[DescribePackagesFilterValues] = js.undefined
}
object DescribePackagesFilter {
  
  inline def apply(): DescribePackagesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePackagesFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePackagesFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: DescribePackagesFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: DescribePackagesFilterValues): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    inline def setValueVarargs(value: DescribePackagesFilterValue*): Self = StObject.set(x, "Value", js.Array(value*))
  }
}
