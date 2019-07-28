package typings.aureliaDashBinding.aureliaDashBindingMod

import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectObservationAdapter extends js.Object {
  def getObserver(`object`: js.Any, propertyName: String, descriptor: PropertyDescriptor): js.UndefOr[InternalPropertyObserver | Null]
}

object ObjectObservationAdapter {
  @scala.inline
  def apply(getObserver: (js.Any, String, PropertyDescriptor) => js.UndefOr[InternalPropertyObserver | Null]): ObjectObservationAdapter = {
    val __obj = js.Dynamic.literal(getObserver = js.Any.fromFunction3(getObserver))
  
    __obj.asInstanceOf[ObjectObservationAdapter]
  }
}

