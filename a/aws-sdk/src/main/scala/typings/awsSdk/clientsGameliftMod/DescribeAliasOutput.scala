package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAliasOutput extends StObject {
  
  /**
    * The requested alias resource.
    */
  var Alias: js.UndefOr[typings.awsSdk.clientsGameliftMod.Alias] = js.undefined
}
object DescribeAliasOutput {
  
  inline def apply(): DescribeAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAliasOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAliasOutput] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: Alias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
  }
}
