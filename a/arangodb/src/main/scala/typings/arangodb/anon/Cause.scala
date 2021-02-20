package typings.arangodb.anon

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cause extends StObject {
  
  var cause: js.UndefOr[Error] = js.native
  
  var extra: js.UndefOr[js.Any] = js.native
}
object Cause {
  
  @scala.inline
  def apply(): Cause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cause]
  }
  
  @scala.inline
  implicit class CauseMutableBuilder[Self <: Cause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setExtra(value: js.Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
  }
}
