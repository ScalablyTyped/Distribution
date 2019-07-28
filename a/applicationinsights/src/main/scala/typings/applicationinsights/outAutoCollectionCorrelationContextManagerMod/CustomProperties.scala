package typings.applicationinsights.outAutoCollectionCorrelationContextManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomProperties extends js.Object {
  /**
    * Get a custom property from the correlation context
    */
  def getProperty(key: String): String
  /**
    * Store a custom property in the correlation context.
    * Do not store sensitive information here.
    * Properties stored here are exposed via outgoing HTTP headers for correlating data cross-component.
    * The characters ',' and '=' are disallowed within keys or values.
    */
  def setProperty(key: String, value: String): Unit
}

object CustomProperties {
  @scala.inline
  def apply(getProperty: String => String, setProperty: (String, String) => Unit): CustomProperties = {
    val __obj = js.Dynamic.literal(getProperty = js.Any.fromFunction1(getProperty), setProperty = js.Any.fromFunction2(setProperty))
  
    __obj.asInstanceOf[CustomProperties]
  }
}

