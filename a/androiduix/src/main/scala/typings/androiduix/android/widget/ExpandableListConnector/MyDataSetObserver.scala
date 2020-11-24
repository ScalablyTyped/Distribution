package typings.androiduix.android.widget.ExpandableListConnector

import typings.androiduix.android.database.DataSetObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MyDataSetObserver extends DataSetObserver {
  
  var _ExpandableListConnector_this: typings.androiduix.android.widget.ExpandableListConnector = js.native
}
object MyDataSetObserver {
  
  @scala.inline
  def apply(
    _ExpandableListConnector_this: typings.androiduix.android.widget.ExpandableListConnector,
    onChanged: () => Unit,
    onInvalidated: () => Unit
  ): MyDataSetObserver = {
    val __obj = js.Dynamic.literal(_ExpandableListConnector_this = _ExpandableListConnector_this.asInstanceOf[js.Any], onChanged = js.Any.fromFunction0(onChanged), onInvalidated = js.Any.fromFunction0(onInvalidated))
    __obj.asInstanceOf[MyDataSetObserver]
  }
  
  @scala.inline
  implicit class MyDataSetObserverOps[Self <: MyDataSetObserver] (val x: Self) extends AnyVal {
    
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
    def set_ExpandableListConnector_this(value: typings.androiduix.android.widget.ExpandableListConnector): Self = this.set("_ExpandableListConnector_this", value.asInstanceOf[js.Any])
  }
}
