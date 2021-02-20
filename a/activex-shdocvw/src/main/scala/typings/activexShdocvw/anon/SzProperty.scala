package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SzProperty extends StObject {
  
  val szProperty: String = js.native
}
object SzProperty {
  
  @scala.inline
  def apply(szProperty: String): SzProperty = {
    val __obj = js.Dynamic.literal(szProperty = szProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[SzProperty]
  }
  
  @scala.inline
  implicit class SzPropertyMutableBuilder[Self <: SzProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSzProperty(value: String): Self = StObject.set(x, "szProperty", value.asInstanceOf[js.Any])
  }
}
