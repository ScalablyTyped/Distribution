package typings.astring.anon

import typings.astring.astringStrings.SpreadElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var `type`: SpreadElement
}
object `5` {
  
  @scala.inline
  def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SpreadElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
