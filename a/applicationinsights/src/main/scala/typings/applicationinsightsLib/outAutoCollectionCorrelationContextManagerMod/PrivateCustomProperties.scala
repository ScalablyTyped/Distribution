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
    addHeaderData: js.Function1[java.lang.String, scala.Unit],
    getProperty: js.Function1[java.lang.String, java.lang.String],
    serializeToHeader: js.Function0[java.lang.String],
    setProperty: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): PrivateCustomProperties = {
    val __obj = js.Dynamic.literal(addHeaderData = addHeaderData, getProperty = getProperty, serializeToHeader = serializeToHeader, setProperty = setProperty)
  
    __obj.asInstanceOf[PrivateCustomProperties]
  }
}

