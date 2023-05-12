package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`50Percentsign`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  val attributes: `0`
  
  val value: `50Percentsign`
}
object `6` {
  
  inline def apply(attributes: `0`): `6` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "50%")
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `0`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `50Percentsign`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
