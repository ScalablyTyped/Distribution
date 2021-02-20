package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pathname extends StObject {
  
  var pathname: js.UndefOr[String] = js.native
}
object Pathname {
  
  @scala.inline
  def apply(): Pathname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pathname]
  }
  
  @scala.inline
  implicit class PathnameMutableBuilder[Self <: Pathname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
  }
}
