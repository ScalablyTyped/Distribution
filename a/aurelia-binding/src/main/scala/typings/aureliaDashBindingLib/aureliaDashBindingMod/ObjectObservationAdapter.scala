package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectObservationAdapter extends js.Object {
  def getObserver(`object`: js.Any, propertyName: java.lang.String, descriptor: stdLib.PropertyDescriptor): js.UndefOr[InternalPropertyObserver | scala.Null]
}

object ObjectObservationAdapter {
  @scala.inline
  def apply(
    getObserver: js.Function3[
      js.Any, 
      java.lang.String, 
      stdLib.PropertyDescriptor, 
      js.UndefOr[InternalPropertyObserver | scala.Null]
    ]
  ): ObjectObservationAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getObserver")(getObserver)
    __obj.asInstanceOf[ObjectObservationAdapter]
  }
}

