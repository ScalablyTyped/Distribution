package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a generic service which should be supported by all servies which have properties.
  *
  * It specifies several, mostly optional ways to access properties.
  */
@js.native
trait PropertySet
  extends XPropertySet
     with XFastPropertySet
     with XMultiPropertySet
     with XPropertyAccess
     with XPropertyState {
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: XPropertySetInfo = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

