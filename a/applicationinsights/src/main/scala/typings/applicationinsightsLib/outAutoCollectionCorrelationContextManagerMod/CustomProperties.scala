package typings
package applicationinsightsLib.outAutoCollectionCorrelationContextManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CustomProperties extends js.Object {
  /**
       * Get a custom property from the correlation context
       */
  def getProperty(key: java.lang.String): java.lang.String
  /**
       * Store a custom property in the correlation context.
       * Do not store sensitive information here.
       * Properties stored here are exposed via outgoing HTTP headers for correlating data cross-component.
       * The characters ',' and '=' are disallowed within keys or values.
       */
  def setProperty(key: java.lang.String, value: java.lang.String): scala.Unit
}

