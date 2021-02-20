package typings.astring.anon

import typings.astring.astringStrings.EmptyStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `33` extends StObject {
  
  var `type`: EmptyStatement = js.native
}
object `33` {
  
  @scala.inline
  def apply(`type`: EmptyStatement): `33` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`33`]
  }
  
  @scala.inline
  implicit class `33MutableBuilder`[Self <: `33`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
