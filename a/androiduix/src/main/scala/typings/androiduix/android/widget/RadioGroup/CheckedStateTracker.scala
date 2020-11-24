package typings.androiduix.android.widget.RadioGroup

import typings.androiduix.android.widget.CompoundButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedStateTracker
  extends typings.androiduix.android.widget.CompoundButton.OnCheckedChangeListener {
  
  var _RadioGroup_this: typings.androiduix.android.widget.RadioGroup = js.native
}
object CheckedStateTracker {
  
  @scala.inline
  def apply(
    _RadioGroup_this: typings.androiduix.android.widget.RadioGroup,
    onCheckedChanged: (CompoundButton, Boolean) => Unit
  ): CheckedStateTracker = {
    val __obj = js.Dynamic.literal(_RadioGroup_this = _RadioGroup_this.asInstanceOf[js.Any], onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
    __obj.asInstanceOf[CheckedStateTracker]
  }
  
  @scala.inline
  implicit class CheckedStateTrackerOps[Self <: CheckedStateTracker] (val x: Self) extends AnyVal {
    
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
    def set_RadioGroup_this(value: typings.androiduix.android.widget.RadioGroup): Self = this.set("_RadioGroup_this", value.asInstanceOf[js.Any])
  }
}
