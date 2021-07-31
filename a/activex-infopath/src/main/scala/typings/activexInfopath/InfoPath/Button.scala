package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Button extends StObject {
  
  @JSName("InfoPath.Button_typekey")
  var InfoPathDotButton_typekey: Button
}
object Button {
  
  @scala.inline
  def apply(InfoPathDotButton_typekey: Button): Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InfoPath.Button_typekey")(InfoPathDotButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotButton_typekey(value: Button): Self = StObject.set(x, "InfoPath.Button_typekey", value.asInstanceOf[js.Any])
  }
}
