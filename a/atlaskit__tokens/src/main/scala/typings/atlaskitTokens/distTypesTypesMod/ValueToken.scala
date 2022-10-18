package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.CategoryGroup
import typings.atlaskitTokens.atlaskitTokensStrings.palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueToken
  extends StObject
     with BaseToken[Double, palette] {
  
  @JSName("attributes")
  var attributes_ValueToken: CategoryGroup
}
object ValueToken {
  
  inline def apply(attributes: CategoryGroup, value: Double): ValueToken = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueToken]
  }
  
  extension [Self <: ValueToken](x: Self) {
    
    inline def setAttributes(value: CategoryGroup): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
