package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadonlyEditOptions extends StObject {
  
  /** Whether the readonly protections on the text editor should be ignored. */
  var bypassReadOnly: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyEditOptions {
  
  @scala.inline
  def apply(): ReadonlyEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyEditOptions]
  }
  
  @scala.inline
  implicit class ReadonlyEditOptionsMutableBuilder[Self <: ReadonlyEditOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassReadOnly(value: Boolean): Self = StObject.set(x, "bypassReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassReadOnlyUndefined: Self = StObject.set(x, "bypassReadOnly", js.undefined)
  }
}
