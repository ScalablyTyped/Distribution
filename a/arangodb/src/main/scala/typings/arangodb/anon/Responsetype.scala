package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responsetype extends StObject {
  
  var response_type: js.UndefOr[String] = js.undefined
}
object Responsetype {
  
  @scala.inline
  def apply(): Responsetype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Responsetype]
  }
  
  @scala.inline
  implicit class ResponsetypeMutableBuilder[Self <: Responsetype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
  }
}
