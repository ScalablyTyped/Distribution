package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a generic service which should be supported by all servies which have properties.
  *
  * It specifies several, mostly optional ways to access properties.
  */
@js.native
trait PropertySet
  extends StObject
     with XPropertySet
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
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
