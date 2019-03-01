package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies information about a single property failed to be set.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
trait SetPropertyTolerantFailed extends js.Object {
  /** specifies the name of the property. */
  var Name: java.lang.String
  /**
    * specifies the success or error code for setting the properties value.
    *
    * Since the property was not successful set the result will never be {@link com.sun.star.beans.TolerantPropertySetResultType.SUCCESS} .
    * @see com.sun.star.beans.TolerantPropertySetResultType
    */
  var Result: scala.Double
}

object SetPropertyTolerantFailed {
  @scala.inline
  def apply(Name: java.lang.String, Result: scala.Double): SetPropertyTolerantFailed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[SetPropertyTolerantFailed]
  }
}

