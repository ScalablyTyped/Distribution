package typings.aureliaBinding.mod

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectObservationAdapter extends js.Object {
  
  def getObserver(`object`: js.Any, propertyName: String, descriptor: PropertyDescriptor): js.UndefOr[InternalPropertyObserver | Null] = js.native
}
object ObjectObservationAdapter {
  
  @scala.inline
  def apply(getObserver: (js.Any, String, PropertyDescriptor) => js.UndefOr[InternalPropertyObserver | Null]): ObjectObservationAdapter = {
    val __obj = js.Dynamic.literal(getObserver = js.Any.fromFunction3(getObserver))
    __obj.asInstanceOf[ObjectObservationAdapter]
  }
  
  @scala.inline
  implicit class ObjectObservationAdapterOps[Self <: ObjectObservationAdapter] (val x: Self) extends AnyVal {
    
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
    def setGetObserver(value: (js.Any, String, PropertyDescriptor) => js.UndefOr[InternalPropertyObserver | Null]): Self = this.set("getObserver", js.Any.fromFunction3(value))
  }
}
