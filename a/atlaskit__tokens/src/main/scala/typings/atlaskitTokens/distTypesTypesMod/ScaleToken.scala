package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.`19`
import typings.atlaskitTokens.atlaskitTokensStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleToken
  extends StObject
     with BaseToken[String, scale] {
  
  @JSName("attributes")
  var attributes_ScaleToken: `19`
}
object ScaleToken {
  
  inline def apply(attributes: `19`, value: String): ScaleToken = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleToken]
  }
  
  extension [Self <: ScaleToken](x: Self) {
    
    inline def setAttributes(value: `19`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
