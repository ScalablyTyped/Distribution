package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Granttype extends StObject {
  
  var grant_type: js.UndefOr[String] = js.undefined
}
object Granttype {
  
  @scala.inline
  def apply(): Granttype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Granttype]
  }
  
  @scala.inline
  implicit class GranttypeMutableBuilder[Self <: Granttype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrant_typeUndefined: Self = StObject.set(x, "grant_type", js.undefined)
  }
}
