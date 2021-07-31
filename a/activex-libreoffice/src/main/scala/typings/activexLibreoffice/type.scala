package typings.activexLibreoffice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `type` extends StObject {
  
  var typekey: `type`
}
object `type` {
  
  @scala.inline
  def apply(typekey: `type`): `type` = {
    val __obj = js.Dynamic.literal(typekey = typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[`type`]
  }
  
  @scala.inline
  implicit class typeMutableBuilder[Self <: `type`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypekey(value: `type`): Self = StObject.set(x, "typekey", value.asInstanceOf[js.Any])
  }
}
