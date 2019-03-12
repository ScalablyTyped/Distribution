package typings
package applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateCustomProperties extends CustomProperties {
  def addHeaderData(header: java.lang.String): scala.Unit
  def serializeToHeader(): java.lang.String
}

object PrivateCustomProperties {
  @scala.inline
  def apply(
    addHeaderData: java.lang.String => scala.Unit,
    getProperty: java.lang.String => java.lang.String,
    serializeToHeader: () => java.lang.String,
    setProperty: (java.lang.String, java.lang.String) => scala.Unit
  ): PrivateCustomProperties = {
    val __obj = js.Dynamic.literal(addHeaderData = js.Any.fromFunction1(addHeaderData), getProperty = js.Any.fromFunction1(getProperty), serializeToHeader = js.Any.fromFunction0(serializeToHeader), setProperty = js.Any.fromFunction2(setProperty))
  
    __obj.asInstanceOf[PrivateCustomProperties]
  }
}

