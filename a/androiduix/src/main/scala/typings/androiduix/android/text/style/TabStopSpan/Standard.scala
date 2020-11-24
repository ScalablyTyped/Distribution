package typings.androiduix.android.text.style.TabStopSpan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Standard
  extends typings.androiduix.android.text.style.TabStopSpan {
  
  var mTab: js.Any = js.native
}
object Standard {
  
  @scala.inline
  def apply(getTabStop: () => Double, mTab: js.Any): Standard = {
    val __obj = js.Dynamic.literal(getTabStop = js.Any.fromFunction0(getTabStop), mTab = mTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Standard]
  }
  
  @scala.inline
  implicit class StandardOps[Self <: Standard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMTab(value: js.Any): Self = this.set("mTab", value.asInstanceOf[js.Any])
  }
}
