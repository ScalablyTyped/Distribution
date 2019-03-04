package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to multiple iformation of a set of properties with a single call.
  *
  * The speciality of this interface is that none of the functions will throw the usual exceptions associated with setting and retrieving of property
  * values. Instead the data for the failures is collected and returned.
  *
  * Note: There is no support for property change listeners in this interface.
  * @see com.sun.star.beans.XPropertySet
  * @see com.sun.star.beans.XMultiPropertySet
  */
trait XTolerantMultiPropertySet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieve only those values of the specified properties which are direct values.
    *
    * Since the count of returned elements may be different from the number of supplied property names the returned elements will also state the name of the
    * property.
    * @param aPropertyNames specifies the names of the properties. The property names must be sorted ascending.  If the names are not sorted the behaviour of
    * @returns a sequence of type {@link com.sun.star.beans.GetDirectPropertyTolerantResult} but only for those properties supplied whoms state is com::sun::sta
    */
  def getDirectPropertyValuesTolerant(aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[GetDirectPropertyTolerantResult]
  /**
    * retrieve the values of the specified properties
    *
    * The count and order of the values in the returned sequence will be the same as the order of the names in the argument.
    * @param aPropertyNames specifies the names of the properties. The property names must be sorted ascending.  If the names are not sorted the behaviour of
    * @returns a sequence of type {@link com.sun.star.beans.GetPropertyTolerantResult} for each of the properties listed in **aPropertyNames** .
    */
  def getPropertyValuesTolerant(aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): activexDashInteropLib.SafeArray[GetPropertyTolerantResult]
  /**
    * sets the values to the properties with the specified names.
    * @param aPropertyNames specifies the names of the properties. The property names must be sorted ascending.  If the names are not sorted the behaviour of
    * @param aValues specifies the values of the properties. The order of the values has to be the same as in the **aPropertyNames** parameter int order to ma
    * @returns An empty sequence if all properties are successful set. Otherwise for every property value that could not successfully be set an entry of the {@l
    * @throws IllegalArgumentException if the number of property names and values do not match.
    */
  def setPropertyValuesTolerant(
    aPropertyNames: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    aValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]
  ): activexDashInteropLib.SafeArray[SetPropertyTolerantFailed]
}

object XTolerantMultiPropertySet {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDirectPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[GetDirectPropertyTolerantResult]
    ],
    getPropertyValuesTolerant: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[GetPropertyTolerantResult]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPropertyValuesTolerant: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashInteropLib.SafeArray[SetPropertyTolerantFailed]
    ]
  ): XTolerantMultiPropertySet = {
    val __obj = js.Dynamic.literal(acquire = acquire, getDirectPropertyValuesTolerant = getDirectPropertyValuesTolerant, getPropertyValuesTolerant = getPropertyValuesTolerant, queryInterface = queryInterface, release = release, setPropertyValuesTolerant = setPropertyValuesTolerant)
  
    __obj.asInstanceOf[XTolerantMultiPropertySet]
  }
}

