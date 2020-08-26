package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
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
@js.native
trait XTolerantMultiPropertySet extends XInterface {
  /**
    * retrieve only those values of the specified properties which are direct values.
    *
    * Since the count of returned elements may be different from the number of supplied property names the returned elements will also state the name of the
    * property.
    * @param aPropertyNames specifies the names of the properties. The property names must be sorted ascending.  If the names are not sorted the behaviour of
    * @returns a sequence of type {@link com.sun.star.beans.GetDirectPropertyTolerantResult} but only for those properties supplied whoms state is com::sun::sta
    */
  def getDirectPropertyValuesTolerant(aPropertyNames: SeqEquiv[String]): SafeArray[GetDirectPropertyTolerantResult] = js.native
  /**
    * retrieve the values of the specified properties
    *
    * The count and order of the values in the returned sequence will be the same as the order of the names in the argument.
    * @param aPropertyNames specifies the names of the properties. The property names must be sorted ascending.  If the names are not sorted the behaviour of
    * @returns a sequence of type {@link com.sun.star.beans.GetPropertyTolerantResult} for each of the properties listed in **aPropertyNames** .
    */
  def getPropertyValuesTolerant(aPropertyNames: SeqEquiv[String]): SafeArray[GetPropertyTolerantResult] = js.native
  /**
    * sets the values to the properties with the specified names.
    * @param aPropertyNames specifies the names of the properties. The property names must be sorted ascending.  If the names are not sorted the behaviour of
    * @param aValues specifies the values of the properties. The order of the values has to be the same as in the **aPropertyNames** parameter int order to ma
    * @returns An empty sequence if all properties are successful set. Otherwise for every property value that could not successfully be set an entry of the {@l
    * @throws IllegalArgumentException if the number of property names and values do not match.
    */
  def setPropertyValuesTolerant(aPropertyNames: SeqEquiv[String], aValues: SeqEquiv[_]): SafeArray[SetPropertyTolerantFailed] = js.native
}

object XTolerantMultiPropertySet {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed]
  ): XTolerantMultiPropertySet = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant))
    __obj.asInstanceOf[XTolerantMultiPropertySet]
  }
  @scala.inline
  implicit class XTolerantMultiPropertySetOps[Self <: XTolerantMultiPropertySet] (val x: Self) extends AnyVal {
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
    def setGetDirectPropertyValuesTolerant(value: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult]): Self = this.set("getDirectPropertyValuesTolerant", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPropertyValuesTolerant(value: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult]): Self = this.set("getPropertyValuesTolerant", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPropertyValuesTolerant(value: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed]): Self = this.set("setPropertyValuesTolerant", js.Any.fromFunction2(value))
  }
  
}

