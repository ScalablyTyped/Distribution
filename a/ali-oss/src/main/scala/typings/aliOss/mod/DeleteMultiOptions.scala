package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMultiOptions extends StObject {
  
  var quite: js.UndefOr[Boolean] = js.native
  
  // quite mode or verbose mode, default is false
  var timeout: js.UndefOr[Double] = js.native
}
object DeleteMultiOptions {
  
  @scala.inline
  def apply(): DeleteMultiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMultiOptions]
  }
  
  @scala.inline
  implicit class DeleteMultiOptionsMutableBuilder[Self <: DeleteMultiOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuite(value: Boolean): Self = StObject.set(x, "quite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiteUndefined: Self = StObject.set(x, "quite", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
