package typings.applicationinsights.correlationContextManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateCustomProperties extends CustomProperties {
  def addHeaderData(header: String): Unit
  def serializeToHeader(): String
}

object PrivateCustomProperties {
  @scala.inline
  def apply(
    addHeaderData: String => Unit,
    getProperty: String => String,
    serializeToHeader: () => String,
    setProperty: (String, String) => Unit
  ): PrivateCustomProperties = {
    val __obj = js.Dynamic.literal(addHeaderData = js.Any.fromFunction1(addHeaderData), getProperty = js.Any.fromFunction1(getProperty), serializeToHeader = js.Any.fromFunction0(serializeToHeader), setProperty = js.Any.fromFunction2(setProperty))
  
    __obj.asInstanceOf[PrivateCustomProperties]
  }
}

